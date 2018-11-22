package Persistencia;

import Common.cDatosException;
import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class pGenerico extends pPersistencia {

    public pGenerico() {
        super.getInstancia();
    }

    // <editor-fold defaultstate="collapsed" desc=" Propiedades_Informacion_Objetos">     
    public static boolean IsPrimitio(Field propiedades) {
        Class aux = propiedades.getType();
        if (aux.equals(java.lang.String.class)) {
            return true;
        }
        if (aux.equals(java.lang.Integer.class) || aux.equals(int.class) || aux.equals(java.lang.Double.class)) {
            return true;
        }
        if (aux.equals(java.util.Date.class)) {
            return true;
        }
        if (aux.equals(java.lang.Boolean.class) || aux.equals(boolean.class)) {
            return true;
        }
        return false;
    }

    public static java.lang.reflect.Field[] getPropertiesFields(Object pObject) {
        try {
            Class<? extends Class> pObjectGetClass = (Class<? extends Class>) pObject.getClass();
            java.lang.reflect.Field[] fields = pObjectGetClass.getDeclaredFields();
            return fields;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Object CreateInstance(Object pObject) {
        Object myObject = new Object();
        try {
            Constructor constructor = pObject.getClass().getConstructor();
            myObject = (Object) constructor.newInstance();
            return myObject;
        } catch (Exception e) {
            System.out.println("Error en Crear Instance el error es :" + e.getMessage());
        }
        return null;
    }

    public Object SetValorObjeto(Object pObject, ResultSet reader) throws SQLException {
        Object retorno = CreateInstance(pObject);
        java.lang.reflect.Field[] MyFields = getPropertiesFields(pObject);

        for (java.lang.reflect.Field property : MyFields) // retorno.Identificador = int.Parse(oReader["Identificador"].ToString());
        {
            Class tipo = property.getType();

            if (tipo.equals(java.util.ArrayList.class)) {
                continue;
            }
            String valorLector = property.getName();
            Object caprutatValor = (reader.getObject(valorLector));
            Object valorRetorno = null;

            if (tipo.equals(java.lang.String.class)) {
                valorRetorno = caprutatValor.toString();
            }
            if (tipo.equals(java.util.Date.class)) {
                valorRetorno = pasar_Fecha_JAVA(caprutatValor.toString());
            }
            if (tipo.equals(java.lang.Integer.class) || tipo.equals(int.class)) {
                valorRetorno = Integer.parseInt(caprutatValor.toString());
            }
            if (tipo.equals(java.lang.Double.class)) {
                valorRetorno = Double.parseDouble(caprutatValor.toString());
            }
            if (tipo.equals(java.lang.Boolean.class) || tipo.equals(boolean.class)) {

                caprutatValor = Boolean.parseBoolean(caprutatValor.toString());
            }
            if (!IsPrimitio(property)) {

                Object Instance = CreateInstance(property.getType());

                java.lang.reflect.Field[] MyFields2 = getPropertiesFields(Instance);
                try {
                    for (java.lang.reflect.Field info : MyFields2) {
                        if (IsPK(Instance.getClass().getSimpleName(), info.getName())) {
                            info.setAccessible(true);
                            info.set(Instance, caprutatValor);
                            Instance = TraerEspecifico(Instance);
                            valorRetorno = Instance;
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error en ser valor obj el error es: " + e.getMessage());
                }
            }

            try {
                property.setAccessible(true);
                property.set(retorno, valorRetorno);
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        return retorno;
    }

    public static Boolean EsString(Object pObject) {
        if (pObject instanceof java.lang.String) {
            return true;
        }
        if (pObject instanceof java.util.Date) {
            return true;
        }
        return false;
    }

    public Boolean IsPK(String TablaSQL, String Campo) throws cDatosException {
        ArrayList<String> PKs = new ArrayList();
        try {
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st = super.getDistribuidora().createStatement();

            String selectSql = "SHOW KEYS FROM " + TablaSQL.replace("common", "") + " WHERE Key_name = 'PRIMARY'";

            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs = st.executeQuery(selectSql);
            while (rs.next()) {
                String aux = rs.getString("Column_Name");
                PKs.add(aux);
            }

            cerrarConexion();
        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }
        for (String s : PKs) {
            if (s.equals(Campo)) {
                return true;
            }
        }
        return false;
    }

    public Boolean IsAutoincremental(String TablaSQL, String Campo) throws cDatosException {
        ArrayList<String> PKs = new ArrayList();
        try {
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st = super.getDistribuidora().createStatement();

            String selectSql = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME='" + TablaSQL + "' AND EXTRA='auto_increment'";

            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs = st.executeQuery(selectSql);
            while (rs.next()) {
                String aux = rs.getString("TABLE_NAME");
                PKs.add(aux);
            }

            cerrarConexion();
        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }
        for (String s : PKs) {
            if (s.equals(Campo)) {
                return true;
            }
        }
        return false;
    }

    public static java.util.Date pasar_Fecha_JAVA(String uDate) {
        java.util.Date sDate = new java.util.Date(uDate);
        return sDate;
    }

    public static String pasar_SQL_Fecha(String utilDate) {
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        return df.format(utilDate);
    }

    public static String PasarAString(Object pObject) {//Cambiar por fecha
        if (pObject.getClass().equals(java.util.Date.class)) {
            pasar_SQL_Fecha(pObject.toString());
        }
        return EsString(pObject) ? "'" + pObject.toString() + "'" : pObject.toString();
    }

    public Object DevolverValor(Object pObject, Field property, Boolean IsRecursivo) throws cDatosException {
        try {
            if (IsRecursivo == false) {
                if (IsPrimitio(property)) {
                    if (IsAutoincremental(pObject.getClass().getSimpleName(), property.getName())) {
                        return null;
                    } else {
                        property.setAccessible(true);
                        return property.get(pObject);
                    }
                } else {
                    Object reflejado;

                    property.setAccessible(true);
                    reflejado = property.get(pObject);
                    for (Field property2 : reflejado.getClass().getDeclaredFields()) {
                        //propertyA.GetValue(property.GetValue(pObject, null), null)
                        Object rtn = DevolverValor(reflejado, property2, true);
                        if (rtn != null) {
                            return rtn;
                        }
                    }
                }
            } else {
                if (IsPrimitio(property)) {
                    String a = pObject.getClass().getSimpleName().toString();
                    if (IsPK(a, property.getName())) {
                        property.setAccessible(true);
                        Object o = property.get(pObject);
                        return o;
                    }
                } else {
                    Object reflejado;
                    property.setAccessible(true);
                    reflejado = property.get(pObject);

                    for (Field property2 : reflejado.getClass().getDeclaredFields()) {        //propertyA.GetValue(property.GetValue(pObject, null), null)
                        Object rtn = DevolverValor(reflejado, property2, true);
                        if (rtn != null) {
                            return rtn;
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" ABM (ALTAS, BAJAS, MODIF.)">      
    public boolean agregar(Object pObject) throws cDatosException {
        boolean retorno = true;
        try {

            super.abrirConexion();

            Statement st = super.getDistribuidora().createStatement();

            String Insert_In_Table = "INSERT INTO " + pObject.getClass().getSimpleName() + "  (";
            String parametro = " ";
            String value = " VALUES (";

            for (Field property : pObject.getClass().getDeclaredFields()) {
                if (property.getType().equals(java.util.List.class
                )) {
                    continue;
                }
                Object Valor = DevolverValor(pObject, property, false);
                if (Valor == null) {
                    continue;
                }

                value += PasarAString(Valor) + ",";
                parametro += property.getName() + ",";
            }
            value = value.substring(0, value.length() - 1) + ")";
            parametro = parametro.substring(0, parametro.length() - 1) + ")";
            Insert_In_Table += parametro;
            Insert_In_Table += value;

            System.out.println(Insert_In_Table);

            st.executeUpdate(Insert_In_Table);

            cerrarConexion();
        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }

        return retorno;
    }

    public boolean modificar(Object pObject) throws cDatosException {
        boolean retorno = true;
        try {

            super.abrirConexion();

            Statement st = super.getDistribuidora().createStatement();
            String Insert_In_Table = "UPDATE  " + pObject.getClass().getSimpleName() + " SET ";
            String Tipe = " ";
            String Condicion = "  Where  ";

            for (Field property : pObject.getClass().getDeclaredFields()) {

                if (IsPK(pObject.getClass().getSimpleName(), property.getName())) {
                    Object Valor = DevolverValor(pObject, property, true);
                    if ((Valor == null)) {
                        continue;
                    }
                    Condicion += property.getName() + "=" + PasarAString(Valor) + " AND ";

                } else {
                    Object Valor = DevolverValor(pObject, property, false);
                    Tipe += property.getName() + "=" + PasarAString(Valor) + " ,";
                }
            }
            Tipe = Tipe.substring(0, Tipe.length() - 1) + " ";
            Condicion = Condicion.substring(0, Condicion.length() - 4) + " ";
            Insert_In_Table += Tipe;
            Insert_In_Table += Condicion;

            System.out.println(Insert_In_Table);

            st.executeUpdate(Insert_In_Table);

            cerrarConexion();
        } catch (Exception e) {
            throw new cDatosException("ERROR en Modificar : " + e.getMessage());
        }

        return retorno;
    }

    public boolean eliminar_Logico(Object pObject) throws cDatosException {
        boolean retorno = true;
        try {
            super.abrirConexion();

            Statement st = super.getDistribuidora().createStatement();
            String Condicion = "UPDATE  " + pObject.getClass().getSimpleName() + " SET isDeleted=true WHERE ";

            //  Creacion de una variable del tipo 
            for (Field property : pObject.getClass().getDeclaredFields()) {
                // pObject.GetType().GetProperties()  -------- Lista de Campos
                if (IsPK(pObject.getClass().getSimpleName(), property.getName())) {
                    Object Valor = DevolverValor(pObject, property, true);
                    if ((Valor == null)) {
                        continue;
                    }

                    Condicion += " " + property.getName() + "=" + PasarAString(Valor) + " AND";
                }

            }
            Condicion = Condicion.substring(0, Condicion.length() - 3);

            System.out.println(Condicion);

            st.executeUpdate(Condicion);

            cerrarConexion();
        } catch (Exception e) {
            throw new cDatosException("ERROR en ELiminar Logico: " + e.getMessage());
        }

        return retorno;
    }

    public boolean eliminar(Object pObject) throws cDatosException {
        boolean retorno = true;
        try {
            super.abrirConexion();

            Statement st = super.getDistribuidora().createStatement();
            String Condicion = "DELETE  " + pObject.getClass().getSimpleName() + " WHERE ";

            //  Creacion de una variable del tipo 
            for (Field property : pObject.getClass().getDeclaredFields()) {
                // pObject.GetType().GetProperties()  -------- Lista de Campos
                if (IsPK(pObject.getClass().getSimpleName(), property.getName())) {
                    Object Valor = DevolverValor(pObject, property, true);
                    if ((Valor == null)) {
                        continue;
                    }

                    Condicion += " " + property.getName() + "=" + PasarAString(Valor) + " AND";
                }

            }
            Condicion = Condicion.substring(0, Condicion.length() - 3);

            System.out.println(Condicion);

            st.executeUpdate(Condicion);

            cerrarConexion();
        } catch (Exception e) {
            throw new cDatosException("ERROR en ELiminar : " + e.getMessage());
        }

        return retorno;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" Consultas">      
    public Object TraerTodosSinEliminados(Object pObject) throws cDatosException {
        // Creacion del string que contiene la sentencia a ejecutar
        String SecuenciaSQL = "select  *  from " + pObject.getClass().getSimpleName() + " WHERE isDeleted=false";

        ArrayList<Object> retornoLista = new ArrayList<Object>();

        try {
            super.abrirConexion();
            Statement st = super.getDistribuidora().createStatement();
            System.out.println(SecuenciaSQL);

            ResultSet rs = st.executeQuery(SecuenciaSQL);
            while (rs.next()) {
                Object retorno = SetValorObjeto(pObject, rs);
                retornoLista.add(retorno);
            }
            cerrarConexion();

            return retornoLista;

        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }
    }

    public Object TraerEspecifico(Object pObject) throws cDatosException {
        Object retorno = null;

        try {

            super.abrirConexion();
            Statement st = super.getDistribuidora().createStatement();
            String SecuenciaSQL = "select * from " + pObject.getClass().getSimpleName() + " where ";
            System.out.println("SQL:    " + SecuenciaSQL);
            for (Field property : pObject.getClass().getDeclaredFields()) {
                if (IsPK(pObject.getClass().getSimpleName(), property.getName())) {
                    Object Valor = DevolverValor(pObject, property, true);

                    if (Valor == null) {
                        continue;
                    }

                    SecuenciaSQL += " " + property.getName() + "=" + PasarAString(Valor) + " AND";
                }
            }

            SecuenciaSQL = SecuenciaSQL.substring(0, SecuenciaSQL.length() - 3);

            System.out.println(SecuenciaSQL);

            ResultSet rs = st.executeQuery(SecuenciaSQL);
            while (rs.next()) {
                retorno = SetValorObjeto(pObject, rs);
            }
            cerrarConexion();

            return retorno;

        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }
    }

    public Object TraerTodos(Object pObject) throws cDatosException {
        // Creacion del string que contiene la sentencia a ejecutar
        String SecuenciaSQL = "select  *  from " + pObject.getClass().getSimpleName();

        ArrayList<Object> retornoLista = new ArrayList<Object>();

        try {
            super.abrirConexion();
            Statement st = super.getDistribuidora().createStatement();
            System.out.println(SecuenciaSQL);

            ResultSet rs = st.executeQuery(SecuenciaSQL);
            while (rs.next()) {
                Object retorno = SetValorObjeto(pObject, rs);
                retornoLista.add(retorno);
            }
            cerrarConexion();

            return retornoLista;

        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }
    }

    public ArrayList<Object> TraerTodos_PorFKs(Object pObject, String SecuenciaSQL) throws cDatosException {

        ArrayList<Object> retornoLista = new ArrayList<Object>();

        try {
            super.abrirConexion();
            Statement st = super.getDistribuidora().createStatement();
            System.out.println(SecuenciaSQL);

            ResultSet rs = st.executeQuery(SecuenciaSQL);
            while (rs.next()) {
                Object retorno = SetValorObjeto(pObject, rs);
                retornoLista.add(retorno);
            }
            cerrarConexion();

            return retornoLista;

        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }
    }

    // </editor-fold>
}

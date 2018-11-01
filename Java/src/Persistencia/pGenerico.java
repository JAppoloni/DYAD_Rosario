/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Common.cDatosException;
import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jmanu
 */
public class pGenerico extends pPersistencia {

    public pGenerico() {
        super.getInstancia();
    }

    // <editor-fold defaultstate="collapsed" desc=" Propiedades_Informacion_Objetos">     
    public static boolean IsPrimitio(Field propiedades) {
        if (propiedades.getClass().isAssignableFrom(java.lang.String.class)) {
            return true;
        }
        if (propiedades.getClass().isAssignableFrom(java.lang.Integer.class) || propiedades.getClass().isAssignableFrom(java.lang.Double.class)) {
            return true;
        }
        if (propiedades.getClass().isAssignableFrom(java.lang.Boolean.class)) {
            return true;
        }
        if (propiedades.getClass().isAssignableFrom(java.util.Date.class)) {
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
            Constructor constructor = pObject.getClass().getConstructor(String.class);
            myObject = (Object) constructor.newInstance();
            return myObject;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Object SetValorObjeto(Object pObject, ResultSet reader) throws SQLException {
        Object retorno = CreateInstance(pObject);
        java.lang.reflect.Field[] MyFields = getPropertiesFields(pObject);

        for (java.lang.reflect.Field property : MyFields) // retorno.Identificador = int.Parse(oReader["Identificador"].ToString());
        {
            if (property.getClass().isAssignableFrom(java.util.ArrayList.class)) {
                continue;
            }
            String valorLector = property.getName();
            Object caprutatValor = (reader.getObject(valorLector));
            Object valorRetorno = null;

            if (property.getType().isAssignableFrom(java.lang.String.class)) {
                valorRetorno = caprutatValor.toString();
            }
            if (property.getType().isAssignableFrom(java.util.Date.class)) {
                // valorRetorno = DateTime.Parse(caprutatValor.toString());Metodo de fechasss
            }
            if (property.getType().isAssignableFrom(java.lang.Integer.class)) {
                valorRetorno = Integer.parseInt(caprutatValor.toString());
            }
            if (property.getType().isAssignableFrom(java.lang.Double.class)) {
                valorRetorno = Double.parseDouble(caprutatValor.toString());
            }
            if (property.getType().isAssignableFrom(java.lang.Boolean.class)) {
                {
                    caprutatValor = Boolean.parseBoolean(caprutatValor.toString());
                }
                if (!IsPrimitio(property)) {

                    Object Instance = CreateInstance(property);

                    java.lang.reflect.Field[] MyFields2 = getPropertiesFields(Instance);
                    try {
                        for (java.lang.reflect.Field info : MyFields2) {
                            if (IsPK(Instance.getClass().getSimpleName(), info.getName())) {
                                info.setAccessible(true);
                                info.set(Instance, caprutatValor);
                                Instance = TraerEspecifico_Eliminado(Instance);
                                valorRetorno = Instance;
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
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
        if (pObject.getClass().isAssignableFrom(java.lang.String.class)) {
            return true;
        }
        if (pObject.getClass().isAssignableFrom(java.util.Date.class)) {
            return true;
        }
        if (pObject.getClass().isAssignableFrom(java.lang.Boolean.class)) {
            return true;
        }
        return false;
    }

    /*
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();//igual al command
            // arma la sentencia sql
               String insertSql="INSERT INTO Cliente(Ci,Nombre,IdTipo)" +
               "VALUES(´" + cli.getCi() + "´ ,´" + cli.getNombre()  + "´, " + cli.getIdtipo().getId() + " )";
                // esto es solo para mostrar el sql que se va a ejecutar
               System.out.println(insertSql);
               // ejecuta la sentencia
               st.executeUpdate(insertSql);//execute nonquery
               super.cerrarConexion();
    
     */

 /*
    
    
    
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st= super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String selectSql="SELECT * FROM CLiente ";
            if (!"".equals(cli.getCi())){
                // si pasaron el registro busco solo por eso
                selectSql=selectSql + " WHERE Ci = ´" + cli.getCi()+"´ ";
            }
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs=st.executeQuery(selectSql);
            
            cli = null;
            
            while(rs.next()){
                cli = new cCliente();
                int num;
                pTipo pt = new pTipo();
                // recorre el Resultset y crea un objeto con los datos de
                // cada linea.
                num = rs.getInt("tid");
                cli.setCi(rs.getString("Ci"));
                cli.setNombre(rs.getString("Nombre"));
                cTipo untipo = new cTipo();
                untipo.setId(rs.getInt("IdTipo"));
                untipo = pt.buscarTipo(untipo);
                cli.setIdtipo(untipo);
            }
            super.cerrarConexion();
            // devuelve el objeto encontrado
            if (cli != null){
                return cli;
            }else{
                return null;
            }
        }catch(SQLException e){throw new cDatosException("Error al buscar accion:" + e.getMessage());}
    }
    
    
     */
    public Boolean IsPK(String TablaSQL, String Campo) throws cDatosException {
        ArrayList<String> PKs = new ArrayList();
        try {
            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st = super.getDistribuidora().createStatement();

            String selectSql = "SELECT COLUMN_NAME FROM Taller_Integrador_Prog.INFORMATION_SCHEMA.KEY_COLUMN_USAGE"
                    + " WHERE TABLE_NAME LIKE ´" + TablaSQL + "´ AND CONSTRAINT_NAME LIKE ´PK%´";
            // https://stackoverflow.com/questions/3930338/sql-server-get-table-primary-key-using-sql-query

            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs = st.executeQuery(selectSql);
            while (rs.next()) {
                String aux = rs.getString("Nombre_Columna");
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

            String selectSql = "SELECT COLUMN_NAME FROM Taller_Integrador_Prog.INFORMATION_SCHEMA.KEY_COLUMN_USAGE"
                    + " WHERE TABLE_NAME LIKE ´" + TablaSQL + "´ AND CONSTRAINT_NAME LIKE ´PK%´";
            // https://stackoverflow.com/questions/3930338/sql-server-get-table-primary-key-using-sql-query

            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs = st.executeQuery(selectSql);
            while (rs.next()) {
                String aux = rs.getString("Nombre_Columna");
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

    public static String PasarAString(Object pObject) {//Cambiar por fecha
        return EsString(pObject) ? "´" + pObject.toString() + "´" : pObject.toString();
    }

    public Object DevolverValor(Object pObject, Field property, Boolean IsRecursivo) throws cDatosException {
        try {
            if (IsRecursivo == false) {
                if (IsPrimitio(property)) {
                    if (IsAutoincremental(pObject.getClass().getSimpleName(), property.getName())) {
                        return null;
                    } else {
                        property.setAccessible(true);
                        property.get(pObject);
                        return property;
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
                        property.get(pObject);
                        return property;
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
    public boolean Agregar(Object pObject) throws cDatosException {
        boolean retorno = true;
        try {

            super.abrirConexion();

            Statement st = super.getDistribuidora().createStatement();

            String Insert_In_Table = "INSERT INTO " + pObject.getClass().getSimpleName() + "  (";
            String parametro = " ";
            String value = " VALUES (";

            for (Field property : pObject.getClass().getDeclaredFields()) {
                if (property.getClass().isAssignableFrom(java.util.List.class)) {
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

    public boolean Modificar(Object pObject) throws cDatosException {
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
            Tipe = Tipe.substring(0, Tipe.length() - 1) + ")";
            Condicion = Condicion.substring(0, Condicion.length() - 1) + ")";
            Insert_In_Table += Condicion;
            Insert_In_Table += Tipe;

            System.out.println(Insert_In_Table);

            st.executeUpdate(Insert_In_Table);

            cerrarConexion();
        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }

        return retorno;
    }

    public boolean Eliminar_Logico(Object pObject) throws cDatosException {
        boolean retorno = true;
        try {
            super.abrirConexion();

            Statement st = super.getDistribuidora().createStatement();
            String Condicion = "UPDATE  " + pObject.getClass().getSimpleName() + " SET isDeleted=´true´ WHERE ";

            //  Creacion de una variable del tipo 
            for (Field property : pObject.getClass().getDeclaredFields()) {
                // pObject.GetType().GetProperties()  -------- Lista de Campos
                if (IsPK(pObject.getClass().getName(), property.getName())) {
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
            throw new cDatosException("ERROR: " + e.getMessage());
        }

        return retorno;
    }

    public boolean Eliminar(Object pObject) throws cDatosException {
        boolean retorno = true;
        try {
            super.abrirConexion();

            Statement st = super.getDistribuidora().createStatement();
            String Condicion = "DELETE  " + pObject.getClass().getSimpleName() + " WHERE ";

            //  Creacion de una variable del tipo 
            for (Field property : pObject.getClass().getDeclaredFields()) {
                // pObject.GetType().GetProperties()  -------- Lista de Campos
                if (IsPK(pObject.getClass().getName(), property.getName())) {
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
            throw new cDatosException("ERROR: " + e.getMessage());
        }

        return retorno;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" Consultas">      
    public Object TraerEspecifico(Object pObject) throws cDatosException {
        Object retorno = null;

        try {

            super.abrirConexion();
            Statement st = super.getDistribuidora().createStatement();
            String SecuenciaSQL = "select * from " + pObject.getClass().getSimpleName() + " where ";

            for (Field property : pObject.getClass().getDeclaredFields()) {
                if (IsPK(pObject.getClass().getName(), property.getName())) {
                    Object Valor = DevolverValor(pObject, property, true);

                    if (Valor == null) {
                        continue;
                    }
                    SecuenciaSQL += " " + property.getName() + "=" + PasarAString(Valor) + " AND";
                }
            }

            SecuenciaSQL += " isDeleted= 'false'";

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

    public Object TraerTodos(Object pObject) throws  cDatosException{
        // Creacion del string que contiene la sentencia a ejecutar
        String SecuenciaSQL = "select  *  from " + pObject.getClass().getSimpleName() + " WHERE isDeleted=´false´";

        ArrayList<Object> retornoLista = new ArrayList<Object>();

        try {
            super.abrirConexion();
            Statement st = super.getDistribuidora().createStatement();
            System.out.println(SecuenciaSQL);

            ResultSet rs = st.executeQuery(SecuenciaSQL);
            while (rs.next()) {
              Object  retorno = SetValorObjeto(pObject, rs);
            retornoLista.add(retorno);
            }
            cerrarConexion();

            return retornoLista;

        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }
    }

      public Object TraerEspecifico_Eliminado(Object pObject) throws cDatosException {
        Object retorno = null;

        try {

            super.abrirConexion();
            Statement st = super.getDistribuidora().createStatement();
            String SecuenciaSQL = "select * from " + pObject.getClass().getSimpleName() + " where ";

            for (Field property : pObject.getClass().getDeclaredFields()) {
                if (IsPK(pObject.getClass().getName(), property.getName())) {
                    Object Valor = DevolverValor(pObject, property, true);

                    if (Valor == null) {
                        continue;
                    }
                    SecuenciaSQL += " " + property.getName() + "=" + PasarAString(Valor) + " AND";
                }
            }

            SecuenciaSQL = SecuenciaSQL.substring(0,SecuenciaSQL.length()-3);

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

    public Object TraerTodos_Eliminado(Object pObject) throws  cDatosException{
        // Creacion del string que contiene la sentencia a ejecutar
        String SecuenciaSQL = "select  *  from " + pObject.getClass().getSimpleName();

        ArrayList<Object> retornoLista = new ArrayList<Object>();

        try {
            super.abrirConexion();
            Statement st = super.getDistribuidora().createStatement();
            System.out.println(SecuenciaSQL);

            ResultSet rs = st.executeQuery(SecuenciaSQL);
            while (rs.next()) {
              Object  retorno = SetValorObjeto(pObject, rs);
            retornoLista.add(retorno);
            }
            cerrarConexion();

            return retornoLista;

        } catch (Exception e) {
            throw new cDatosException("ERROR: " + e.getMessage());
        }
    }


    public  ArrayList<Object> TraerTodos_PorFKs(Object pObject, String SecuenciaSQL) throws  cDatosException{

        ArrayList<Object> retornoLista = new ArrayList<Object>();

        try {
           super.abrirConexion();
            Statement st = super.getDistribuidora().createStatement();
            System.out.println(SecuenciaSQL);

            ResultSet rs = st.executeQuery(SecuenciaSQL);
            while (rs.next()) {
              Object  retorno = SetValorObjeto(pObject, rs);
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

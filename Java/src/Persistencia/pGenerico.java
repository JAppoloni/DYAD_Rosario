/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jmanu
 */
public class pGenerico extends pPersistencia {

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

    public static Object SetValorObjeto(Object pObject, ResultSet reader) throws SQLException {
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
                // valorRetorno = DateTime.Parse(caprutatValor.toString());
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
                                Instance = TraerEspecifico_Con_Eliminados(Instance);
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

    public static bool EsString(Object pObject) {
        if (pObject.GetType() == typeof(String)) {
            return true;
        }

        if (pObject.GetType() == typeof(DateTime)) {
            return true;
        }

        if (pObject.GetType() == typeof(bool)) {
            return true;
        }

        return false;
    }

    public static bool IsPK(String TablaSQL, String Campo) {
        List<String> PKs = new List<string>();
        try {
            var conn = new SqlConnection(CadenaDeConexion);
            // Se Abre la Conexion con BD

            String sentenciaSQL = "SELECT COLUMN_NAME FROM Taller_Integrador_Prog.INFORMATION_SCHEMA.KEY_COLUMN_USAGE"
                    + " WHERE TABLE_NAME LIKE '" + TablaSQL + "' AND CONSTRAINT_NAME LIKE 'PK%'";
            // https://stackoverflow.com/questions/3930338/sql-server-get-table-primary-key-using-sql-query

            // Se Abre la Conexion con BD
            conn.Open();

            SqlCommand cmd = new SqlCommand(sentenciaSQL, conn);

            using(SqlDataReader reader = cmd.ExecuteReader()
            
            
            
            
                )
                {
                    while (reader.Read()) {
                    String Aux = reader["COLUMN_NAME"].ToString();
                    PKs.Add(Aux);
                }
                conn.Close();
            }
        } catch (Exception e) {
            throw e;
        }
        foreach(String s in PKs
        
        
        
        
            )
            {
                if (s.Equals(Campo)) {
                return true;
            }
        }

        return false;
    }

    public static bool IsAutoincremental(String TablaSQL, String Campo) {
        List<String> PKs = new List<string>();
        try {
            var conn = new SqlConnection(CadenaDeConexion);
            // Se Abre la Conexion con BD

            String sentenciaSQL = "SELECT name From(Select name,"
                    + " IsIdentity= COLUMNPROPERTY(id, name, 'IsIdentity') FROM syscolumns WHERE OBJECT_NAME(id) = '"
                    + TablaSQL + "') S where S.IsIdentity > 0 group by name;";
            // https://social.msdn.microsoft.com/Forums/sqlserver/en-US/4708d229-679c-4ecf-a3da-efa4624607bc/how-do-i-find-identity-columns-on-table-using-tsql?forum=transactsql

            // Se Abre la Conexion con BD
            conn.Open();

            SqlCommand cmd = new SqlCommand(sentenciaSQL, conn);

            using(SqlDataReader reader = cmd.ExecuteReader()
            
            
            
            
                )
                {
                    while (reader.Read()) {
                    String Aux = reader["name"].ToString();
                    PKs.Add(Aux);
                }
                conn.Close();
            }
        } catch (Exception e) {
            throw e;
        }
        foreach(String s in PKs
        
        
        
        
            )
            {
                if (s.Equals(Campo)) {
                return true;
            }
        }

        return false;
    }

    public static String PasarAString(Object pObject) {
        return EsString(pObject) ? "'" + pObject.ToString() + "'" : pObject.ToString();
    }

    public static Object DevolverValor(Object pObject, PropertyInfo property, bool IsRecursivo) {
        try {
            if (IsRecursivo == false) {
                if (IsPrimitio(property)) {
                    return (IsAutoincremental(pObject.GetType().Name, property.Name)) ? null
                            : property.GetValue(pObject, null); // Es Incremental retorna null sino el valor del obj
                } else {
                    object reflejado = (property.GetValue(pObject, null));
                    // recorer objeto abstracto
                    foreach(PropertyInfo property2 in reflejado.GetType().GetProperties()
                    
                    
                    
                    
                        )
                        {
                            //propertyA.GetValue(property.GetValue(pObject, null), null)
                            Object rtn = DevolverValor(reflejado, property2, true);
                        if (rtn != null) {
                            return rtn;
                        }
                    }
                }
            } else {
                if (IsPrimitio(property)) {
                    string a = pObject.ToString().Replace("Common.Clases.", "");
                    if (IsPK(a, property.Name)) {
                        return property.GetValue(pObject, null);
                    }
                } else {
                    object reflejado = (property.GetValue(pObject, null));
                    // recorer objeto abstracto
                    foreach(PropertyInfo property2 in reflejado.GetType().GetProperties()
                    
                    
                    
                    
                        )
                        {
                            //propertyA.GetValue(property.GetValue(pObject, null), null)
                            Object rtn = DevolverValor(reflejado, property2, true);
                        if (rtn != null) {
                            return rtn;
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        } // Ctrl+K, Ctrl+C para comentar código y Ctrl+K, Ctrl+U para quitar un comentario
        return null;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" ABM (ALTAS, BAJAS, MODIF.)">      
    public static boolean Agregar(Object pObject) {
        boolean retorno = true;
        try {
            var conn = new SqlConnection(CadenaDeConexion);
            conn.Open();
            string Insert_In_Table = ("INSERT INTO "
                    + (pObject.GetType().Name + "  ("));
            string parametro = "";
            string value = " VALUES (";
            Type type = pObject.GetType();
            for (PropertyInfo property : type.GetProperties()) {
                if ((property.PropertyType == typeof(List < Object >))) {
                    // TODO: Warning!!! continue If
                }

                object Valor = Persistencia.DevolverValor(pObject, property, false);
                if ((Valor == null)) {
                    // TODO: Warning!!! continue If
                }

                value = (value
                        + (Persistencia.PasarAString(Valor) + ","));
                parametro = (parametro
                        + (property.Name + ","));
            }

            //  se concatenan los strings
            value = (value.Remove((value.Length - 1), 1) + ")");
            parametro = (parametro.Remove((parametro.Length - 1), 1) + ")");
            Insert_In_Table = (Insert_In_Table + parametro);
            Insert_In_Table = (Insert_In_Table + value);
            //  Se crea la sentencia a ejecutar en SQL
            SqlCommand cmd = new SqlCommand(Insert_In_Table, conn);
            int rtn = cmd.ExecuteNonQuery();
            //  Verif que se modificaron datos
            if ((rtn <= 0)) {
                retorno = false;
            }

            //  Se cierra la conexion con BD
            if ((conn.State == ConnectionState.Open)) {
                conn.Close();
            }

        } catch (Exception ex) {
            throw ex;
        }

        return retorno;
    }

    public static boolean Modificar_Objeto(Object pObject) {
        boolean retorno = true;
        try {
            //  Se estable ce la conexion con BD
            var conn = new SqlConnection(CadenaDeConexion);
            //  Se abre la cadena de Conexion
            conn.Open();
            //  Creacion del Insert para el Objeto deseado
            string Insert_In_Table = ("UPDATE "
                    + (pObject.GetType().Name + " SET "));
            //  String en el que se almacenara el nombre del Objeto+ Valor del mismo
            string Tipe = " ";
            string Condicion = "  Where  ";
            //  Creacion de una variable del tipo 
            Type type = pObject.GetType();
            for (PropertyInfo property : type.GetProperties()) {
                if ((property.PropertyType == typeof(List < Object >))) {
                    // TODO: Warning!!! continue If
                }

                if (Persistencia.IsPK(pObject.GetType().Name, property.Name)) {
                    Object Valor = Persistencia.DevolverValor(pObject, property, true);
                    if ((Valor == null)) {
                        // TODO: Warning!!! continue If
                    }

                    Condicion = (Condicion
                            + (property.Name + ("="
                            + (Persistencia.PasarAString(Valor) + " AND"))));
                } else {
                    Object Valor = Persistencia.DevolverValor(pObject, property, false);
                    Tipe = (Tipe
                            + (property.Name + ("="
                            + (Persistencia.PasarAString(Valor) + " ,"))));
                }

            }

            Tipe = (Tipe.Remove((Tipe.Length - 1), 1) + "");
            Condicion = (Condicion.Remove((Condicion.Length - 3), 3) + "");
            //  se concatenan los strings
            Insert_In_Table = (Insert_In_Table + Tipe);
            Insert_In_Table = (Insert_In_Table + Condicion);
            //  Se crea la sentencia a ejecutar en SQL
            SqlCommand cmd = new SqlCommand(Insert_In_Table, conn);
            int rtn = cmd.ExecuteNonQuery();
            //  Verif que se modificaron datos
            if ((rtn <= 0)) {
                retorno = false;
            }

            //  Se cierra la conexion con BD
            if ((conn.State == ConnectionState.Open)) {
                conn.Close();
            }

        } catch (Exception ex) {
            throw ex;
        }

        return retorno;
    }

    public static boolean Eliminar_Objeto_Logico(Object pObject) {
        boolean retorno = true;
        try {
            //  Se estable ce la conexion con BD
            var conn = new SqlConnection(CadenaDeConexion);
            //  Se abre la cadena de Conexion
            conn.Open();
            //  Creacion del Insert para el Objeto deseado
            string Insert_In_Table = ("UPDATE "
                    + (pObject.GetType().Name + "SET * WHERE"));
            //  SET ++ Valor +
            //  String en el que se almaceara los datos de los atributos del objeto
            string Condicion = "";
            //  Creacion de una variable del tipo 
            for (PropertyInfo property : pObject.GetType().GetProperties()) {
                // pObject.GetType().GetProperties()  -------- Lista de Campos
                if (Persistencia.IsPK(pObject.GetType().Name, property.Name)) {
                    Object Valor = Persistencia.DevolverValor(pObject, property, true);
                    if ((Valor == null)) {
                        // TODO: Warning!!! continue If
                    }

                    Condicion = (Condicion
                            + (property.Name + ("="
                            + (Persistencia.PasarAString(Valor) + " AND"))));
                }

            }

            Condicion = (Condicion + (" Eliminado_"
                    + (pObject.GetType().Name + "= false")));
            Insert_In_Table = (Insert_In_Table + Condicion);
            //  Se crea la sentencia a ejecutar en SQL
            SqlCommand cmd = new SqlCommand(Insert_In_Table, conn);
            int rtn = cmd.ExecuteNonQuery();
            //  Verif que se modificaron datos
            if ((rtn <= 0)) {
                retorno = false;
            }

            //  Se cierra la conexion con BD
            if ((conn.State == ConnectionState.Open)) {
                conn.Close();
            }

        } catch (Exception ex) {
            throw ex;
        }

        return retorno;
    }

    public static boolean Eliminar_Objeto(Object pObject) {
        boolean retorno = true;
        try {
            //  Se estable ce la conexion con BD
            var conn = new SqlConnection(CadenaDeConexion);
            //  Se abre la cadena de Conexion
            conn.Open();
            //  Creacion del Insert para el Objeto deseado
            string Insert_In_Table = ("UPDATE "
                    + (pObject.GetType().Name + "SET * WHERE"));
            //  SET ++ Valor +
            //  String en el que se almaceara los datos de los atributos del objeto
            string Condicion = "";
            //  Creacion de una variable del tipo 
            for (PropertyInfo property : pObject.GetType().GetProperties()) {
                // pObject.GetType().GetProperties()  -------- Lista de Campos
                if (Persistencia.IsPK(pObject.GetType().Name, property.Name)) {
                    Object Valor = Persistencia.DevolverValor(pObject, property, true);
                    if ((Valor == null)) {
                        // TODO: Warning!!! continue If
                    }

                    Condicion = (Condicion
                            + (property.Name + ("="
                            + (Persistencia.PasarAString(Valor) + " AND"))));
                }

            }

            Condicion = Condicion.Remove((Condicion.Length - 3), 3);
            Insert_In_Table = (Insert_In_Table + Condicion);
            //  Se crea la sentencia a ejecutar en SQL
            SqlCommand cmd = new SqlCommand(Insert_In_Table, conn);
            int rtn = cmd.ExecuteNonQuery();
            //  Verif que se modificaron datos
            if ((rtn <= 0)) {
                retorno = false;
            }

            //  Se cierra la conexion con BD
            if ((conn.State == ConnectionState.Open)) {
                conn.Close();
            }

        } catch (Exception ex) {
            throw ex;
        }

        return retorno;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc=" Consultas">      
    public static dynamic Traer_Objeto_ConEliminados(Object pObject) {
        //  Creacion del string que contiene la sentencia a ejecutar
        string SecuenciaSQL = ("select * from "
                + (pObject.GetType().Name + " where "));
        try {
            var conn = new SqlConnection(CadenaDeConexion);
            conn.Open();
            string Condicion = "";
            for (PropertyInfo property : pObject.GetType().GetProperties()) {
                if (Persistencia.IsPK(pObject.GetType().Name, property.Name)) {
                    Object Valor = Persistencia.DevolverValor(pObject, property, true);
                    if ((Valor == null)) {
                        // TODO: Warning!!! continue If
                    }

                    Condicion = (Condicion
                            + (property.Name + ("="
                            + (Persistencia.PasarAString(Valor) + " AND"))));
                }

            }

            Condicion = (Condicion.Remove((Condicion.Length - 3), 3) + "");
            SecuenciaSQL = (SecuenciaSQL + Condicion);
            SqlCommand cmd = new SqlCommand(SecuenciaSQL, conn);
            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read()) {
                Object retorno = null;
                Type type = Type.GetType(pObject.GetType().Name, true);
                retorno = Activator.CreateInstance(type);
                for (var property : pObject.GetType().GetProperties()) {
                    Object caprutatValor = reader[property.Name];
                    object valorRetorno = null;
                    if ((property.PropertyType == typeof(String))) {
                        valorRetorno = caprutatValor.ToString();
                    }

                    if ((property.PropertyType == typeof(int))) {
                        valorRetorno = int.Parse
                        (caprutatValor.ToString()
                    
                    
                    
                    
                    
                    );
                        }
                        
                        if ((property.PropertyType == typeof(boolean))) {
                        caprutatValor = boolean.Parse
                        (caprutatValor.ToString()
                    
                    
                    
                    
                    
                    );
                        }
                        
                        if (!Persistencia.IsPrimitio(property)) {
                        Object aux = property.GetValue(pObject);
                        Type tipo_ObjC = Type.GetType(aux.GetType().Name, true);
                        Object Instance = Activator.CreateInstance(tipo_ObjC);
                        for (PropertyInfo info : Instance.GetType().GetProperties()) {
                            if (Persistencia.IsPK(Instance.GetType().Name, info.Name)) {
                                info.SetValue(Instance, caprutatValor);
                                Instance = Persistencia.Traer_Lista_Objeto_ConELiminados(Instance);
                                valorRetorno = Instance;
                                break;
                            }

                        }

                    }

                    property.SetValue(retorno, caprutatValor);
                }

                return retorno;
            }

            if ((conn.State == ConnectionState.Open)) {
                conn.Close();
            }

            return null;
        } catch (Exception ex) {
            throw ex;
        }

    }

    public static dynamic Traer_Lista_Objeto_ConELiminados(Object pObject) {
        //  Creacion del string que contiene la sentencia a ejecutar
        string SecuenciaSQL = ("select  *  from " + pObject.GetType().Name);
        var retornoLista = new List<dynamic>();
        try {
            var conn = new SqlConnection(CadenaDeConexion);
            //  Se Abre la Conexion con BD
            conn.Open();
            SqlCommand cmd = new SqlCommand(SecuenciaSQL, conn);
            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read()) {
                Object retorno = null;
                Type type = Type.GetType(pObject.GetType().Name, true);
                retorno = Activator.CreateInstance(type);
                for (var property : pObject.GetType().GetProperties()) {
                    Object caprutatValor = reader[property.Name];
                    object valorRetorno = null;
                    if ((property.PropertyType == typeof(String))) {
                        valorRetorno = caprutatValor.ToString();
                    }

                    if ((property.PropertyType == typeof(int))) {
                        valorRetorno = int.Parse
                        (caprutatValor.ToString()
                    
                    
                    
                    
                    
                    );
                        }
                        
                        if ((property.PropertyType == typeof(boolean))) {
                        caprutatValor = boolean.Parse
                        (caprutatValor.ToString()
                    
                    
                    
                    
                    
                    );
                        }
                        
                        if (!Persistencia.IsPrimitio(property)) {
                        Object aux = property.GetValue(pObject);
                        Type tipo_ObjC = Type.GetType(aux.GetType().Name, true);
                        Object Instance = Activator.CreateInstance(tipo_ObjC);
                        for (PropertyInfo info : Instance.GetType().GetProperties()) {
                            if (Persistencia.IsPK(Instance.GetType().Name, info.Name)) {
                                info.SetValue(Instance, caprutatValor);
                                Instance = Persistencia.Traer_Lista_Objeto_ConELiminados(Instance);
                                valorRetorno = Instance;
                                break;
                            }

                        }

                    }

                    property.SetValue(retorno, caprutatValor);
                }

                retornoLista.Add(retorno);
            }

            if ((conn.State == ConnectionState.Open)) {
                conn.Close();
            }

            return retornoLista;
        } catch (Exception ex) {
            throw ex;
        }

    }

    public static dynamic Traer_Objeto(Object pObject) {
        //  Creacion del string que contiene la sentencia a ejecutar
        string SecuenciaSQL = ("select * from "
                + (pObject.GetType().Name + " where "));
        try {
            var conn = new SqlConnection(CadenaDeConexion);
            conn.Open();
            string Condicion = "";
            for (PropertyInfo property : pObject.GetType().GetProperties()) {
                if (Persistencia.IsPK(pObject.GetType().Name, property.Name)) {
                    Object Valor = Persistencia.DevolverValor(pObject, property, true);
                    if ((Valor == null)) {
                        // TODO: Warning!!! continue If
                    }

                    Condicion = (Condicion
                            + (property.Name + ("="
                            + (Persistencia.PasarAString(Valor) + " AND"))));
                }

            }

            Condicion = (Condicion + (" Eliminado_"
                    + (pObject.GetType().Name + "= false")));
            SecuenciaSQL = (SecuenciaSQL + Condicion);
            SqlCommand cmd = new SqlCommand(SecuenciaSQL, conn);
            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read()) {
                Object retorno = null;
                Type type = Type.GetType(pObject.GetType().Name, true);
                retorno = Activator.CreateInstance(type);
                for (var property : pObject.GetType().GetProperties()) {
                    Object caprutatValor = reader[property.Name];
                    object valorRetorno = null;
                    if ((property.PropertyType == typeof(String))) {
                        valorRetorno = caprutatValor.ToString();
                    }

                    if ((property.PropertyType == typeof(int))) {
                        valorRetorno = int.Parse
                        (caprutatValor.ToString()
                    
                    
                    
                    
                    
                    );
                        }
                        
                        if ((property.PropertyType == typeof(boolean))) {
                        caprutatValor = boolean.Parse
                        (caprutatValor.ToString()
                    
                    
                    
                    
                    
                    );
                        }
                        
                        if (!Persistencia.IsPrimitio(property)) {
                        Object aux = property.GetValue(pObject);
                        Type tipo_ObjC = Type.GetType(aux.GetType().Name, true);
                        Object Instance = Activator.CreateInstance(tipo_ObjC);
                        for (PropertyInfo info : Instance.GetType().GetProperties()) {
                            if (Persistencia.IsPK(Instance.GetType().Name, info.Name)) {
                                info.SetValue(Instance, caprutatValor);
                                Instance = Persistencia.Traer_Lista_Objeto_ConELiminados(Instance);
                                valorRetorno = Instance;
                                break;
                            }

                        }

                    }

                    property.SetValue(retorno, caprutatValor);
                }

                return retorno;
            }

            if ((conn.State == ConnectionState.Open)) {
                conn.Close();
            }

            return null;
        } catch (Exception ex) {
            throw ex;
        }

    }

    public static dynamic Traer_Lista_Objeto(Object pObject) {
        //  Creacion del string que contiene la sentencia a ejecutar
        string SecuenciaSQL = ("select  *  from "
                + (pObject.GetType().Name + (" WHERE Eliminado_"
                + (pObject.GetType().Name + "= false"))));
        var retornoLista = new List<dynamic>();
        try {
            var conn = new SqlConnection(CadenaDeConexion);
            //  Se Abre la Conexion con BD
            conn.Open();
            SqlCommand cmd = new SqlCommand(SecuenciaSQL, conn);
            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read()) {
                Object retorno = null;
                Type type = Type.GetType(pObject.GetType().Name, true);
                retorno = Activator.CreateInstance(type);
                for (var property : pObject.GetType().GetProperties()) {
                    Object caprutatValor = reader[property.Name];
                    object valorRetorno = null;
                    if ((property.PropertyType == typeof(String))) {
                        valorRetorno = caprutatValor.ToString();
                    }

                    if ((property.PropertyType == typeof(int))) {
                        valorRetorno = int.Parse
                        (caprutatValor.ToString()
                    
                    
                    
                    
                    
                    );
                        }
                        
                        if ((property.PropertyType == typeof(boolean))) {
                        caprutatValor = boolean.Parse
                        (caprutatValor.ToString()
                    
                    
                    
                    
                    
                    );
                        }
                        
                        if (!Persistencia.IsPrimitio(property)) {
                        Object aux = property.GetValue(pObject);
                        Type tipo_ObjC = Type.GetType(aux.GetType().Name, true);
                        Object Instance = Activator.CreateInstance(tipo_ObjC);
                        for (PropertyInfo info : Instance.GetType().GetProperties()) {
                            if (Persistencia.IsPK(Instance.GetType().Name, info.Name)) {
                                info.SetValue(Instance, caprutatValor);
                                Instance = Persistencia.Traer_Lista_Objeto_ConELiminados(Instance);
                                valorRetorno = Instance;
                                break;
                            }

                        }

                    }

                    property.SetValue(retorno, caprutatValor);
                }

                retornoLista.Add(retorno);
            }

            if ((conn.State == ConnectionState.Open)) {
                conn.Close();
            }

            return retornoLista;
        } catch (Exception ex) {
            throw ex;
        }

    }
    // </editor-fold>
}

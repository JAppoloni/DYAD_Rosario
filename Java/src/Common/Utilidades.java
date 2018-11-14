/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PERSONAL
 */
public class Utilidades {

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    //metodo para validar si la fecha es correcta
    public static boolean validarFecha(String fechax) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formatoFecha.parse(fechax);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    //función para convertir desde una fecha sql.date a una fecha date.util
    public static java.util.Date convertirSqlToDateUtil(java.sql.Date uDate) {
        java.util.Date sDate = new java.util.Date(uDate.getTime());
        return sDate;
    }
    
    //convertir una fecha util.date a un string
    public static String convertirDateUtilAString(java.util.Date utilDate) {
       SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
       return df.format(utilDate);
    }
    
    //convertir una fecha util.date a un string para la BD
    public static String convertirDateUtilAStringBD(java.util.Date utilDate) {
       SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
       return df.format(utilDate);
    }
}


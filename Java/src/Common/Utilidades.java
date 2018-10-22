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
}

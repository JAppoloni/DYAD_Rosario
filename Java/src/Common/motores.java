/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Common;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class motores {
    private int idMotor;

    public int getIdMotor() {
        return idMotor;
    }

    public void setIdMotor(int idMotor) {
        this.idMotor = idMotor;
    }

    public String getNombreMotor() {
        return nombreMotor;
    }

    public void setNombreMotor(String nombreMotor) {
        this.nombreMotor = nombreMotor;
    }

    public boolean isIdDeleted() {
        return idDeleted;
    }

    public void setIdDeleted(boolean idDeleted) {
        this.idDeleted = idDeleted;
    }
    private String nombreMotor;
    private boolean idDeleted;

    public motores(int idMotor, String nombreMotor, boolean idDeleted) {
        this.idMotor = idMotor;
        this.nombreMotor = nombreMotor;
        this.idDeleted = idDeleted;
    }

    public motores() {
    }
          
}

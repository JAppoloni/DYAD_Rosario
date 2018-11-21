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

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    private int idMotor;
    private String nombreMotor;
    private boolean isDeleted;

    

    public motores(int idMotor, String nombreMotor, boolean isDeleted) {
        this.idMotor = idMotor;
        this.nombreMotor = nombreMotor;
        this.isDeleted = isDeleted;
    }

    public motores() {
    }
          
}

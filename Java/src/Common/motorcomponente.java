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
public class motorcomponente {

    private int idMotorMotorComponente;
    private int idComponenteMotorComponente;
    private int cantidadMotorComponente;

    public motorcomponente(int idMotorMotorComponente, int idComponenteMotorComponente, int cantidadMotorComponente) {
        this.idMotorMotorComponente = idMotorMotorComponente;
        this.idComponenteMotorComponente = idComponenteMotorComponente;
        this.cantidadMotorComponente = cantidadMotorComponente;
    }

    public int getIdMotorMotorComponente() {
        return idMotorMotorComponente;
    }

    public void setIdMotorMotorComponente(int idMotorMotorComponente) {
        this.idMotorMotorComponente = idMotorMotorComponente;
    }

    public int getIdComponenteMotorComponente() {
        return idComponenteMotorComponente;
    }

    public void setIdComponenteMotorComponente(int idComponenteMotorComponente) {
        this.idComponenteMotorComponente = idComponenteMotorComponente;
    }

    public int getCantidadMotorComponente() {
        return cantidadMotorComponente;
    }

    public void setCantidadMotorComponente(int cantidadMotorComponente) {
        this.cantidadMotorComponente = cantidadMotorComponente;
    }
    
}

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

    private motores idMotorMotorComponente;
    private componente idComponenteMotorComponente;
    private int cantidadMotorComponente;

    public motores getIdMotorMotorComponente() {
        return idMotorMotorComponente;
    }

    public void setIdMotorMotorComponente(motores idMotorMotorComponente) {
        this.idMotorMotorComponente = idMotorMotorComponente;
    }

    public componente getIdComponenteMotorComponente() {
        return idComponenteMotorComponente;
    }

    public void setIdComponenteMotorComponente(componente idComponenteMotorComponente) {
        this.idComponenteMotorComponente = idComponenteMotorComponente;
    }

    public int getCantidadMotorComponente() {
        return cantidadMotorComponente;
    }

    public void setCantidadMotorComponente(int cantidadMotorComponente) {
        this.cantidadMotorComponente = cantidadMotorComponente;
    }

    public motorcomponente(motores idMotorMotorComponente, componente idComponenteMotorComponente, int cantidadMotorComponente) {
        this.idMotorMotorComponente = idMotorMotorComponente;
        this.idComponenteMotorComponente = idComponenteMotorComponente;
        this.cantidadMotorComponente = cantidadMotorComponente;
    }
    public motorcomponente() {
    }
    

 
    
}

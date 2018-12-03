/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dominio.dEmpresa;
import Interfase.observer;
import Interfase.vObservable;
import Interfase.vPrincipal;


public class main {

    public static dEmpresa empresa;

    public main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        observer obs = new observer();
        vPrincipal ventanaPrincipal = new vPrincipal(Dominio.dEmpresa.getInstancia(), obs);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
        vObservable ventanaObservable = new vObservable(Dominio.dEmpresa.getInstancia(), obs);
        obs.addObserver(ventanaObservable);
        ventanaObservable.setLocationRelativeTo(null);
        ventanaObservable.setVisible(true);
    }

    public dEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(dEmpresa pEmp) {
        empresa = pEmp;
    }
}

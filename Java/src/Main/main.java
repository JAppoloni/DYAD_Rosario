/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dominio.dEmpresa;
import Interfase.vPrincipal;


public class main {

    public static dEmpresa empresa;

    public main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vPrincipal ventanaPrincipal = new vPrincipal(Dominio.dEmpresa.getInstancia());
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);
    }

    public dEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(dEmpresa pEmp) {
        empresa = pEmp;
    }
}

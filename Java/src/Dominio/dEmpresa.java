/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.*;
import java.util.ArrayList;

/**
 *
 * @author administrator
 */
public class dEmpresa {

    // <editor-fold defaultstate="collapsed" desc=" Inctancia ">
    private static dEmpresa instancia;

    public static dEmpresa getInstancia() {
        if (instancia == null) {
            instancia = new dEmpresa();
        }
        return instancia;
    }

    public dEmpresa() {
    }
// </editor-fold>
    
    private dCliente empresaCliente = new dCliente();
    // <editor-fold defaultstate="collapsed" desc=" Cliente ">
    public cliente buscarCliente(cliente pCliente) throws cDatosException {
        cliente unCliente = new cliente();
        if (pCliente != null) {
            if (pCliente.getIdClie() != 0) {
                try {
                    unCliente = empresaCliente.buscar(pCliente);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar cliente:" + ex.getMessage());
                }
            }
        }
        if (unCliente != null) {
            return unCliente;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosClientes() throws cDatosException {
        dCliente unCliente = new dCliente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unCliente.buscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los clientes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    

    public boolean agregarCliente(cliente clien) throws cDatosException {
        if (clien != null) {
            try {
                empresaCliente.guardar(clien);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el cliente:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarCliente(cliente clien) throws cDatosException {
        if (clien != null) {
            try {
                empresaCliente.modificar(clien);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al modificar cliente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarCliente(cliente clien) throws cDatosException {
        if (clien != null) {
            try {
                empresaCliente.eliminar(clien);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar cliente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
    
    
    private dComponente empresaComponente = new dComponente();
    // <editor-fold defaultstate="collapsed" desc=" Componente ">
    public componente buscarComponente(componente pComponente) throws cDatosException {
        componente unComponente = new componente();
        if (pComponente != null) {
            if (pComponente.getIdComp() != 0) {
                try {
                    unComponente = empresaComponente.buscar(pComponente);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar componente:" + ex.getMessage());
                }
            }
        }
        if (unComponente != null) {
            return unComponente;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosComponentes() throws cDatosException {
        dComponente unComponente = new dComponente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unComponente.buscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los componentes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    

    public boolean agregarComponente(componente compo) throws cDatosException {
        if (compo != null) {
            try {
                empresaComponente.guardar(compo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el componente:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarComponente(componente compo) throws cDatosException {
        if (compo != null) {
            try {
                empresaComponente.modificar(compo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al modificar componente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarComponente(componente compo) throws cDatosException {
        if (compo != null) {
            try {
                empresaComponente.eliminar(compo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar componente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
}

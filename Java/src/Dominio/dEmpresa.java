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
    
    private dTipo empresaTipo = new dTipo();

    // <editor-fold defaultstate="collapsed" desc=" Tipo ">
    public cTipo buscarTipo(cTipo pTipo) throws cDatosException {
        cTipo unTipo = new cTipo();
        if (pTipo != null) {
            if (pTipo.getId() != 0) {
                try {
                    unTipo = empresaTipo.buscar(pTipo);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar tipo:" + ex.getMessage());
                }
            }
        }
        if (unTipo != null) {
            return unTipo;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosTipos() throws cDatosException {
        dTipo unTipo = new dTipo();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unTipo.buscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los tipos:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    public int generarIdTipo() throws cDatosException {
        dTipo unTipo = new dTipo();
        int num = 0;
        try {
            num = unTipo.generarId();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar el tipo:" + ex.getMessage());
        }
        return num;
    }

    public boolean agregarTipo(cTipo tipo) throws cDatosException {
        if (tipo != null) {
            try {
                empresaTipo.guardar(tipo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el tipo:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarTipo(cTipo tipo) throws cDatosException {
        if (tipo != null) {
            try {
                empresaTipo.modificar(tipo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al modificar tipo:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarTipo(cTipo tipo) throws cDatosException {
        if (tipo != null) {
            try {
                empresaTipo.eliminar(tipo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar tipo:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
}

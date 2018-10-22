/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.*;
import Persistencia.pTipo;
import java.util.ArrayList;

/**
 *
 * @author administrator
 */
public class dTipo {

    public void guardar(cTipo pTipo) throws cDatosException {
        if (pTipo.getId() != 0) {
            pTipo pPersistencia = new pTipo();
            pPersistencia.agregar(pTipo);
        }
    }

    public void modificar(cTipo pTipo) throws cDatosException {
        if (pTipo.getId() != 0) {
            pTipo pPersistencia = new pTipo();
            pPersistencia.modificar(pTipo);
        }
    }

    public void eliminar(cTipo pTipo) throws cDatosException {
        if (pTipo.getId() != 0) {
            pTipo pPersistencia = new pTipo();
            pPersistencia.eliminar(pTipo);
        }
    }

    public cTipo buscar(cTipo pTipo) throws cDatosException {
        cTipo unTipo = new cTipo();
        if (pTipo.getId() != 0) {
            pTipo persistencia = new pTipo();
            unTipo = persistencia.buscarTipo(pTipo);
        }
        if (unTipo != null) {
            return unTipo;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodos() throws cDatosException {
        ArrayList coleccion;
        coleccion = new ArrayList();
        pTipo persistencia = new pTipo();
        coleccion = persistencia.buscarTodos();
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    public int generarId() throws cDatosException {
        int id;
        pTipo persistencia = new pTipo();
        id = persistencia.generarId();

        if (id > 0) {
            return id;
        } else {
            return 0;
        }
    }
}

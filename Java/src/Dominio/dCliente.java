/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.*;
import Persistencia.pGenerico;
import java.util.ArrayList;

/**
 *
 * @author administrator
 */
public class dCliente {

    public void Alta(cliente pCliente) throws cDatosException {
        if (pCliente == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.agregar(pCliente);
        }
    }

    public void modificar(cliente pCliente) throws cDatosException {
        if (pCliente == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.modificar(pCliente);
        }
    }

    public void eliminar(cliente pCliente) throws cDatosException {
        if (pCliente == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.eliminar(pCliente);
        }
    }

    public cliente buscar(cliente pCliente) throws cDatosException {
        cliente unCliente = new cliente();
        if (pCliente.getIdClie() != 0) {
            pGenerico persistencia = new pGenerico();
            unCliente = (cliente) persistencia.TraerEspecifico(pCliente);
        }
        if (unCliente != null) {
            return unCliente;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodosSinEliminados() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        cliente pCliente = new cliente();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pCliente);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
         
        public ArrayList BuscarTodos() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        cliente pCliente = new cliente();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pCliente);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

}

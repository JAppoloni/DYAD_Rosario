/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.*;
import Persistencia.pCliente;
import java.util.ArrayList;

/**
 *
 * @author administrator
 */
public class dCliente {

    public void guardar(cliente pCliente) throws cDatosException {
        if (pCliente.getIdClie() != 0) {
            pCliente pPersistencia = new pCliente();
            pPersistencia.agregar(pCliente);
        }
    }

    public void modificar(cliente pCliente) throws cDatosException {
        if (pCliente.getIdClie() != 0) {
            pCliente pPersistencia = new pCliente();
            pPersistencia.modificar(pCliente);
        }
    }

    public void eliminar(cliente pCliente) throws cDatosException {
        if (pCliente.getIdClie() != 0) {
            pCliente pPersistencia = new pCliente();
            pPersistencia.eliminar(pCliente);
        }
    }

    public cliente buscar(cliente pCliente) throws cDatosException {
        cliente unCliente = new cliente();
        if (pCliente.getIdClie() != 0) {
            pCliente persistencia = new pCliente();
            unCliente = persistencia.buscarCliente(pCliente);
        }
        if (unCliente != null) {
            return unCliente;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodos() throws cDatosException {
        ArrayList coleccion;
        coleccion = new ArrayList();
        pCliente persistencia = new pCliente();
        coleccion = persistencia.buscarTodos();
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

     
    
}

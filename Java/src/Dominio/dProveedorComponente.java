/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Common.proveedorcomponente;
import Persistencia.pGenerico;
import java.util.ArrayList;

/**
 *
 * @author jmanu
 */
public class dProveedorComponente {
    
        public void Alta(proveedorcomponente pproveedorcomponente) throws cDatosException {
        if (pproveedorcomponente == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.agregar(pproveedorcomponente);
        }
    }

    public void modificar(proveedorcomponente pproveedorcomponente) throws cDatosException {
        if (pproveedorcomponente == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.modificar(pproveedorcomponente);
        }
    }

    public void eliminar(proveedorcomponente pproveedorcomponente) throws cDatosException {
        if (pproveedorcomponente == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.eliminar(pproveedorcomponente);
        }
    }

    public proveedorcomponente buscar(proveedorcomponente pproveedorcomponente) throws cDatosException {
        proveedorcomponente unproveedorcomponente = new proveedorcomponente();
        if (pproveedorcomponente == null) {
            pGenerico persistencia = new pGenerico();
            unproveedorcomponente = (proveedorcomponente) persistencia.TraerEspecifico(pproveedorcomponente);
        }
        if (unproveedorcomponente != null) {
            return unproveedorcomponente;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodosSinEliminados() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        proveedorcomponente pproveedorcomponente = new proveedorcomponente();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pproveedorcomponente);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
         
        public ArrayList BuscarTodos() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        proveedorcomponente pproveedorcomponente = new proveedorcomponente();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pproveedorcomponente);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
}

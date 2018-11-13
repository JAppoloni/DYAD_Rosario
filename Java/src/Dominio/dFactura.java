/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Common.factura;
import Persistencia.pGenerico;
import java.util.ArrayList;

/**
 *
 * @author jmanu
 */
public class dFactura {

    public void Alta(factura pfactura) throws cDatosException {
        if (pfactura == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.agregar(pfactura);
        }
    }

    public void modificar(factura pfactura) throws cDatosException {
        if (pfactura == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.modificar(pfactura);
        }
    }

    public void eliminar(factura pfactura) throws cDatosException {
        if (pfactura == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.eliminar(pfactura);
        }
    }

    public factura buscar(factura pfactura) throws cDatosException {
        factura unfactura = new factura();
        if (pfactura == null) {
            pGenerico persistencia = new pGenerico();
            unfactura = (factura) persistencia.TraerEspecifico(pfactura);
        }
        if (unfactura != null) {
            return unfactura;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodosSinEliminados() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        factura pfactura = new factura();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pfactura);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
         
        public ArrayList BuscarTodos() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        factura pfactura = new factura();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pfactura);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
}

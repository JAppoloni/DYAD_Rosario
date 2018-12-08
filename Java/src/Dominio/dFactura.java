/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Common.factura;
import Common.pedido;
import Persistencia.pFactura;
import Persistencia.pGenerico;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jmanu
 */
public class dFactura {

    public void Alta(factura pfactura) throws cDatosException {
        if (pfactura != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.agregar(pfactura);
        }
    }

    public void modificar(factura pfactura) throws cDatosException {
        if (pfactura != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.modificar(pfactura);
        }
    }

    public void eliminar(factura pfactura) throws cDatosException {
        if (pfactura != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.eliminar_Logico(pfactura);
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

    public int calcularCostoXPedido(pedido ppedido) throws cDatosException, SQLException {
        int num = 0;
        if (ppedido.getIdPedido() != 0) {
            pFactura persistencia = new pFactura();
            num = (int) persistencia.calcularCostoXPedido(ppedido);
        }
        if (num != 0) {
            return num;
        } else {
            return 0;
        }
    }
    
    public int TotalFacturado(Object o, Object o1) throws cDatosException, SQLException {
            pFactura persistencia = new pFactura();
         return (int) persistencia.TotalFacturado(o, o1);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Common.pedido;
import Persistencia.pGenerico;
import java.util.ArrayList;

public class dPedido {
 
        public void Alta(pedido ppedido) throws cDatosException {
        if (ppedido == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.agregar(ppedido);
        }
    }

    public void modificar(pedido ppedido) throws cDatosException {
        if (ppedido == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.modificar(ppedido);
        }
    }

    public void eliminar(pedido ppedido) throws cDatosException {
        if (ppedido == null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.eliminar(ppedido);
        }
    }

    public pedido buscar(pedido ppedido) throws cDatosException {
        pedido unpedido = new pedido();
        if (ppedido == null) {
            pGenerico persistencia = new pGenerico();
            unpedido = (pedido) persistencia.TraerEspecifico(ppedido);
        }
        if (unpedido != null) {
            return unpedido;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodosSinEliminados() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        pedido ppedido = new pedido();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(ppedido);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
         
        public ArrayList BuscarTodos() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        pedido ppedido = new pedido();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(ppedido);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
}
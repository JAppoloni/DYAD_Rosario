/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Common.proveedor;
import Persistencia.pGenerico;
import java.util.ArrayList;

/**
 *
 * @author jmanu
 */
public class dProveedor {
    
        public void Alta(proveedor pproveedor) throws cDatosException {
        if (pproveedor != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.agregar(pproveedor);
        }
    }

    public void modificar(proveedor pproveedor) throws cDatosException {
        if (pproveedor != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.modificar(pproveedor);
        }
    }

    public void eliminar(proveedor pproveedor) throws cDatosException {
        if (pproveedor != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.eliminar_Logico(pproveedor);
        }
    }

    public proveedor buscar(proveedor pproveedor) throws cDatosException {
        proveedor unproveedor = new proveedor();
        if (pproveedor == null) {
            pGenerico persistencia = new pGenerico();
            unproveedor = (proveedor) persistencia.TraerEspecifico(pproveedor);
        }
        if (unproveedor != null) {
            return unproveedor;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodosSinEliminados() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        proveedor pproveedor = new proveedor();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pproveedor);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
         
        public ArrayList BuscarTodos() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        proveedor pproveedor = new proveedor();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pproveedor);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
}

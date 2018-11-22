/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Common.motores;
import Persistencia.pGenerico;
import java.util.ArrayList;

/**
 *
 * @author jmanu
 */
public class dMotores {
 
    public void agregar(motores pmotores) throws cDatosException {
        if (pmotores != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.agregar(pmotores);
        }
    }

    public void modificar(motores pmotores) throws cDatosException {
        if (pmotores != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.modificar(pmotores);
        }
    }

    public void eliminar(motores pmotores) throws cDatosException {
        if (pmotores != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.eliminar_Logico(pmotores);
        }
    }

    public motores Buscar(motores pmotores) throws cDatosException {
        motores unmotores = new motores();
        if (pmotores != null) {
            pGenerico persistencia = new pGenerico();
            unmotores = (motores) persistencia.TraerEspecifico(pmotores);
        }
        if (unmotores != null) {
            return unmotores;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodos() throws cDatosException {
        ArrayList coleccion = new ArrayList();

        motores auxMotores = new motores();

        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodos(auxMotores);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodosSinELiminados() throws cDatosException {
        ArrayList coleccion = new ArrayList();

        motores auxMotores = new motores();

        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(auxMotores);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

}

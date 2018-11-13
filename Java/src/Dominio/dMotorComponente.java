/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.cDatosException;
import Common.motorcomponente;
import Persistencia.pGenerico;
import java.util.ArrayList;

/**
 *
 * @author jmanu
 */
public class dMotorComponente {
 
        public void agregar(motorcomponente  pmotorcomponente ) throws cDatosException {
        if (pmotorcomponente  != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.agregar(pmotorcomponente );
        }
    }

    public void modificar(motorcomponente  pmotorcomponente ) throws cDatosException {
        if (pmotorcomponente  != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.modificar(pmotorcomponente );
        }
    }

    public void eliminar(motorcomponente  pmotorcomponente ) throws cDatosException {
        if (pmotorcomponente  != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.eliminar(pmotorcomponente );
        }
    }

    public motorcomponente  Buscar(motorcomponente  pmotorcomponente ) throws cDatosException {
        motorcomponente  unmotorcomponente  = new motorcomponente ();
        if (pmotorcomponente  != null) {
            pGenerico persistencia = new pGenerico();
            unmotorcomponente  = (motorcomponente ) persistencia.TraerEspecifico(pmotorcomponente );
        }
        if (unmotorcomponente  != null) {
            return unmotorcomponente ;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodos() throws cDatosException {
        ArrayList coleccion = new ArrayList();

        motorcomponente  auxMotorComponente = new motorcomponente ();

        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodos(auxMotorComponente);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodosSinELiminados() throws cDatosException {
        ArrayList coleccion = new ArrayList();

        motorcomponente  auxMotorComponente = new motorcomponente ();

        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodos(auxMotorComponente);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
}

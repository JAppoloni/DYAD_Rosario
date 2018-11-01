
package Dominio;

import Common.cDatosException;
import Common.cliente;
import Common.componente;
import Persistencia.pComponente;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class dComponente {
     public void guardar(componente pComponente) throws cDatosException {
        if (pComponente.getIdComp() != 0) {
            pComponente pPersistencia = new pComponente();
            pPersistencia.agregar(pComponente);
        }
    }

    public void modificar(componente pComponente) throws cDatosException {
        if (pComponente.getIdComp() != 0) {
            pComponente pPersistencia = new pComponente();
            pPersistencia.modificar(pComponente);
        }
    }

    public void eliminar(componente pComponente) throws cDatosException {
        if (pComponente.getIdComp() != 0) {
            pComponente pPersistencia = new pComponente();
            pPersistencia.eliminar(pComponente);
        }
    }

    public componente buscar(componente pComponente) throws cDatosException {
        componente unComponente = new componente();
        if (pComponente.getIdComp() != 0) {
            pComponente persistencia = new pComponente();
            unComponente = persistencia.buscarComponente(pComponente);
        }
        if (unComponente != null) {
            return unComponente;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodos() throws cDatosException {
        ArrayList coleccion;
        coleccion = new ArrayList();
        pComponente persistencia = new pComponente();
        coleccion = persistencia.buscarTodos();
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

     
    
}

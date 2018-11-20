
package Dominio;

import Common.cDatosException;
import Common.componente;
import Persistencia.pGenerico;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class dComponente {
     
    public void Alta(componente pcomponente) throws cDatosException {
        if (pcomponente != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.agregar(pcomponente);
        }
    }

    public void modificar(componente pcomponente) throws cDatosException {
        if (pcomponente != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.modificar(pcomponente);
        }
    }

    public void eliminar(componente pcomponente) throws cDatosException {
        if (pcomponente != null) {
            pGenerico pPersistencia = new pGenerico();
            pPersistencia.eliminar_Logico(pcomponente);
        }
    }

    public componente buscar(componente pcomponente) throws cDatosException {
        componente uncomponente = new componente();
        if (pcomponente == null) {
            pGenerico persistencia = new pGenerico();
            uncomponente = (componente) persistencia.TraerEspecifico(pcomponente);
        }
        if (uncomponente != null) {
            return uncomponente;
        } else {
            return null;
        }
    }

    public ArrayList BuscarTodosSinEliminados() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        componente pcomponente = new componente();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pcomponente);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
         
        public ArrayList BuscarTodos() throws cDatosException {
        ArrayList coleccion = new ArrayList();
        componente pcomponente = new componente();
 
        pGenerico persistencia = new pGenerico();
        coleccion = (ArrayList) persistencia.TraerTodosSinEliminados(pcomponente);
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
}

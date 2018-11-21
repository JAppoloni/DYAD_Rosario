/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Common;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class proveedorcomponente {
private proveedor idProveedorProveedorComponente;
private componente idComponenteProveedorComponente;
private boolean isDeleted;

    public proveedor getIdProveedorProveedorComponente() {
        return idProveedorProveedorComponente;
    }

    public void setIdProveedorProveedorComponente(proveedor idProveedorProveedorComponente) {
        this.idProveedorProveedorComponente = idProveedorProveedorComponente;
    }

    public componente getIdComponenteProveedorComponente() {
        return idComponenteProveedorComponente;
    }

    public void setIdComponenteProveedorComponente(componente idComponenteProveedorComponente) {
        this.idComponenteProveedorComponente = idComponenteProveedorComponente;
    }

    public boolean isIsDeletedProveedorComponente() {
        return isDeleted;
    }

    public void setIsDeletedProveedorComponente(boolean isDeletedProveedorComponente) {
        this.isDeleted = isDeleted;
    }

    public proveedorcomponente(proveedor idProveedorProveedorComponente, componente idComponenteProveedorComponente, boolean isDeletedProveedorComponente) {
        this.idProveedorProveedorComponente = idProveedorProveedorComponente;
        this.idComponenteProveedorComponente = idComponenteProveedorComponente;
        this.isDeleted = isDeleted;
    }

    public proveedorcomponente() {
    }
}

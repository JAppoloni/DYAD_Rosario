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
public class proveedor {
private int idProvedor;
private String nombreProveedor;
private String descProveedor;
private boolean IsDeleted;

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDescProveedor() {
        return descProveedor;
    }

    public void setDescProveedor(String descProveedor) {
        this.descProveedor = descProveedor;
    }

    public boolean isIsDeletedProveedor() {
        return IsDeleted;
    }

    public void setIsDeletedProveedor(boolean IsDeletedProveedor) {
        this.IsDeleted = IsDeleted;
    }

public proveedor(int idProvedor, String nombreProveedor, String descProveedor, boolean IsDeleted) {
        this.idProvedor = idProvedor;
        this.nombreProveedor = nombreProveedor;
        this.descProveedor = descProveedor;
        this.IsDeleted = IsDeleted;
    }

    public proveedor() {
    }
}

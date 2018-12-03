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
private int idProveedor;
private String nombreProveedor;
private String descProveedor;
private boolean IsDeleted;

    @Override
    public String toString() {
        return  idProveedor + ", " + nombreProveedor ;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
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

    public boolean isIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public proveedor(int idProveedor, String nombreProveedor, String descProveedor, boolean IsDeleted) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.descProveedor = descProveedor;
        this.IsDeleted = IsDeleted;
    }

    

    public proveedor() {
    }
}

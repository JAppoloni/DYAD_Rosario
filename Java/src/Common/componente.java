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
public class componente {
private int idComp;
private String descripcionComp;
private int costoComp;
private int cantStockComp;
private int cantMinStockComp;
private boolean isDeleted;

    public componente(int idComp, String descripcionComp, int costoComp, int cantStockComp, int cantMinStockComp, boolean isDeleted) {
        this.idComp = idComp;
        this.descripcionComp = descripcionComp;
        this.costoComp = costoComp;
        this.cantStockComp = cantStockComp;
        this.cantMinStockComp = cantMinStockComp;
        this.isDeleted = isDeleted;
    }

    public componente() {
        
    }
     public int getIdComp() {
        return idComp;
    }

    public void setIdComp(int idComp) {
        this.idComp = idComp;
    }

    public String getDescripcionComp() {
        return descripcionComp;
    }

    public void setDescripcionComp(String descripcionComp) {
        this.descripcionComp = descripcionComp;
    }

    public int getCostoComp() {
        return costoComp;
    }

    public void setCostoComp(int costoComp) {
        this.costoComp = costoComp;
    }

    public int getCantStockComp() {
        return cantStockComp;
    }

    public void setCantStockComp(int cantStockComp) {
        this.cantStockComp = cantStockComp;
    }

    public int getCantMinStockComp() {
        return cantMinStockComp;
    }

    public void setCantMinStockComp(int cantMinStockComp) {
        this.cantMinStockComp = cantMinStockComp;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeletedComp) {
        this.isDeleted = isDeleted;
    }
    
}

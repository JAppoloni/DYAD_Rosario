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
public class cliente {

private int idClie;
private String nombreEmpresaClie;
private String nombreFantasiaClie;
private  String paisClie;
private String direccionClie;
private  String contactoClie;
private boolean isDeleted;

    public cliente() {

    }

    public int getIdClie() {
        return idClie;
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public String getNombreEmpresaClie() {
        return nombreEmpresaClie;
    }

    public void setNombreEmpresaClie(String nombreEmpresaClie) {
        this.nombreEmpresaClie = nombreEmpresaClie;
    }

    public String getNombreFantasiaClie() {
        return nombreFantasiaClie;
    }

    public void setNombreFantasiaClie(String nombreFantasiaClie) {
        this.nombreFantasiaClie = nombreFantasiaClie;
    }

    public String getPaisClie() {
        return paisClie;
    }

    public void setPaisClie(String paisClie) {
        this.paisClie = paisClie;
    }

    public String getDireccionClie() {
        return direccionClie;
    }

    public void setDireccionClie(String direccionClie) {
        this.direccionClie = direccionClie;
    }

    public String getContactoClie() {
        return contactoClie;
    }

    public void setContactoClie(String contactoClie) {
        this.contactoClie = contactoClie;
    }

    public boolean isIdDeleted() {
        return isDeleted;
    }

    public void setIdDeleted(boolean idDeleted) {
        this.isDeleted = idDeleted;
    }

  public cliente(int idClie, String nombreEmpresaClie, String nombreFantasiaClie, String paisClie, String direccionClie, String contactoClie, boolean idDeleted) {
        this.idClie = idClie;
        this.nombreEmpresaClie = nombreEmpresaClie;
        this.nombreFantasiaClie = nombreFantasiaClie;
        this.paisClie = paisClie;
        this.direccionClie = direccionClie;
        this.contactoClie = contactoClie;
        this.isDeleted = idDeleted;
    }
}

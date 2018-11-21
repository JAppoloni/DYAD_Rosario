/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Common;

import java.util.Date;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class pedido {
private int idPedido;
private cliente idCliente;
private Date fechaDeEntregaPedido;
private boolean isDeleted;
private motores idMotorPedido;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaDeEntregaPedido() {
        return fechaDeEntregaPedido;
    }

    public void setFechaDeEntregaPedido(Date fechaDeEntregaPedido) {
        this.fechaDeEntregaPedido = fechaDeEntregaPedido;
    }

    public boolean isIsDeletedPedido() {
        return isDeleted;
    }

    public void setIsDeletedPedido(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public motores getIdMotorPedido() {
        return idMotorPedido;
    }

    public void setIdMotorPedido(motores idMotorPedido) {
        this.idMotorPedido = idMotorPedido;
    }

    public pedido(int idPedido, cliente idCliente, Date fechaDeEntregaPedido, boolean isDeletedPedido, motores idMotorPedido) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fechaDeEntregaPedido = fechaDeEntregaPedido;
        this.isDeleted = isDeleted;
        this.idMotorPedido = idMotorPedido;
    }

    public pedido() {
    }
    
    
}

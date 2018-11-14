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
public class factura {
    
    private int idFactura;
    private Date fechaPagoFactura;
    private pedido idPedidoFactura;
    private boolean idDeletedFactura;

    public factura(int idFactura, Date fechaPagoFactura, pedido idPedidoFactura, boolean idDeletedFactura) {
        this.idFactura = idFactura;
        this.fechaPagoFactura = fechaPagoFactura;
        this.idPedidoFactura = idPedidoFactura;
        this.idDeletedFactura = idDeletedFactura;
    }

    public factura() {
    }

    
    public boolean isIdDeletedFactura() {
        return idDeletedFactura;
    }

    public void setIdDeletedFactura(boolean idDeletedFactura) {
        this.idDeletedFactura = idDeletedFactura;
    }

   
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaPagoFactura() {
        return fechaPagoFactura;
    }

    public void setFechaPagoFactura(Date fechaPagoFactura) {
        this.fechaPagoFactura = fechaPagoFactura;
    }

    public pedido getIdPedidoFactura() {
        return idPedidoFactura;
    }

    public void setIdPedidoFactura(pedido idPedidoFactura) {
        this.idPedidoFactura = idPedidoFactura;
    }
    

}

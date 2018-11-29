/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author administrator
 */
public class dEmpresa {

    // <editor-fold defaultstate="collapsed" desc=" Inctancia ">
    private static dEmpresa instancia;

    public static dEmpresa getInstancia() {
        if (instancia == null) {
            instancia = new dEmpresa();
        }
        return instancia;
    }

    public dEmpresa() {
    }
// </editor-fold>
    
    private dCliente empresaCliente = new dCliente();
    // <editor-fold defaultstate="collapsed" desc=" Cliente ">
    public cliente buscarCliente(cliente pCliente) throws cDatosException {
        cliente unCliente = new cliente();
        if (pCliente != null) {
            if (pCliente.getIdClie() != 0) {
                try {
                    unCliente = empresaCliente.buscar(pCliente);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar cliente:" + ex.getMessage());
                }
            }
        }
        if (unCliente != null) {
            return unCliente;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosClientes() throws cDatosException {
        dCliente unCliente = new dCliente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unCliente.BuscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los clientes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
    
    public ArrayList buscarTodosClientesSinEliminados() throws cDatosException {
        dCliente unCliente = new dCliente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unCliente.BuscarTodosSinEliminados();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los clientes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
    

    public boolean agregarCliente(cliente clien) throws cDatosException {
        if (clien != null) {
            try {
                empresaCliente.Alta(clien);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el cliente:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarCliente(cliente clien) throws cDatosException {
        if (clien != null) {
            try {
                empresaCliente.modificar(clien);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al modificar cliente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarCliente(cliente clien) throws cDatosException {
        if (clien != null) {
            try {
                empresaCliente.eliminar(clien);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar cliente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
    
    
    private dComponente empresaComponente = new dComponente();
    // <editor-fold defaultstate="collapsed" desc=" Componente ">
    public componente buscarComponente(componente pComponente) throws cDatosException {
        componente unComponente = new componente();
        if (pComponente != null) {
            if (pComponente.getIdComp() != 0) {
                try {
                    unComponente = empresaComponente.buscar(pComponente);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar componente:" + ex.getMessage());
                }
            }
        }
        if (unComponente != null) {
            return unComponente;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosComponentes() throws cDatosException {
        dComponente unComponente = new dComponente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unComponente.BuscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los componentes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
public ArrayList buscarTodosComponentesSinEliminados() throws cDatosException {
        dComponente unComponente = new dComponente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unComponente.BuscarTodosSinEliminados();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los componentes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
    

    public boolean agregarComponente(componente compo) throws cDatosException {
        if (compo != null) {
            try {
                empresaComponente.Alta(compo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el componente:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarComponente(componente compo) throws cDatosException {
        if (compo != null) {
            try {
                empresaComponente.modificar(compo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al modificar componente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarComponente(componente compo) throws cDatosException {
        if (compo != null) {
            try {
                empresaComponente.eliminar(compo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar componente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
    
    private dFactura empresaFactura = new dFactura();
    // <editor-fold defaultstate="collapsed" desc=" Factura ">
    public factura buscarFactura(factura pFactura) throws cDatosException {
        factura unaFactura = new factura();
        if (pFactura != null) {
            if (pFactura.getIdFactura()!= 0) {
                try {
                    unaFactura = empresaFactura.buscar(pFactura);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar la factura:" + ex.getMessage());
                }
            }
        }
        if (unaFactura != null) {
            return unaFactura;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosFacturas() throws cDatosException {
        dFactura unaFactura = new dFactura();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unaFactura.BuscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todas las facturas:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosFacturasSinEliminados() throws cDatosException {
        dFactura unaFactura = new dFactura();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unaFactura.BuscarTodosSinEliminados();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todas las facturas:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
    

    public boolean agregarFactura(factura factu) throws cDatosException {
        if (factu != null) {
            try {
                empresaFactura.Alta(factu);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar la factura:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarFactura(factura fact) throws cDatosException {
        if (fact != null) {
            try {
                empresaFactura.modificar(fact);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al modificar factura:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarFactura(factura fact) throws cDatosException {
        if (fact != null) {
            try {
                empresaFactura.eliminar(fact);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar factura:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
    
    public int calcularCostoXPedido(pedido ppedido) throws cDatosException, SQLException {
        int num = 0;
        if (ppedido.getIdPedido() != 0) {
            num=empresaFactura.calcularCostoXPedido(ppedido);
        }
        if (num != 0) {
            return num;
        } else {
            return 0;
        }
    }
// </editor-fold>
    
    private dMotorComponente empresaMotorComponente = new dMotorComponente();
    // <editor-fold defaultstate="collapsed" desc=" Motor Componente ">
    public motorcomponente buscarMotorComponente(motorcomponente pMotorComponente) throws cDatosException {
        motorcomponente unMotorComponente = new motorcomponente();
        if (pMotorComponente != null) {
            if (pMotorComponente.getIdMotorMotorComponente().getIdMotor()!= 0) {
                try {
                    unMotorComponente = empresaMotorComponente.Buscar(pMotorComponente);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar motor-componente:" + ex.getMessage());
                }
            }
        }
        if (unMotorComponente != null) {
            return unMotorComponente;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosMotoresComponentes() throws cDatosException {
        dMotorComponente unMotorComponente = new dMotorComponente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unMotorComponente.BuscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los componentes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosMotoresComponentesSinEliminados() throws cDatosException {
        dMotorComponente unMotorComponente = new dMotorComponente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unMotorComponente.BuscarTodosSinELiminados();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los componentes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    public boolean agregarMotorComponente(motorcomponente motcompo) throws cDatosException {
        if (motcompo != null) {
            try {
                empresaMotorComponente.agregar(motcompo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el motor-componente:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

   
    public boolean eliminarMotorComponente(motorcomponente motcompo) throws cDatosException {
        if (motcompo != null) {
            try {
                empresaMotorComponente.eliminar(motcompo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar motor-componente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
    
    private dProveedor empresaProveedor = new dProveedor();
    // <editor-fold defaultstate="collapsed" desc=" proveedor ">
    public proveedor buscarProveedor(proveedor pProveedor) throws cDatosException {
        proveedor unProveedor = new proveedor();
        if (pProveedor != null) {
            if (pProveedor.getIdProveedor()!= 0) {
                try {
                    unProveedor = empresaProveedor.buscar(pProveedor);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar proveedores:" + ex.getMessage());
                }
            }
        }
        if (unProveedor != null) {
            return unProveedor;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosProveedor() throws cDatosException {
        dProveedor unProveedor = new dProveedor();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unProveedor.BuscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los proveedores:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
    
    public ArrayList buscarTodosProveedorSinEliminados() throws cDatosException {
        dProveedor unProveedor = new dProveedor();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unProveedor.BuscarTodosSinEliminados();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los proveedores:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    

    public boolean agregarProveedor(proveedor prov) throws cDatosException {
        if (prov != null) {
            try {
                empresaProveedor.Alta(prov);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el proveedor:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarProveedor(proveedor prov) throws cDatosException {
        if (prov != null) {
            try {
                empresaProveedor.modificar(prov);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al modificar proveedor:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarProveedor(proveedor prov) throws cDatosException {
        if (prov != null) {
            try {
                empresaProveedor.eliminar(prov);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar proveedor:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
    
     private dMotores empresaMotor = new dMotores();
    // <editor-fold defaultstate="collapsed" desc=" Motor ">
    public motores buscarMotor(motores pMotor) throws cDatosException {
        motores unMotor = new motores();
        if (pMotor != null) {
            if (pMotor.getIdMotor() != 0) {
                try {
                    unMotor = empresaMotor.Buscar(pMotor);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar motor:" + ex.getMessage());
                }
            }
        }
        if (unMotor != null) {
            return unMotor;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosMotores() throws cDatosException {
        dMotores unMotor = new dMotores();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unMotor.BuscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los motor:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
    
     public ArrayList buscarTodosMotoresSinEliminados() throws cDatosException {
        dMotores unMotor = new dMotores();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unMotor.BuscarTodosSinELiminados();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los motor:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    

    public boolean agregarMotor(motores moto) throws cDatosException {
        if (moto != null) {
            try {
                empresaMotor.agregar(moto);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el motor:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarMotor(motores moto) throws cDatosException {
        if (moto != null) {
            try {
                empresaMotor.modificar(moto);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al modificar moto:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarMotor(motores moto) throws cDatosException {
        if (moto != null) {
            try {
                empresaMotor.eliminar(moto);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar motor:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
    
    private dPedido empresaPedido = new dPedido();
    // <editor-fold defaultstate="collapsed" desc=" Pedido ">
    public pedido buscarPedido(pedido pPedido) throws cDatosException {
        pedido unPedido = new pedido();
        if (pPedido != null) {
            if (pPedido.getIdPedido() != 0) {
                try {
                    unPedido = empresaPedido.buscar(pPedido);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar pedido:" + ex.getMessage());
                }
            }
        }
        if (unPedido != null) {
            return unPedido;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosPedidos() throws cDatosException {
        dPedido unPedido = new dPedido();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unPedido.BuscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los pedidos:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
    
    public ArrayList buscarTodosPedidosSinEliminados() throws cDatosException {
        dPedido unPedido = new dPedido();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unPedido.BuscarTodosSinEliminados();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los pedidos:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    

    public boolean agregarPedido(pedido pedid) throws cDatosException {
        if (pedid != null) {
            try {
                empresaPedido.Alta(pedid);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el pedid:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    public boolean modificarPedido(pedido pedid) throws cDatosException {
        if (pedid != null) {
            try {
                empresaPedido.modificar(pedid);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al modificar pedido:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }

    public boolean eliminarPedido(pedido pedid) throws cDatosException {
        if (pedid != null) {
            try {
                empresaPedido.eliminar(pedid);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar pedido:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
    
    
    private dProveedorComponente empresaProveedorComponente = new dProveedorComponente();
    // <editor-fold defaultstate="collapsed" desc=" Proveedor-Componente ">
    public proveedorcomponente buscarProveedorComponente(proveedorcomponente pProveedorComponente) throws cDatosException {
        proveedorcomponente unProveedorComponente = new proveedorcomponente();
        if (pProveedorComponente != null) {
            if (pProveedorComponente.getIdProveedorProveedorComponente().getIdProveedor() != 0 && pProveedorComponente.getIdComponenteProveedorComponente().getIdComp() != 0 ) {
                try {
                    unProveedorComponente= empresaProveedorComponente.buscar(pProveedorComponente);
                } catch (cDatosException ex) {
                    throw new cDatosException("Error al buscar proveedor-componente:" + ex.getMessage());
                }
            }
        }
        if (unProveedorComponente != null) {
            return unProveedorComponente;
        } else {
            return null;
        }
    }

    public ArrayList buscarTodosProveedoresComponentes() throws cDatosException {
        dProveedorComponente unProveedorComponente = new dProveedorComponente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unProveedorComponente.BuscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los proveedores-componentes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }
    
    public ArrayList buscarTodosProveedoresComponentesSinEliminados() throws cDatosException {
        dProveedorComponente unProveedorComponente = new dProveedorComponente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unProveedorComponente.BuscarTodosSinEliminados();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los proveedores-componentes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    

    public boolean agregarProveedorComponente(proveedorcomponente provcompo) throws cDatosException {
        if (provcompo!= null) {
            try {
                empresaProveedorComponente.Alta(provcompo);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al ingresar el proveedor-componente:" + ex.getMessage());
            }


        } else {
            return false;
        }
    }

    

    public boolean eliminarProveedorComponente(proveedorcomponente provcomp) throws cDatosException {
        if (provcomp != null) {
            try {
                empresaProveedorComponente.eliminar(provcomp);
                return true;
            } catch (cDatosException ex) {
                throw new cDatosException("Error al eliminar proveedor-componente:" + ex.getMessage());
            }
        } else {
            return false;
        }
    }
// </editor-fold>
}

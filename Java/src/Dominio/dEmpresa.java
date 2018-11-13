/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Common.*;
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
            coleccion = unCliente.buscarTodos();
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
                empresaCliente.guardar(clien);
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
            coleccion = unComponente.buscarTodos();
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
                empresaComponente.guardar(compo);
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
            coleccion = unaFactura.buscarTodos();
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
                empresaFactura.guardar(factu);
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
// </editor-fold>
    
    private dMotorComponente empresaMotorComponente = new dMotorComponente();
    // <editor-fold defaultstate="collapsed" desc=" Motor Componente ">
    public motorcomponente buscarMotorComponente(motorcomponente pMotorComponente) throws cDatosException {
        motorcomponente unMotorComponente = new motorcomponente();
        if (pMotorComponente != null) {
            if (pMotorComponente.getIdMotorMotorComponente()!= 0) {
                try {
                    unMotorComponente = empresaComponente.buscar(pMotorComponente);
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
            coleccion = unMotorComponente.buscarTodos();
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
                empresaMotorComponente.guardar(compo);
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
            if (pProveedor.getIdProvedor()!= 0) {
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
            coleccion = unProveedor.buscarTodos();
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
                empresaProveedor.guardar(prov);
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

    public boolean eliminarComponente(proveedor prov) throws cDatosException {
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
    
     private dMotor empresaMotor = new dMotor();
    // <editor-fold defaultstate="collapsed" desc=" Motor ">
    public motores buscarMotor(motores pMotor) throws cDatosException {
        motores unMotor = new motores();
        if (pMotor != null) {
            if (pMotor.getIdMotor() != 0) {
                try {
                    unMotor = empresaMotor.buscar(pMotor);
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
        dMotor unMotor = new dMotor();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unMotor.buscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los motor:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    

    public boolean agregarComponente(motores moto) throws cDatosException {
        if (moto != null) {
            try {
                empresaMotor.guardar(moto);
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
        dPedido unPedido = new dComponente();
        ArrayList coleccion;
        coleccion = new ArrayList();
        try {
            coleccion = unPedido.buscarTodos();
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
                empresaPedido.guardar(pedid);
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

    public boolean eliminarComponente(pedido pedid) throws cDatosException {
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
        proveedorcomponente unProvedorComponente = new proveedorcomponente();
        if (pProveedorComponente != null) {
            if (pProveedorComponente.getIdProveedorProveedorComponente() != 0 && pProveedorComponente.getIdComponenteProveedorComponente() != 0 ) {
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
            coleccion = unProveedorComponente.buscarTodos();
        } catch (cDatosException ex) {
            throw new cDatosException("Error al buscar todos los proveedores-componentes:" + ex.getMessage());
        }
        if (coleccion != null) {
            return coleccion;
        } else {
            return null;
        }
    }

    

    public boolean agregarProveedorComponente(proveedor provcompo) throws cDatosException {
        if (provcompo!= null) {
            try {
                empresaProveedorComponente.guardar(provcompo);
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

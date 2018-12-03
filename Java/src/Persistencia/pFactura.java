/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Common.cDatosException;
import Common.pedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class pFactura extends pPersistencia {

    public int calcularCostoXPedido(java.lang.Object o) throws cDatosException, SQLException {
        try {
            pedido unPedido = (pedido) o;

            super.abrirConexion();
            // Creo una nueva sentecia para ser ejecutada
            Statement st = super.getDistribuidora().createStatement();
            // arma la sentencia sql
            String selectSql
                    = "SELECT SUM(MC.cantidadMotorComponente*C.costoComp) suma FROM bd_fabricam.pedido P, bd_fabricam.motorcomponente MC, bd_fabricam.componente C\n"
                    + "where P.idMotorPedido=MC.idMotorMotorComponente AND MC.idComponenteMotorComponente=C.idComp AND P.idPedido=" + unPedido.getIdPedido() + " group by MC.idMotorMotorComponente;";
            // esto es solo para mostrar el sql que se va a ejecutar
            System.out.println(selectSql);
            // ejecuta la sentencia
            ResultSet rs = st.executeQuery(selectSql);

            int num = 0;
            while (rs.next()) {
                num = rs.getInt("suma");
            }
            super.cerrarConexion();
            // devuelve el objeto encontrado
            if (num != 0) {
                return num;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            throw new cDatosException("Error al buscar accion:" + e.getMessage());
        }
    }
}

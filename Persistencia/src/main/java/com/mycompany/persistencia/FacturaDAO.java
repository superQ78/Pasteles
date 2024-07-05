package com.mycompany.persistencia;

import Entidades.FacturaEntidad;
import Interface.IFacturaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cesar
 */
public class FacturaDAO implements IFacturaDAO{

    @Override
    public void insertarFactura(FacturaEntidad facturaEntidad) {
        String sql = "INSERT INTO Facturas ( pedidoId, RFC, usoFiscal, CURP) VALUES (?, ?, ?, ? )";
        try (Connection conn = DatabaseConexion.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, facturaEntidad.getPedidoId());
            pstmt.setString(2, facturaEntidad.getRFC());
            pstmt.setString(3, facturaEntidad.getUsoFiscal());
            pstmt.setString(4, facturaEntidad.getCURP());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public FacturaEntidad obtenerFacturaPorPedidoId(int pedidoId) {
        FacturaEntidad factura = null;
        String sql = "SELECT RFC, UsoFiscal, CURP FROM Facturas WHERE id = ?";
        try (Connection conn = DatabaseConexion.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, pedidoId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    factura = new FacturaEntidad();
                    factura.setRFC(rs.getString("RFC"));
                    factura.setUsoFiscal(rs.getString("UsoFiscal"));
                    factura.setCURP(rs.getString("CURP"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return factura;
    }

}

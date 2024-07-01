/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistencia;

import Entidades.PedidoEntidad;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class PedidoDAO {

    // Constructor vacío porque no usaremos un ArrayList
    public PedidoDAO() {
    }

    public void agregarPedido(PedidoEntidad pedido) {

        String sql = "INSERT INTO pedidos (colores_decorativos, total_personas, precio_total, fecha_pedido, "
                + "relleno_sabor, sabor_pan, total_velas, oblea_decorativa, pedido_id, cliente_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, pedido.getColoresDecorativos());
            statement.setInt(2, pedido.getTotalPersonas());
            statement.setInt(3, pedido.getPrecioTotal());
            java.util.Date utilDate = pedido.getFechaPedido();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            statement.setDate(4, sqlDate);
            statement.setString(5, pedido.getRellenoSabor());
            statement.setString(6, pedido.getSaborPan());
            statement.setInt(7, pedido.getTotalVelas());
            statement.setBoolean(8, pedido.isObleaDecorativa());
            statement.setInt(9, pedido.getPedidoid());
            statement.setString(10, pedido.getClienteId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PedidoEntidad obtenerPedidoPorId(int pedidoid) {
        PedidoEntidad pedido = null;
        String sql = "SELECT pedido_id, precio_total, cliente_id FROM Pedidos WHERE pedido_id = ?";

        try (Connection conn = DatabaseConexion.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, pedidoid);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    pedido = new PedidoEntidad();
                    pedido.setPedidoid(rs.getInt("pedido_id"));
                    pedido.setPrecioTotal(rs.getInt("precio_total"));
                    pedido.setClienteId(rs.getString("cliente_id"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pedido;
    }

    public List<PedidoEntidad> consultarPedidosPorCliente(String clienteId) {
        List<PedidoEntidad> resultado = new ArrayList<>();

        try (Connection con = DatabaseConexion.getConnection(); PreparedStatement ps = con.prepareStatement("SELECT pedido_id, colores_decorativos, total_personas, precio_total, fecha_pedido,"
                + "relleno_sabor, sabor_pan, total_velas, oblea_decorativa, cliente_id FROM pedidos WHERE cliente_id = ?")) {
            ps.setString(1, clienteId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    PedidoEntidad pedido = new PedidoEntidad();
                    pedido.setPedidoid(rs.getInt("pedido_id"));
                    pedido.setColoresDecorativos(rs.getString("colores_decorativos"));
                    pedido.setTotalPersonas(rs.getInt("total_personas"));
                    pedido.setPrecioTotal(rs.getInt("precio_total"));
                    pedido.setFechaPedido(rs.getDate("fecha_pedido"));
                    pedido.setRellenoSabor(rs.getString("relleno_sabor"));
                    pedido.setSaborPan(rs.getString("sabor_pan"));
                    pedido.setTotalVelas(rs.getInt("total_velas"));
                    pedido.setObleaDecorativa(rs.getBoolean("oblea_decorativa"));
                    pedido.setClienteId(rs.getString("cliente_id"));
                    resultado.add(pedido);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de excepciones
        }
        return resultado;
    }

    public List<PedidoEntidad> consultarPedidos() {
        List<PedidoEntidad> pedidos = new ArrayList<>();
        String sql = "SELECT pedido_id, colores_decorativos, total_personas, precio_total, fecha_pedido, "
                + "relleno_sabor, sabor_pan, total_velas, oblea_decorativa, cliente_id FROM pedidos";

        try (Connection connection = DatabaseConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                PedidoEntidad pedido = new PedidoEntidad();
                pedido.setPedidoid(resultSet.getInt("pedido_id"));
                pedido.setColoresDecorativos(resultSet.getString("colores_decorativos"));
                pedido.setTotalPersonas(resultSet.getInt("total_personas"));
                pedido.setPrecioTotal(resultSet.getInt("precio_total"));
                pedido.setFechaPedido(resultSet.getDate("fecha_pedido"));
                pedido.setRellenoSabor(resultSet.getString("relleno_sabor"));
                pedido.setSaborPan(resultSet.getString("sabor_pan"));
                pedido.setTotalVelas(resultSet.getInt("total_velas"));
                pedido.setObleaDecorativa(resultSet.getBoolean("oblea_decorativa"));
                pedido.setClienteId(resultSet.getString("cliente_id"));

                pedidos.add(pedido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidos;
    }

    // Método para convertir java.util.Date a java.sql.Date
    private Date convertirAFechaSQL(java.util.Date fecha) {
        return new Date(fecha.getTime());
    }
}

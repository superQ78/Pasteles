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
                + "relleno_sabor, sabor_pan, total_velas, oblea_decorativa, pedido_id, cliente_id, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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
            statement.setString(11, pedido.getEstado());

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
                + "relleno_sabor, sabor_pan, total_velas, oblea_decorativa, cliente_id, estado FROM pedidos";

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
                pedido.setEstado(resultSet.getString("estado"));

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

    /**
     * Consulta los pedidos realizados en el día actual.
     *
     * @return Una lista de pedidos realizados en el día actual.
     */
    public List<PedidoEntidad> obtenerPedidosDelDia() {
        List<PedidoEntidad> pedidos = new ArrayList<>();
        String sql = "SELECT pedido_id, cliente_id, colores_decorativos, total_personas, precio_total, fecha_pedido, "
                + "relleno_sabor, sabor_pan, total_velas, oblea_decorativa, estado FROM pedidos WHERE DATE(fecha_pedido) = CURDATE()";

        try (Connection connection = DatabaseConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(sql); ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                PedidoEntidad pedido = new PedidoEntidad();
                pedido.setPedidoid(resultSet.getInt("pedido_id"));
                pedido.setClienteId(resultSet.getString("cliente_id"));
                pedido.setColoresDecorativos(resultSet.getString("colores_decorativos"));
                pedido.setTotalPersonas(resultSet.getInt("total_personas"));
                pedido.setPrecioTotal(resultSet.getInt("precio_total"));
                pedido.setFechaPedido(resultSet.getDate("fecha_pedido"));
                pedido.setRellenoSabor(resultSet.getString("relleno_sabor"));
                pedido.setSaborPan(resultSet.getString("sabor_pan"));
                pedido.setTotalVelas(resultSet.getInt("total_velas"));
                pedido.setObleaDecorativa(resultSet.getBoolean("oblea_decorativa"));
                pedido.setEstado(resultSet.getString("estado"));
                pedidos.add(pedido);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedidos;
    }

    /**
     * Obtiene el pedido por su Id desde la base de datos.
     *
     * @param pedidoid El Id del pedido a obtener.
     * @return El objeto PedidoEntidad con los detalles del pedid.
     */
    public PedidoEntidad obtenerPedidoPorIds(int pedidoid) {
        PedidoEntidad pedido = null;
        String sql = "SELECT pedido_id, cliente_id, colores_decorativos, total_personas, precio_total, fecha_pedido, "
                + "relleno_sabor, sabor_pan, total_velas, oblea_decorativa, estado FROM pedidos WHERE pedido_id = ?";
        try (Connection connection = DatabaseConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, pedidoid);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    pedido = new PedidoEntidad();
                    pedido.setPedidoid(resultSet.getInt("pedido_id"));
                    pedido.setClienteId(resultSet.getString("cliente_id"));
                    pedido.setColoresDecorativos(resultSet.getString("colores_decorativos"));
                    pedido.setTotalPersonas(resultSet.getInt("total_personas"));
                    pedido.setPrecioTotal(resultSet.getInt("precio_total"));
                    pedido.setFechaPedido(resultSet.getDate("fecha_pedido"));
                    pedido.setRellenoSabor(resultSet.getString("relleno_sabor"));
                    pedido.setSaborPan(resultSet.getString("sabor_pan"));
                    pedido.setTotalVelas(resultSet.getInt("total_velas"));
                    pedido.setObleaDecorativa(resultSet.getBoolean("oblea_decorativa"));
                    pedido.setEstado(resultSet.getString("estado"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedido;
    }

    /**
     * Consulta los pedidos realizados por número de teléfono, fecha y estado.
     *
     * @param clienteId El número de teléfono de los pedidos a consultar (puede
     * ser parcial).
     * @param fecha La fecha de los pedidos a consultar.
     * @param estado El estado de los pedidos a consultar (pendiente, entregado,
     * cancelado).
     * @return Una lista de pedidos que coinciden con los criterios de búsqueda
     * especificados.
     */
    public List<PedidoEntidad> obtenerPedidosPorFiltro(String clienteId, java.sql.Date fecha, String estado) {
        List<PedidoEntidad> pedidos = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT pedido_id, cliente_id, colores_decorativos, total_personas, precio_total, fecha_pedido, "
                + "relleno_sabor, sabor_pan, total_velas, oblea_decorativa, estado FROM pedidos WHERE 1=1");

        List<Object> parametros = new ArrayList<>();

        if (clienteId != null && !clienteId.isEmpty()) {
            sql.append(" AND cliente_id LIKE ?");
            parametros.add("%" + clienteId + "%");
        }

        if (fecha != null) {
            sql.append(" AND fecha_pedido = ?");
            parametros.add(fecha);
        }

        if (estado != null && !estado.isEmpty()) {
            sql.append(" AND estado = ?");
            parametros.add(estado);
        }

        try (Connection connection = DatabaseConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(sql.toString())) {

            for (int i = 0; i < parametros.size(); i++) {
                statement.setObject(i + 1, parametros.get(i));
            }

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    PedidoEntidad pedido = new PedidoEntidad();
                    pedido.setPedidoid(resultSet.getInt("pedido_id"));
                    pedido.setClienteId(resultSet.getString("cliente_id"));
                    pedido.setColoresDecorativos(resultSet.getString("colores_decorativos"));
                    pedido.setTotalPersonas(resultSet.getInt("total_personas"));
                    pedido.setPrecioTotal(resultSet.getInt("precio_total"));
                    pedido.setFechaPedido(resultSet.getDate("fecha_pedido"));
                    pedido.setRellenoSabor(resultSet.getString("relleno_sabor"));
                    pedido.setSaborPan(resultSet.getString("sabor_pan"));
                    pedido.setTotalVelas(resultSet.getInt("total_velas"));
                    pedido.setObleaDecorativa(resultSet.getBoolean("oblea_decorativa"));
                    pedido.setEstado(resultSet.getString("estado"));
                    pedidos.add(pedido);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pedidos;
    }

    /**
     * Actualiza el estado del pedido en la base de datos.
     *
     * @param pedidoid El ID del pedido a actualizar.
     * @param nuevoEstado El nuevo estado que se asignará al pedido.
     */
    public void actualizarEstadoPedido(int pedidoid, String nuevoEstado) {
        String sql = "UPDATE pedidos SET estado = ? WHERE pedido_id = ?";
        try (Connection connection = DatabaseConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {

            connection.setAutoCommit(false);
            statement.setString(1, nuevoEstado);
            statement.setInt(2, pedidoid);
            statement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Actualiza los detalles del pedido en la base de datos.
     *
     * @param pedido El pedido a actualizar.
     * @return true si la actualización fue exitosa, false si no.
     */
    public boolean actualizarPedido(PedidoEntidad pedido) {
        String sql = "UPDATE pedidos SET cliente_id = ?, colores_decorativos = ?, total_personas = ?, precio_total = ?, fecha_pedido = ?, "
                + "relleno_sabor = ?, sabor_pan = ?, total_velas = ?, oblea_decorativa = ?, estado = ? WHERE pedido_id = ?";
        try (Connection connection = DatabaseConexion.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, pedido.getClienteId());
            statement.setString(2, pedido.getColoresDecorativos());
            statement.setInt(3, pedido.getTotalPersonas());
            statement.setDouble(4, pedido.getPrecioTotal());
            statement.setDate(5, new java.sql.Date(pedido.getFechaPedido().getTime()));
            statement.setString(6, pedido.getRellenoSabor());
            statement.setString(7, pedido.getSaborPan());
            statement.setInt(8, pedido.getTotalVelas());
            statement.setBoolean(9, pedido.isObleaDecorativa());
            statement.setString(10, pedido.getEstado());
            statement.setInt(11, pedido.getPedidoid());

            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}

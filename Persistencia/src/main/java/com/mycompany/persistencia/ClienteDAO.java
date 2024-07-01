/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistencia;

import Entidades.ClienteEntidad;
import com.mycompany.dto.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class ClienteDAO {
   public void agregarCliente(ClienteEntidad clienteEntidad) {
        String sql = "INSERT INTO Clientes (nombre, apellido, celular, correo) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, clienteEntidad.getNombre());
            pstmt.setString(2, clienteEntidad.getApellido());
            pstmt.setString(3, clienteEntidad.getCelular());
            pstmt.setString(4, clienteEntidad.getCorreo());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
   public boolean existeNumeroDeCelular(String celular) {
    String sql = "SELECT COUNT(*) FROM clientes WHERE celular = ?";
    try (Connection conn = DatabaseConexion.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, celular);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return false;
}

    public List<ClienteEntidad> consultarClientes() {
        List<ClienteEntidad> clientes = new ArrayList<>();
        String sql = "SELECT id, nombre, apellido, celular, correo FROM Clientes";
        try (Connection conn = DatabaseConexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                ClienteEntidad cliente = new ClienteEntidad();
                cliente.setClienteid(rs.getString("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setCorreo(rs.getString("correo"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return clientes;
    }

     public ClienteEntidad obtenerClientePorPedidoId(String pedidoId) {
    ClienteEntidad cliente = null;
    String sql = "SELECT c.nombre, c.apellido " +
                 "FROM Clientes c " +
                 "JOIN Pedidos p ON c.celular = p.cliente_id " +
                 "WHERE p.pedido_id = ?";
    try (Connection conn = DatabaseConexion.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, pedidoId);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                cliente = new ClienteEntidad();
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
            }
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return cliente;
}


       public ClienteEntidad consultarCliente(String Clienteid) {
        ClienteEntidad cliente = null;
           System.out.println("daooo"+ Clienteid);
        String sql = "SELECT id, nombre, apellido, celular, correo FROM Clientes WHERE celular='"+Clienteid+"'";
        try (Connection conn = DatabaseConexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.println("adentro del primer try");
          // pstmt.setString(1, Clienteid);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("dentro del segundo try");
                    cliente = new ClienteEntidad();
                    cliente.setClienteid(rs.getString("id"));
                    cliente.setNombre(rs.getString("nombre"));
                    cliente.setApellido(rs.getString("apellido"));
                    cliente.setCelular(rs.getString("celular"));
                    cliente.setCorreo(rs.getString("correo"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cliente;
    }
}




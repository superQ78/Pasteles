/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriabo;

import Entidades.ClienteEntidad;
import Entidades.PedidoEntidad;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.persistencia.ClienteDAO;
import com.mycompany.persistencia.PedidoDAO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cesar
 */
public class ConsultaBO {

    private PedidoDAO pedidoDAO;
    private ClienteDAO clienteDAO;

    public ConsultaBO() {
        this.pedidoDAO = new PedidoDAO();
        this.clienteDAO = new ClienteDAO();
    }

    public List<PedidoEntidad> obtenerPedidos() {
        return pedidoDAO.consultarPedidos();
    }


    public ClienteDTO obtenerClientePorPedidoId(String Clienteid) {
        ClienteEntidad clienteEntidad = clienteDAO.obtenerClientePorPedidoId(Clienteid);
        if (clienteEntidad != null) {
            return convertirEntidadADTO(clienteEntidad);
        }
        return null;
    }

    private ClienteDTO convertirEntidadADTO(ClienteEntidad entidad) {
        ClienteDTO dto = new ClienteDTO();
        dto.setNombre(entidad.getNombre());
        dto.setApellido(entidad.getApellido());
        return dto;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pasteleriabo;

import Entidades.PedidoEntidad;
import com.mycompany.dto.PedidoDTO;
import com.mycompany.persistencia.PedidoDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class PedidoBO {

    private PedidoDAO pedidoDAO;

    public PedidoBO() {
        this.pedidoDAO = new PedidoDAO();
    }

    public List<PedidoDTO> obtenerPedidos() {
        List<PedidoEntidad> pedidosEntidad = pedidoDAO.consultarPedidos();
        List<PedidoDTO> pedidosDTO = new ArrayList<>();
        for (PedidoEntidad pedidoEntidad : pedidosEntidad) {
            pedidosDTO.add(entityToDto(pedidoEntidad));
        }
        return pedidosDTO;
    }

    public PedidoDTO obtenerPedidoPorId(int pedidoid) {
        PedidoEntidad pedidoEntidad = pedidoDAO.obtenerPedidoPorId(pedidoid);
        PedidoDTO pedido=entityToDto(pedidoEntidad);
        if (pedidoEntidad != null) {
            return pedido;
        }
        return null;
    }
   
    
    public List<PedidoDTO> obtenerPedidosPorCliente(String clienteId) {
        List<PedidoEntidad> pedidosEntidad = pedidoDAO.consultarPedidosPorCliente(clienteId);
        List<PedidoDTO> pedidosDTO = new ArrayList<>();
        for (PedidoEntidad pedidoEntidad : pedidosEntidad) {
            pedidosDTO.add(entityToDto(pedidoEntidad));
        }
        return pedidosDTO;
    }

    public void agregarPedido(PedidoDTO pedidoDTO) {
        PedidoEntidad pedidoEntidad = dtoToEntity(pedidoDTO);
        pedidoDAO.agregarPedido(pedidoEntidad);
    }

    private PedidoEntidad dtoToEntity(PedidoDTO dto) {
        PedidoEntidad entidad = new PedidoEntidad();
        entidad.setColoresDecorativos(dto.getColoresDecorativos());
        entidad.setTotalPersonas(dto.getTotalPersonas());
        entidad.setPrecioTotal(dto.getPrecioTotal());
        entidad.setFechaPedido(dto.getFechaPedido());
        entidad.setRellenoSabor(dto.getRellenoSabor());
        entidad.setSaborPan(dto.getSaborPan());
        entidad.setTotalVelas(dto.getTotalVelas());
        entidad.setObleaDecorativa(dto.isObleaDecorativa());
        entidad.setPedidoid(dto.getPedidoid());
        entidad.setClienteId(dto.getClienteId());
        return entidad;
    }

    private PedidoDTO entityToDto(PedidoEntidad entidad) {
        PedidoDTO dto = new PedidoDTO();
        dto.setColoresDecorativos(entidad.getColoresDecorativos());
        dto.setTotalPersonas(entidad.getTotalPersonas());
        dto.setPrecioTotal(entidad.getPrecioTotal());
        dto.setFechaPedido(entidad.getFechaPedido());
        dto.setRellenoSabor(entidad.getRellenoSabor());
        dto.setSaborPan(entidad.getSaborPan());
        dto.setTotalVelas(entidad.getTotalVelas());
        dto.setObleaDecorativa(entidad.isObleaDecorativa());
        dto.setPedidoid(entidad.getPedidoid());
        dto.setClienteId(entidad.getClienteId());
        return dto;
    }
}
package com.mycompany.pasteleriabo;

import Entidades.PedidoEntidad;
import com.mycompany.dto.PedidoDTO;
import com.mycompany.persistencia.PedidoDAO;

/**
 *
 * @author Valeria
 */
public class ModificarBO {

    private PedidoDAO pedidoDAO;

    public ModificarBO() {
        this.pedidoDAO = new PedidoDAO(); // Inicialización del DAO de pedido
    }

    /**
     * Actualiza el estado de un pedido a un nuevo estado especificado.
     *
     * @param pedidoDTO El pedido a actualizar.
     * @param nuevoEstado El nuevo estado del pedido ("Cancelado" o
     * "Entregado").
     */
    public void actualizarEstadoPedido(PedidoDTO pedidoDTO, String nuevoEstado) {
        pedidoDAO.actualizarEstadoPedido(pedidoDTO.getPedidoid(), nuevoEstado);
    }

    /**
     * Actualiza los detalles del pedido
     *
     * @param pedidoDTO
     * @return
     */
    public boolean actualizarPedido(PedidoDTO pedidoDTO) {
        PedidoEntidad pedido = dtoToEntity(pedidoDTO);
        return pedidoDAO.actualizarPedido(pedido);
    }

    // Conversión DTO a Entidad
    private PedidoEntidad dtoToEntity(PedidoDTO dto) {
        PedidoEntidad entidad = new PedidoEntidad();
        entidad.setPedidoid(dto.getPedidoid());
        entidad.setClienteId(dto.getClienteId());
        entidad.setColoresDecorativos(dto.getColoresDecorativos());
        entidad.setTotalPersonas(dto.getTotalPersonas());
        entidad.setPrecioTotal(dto.getPrecioTotal());
        entidad.setFechaPedido(dto.getFechaPedido());
        entidad.setRellenoSabor(dto.getRellenoSabor());
        entidad.setSaborPan(dto.getSaborPan());
        entidad.setTotalVelas(dto.getTotalVelas());
        entidad.setObleaDecorativa(dto.isObleaDecorativa());
        entidad.setEstado(dto.getEstado());

        return entidad;
    }

    // Conversión Entidad a DTO
    private PedidoDTO entityToDto(PedidoEntidad entidad) {
        PedidoDTO dto = new PedidoDTO();
        dto.setPedidoid(entidad.getPedidoid());
        dto.setClienteId(entidad.getClienteId()); // Agregar número de teléfono
        dto.setColoresDecorativos(entidad.getColoresDecorativos());
        dto.setTotalPersonas(entidad.getTotalPersonas());
        dto.setPrecioTotal(entidad.getPrecioTotal());
        dto.setFechaPedido(entidad.getFechaPedido());
        dto.setRellenoSabor(entidad.getRellenoSabor());
        dto.setSaborPan(entidad.getSaborPan());
        dto.setTotalVelas(entidad.getTotalVelas());
        dto.setObleaDecorativa(entidad.isObleaDecorativa());
        dto.setEstado(entidad.getEstado());

        return dto;
    }
}

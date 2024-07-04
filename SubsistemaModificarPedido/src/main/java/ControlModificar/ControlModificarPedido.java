/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlModificar;

import com.mycompany.dto.PedidoDTO;
import com.mycompany.pasteleriabo.ModificarBO;

/**
 *
 * @author Valeria
 */
public class ControlModificarPedido {

    private ModificarBO modificarBO;

    public ControlModificarPedido() {
        this.modificarBO = new ModificarBO();
    }

    /**
     * Actualiza el estado de un pedido a un nuevo estado especificado.
     *
     * @param pedidoDTO El pedido a actualizar.
     * @param nuevoEstado El nuevo estado del pedido ("Cancelado" o
     * "Entregado").
     */
    public void actualizarEstadoPedido(PedidoDTO pedidoDTO, String nuevoEstado) {
        modificarBO.actualizarEstadoPedido(pedidoDTO, nuevoEstado);
    }

    /**
     * Actualiza los detalles de los pedidos.
     *
     */
    public boolean actualizarPedido(PedidoDTO pedidoDTO) {
        return modificarBO.actualizarPedido(pedidoDTO);
    }
}

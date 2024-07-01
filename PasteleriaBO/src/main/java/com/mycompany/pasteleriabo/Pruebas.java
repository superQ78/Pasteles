/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriabo;

import com.mycompany.dto.PedidoDTO;
import com.mycompany.dto.UsuarioDTO;

/**
 *
 * @author cesar
 */
import java.util.Date;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        // Crear un nuevo pedido
        PedidoDTO pedido = new PedidoDTO();
        pedido.setFechaPedido(new Date());
        pedido.setColoresDecorativos("Rojo y Blanco");
        pedido.setObleaDecorativa(true);
        pedido.setRellenoSabor("Chocolate");
        pedido.setSaborPan("Vainilla");
        pedido.setTotalVelas(5);
        pedido.setTotalPersonas(20);

        // Crear un objeto de negocio de pedidos
        PedidoBO pedidoBO = new PedidoBO();

        // Agregar el pedido
        pedidoBO.agregarPedido(pedido);

        // Verificar que el pedido se haya agregado correctamente
        List<PedidoDTO> pedidosGuardados = pedidoBO.obtenerPedidos();
        if (!pedidosGuardados.isEmpty() && pedidosGuardados.get(0).equals(pedido)) {
            System.out.println("El pedido se ha guardado correctamente:");
            System.out.println(pedidosGuardados.get(0));
        } else {
            System.out.println("Error al guardar el pedido.");
        }
    }
}


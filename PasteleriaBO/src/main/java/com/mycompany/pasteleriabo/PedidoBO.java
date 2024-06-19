/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pasteleriabo;

import com.mycompany.dto.PedidoDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class PedidoBO {

    private List<PedidoDTO> pedidos;

    public PedidoBO() {
        this.pedidos = new ArrayList<>();
    }

    public List<PedidoDTO> obtenerPedidos() {
        return pedidos;
    }

    public void agregarPedido(PedidoDTO pedido) {
        pedidos.add(pedido);
    }

    public double calcularPrecio(PedidoDTO pedido) {
        double precio = 0;

        precio += pedido.getTotalVelas() * 5; // Velas cuestan 5 pesos cada una
        precio += pedido.getTotalPersonas() * 10; // 10 pesos por persona
        precio += pedido.isObleaDecorativa() ? 20 : 0; // Oblea cuesta 20 pesos
        precio += 25; // Costo del relleno del pan
        precio += 200; // Costo del sabor del pan

        return precio * 2; // Multiplicar por 2 por la mano de obra
    }    
    

}

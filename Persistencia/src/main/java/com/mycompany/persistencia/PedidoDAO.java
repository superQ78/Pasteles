/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistencia;

import Entidades.PedidoEntidad;
import com.mycompany.dto.PedidoDTO;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author cesar
 */
public class PedidoDAO {

    private List<PedidoEntidad> pedidos;

    public PedidoDAO() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(PedidoEntidad pedido) {
        pedidos.add(pedido);
    }

    public List<PedidoEntidad> consultarPedidos() {
        return pedidos;
    }

    public List<PedidoEntidad> obtenerPedidosEnFecha(Date fecha) {
        return pedidos.stream().filter(pedido -> esMismaFecha(pedido.getFechaPedido(), fecha)).collect(Collectors.toList());
    }

    private boolean esMismaFecha(Date fechaPedido, Date fecha) {
        LocalDate fechaPedidoLocal = fechaPedido.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaLocal = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return fechaPedidoLocal.isEqual(fechaLocal);
    }
}

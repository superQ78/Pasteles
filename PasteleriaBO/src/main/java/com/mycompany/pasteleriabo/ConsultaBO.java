/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriabo;

import com.mycompany.dto.PedidoDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Valeria
 */
public class ConsultaBO {
     private static List<PedidoDTO> pedidos;

    public ConsultaBO() {
        this.pedidos = new ArrayList<>();
    }

    public List<PedidoDTO> obtenerPedidos() {
        return this.pedidos;
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlConsultarPedido;

import com.mycompany.dto.PedidoDTO;
import com.mycompany.pasteleriabo.ConsultaBO;
import java.util.List;

/**
 *
 * @author Valeria
 */
public class ControlConsultarPedido {
    private ConsultaBO consultarPedido;

    public ControlConsultarPedido() {
        this.consultarPedido = new ConsultaBO();
    }

    public List<PedidoDTO> obtenerPedidos() {
        return consultarPedido.obtenerPedidos();
    }

}

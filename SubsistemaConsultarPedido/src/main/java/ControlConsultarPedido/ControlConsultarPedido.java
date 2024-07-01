/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlConsultarPedido;

import Entidades.PedidoEntidad;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.PedidoDTO;
import com.mycompany.pasteleriabo.ConsultaBO;
import com.mycompany.pasteleriabo.PedidoBO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Valeria
 */
public class ControlConsultarPedido {
    private ConsultaBO consultaBO;
    private PedidoBO pedidoBO;

    public ControlConsultarPedido() {
this.consultaBO = new ConsultaBO();
        this.pedidoBO = new PedidoBO(); 
    }

    public List<PedidoEntidad> obtenerPedidos() {
        return consultaBO.obtenerPedidos();
    }

      public List<PedidoDTO> obtenerPedidosPorCliente(String clienteId) {
        return pedidoBO.obtenerPedidosPorCliente(clienteId);
      
        
      }
    public ClienteDTO obtenerClientePorPedidoId(String Clienteid) {
        return consultaBO.obtenerClientePorPedidoId(Clienteid);
    }
     
}

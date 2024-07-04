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

    public List<PedidoDTO> obtenerPedidos() {
        return consultaBO.obtenerPedidos();
    }

      public List<PedidoDTO> obtenerPedidosPorCliente(String clienteId) {
        return pedidoBO.obtenerPedidosPorCliente(clienteId);
      
        
      }
    public ClienteDTO obtenerClientePorPedidoId(String Clienteid) {
        return consultaBO.obtenerClientePorPedidoId(Clienteid);
    }
     public List<PedidoDTO> obtenerPedidosDelDia() {
        return consultaBO.obtenerPedidosDelDia();
    }
    
    public PedidoDTO obtenerPedidoPorIds(int pedidoid) {
        return consultaBO.obtenerPedidoPorIds(pedidoid);
    }

    public List<PedidoDTO> consultarPedidosPorFiltro(String telefono, Date fecha, String estado) {
        return consultaBO.consultarPedidosPorFiltro(telefono, fecha, estado);
    }
}

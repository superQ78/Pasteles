/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceConsultarPedido;

import Entidades.PedidoEntidad;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.PedidoDTO;
import java.util.List;

/**
 *
 * @author Valeria
 */
public interface IConsultaPedido {
    
    List<PedidoEntidad> obtenerPedidos();
    
      List<PedidoDTO> obtenerPedidosPorCliente(String clienteId);
      ClienteDTO obtenerClientePorPedidoId(String Clienteid);
      
      
}

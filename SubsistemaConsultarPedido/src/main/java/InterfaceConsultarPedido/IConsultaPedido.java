/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceConsultarPedido;

import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.PedidoDTO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Valeria
 */
public interface IConsultaPedido {
    
    List<PedidoDTO> obtenerPedidos();
    
      List<PedidoDTO> obtenerPedidosPorCliente(String clienteId);
      ClienteDTO obtenerClientePorPedidoId(String Clienteid);
      
    List<PedidoDTO> obtenerPedidosDelDia();
    
    /**
     *
     * @param pedidoid
     * @return
     */
    PedidoDTO obtenerPedidoPorIds(int pedidoid);
    
    public List<PedidoDTO> consultarPedidosPorFiltro(String telefono, Date fecha, String estado);
}

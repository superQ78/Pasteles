/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISAT;

import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.FacturaDTO;
import com.mycompany.dto.PedidoDTO;

/**
 *
 * @author cesar
 */
public interface ISAT  {
     ClienteDTO obtenerClientePorId(String clienteId);
     
    FacturaDTO obtenerFacturaPorPedidoId(int pedidoId);
    
    PedidoDTO obtenerPedidoPorId(int pedidoId);
}


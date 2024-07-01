/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FachadaConsultarPedido;

import ControlConsultarPedido.ControlConsultarPedido;
import Entidades.PedidoEntidad;
import InterfaceConsultarPedido.IConsultaPedido;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.PedidoDTO;
import java.util.List;

/**
 *
 * @author Valeria
 */
public class FachadaConsulta implements IConsultaPedido {
    private ControlConsultarPedido controlConsultarPedido;

    public FachadaConsulta() {
        this.controlConsultarPedido = new ControlConsultarPedido();
    }
@Override
    public List<PedidoEntidad> obtenerPedidos() {
        return controlConsultarPedido.obtenerPedidos();
    }
@Override
    public List<PedidoDTO> obtenerPedidosPorCliente(String clienteId) {
        return controlConsultarPedido.obtenerPedidosPorCliente(clienteId);
    }
     @Override
    public ClienteDTO obtenerClientePorPedidoId(String Clienteid) {
        return controlConsultarPedido.obtenerClientePorPedidoId(Clienteid);
    }
   
}

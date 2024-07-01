/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FachadaRealizarPedido;

import ControlRealizarPedido.ControlRealizarPedido;
import InterfaceRealizarPedido.IPedido;
import com.mycompany.dto.PedidoDTO;

import java.util.Date;

/**
 *
 * @author cesar
 */
import java.util.List;

public class PedidoFachada implements IPedido {

     private ControlRealizarPedido controlRealizarPedido;

  

    public PedidoFachada() {
        this.controlRealizarPedido = new ControlRealizarPedido();
    }

    @Override
    public void agregarPedido(PedidoDTO pedido) {
        controlRealizarPedido.agregarPedido(pedido);
    }

//    @Override
//    public List<PedidoDTO> obtenerPedidos() {
//         
//        return controlRealizarPedido.obtenerPedidos();
//    }

    @Override
    public boolean ValidarPeriodo(Date fecha) {
        return controlRealizarPedido.validarPeriodoFecha(fecha);
    }

    @Override
    public boolean ValidarFechMax5(Date fecha) {
        return controlRealizarPedido.ValidarFechaMax5(fecha);
    }
     @Override
      public void obtenerPrecioTotal(PedidoDTO pedidoDTO) {
    controlRealizarPedido.calcularPrecio(pedidoDTO);
}
    
    
}

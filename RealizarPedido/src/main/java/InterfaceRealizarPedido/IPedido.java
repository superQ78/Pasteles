/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceRealizarPedido;

import com.mycompany.dto.PedidoDTO;
import java.util.Date;

/**
 *
 * @author cesar
 */
public interface IPedido {

    void agregarPedido(PedidoDTO pedido);

    boolean ValidarPeriodo(Date fecha);

    boolean ValidarFechMax5(Date fecha);

    void obtenerPrecioTotal(PedidoDTO pedidoDTO);
}

package InterfaceRealizarPedido;

import com.mycompany.dto.PedidoDTO;

/**
 *
 * @author Valeria
 */
public interface IModificarPedido {
    //Metodo para actualizar el estado
    public void actualizarEstadoPedido(PedidoDTO pedidoDTO, String nuevoEstado);

    //Metodo para actualizar los detalles del pedido.
    boolean actualizarPedido(PedidoDTO pedidoDTO);
}

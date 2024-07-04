package FachadaModificar;

import ControlModificar.ControlModificarPedido;
import com.mycompany.dto.PedidoDTO;
import InterfaceRealizarPedido.IModificarPedido;

/**
 *
 * @author Valeria
 */
public class ModificarFachada implements IModificarPedido {

    private ControlModificarPedido controlModificarPedido;

    public ModificarFachada() {
        this.controlModificarPedido = new ControlModificarPedido();
    }

    @Override
    public void actualizarEstadoPedido(PedidoDTO pedidoDTO, String nuevoEstado) {
        controlModificarPedido.actualizarEstadoPedido(pedidoDTO, nuevoEstado);
    }

    @Override
    public boolean actualizarPedido(PedidoDTO pedidoDTO) {
        return controlModificarPedido.actualizarPedido(pedidoDTO);
    }
}

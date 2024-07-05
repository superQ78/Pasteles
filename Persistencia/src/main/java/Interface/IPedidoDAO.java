package Interface;

import Entidades.PedidoEntidad;
import java.util.List;

/**
 *
 * @author Valeria
 */
public interface IPedidoDAO {

    public void agregarPedido(PedidoEntidad pedido);

    public PedidoEntidad obtenerPedidoPorId(int pedidoid);

    public List<PedidoEntidad> consultarPedidosPorCliente(String clienteId);

    public List<PedidoEntidad> consultarPedidos();

    public List<PedidoEntidad> obtenerPedidosDelDia();

    public PedidoEntidad obtenerPedidoPorIds(int pedidoid);

    public List<PedidoEntidad> obtenerPedidosPorFiltro(String clienteId, java.sql.Date fecha, String estado);

    public void actualizarEstadoPedido(int pedidoid, String nuevoEstado);

    public boolean actualizarPedido(PedidoEntidad pedido);
}

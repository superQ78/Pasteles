package Interface;

import Entidades.ClienteEntidad;
import java.util.List;

/**
 *
 * @author Valeria
 */
public interface IClienteDAO {

    public void agregarCliente(ClienteEntidad clienteEntidad);

    public boolean existeNumeroDeCelular(String celular);

    public List<ClienteEntidad> consultarClientes();

    public ClienteEntidad obtenerClientePorPedidoId(String pedidoId);

    public ClienteEntidad consultarCliente(String Clienteid);
}

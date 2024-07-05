package Interface;

import Entidades.FacturaEntidad;

/**
 *
 * @author Valeria
 */
public interface IFacturaDAO {

    public void insertarFactura(FacturaEntidad facturaEntidad);

    public FacturaEntidad obtenerFacturaPorPedidoId(int pedidoId);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FachadaSAT;

import ControlSAT.ControlSAT;
import ISAT.ISAT;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.FacturaDTO;
import com.mycompany.dto.PedidoDTO;

/**
 *
 * @author cesar
 */
public class FachadaSAT implements ISAT {
    private ControlSAT controlSAT;

    public FachadaSAT() {
        this.controlSAT = new ControlSAT();
    }

    @Override
    public ClienteDTO obtenerClientePorId(String clienteId) {
        ClienteDTO cliente=controlSAT.obtenerClientePorId(clienteId);
    
        return cliente;
    }

    @Override
    public FacturaDTO obtenerFacturaPorPedidoId(int pedidoId) {
        return controlSAT.obtenerFacturaPorPedidoId(pedidoId);
    }

    @Override
    public PedidoDTO obtenerPedidoPorId(int pedidoId) {
        return controlSAT.obtenerPedidoPorId(pedidoId);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlSAT;

import FachadaSAT.FachadaSAT;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.FacturaDTO;
import com.mycompany.dto.PedidoDTO;
import com.mycompany.pasteleriabo.FinanzasBO;
import com.mycompany.pasteleriabo.PedidoBO;
import com.mycompany.pasteleriabo.SATBO;

/**
 *
 * @author cesar
 */
public class ControlSAT {
  private FinanzasBO finanzasBO;
    private SATBO satBO;
    private PedidoBO pedidoBO;

    public ControlSAT() {
        this.finanzasBO = new FinanzasBO();
        this.satBO = new SATBO();
        this.pedidoBO = new PedidoBO();
    }

    public ClienteDTO obtenerClientePorId(String ClienteId) {
        ClienteDTO cliente= finanzasBO.obtenerClientePorId(ClienteId);
      
        return cliente;
    }

    public FacturaDTO obtenerFacturaPorPedidoId(int pedidoId) {
        return satBO.obtenerFacturaPorPedidoId(pedidoId);
    }

    public PedidoDTO obtenerPedidoPorId(int pedidoId) {
        return pedidoBO.obtenerPedidoPorId(pedidoId);
    }
}


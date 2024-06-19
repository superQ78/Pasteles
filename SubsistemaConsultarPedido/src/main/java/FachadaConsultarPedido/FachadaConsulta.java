/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FachadaConsultarPedido;

import ControlConsultarPedido.ControlConsultarPedido;
import com.mycompany.dto.PedidoDTO;
import java.util.List;

/**
 *
 * @author Valeria
 */
public class FachadaConsulta {
    private ControlConsultarPedido controlConsultarPedido;

    public FachadaConsulta() {
        this.controlConsultarPedido = new ControlConsultarPedido();
    }

   public List<PedidoDTO> obtenerPedidos() {
        return controlConsultarPedido.obtenerPedidos();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FachadaFinanza;

import ControlFinanza.ControlFinanza;
import InterfaceFinanza.IFinanza;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.pasteleriabo.FinanzasBO;
import java.util.List;

/**
 *
 * @author cesar
 */
  public class FachadaFinanza implements IFinanza {
    private ControlFinanza controlFinanza;

    public FachadaFinanza() {
        controlFinanza = new ControlFinanza();
    }
    @Override
    public String obtenerCelularClientePorID(String idCliente){
        return controlFinanza.obtenerCelularClientePorID(idCliente);
    }

    @Override
    public List<ClienteDTO> obtenerClientes() {
        return controlFinanza.obtenerClientes();
    }
}


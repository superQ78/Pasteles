/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFinanza;

import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.FacturaDTO;
import com.mycompany.pasteleriabo.FinanzasBO;
import com.mycompany.pasteleriabo.SATBO;
import java.util.List;

/**
 *
 * @author cesar
 */
public class ControlFinanza {
     
    private FinanzasBO finanzasBO;
    private SATBO satBO;

     public ControlFinanza() {
        finanzasBO = new FinanzasBO();
    }

    public String obtenerCelularClientePorID(String idCliente) {
        List<ClienteDTO> clientes = finanzasBO.obtenerClientes();
        for (ClienteDTO cliente : clientes) {
            if (cliente.getClienteid() == idCliente) {
                return cliente.getCelular();
            }
        }
        return null;
    }
    
    public List<ClienteDTO> obtenerClientes() {
        return finanzasBO.obtenerClientes();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceFinanza;

import com.mycompany.dto.ClienteDTO;
import java.util.List;

/**
 *
 * @author cesar
 */
public interface IFinanza {
 
    List<ClienteDTO> obtenerClientes();
    
    String obtenerCelularClientePorID(String idCliente);
}

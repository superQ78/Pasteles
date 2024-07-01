/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriabo;

import Entidades.ClienteEntidad;
import Entidades.FacturaEntidad;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.FacturaDTO;
import com.mycompany.persistencia.ClienteDAO;
import com.mycompany.persistencia.FacturaDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class FinanzasBO {
    private ClienteDAO clienteDAO;

    public FinanzasBO() {
        this.clienteDAO = new ClienteDAO();
    }

    public void agregarCliente(ClienteDTO clienteDTO) {
        ClienteEntidad clienteEntidad = dtoToEntity(clienteDTO);
        clienteDAO.agregarCliente(clienteEntidad);
    }
     public ClienteDTO obtenerClientePorId(String Clienteid) {
        
        ClienteEntidad clienteEntidad = clienteDAO.consultarCliente(Clienteid);
        if (clienteEntidad != null) {
       
            return entityToDto(clienteEntidad);
            
        }
         
        return null;
    }


    public List<ClienteDTO> obtenerClientes() {
        List<ClienteEntidad> clientesEntidad = clienteDAO.consultarClientes();
        List<ClienteDTO> clientesDTO = new ArrayList<>();
        for (ClienteEntidad clienteEntidad : clientesEntidad) {
            clientesDTO.add(entityToDto(clienteEntidad));
        }
        return clientesDTO;
    }

    public boolean existeNumeroDeCelular(String celular) {
    return clienteDAO.existeNumeroDeCelular(celular);
}

    private ClienteEntidad dtoToEntity(ClienteDTO dto) {
        ClienteEntidad entidad = new ClienteEntidad();
        entidad.setNombre(dto.getNombre());
        entidad.setApellido(dto.getApellido());
        entidad.setCelular(dto.getCelular());
        entidad.setCorreo(dto.getCorreo());
        entidad.setClienteid(dto.getClienteid());
        return entidad;
    }

    private ClienteDTO entityToDto(ClienteEntidad entidad) {
        ClienteDTO dto = new ClienteDTO();
        dto.setNombre(entidad.getNombre());
        dto.setApellido(entidad.getApellido());
        dto.setCelular(entidad.getCelular());
        dto.setCorreo(entidad.getCorreo());
        dto.setClienteid(entidad.getClienteid());
        return dto;
    }
}


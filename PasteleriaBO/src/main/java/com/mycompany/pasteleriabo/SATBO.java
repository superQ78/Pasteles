/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriabo;

import Entidades.ClienteEntidad;
import Entidades.FacturaEntidad;
import Entidades.PedidoEntidad;
import com.mycompany.dto.FacturaDTO;
import com.mycompany.persistencia.ClienteDAO;
import com.mycompany.persistencia.FacturaDAO;
import com.mycompany.persistencia.PedidoDAO;

/**
 *
 * @author cesar
 */
public class SATBO {

    private FacturaDAO facturaDAO;

    public SATBO() {
        this.facturaDAO = new FacturaDAO();
    }

    public void agregarDatosFactura(FacturaDTO facturaDTO) {
        FacturaEntidad facturaEntidad = new FacturaEntidad();
    
    
            // Transformación de DTO a Entity
        facturaEntidad.setRFC(facturaDTO.getRFC());
        facturaEntidad.setUsoFiscal(facturaDTO.getUsoFiscal());
        facturaEntidad.setCURP(facturaDTO.getCURP());
        facturaEntidad.setId(facturaDTO.getId());
        facturaEntidad.setPedidoId(facturaDTO.getPedidoId());

        // Envia la entidad al DAO para guardarla en la base de datos
        FacturaDAO facturaDAO = new FacturaDAO();
        facturaDAO.insertarFactura(facturaEntidad);
    
}
     public FacturaDTO obtenerFacturaPorPedidoId(int id) {
        FacturaEntidad facturaEntidad = facturaDAO.obtenerFacturaPorPedidoId(id);
        if (facturaEntidad != null) {
            return entityToDto(facturaEntidad);
        }
        return null;
    }


    private FacturaEntidad dtoToEntity(FacturaDTO dto) {
        FacturaEntidad entidad = new FacturaEntidad();
        entidad.setPedidoId(dto.getPedidoId());
        entidad.setRFC(dto.getRFC());
        entidad.setUsoFiscal(dto.getUsoFiscal());
        entidad.setCURP(dto.getCURP());
        
        entidad.setId(dto.getId());
        return entidad;
    }

    private FacturaDTO entityToDto(FacturaEntidad entidad) {
        FacturaDTO dto = new FacturaDTO();
        dto.setPedidoId(entidad.getPedidoId());
        dto.setRFC(entidad.getRFC());
        dto.setUsoFiscal(entidad.getUsoFiscal());
        dto.setCURP(entidad.getCURP());
        dto.setId(entidad.getId());
        return dto;
    }
       public ClienteEntidad obtenerClientePorId(String Clienteid) {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.consultarCliente(Clienteid);
    }

    public PedidoEntidad obtenerPedidoPorId(int pedidoid) {
        PedidoDAO pedidoDAO = new PedidoDAO();
        return pedidoDAO.obtenerPedidoPorId(pedidoid);
    }

    public FacturaEntidad obtenerFacturaPorId(int pedidoId) {
        FacturaDAO facturaDAO = new FacturaDAO();
        return facturaDAO.obtenerFacturaPorPedidoId(pedidoId);
    }
}


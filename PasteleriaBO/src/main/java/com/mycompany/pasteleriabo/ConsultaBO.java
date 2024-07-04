/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriabo;

import Entidades.ClienteEntidad;
import Entidades.PedidoEntidad;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.dto.PedidoDTO;
import com.mycompany.persistencia.ClienteDAO;
import com.mycompany.persistencia.PedidoDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cesar
 */
public class ConsultaBO {

    private PedidoDAO pedidoDAO;
    private ClienteDAO clienteDAO;

    public ConsultaBO() {
        this.pedidoDAO = new PedidoDAO();
        this.clienteDAO = new ClienteDAO();
    }

    /**
     * Obtiene todos los pedidos existentes.
     *
     * @return todos los pedidos almacenados.
     */
    public List<PedidoDTO> obtenerPedidos() {
        List<PedidoEntidad> pedidosEntidad = pedidoDAO.consultarPedidos();
        List<PedidoDTO> pedidosDTO = new ArrayList<>();
        for (PedidoEntidad pedidoEntidad : pedidosEntidad) {
            pedidosDTO.add(entityToDto(pedidoEntidad));
        }
        return pedidosDTO;
    }


    public ClienteDTO obtenerClientePorPedidoId(String Clienteid) {
        ClienteEntidad clienteEntidad = clienteDAO.obtenerClientePorPedidoId(Clienteid);
        if (clienteEntidad != null) {
            return convertirEntidadADTO(clienteEntidad);
        }
        return null;
    }

    private ClienteDTO convertirEntidadADTO(ClienteEntidad entidad) {
        ClienteDTO dto = new ClienteDTO();
        dto.setNombre(entidad.getNombre());
        dto.setApellido(entidad.getApellido());
        return dto;
    }
    // Conversión Entidad a DTO
    private PedidoDTO entityToDto(PedidoEntidad entidad) {
        PedidoDTO dto = new PedidoDTO();
        dto.setPedidoid(entidad.getPedidoid());
        dto.setClienteId(entidad.getClienteId()); // Agregar número de teléfono
        dto.setColoresDecorativos(entidad.getColoresDecorativos());
        dto.setTotalPersonas(entidad.getTotalPersonas());
        dto.setPrecioTotal(entidad.getPrecioTotal());
        dto.setFechaPedido(entidad.getFechaPedido());
        dto.setRellenoSabor(entidad.getRellenoSabor());
        dto.setSaborPan(entidad.getSaborPan());
        dto.setTotalVelas(entidad.getTotalVelas());
        dto.setObleaDecorativa(entidad.isObleaDecorativa());
        dto.setEstado(entidad.getEstado());

        return dto;
    }
    /**
     * Obtiene todos los pedidos realizados en el día actual.
     *
     * @return los pedidos del día.
     */
    public List<PedidoDTO> obtenerPedidosDelDia() {
        List<PedidoEntidad> pedidosEntidad = pedidoDAO.obtenerPedidosDelDia();
        List<PedidoDTO> pedidosDTO = new ArrayList<>();
        for (PedidoEntidad pedido : pedidosEntidad) {
            pedidosDTO.add(entityToDto(pedido));
        }
        return pedidosDTO;
    }
    /**
     * Obtiene un pedido específico por su Id.
     *
     * @param pedidoid El Id del pedido que se desea obtener.
     * @return El objeto PedidoDTO que representa el pedido encontrado, o null
     * si no se encuentra.
     */
    public PedidoDTO obtenerPedidoPorIds(int pedidoid) {
        PedidoEntidad entidad = pedidoDAO.obtenerPedidoPorIds(pedidoid);
        if (entidad == null) {
            return null;
        }
        return entityToDto(entidad);
    }
    /**
     * Consulta pedidos según filtros de teléfono, fecha y estado,
     * convirtiéndolos a objetos DTO.
     *
     * @param telefono El número de teléfono asociado al pedido (puede ser null
     * o vacío para no filtrar por teléfono).
     * @param fecha La fecha del pedido.
     * @param estado El estado del pedido.
     * @return Los pedidos que cumplen con los criterios de filtro
     * especificados.
     */
    public List<PedidoDTO> consultarPedidosPorFiltro(String telefono, Date fecha, String estado) {
        List<PedidoEntidad> pedidosEntidad = pedidoDAO.obtenerPedidosPorFiltro(
                telefono,
                fecha != null ? new java.sql.Date(fecha.getTime()) : null,
                estado
        );
        return convertirAListaDTO(pedidosEntidad);
    }
    /**
     * Convierte una lista de entidades de pedidos a una lista de objetos DTO de
     * pedidos.
     *
     * @param pedidosEntidad La lista de entidades de pedidos a convertir.
     * @return Una lista de objetos PedidoDTO que representan los pedidos
     * convertidos desde las entidades.
     */
    private List<PedidoDTO> convertirAListaDTO(List<PedidoEntidad> pedidosEntidad) {
        List<PedidoDTO> pedidosDTO = new ArrayList<>();
        for (PedidoEntidad pedidoEntidad : pedidosEntidad) {
            pedidosDTO.add(entityToDto(pedidoEntidad));
        }
        return pedidosDTO;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriabo;

import Entidades.UsuarioEntidad;
import com.mycompany.dto.UsuarioDTO;
import com.mycompany.persistencia.UsuarioDAO;


/**
 *
 * @author cesar
 */
public class UsuarioBO {
   private UsuarioDAO usuarioDAO;

    public UsuarioBO() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public UsuarioDTO obtenerUsuario(UsuarioDTO usuarioDTO) {
        return usuarioDAO.obtenerUsuario(usuarioDTO);
    }

    public boolean validarCredenciales(UsuarioDTO usuarioDTO, String rolEsperado) {
        return usuarioDTO != null && usuarioDTO.getRol().equals(rolEsperado);
    }

    // Métodos estáticos de conversión movidos a una clase de utilidad o servicio

    // Esto podría ser parte de una clase de utilidad separada
    public static UsuarioEntidad convertirDTOaEntidad(UsuarioDTO dto) {
        UsuarioEntidad entidad = new UsuarioEntidad();
        entidad.setNombre(dto.getNombre());
        entidad.setContrasena(dto.getContrasena());
        entidad.setRol(dto.getRol());
        return entidad;
    }

    // Esto también podría ser parte de una clase de utilidad separada
    public static UsuarioDTO convertirEntidadaDTO(UsuarioEntidad entidad) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setNombre(entidad.getNombre());
        dto.setContrasena(entidad.getContrasena());
        dto.setRol(entidad.getRol());
        return dto;
    }
}

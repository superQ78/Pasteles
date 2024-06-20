/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistencia;

import com.mycompany.dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class UsuarioDAO {
   
    private List<UsuarioDTO> usuariosRegistrados;

    public UsuarioDAO() {
        usuariosRegistrados = new ArrayList<>();
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        UsuarioDTO usuariosGerente1 = new UsuarioDTO("Cesar", "cesar123", "Empleado");
        UsuarioDTO usuariosEmpleado1 = new UsuarioDTO("Valeria", "valeria123", "Gerente");
        UsuarioDTO usuariosGerente2 = new UsuarioDTO("Joel", "joel123", "Empleado");

        usuariosRegistrados.add(usuariosGerente2);
        usuariosRegistrados.add(usuariosGerente1);
        usuariosRegistrados.add(usuariosEmpleado1);
    }

    public UsuarioDTO obtenerUsuario(UsuarioDTO usuarioDTO) {
        for (UsuarioDTO usuario : usuariosRegistrados) {
            if (usuario.getNombre().equals(usuarioDTO.getNombre()) && 
                usuario.getContrasena().equals(usuarioDTO.getContrasena())) {
                return usuario;
            }
        }
        return null;
    }

    public List<UsuarioDTO> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public void agregarUsuario(UsuarioDTO usuarioDTO) {
        usuariosRegistrados.add(usuarioDTO);
    }

    public void eliminarUsuario(UsuarioDTO usuarioDTO) {
        usuariosRegistrados.remove(usuarioDTO);
    }
}


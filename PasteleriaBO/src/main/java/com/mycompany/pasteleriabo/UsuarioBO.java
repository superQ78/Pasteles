/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasteleriabo;

import com.mycompany.dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class UsuarioBO {
    List<UsuarioDTO> usuariosRegistrados = new ArrayList<>();

    public UsuarioBO() {
        UsuarioDTO usuariosGerente1 = new UsuarioDTO("Cesar", "cesar123", "Empleado");
        UsuarioDTO usuariosEmpleado1 = new UsuarioDTO("Valeria", "valeria123", "Gerente");
        UsuarioDTO usuariosGerente2 = new UsuarioDTO("Joel", "joel123", "Empleado");

        usuariosRegistrados.add(usuariosGerente2);
        usuariosRegistrados.add(usuariosGerente1);
        usuariosRegistrados.add(usuariosEmpleado1);
    }

    public UsuarioDTO obtenerUsuario(UsuarioDTO usuarioDTO) {
        for (int i = 0; i < usuariosRegistrados.size(); i++) {
            if (usuariosRegistrados.get(i).getNombre().equals(usuarioDTO.getNombre())
                    && usuariosRegistrados.get(i).getContrasena().equals(usuarioDTO.getContrasena())) {
                return usuariosRegistrados.get(i);
            }
        }
        return null;
    }

    public boolean validarCredenciales(UsuarioDTO usuarioDTO, String rolEsperado) {
        return usuarioDTO != null && usuarioDTO.getRol().equals(rolEsperado);
    }
}


package com.mycompany.persistencia;

import Interface.IUsuarioDAO;
import com.mycompany.dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class UsuarioDAO implements IUsuarioDAO{
   
    private List<UsuarioDTO> usuariosRegistrados;

    public UsuarioDAO() {
        usuariosRegistrados = new ArrayList<>();
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        UsuarioDTO usuariosGerente1 = new UsuarioDTO("Cesar", "cesar123", "Gerente");
        UsuarioDTO usuariosEmpleado1 = new UsuarioDTO("Valeria", "valeria123", "Empleado");
        UsuarioDTO usuariosGerente2 = new UsuarioDTO("Joel", "joel123", "Empleado");

        usuariosRegistrados.add(usuariosGerente2);
        usuariosRegistrados.add(usuariosGerente1);
        usuariosRegistrados.add(usuariosEmpleado1);
    }

    @Override
    public UsuarioDTO obtenerUsuario(UsuarioDTO usuarioDTO) {
        for (UsuarioDTO usuario : usuariosRegistrados) {
            if (usuario.getNombre().equals(usuarioDTO.getNombre()) && 
                usuario.getContrasena().equals(usuarioDTO.getContrasena())) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public List<UsuarioDTO> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

   
}


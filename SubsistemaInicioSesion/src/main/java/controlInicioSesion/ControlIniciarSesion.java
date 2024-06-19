/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlInicioSesion;

import com.mycompany.dto.UsuarioDTO;
import com.mycompany.pasteleriabo.UsuarioBO;

/**
 *
 * @author cesar
 */
public class ControlIniciarSesion {
    private UsuarioBO usuarioBO;

    public ControlIniciarSesion() {
        usuarioBO = new UsuarioBO();
    }

    public boolean validarUsuario(String nombre, String contrasena, String rolEsperado) {
        UsuarioDTO usuarioDTO = new UsuarioDTO(nombre, contrasena, null);
        UsuarioDTO usuarioEncontrado = usuarioBO.obtenerUsuario(usuarioDTO);
        return usuarioBO.validarCredenciales(usuarioEncontrado, rolEsperado);
    }
}


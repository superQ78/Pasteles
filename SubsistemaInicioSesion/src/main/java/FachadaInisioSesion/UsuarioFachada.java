/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FachadaInisioSesion;

import InterfaceInicioSesion.IInicioSesion;
import controlInicioSesion.ControlIniciarSesion;

/**
 *
 * @author cesar
 */
public class UsuarioFachada implements IInicioSesion {

    private ControlIniciarSesion usuarioControl;

    public UsuarioFachada() {
        usuarioControl = new ControlIniciarSesion();
    }

    @Override
    public boolean validarUsuario(String nombre, String contrasena, String rolEsperado) {
        return usuarioControl.validarUsuario(nombre, contrasena, rolEsperado);
    }
}
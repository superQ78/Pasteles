/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceInicioSesion;

import com.mycompany.dto.UsuarioDTO;

/**
 *
 * @author cesar
 */
public interface IInicioSesion {
     boolean validarUsuario(String nombre, String contrasena,String rolEsperado);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daos;

import com.mycompany.dto.UsuarioDTO;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cesar
 */
public class UsuarioDAO {
    private static Map<String, UsuarioDTO> usuarios;
////    static {
////        usuarios = new HashMap<>();
////        usuarios.put("empleado", new UsuarioDTO() {{
////            setNombre("empleado");
////            setContrasena("empleado123");
////            setRol("EMPLEADO");
////        }});
////        usuarios.put("gerente", new UsuarioDTO() {{
////            setNombre("gerente");
////            setContrasena("gerente123");
////            setRol("GERENTE");
////        }});
////    }
////
    public UsuarioDTO obtenerUsuario(String nombre, String contrasena) {
        UsuarioDTO usuario = usuarios.get(nombre);
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return usuario;
        }
        return null;
    }
}


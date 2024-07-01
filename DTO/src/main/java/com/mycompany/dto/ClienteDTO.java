/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

/**
 *
 * @author cesar
 */
public class ClienteDTO {
     private String Clienteid;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    
    
    public ClienteDTO(){
        
    }

   public ClienteDTO(String ClienteId, String nombre, String celular, String correo) {
        this.Clienteid = ClienteId;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
    }
    public String getClienteid() {
        return Clienteid;
    }

    public void setClienteid(String Clienteid) {
        this.Clienteid = Clienteid;
    }

    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "Clienteid=" + Clienteid + ", nombre=" + nombre + ", apellido=" + apellido + ", celular=" + celular + ", correo=" + correo + '}';
    }
    
    
    

}

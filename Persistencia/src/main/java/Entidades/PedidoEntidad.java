/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author cesar
 */
public class PedidoEntidad {

    private int pedidoid; // Identificador único de pedido
    private int totalPersonas;
    private String saborPan;
    private boolean obleaDecorativa;
    private String coloresDecorativos;
    private String rellenoSabor;
    private int totalVelas;
    private Date fechaPedido;
    private int precioTotal;
    private String clienteId;
    private String estado;
    

    // Constructor vacío
    public PedidoEntidad() {
    }
    
    public PedidoEntidad(int pedidoid, int precioTotal) {
        this.pedidoid = pedidoid;
        this.precioTotal = precioTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    // Getters y setters

    public int getPedidoid() {
        return pedidoid;
    }

    public void setPedidoid(int pedidoid) {
        this.pedidoid = pedidoid;
    }

 

    public int getTotalPersonas() {
        return totalPersonas;
    }

    public void setTotalPersonas(int totalPersonas) {
        this.totalPersonas = totalPersonas;
    }

    public String getSaborPan() {
        return saborPan;
    }

    public void setSaborPan(String saborPan) {
        this.saborPan = saborPan;
    }

    public boolean isObleaDecorativa() {
        return obleaDecorativa;
    }

    public void setObleaDecorativa(boolean obleaDecorativa) {
        this.obleaDecorativa = obleaDecorativa;
    }

    public String getColoresDecorativos() {
        return coloresDecorativos;
    }

    public void setColoresDecorativos(String coloresDecorativos) {
        this.coloresDecorativos = coloresDecorativos;
    }

    public String getRellenoSabor() {
        return rellenoSabor;
    }

    public void setRellenoSabor(String rellenoSabor) {
        this.rellenoSabor = rellenoSabor;
    }

    public int getTotalVelas() {
        return totalVelas;
    }

    public void setTotalVelas(int totalVelas) {
        this.totalVelas = totalVelas;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

   

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }
 
   
    }

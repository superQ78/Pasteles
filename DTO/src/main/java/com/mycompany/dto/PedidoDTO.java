/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author cesar
 */
public class PedidoDTO {

    private int pedidoid;
    private int totalPersonas;
    private String saborPan;
    private boolean obleaDecorativa;
    private String coloresDecorativos;
    private String RellenoSabor;
    private int totalVelas;
    private Date fechaPedido;
    private int precioTotal;
    private String clienteId;

    public PedidoDTO(){
        
    }
    
    public PedidoDTO(int pedidoid, int precioTotal) {
        this.pedidoid = pedidoid;
        this.precioTotal = precioTotal;
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
        return RellenoSabor;
    }

    public void setRellenoSabor(String RellenoSabor) {
        this.RellenoSabor = RellenoSabor;
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

    public void setFechaPedido(Date fecha) {
        this.fechaPedido = fecha;
    }

    public int getPedidoid() {
        return pedidoid;
    }

    public void setPedidoid(int pedidoid) {
        this.pedidoid = pedidoid;
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

    @Override
    public String toString() {
        return "PedidoDTO{" + "pedidoid=" + pedidoid + ", totalPersonas=" + totalPersonas + ", saborPan=" + saborPan + ", obleaDecorativa=" + obleaDecorativa + ", coloresDecorativos=" + coloresDecorativos + ", RellenoSabor=" + RellenoSabor + ", totalVelas=" + totalVelas + ", fechaPedido=" + fechaPedido + ", precioTotal=" + precioTotal + ", clienteId=" + clienteId + '}';
    }
    

}

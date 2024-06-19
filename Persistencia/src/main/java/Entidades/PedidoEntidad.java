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

    private Long id; // Identificador único de pedido
    private int totalPersonas;
    private String saborPan;
    private boolean obleaDecorativa;
    private String coloresDecorativos;
    private String rellenoSabor;
    private int totalVelas;
    private Date fechaPedido;

    // Constructor vacío
    public PedidoEntidad() {
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    // Método toString() para imprimir los datos del objeto
    @Override
    public String toString() {
        return "PedidoEntidad{" +
                "id=" + id +
                ", totalPersonas=" + totalPersonas +
                ", saborPan='" + saborPan + '\'' +
                ", obleaDecorativa=" + obleaDecorativa +
                ", coloresDecorativos='" + coloresDecorativos + '\'' +
                ", rellenoSabor='" + rellenoSabor + '\'' +
                ", totalVelas=" + totalVelas +
                ", fechaPedido=" + fechaPedido +
                '}';
    }
}
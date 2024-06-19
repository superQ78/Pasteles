/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dto;
 import java.util.Date;
/**
 *
 * @author cesar
 */
public class PedidoDTO {
    private int totalPersonas;
    private String saborPan;
    private boolean obleaDecorativa;
    private String coloresDecorativos;
    private String RellenoSabor;
    private int totalVelas;
    private Date fecha;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "PedidoDTO{" + "totalPersonas=" + totalPersonas + ", saborPan=" + saborPan + ", obleaDecorativa=" + obleaDecorativa + ", coloresDecorativos=" + coloresDecorativos + ", RellenoSabor=" + RellenoSabor + ", totalVelas=" + totalVelas + ", fecha=" + fecha + '}';
    }
    
    

  

}
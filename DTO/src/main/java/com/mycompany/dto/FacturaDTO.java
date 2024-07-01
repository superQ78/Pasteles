/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto;

import java.util.Date;

/**
 *
 * @author cesar
 */
public class FacturaDTO {
    
    private int id;
    private int pedidoId;
    private String RFC;
    private String usoFiscal;
    private String CURP;
    
    public FacturaDTO(){
        
    }

    public FacturaDTO(int id, String RFC, String usoFiscal, String CURP) {
        this.id = id;
        this.RFC = RFC;
        this.usoFiscal = usoFiscal;
        this.CURP = CURP;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

   

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getUsoFiscal() {
        return usoFiscal;
    }

    public void setUsoFiscal(String usoFiscal) {
        this.usoFiscal = usoFiscal;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    
    
    
}
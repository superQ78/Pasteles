/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlRealizarPedido;

import com.mycompany.dto.PedidoDTO;
import com.mycompany.pasteleriabo.PedidoBO;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class ControlRealizarPedido {

    private PedidoBO realizarPedido;

    public ControlRealizarPedido() {
        this.realizarPedido = new PedidoBO();
    }

    public boolean ValidarFechaMax5(Date fecha) { // disponibilidad de la fecha
      int numeroDePedidos = obtenerNumeroDePedidosEnFecha(fecha);
        System.out.println("Número de pedidos en la fecha " + fecha + ": " + numeroDePedidos);
        return numeroDePedidos <= 1; // Permitir solo 2 pedidos por fecha
    }

   

    public boolean validarPeriodoFecha(Date fecha) {
  Calendar calendar = Calendar.getInstance();
    Date fechaActual = calendar.getTime();
    
    // Establecer la fecha máxima permitida (6 meses después de la fecha actual)
    calendar.add(Calendar.MONTH, 6);
    Date fechaMaxima = calendar.getTime();
    
    calendar.setTime(fecha);
    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);
    Date fechaSinHora = calendar.getTime();
    
    calendar.setTime(fechaActual);
    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);
    Date fechaActualSinHora = calendar.getTime();
    
    calendar.setTime(fechaMaxima);
    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);
    Date fechaMaximaSinHora = calendar.getTime();

    
    // Comparar fechas
    if (fechaSinHora.after(fechaActualSinHora) && fechaSinHora.before(fechaMaximaSinHora)) {
        return true;
    } else {
        JOptionPane.showMessageDialog(null, "La fecha debe estar dentro del rango de la fecha actual a 6 meses en adelante.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    }

  public int obtenerNumeroDePedidosEnFecha(Date fecha) {
       int count = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String fechaStr = sdf.format(fecha);

        for (PedidoDTO pedido : realizarPedido.obtenerPedidos()) {
            String pedidoFechaStr = sdf.format(pedido.getFechaPedido());
            if (pedidoFechaStr.equals(fechaStr)) {
                count++;
            }
        }
        return count;
    }
   
    public void agregarPedido(PedidoDTO pedido) {
        if (ValidarFechaMax5(pedido.getFechaPedido())) {
            realizarPedido.agregarPedido(pedido);
            System.out.println("Pedido agregado para la fecha: " + pedido.getFechaPedido());
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más de 2 pedidos en la misma fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  public void calcularPrecio(PedidoDTO pedidoDTO) {
    // Constantes de precios
    final int PRECIO_VELA = 5;
    final int PRECIO_POR_PERSONA = 10;
    final int PRECIO_OBLEA_DECORATIVA = 20;
    final int PRECIO_RELLENO_PAN = 25;
    final int PRECIO_SABOR_PAN = 200;
    final int FACTOR_MANO_DE_OBRA = 2;

    int precio = 0;

    // Calcular el costo de las velas
    precio += pedidoDTO.getTotalVelas() * PRECIO_VELA;

    // Calcular el costo por persona
    precio += pedidoDTO.getTotalPersonas() * PRECIO_POR_PERSONA;

    // Añadir costo de la oblea decorativa si aplica
    if (pedidoDTO.isObleaDecorativa()) {
        precio += PRECIO_OBLEA_DECORATIVA;
    }

    // Añadir costo del relleno del pan
    precio += PRECIO_RELLENO_PAN;

    // Añadir costo del sabor del pan
    precio += PRECIO_SABOR_PAN;

    // Multiplicar por el factor de mano de obra
    precio *= FACTOR_MANO_DE_OBRA;

    // Establecer el precio total en el PedidoDTO
    pedidoDTO.setPrecioTotal(precio);
}

 
    
}


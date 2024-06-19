/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlRealizarPedido;

import com.mycompany.dto.PedidoDTO;
import com.mycompany.pasteleriabo.PedidoBO;
import com.mycompany.pasteleriabo.PedidoBO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
        return numeroDePedidos <= 2; // Permitir solo 2 pedidos por fecha
    }

   

    public boolean validarPeriodoFecha(Date fecha) {
  Calendar calendar = Calendar.getInstance();
    Date fechaActual = calendar.getTime();
    
    // Establecer la fecha máxima permitida (6 meses después de la fecha actual)
    calendar.add(Calendar.MONTH, 6);
    Date fechaMaxima = calendar.getTime();
    
    // Ajustar las fechas para ignorar la parte de tiempo (hora, minuto, segundo)
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
            String pedidoFechaStr = sdf.format(pedido.getFecha());
            if (pedidoFechaStr.equals(fechaStr)) {
                count++;
            }
        }
        return count;
    }
   
    public void agregarPedido(PedidoDTO pedido) {
        if (ValidarFechaMax5(pedido.getFecha())) {
            realizarPedido.agregarPedido(pedido);
            System.out.println("Pedido agregado para la fecha: " + pedido.getFecha());
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más de 2 pedidos en la misma fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        public double calcularPrecio(PedidoDTO pedido) {
        return realizarPedido.calcularPrecio(pedido);
        }
    
}


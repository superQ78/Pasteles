package Presentacion;

import FachadaModificar.ModificarFachada;
import FachadaRealizarPedido.PedidoFachada;
import InterfaceInicioSesion.IInicioSesion;
import InterfaceRealizarPedido.IModificarPedido;
import InterfaceRealizarPedido.IPedido;
import com.mycompany.dto.PedidoDTO;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class IngresaPedido extends javax.swing.JFrame {

    private IPedido pedido;
    private IModificarPedido modificar;
    private PedidoDTO pedidoDTO;
    private IInicioSesion inicioSesion;

    public IngresaPedido() {
        this.pedido = new PedidoFachada();
        this.modificar = new ModificarFachada();
        this.pedidoDTO = new PedidoDTO();
        initComponents();
        setSize(430, 670);
        setResizable(false);
        this.setLocationRelativeTo(this);
        // cargarPedidoParaModificar(pedidoDTO);
    }

    public void setPedido(IPedido pedido) {
        this.pedido = pedido;
    }

    /**
     * Este método llena los campos con los detalles del pedido en la pantalla
     * IngresaPedido al dar clic en el botón modificar, para después
     * modificarlo.
     *
     * @param pedidoDTO El objeto PedidoDTO con los detalles del pedido a
     * modificar.
     */
    public void cargarPedidoParaModificar(PedidoDTO pedidoDTO) {
        this.pedidoDTO = pedidoDTO;
//         Llenar los campos de la ventana IngresaPedido con los datos del pedidoDTO

        txtTelefono.setText(pedidoDTO.getClienteId());
        txtColores.setText(pedidoDTO.getColoresDecorativos());
        dtcAgregarFecha.setDate(pedidoDTO.getFechaPedido());
        cbOblea.setText(pedidoDTO.isObleaDecorativa() ? "Sí" : "No");
        cmbSaborRelleno.setSelectedItem(pedidoDTO.getRellenoSabor());
        cmbSaborPan.setSelectedItem(pedidoDTO.getSaborPan());
        spVelas.setValue(pedidoDTO.getTotalVelas());
        spTotalPersonas.setValue(pedidoDTO.getTotalPersonas());

//         Otros campos según necesidad
//         Mostrar el botón de actualizar si el pedidoDTO ya tiene un ID asignado
        if (pedidoDTO.getPedidoid() != 0) {
            btActualizarPedido.setVisible(true);
            btRealizarPedido.setVisible(false); // Ocultar el botón de realizar pedido si se está modificando
        } else {
            btActualizarPedido.setVisible(false);
            btRealizarPedido.setVisible(true); // Mostrar el botón de realizar pedido si no se está modificando
        }
    }

    /**
     * Este método guarda los cambios realizados de los detalles del pedido.
     */
    public void obtenerPedidoDto() {
        Date fecha = dtcAgregarFecha.getDate();
        pedidoDTO.setClienteId(txtTelefono.getText());
        pedidoDTO.setColoresDecorativos(txtColores.getText());
        pedidoDTO.setFechaPedido(fecha);
        pedidoDTO.setObleaDecorativa(cbOblea.isSelected());
        pedidoDTO.setRellenoSabor((String) cmbSaborRelleno.getSelectedItem());
        pedidoDTO.setSaborPan((String) cmbSaborPan.getSelectedItem());
        pedidoDTO.setTotalVelas((int) spVelas.getValue());
        pedidoDTO.setTotalPersonas((int) spTotalPersonas.getValue());
        pedido.obtenerPrecioTotal(pedidoDTO);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btRealizarPedido = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmbSaborPan = new javax.swing.JComboBox<>();
        cbOblea = new javax.swing.JCheckBox();
        txtTelefono = new javax.swing.JTextField();
        cmbSaborRelleno = new javax.swing.JComboBox<>();
        spVelas = new javax.swing.JSpinner();
        dtcAgregarFecha = new com.toedter.calendar.JDateChooser();
        spTotalPersonas = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtColores = new javax.swing.JTextField();
        btActualizarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar pedido");
        setPreferredSize(new java.awt.Dimension(430, 670));

        jPanel1.setBackground(new java.awt.Color(247, 239, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Oblea decorativa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Total de personas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Colores decorativos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Sabos de relleno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Agregar fecha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Sabor de pan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Total de velas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 30));

        btRealizarPedido.setBackground(new java.awt.Color(153, 0, 153));
        btRealizarPedido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btRealizarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btRealizarPedido.setText("Realizar pedido");
        btRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRealizarPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btRealizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 160, 35));

        jButton2.setBackground(new java.awt.Color(204, 0, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        cmbSaborPan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vainilla", "Chocolate", "Fresa" }));
        jPanel1.add(cmbSaborPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 150, 30));

        cbOblea.setText("Si");
        jPanel1.add(cbOblea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 60, 30));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, 30));

        cmbSaborRelleno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fresa", "Babaria", "Cajeta" }));
        jPanel1.add(cmbSaborRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 150, 30));
        jPanel1.add(spVelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 150, 30));
        jPanel1.add(dtcAgregarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 150, 30));
        jPanel1.add(spTotalPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 150, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Ingresar pedido");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Num. Teléfono");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));
        jPanel1.add(txtColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 150, 30));

        btActualizarPedido.setBackground(new java.awt.Color(153, 0, 153));
        btActualizarPedido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btActualizarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btActualizarPedido.setText("Actualizar pedido");
        btActualizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btActualizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, -1, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRealizarPedidoActionPerformed
        Date fecha = dtcAgregarFecha.getDate();

        if (txtTelefono.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el número de teléfono.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtColores.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese los colores decorativos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (fecha == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cmbSaborRelleno.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un sabor de relleno.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (cmbSaborPan.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un sabor de pan.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if ((int) spTotalPersonas.getValue() <= 0) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido de personas.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear o actualizar el objeto PedidoDTO con los datos ingresados
        if (pedidoDTO == null) {
            pedidoDTO = new PedidoDTO();
            pedidoDTO.setEstado("Pendiente");
        }

        pedidoDTO.setClienteId(txtTelefono.getText());
        pedidoDTO.setColoresDecorativos(txtColores.getText());
        pedidoDTO.setFechaPedido(fecha);
        pedidoDTO.setObleaDecorativa(cbOblea.isSelected());
        pedidoDTO.setRellenoSabor((String) cmbSaborRelleno.getSelectedItem());
        pedidoDTO.setSaborPan((String) cmbSaborPan.getSelectedItem());
        pedidoDTO.setTotalVelas((int) spVelas.getValue());
        pedidoDTO.setTotalPersonas((int) spTotalPersonas.getValue());

        // Validar período y cantidad máxima de pedidos en la fecha seleccionada
        if (!pedido.ValidarPeriodo(fecha)) {
            JOptionPane.showMessageDialog(this, "La fecha debe estar dentro del rango de la fecha actual a 6 meses en adelante.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!pedido.ValidarFechMax5(fecha)) {
            JOptionPane.showMessageDialog(this, "No se pueden realizar más de 2 pedidos en el mismo día.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pedido.obtenerPrecioTotal(pedidoDTO);

        try {
            if (pedidoDTO.getPedidoid() == 0) {
                // Si el ID es 0, entonces es un nuevo pedido
                pedido.agregarPedido(pedidoDTO);
            } else {
                // Si el ID no es 0, entonces es una actualización
                modificar.actualizarPedido(pedidoDTO); // Asegúrate de pasar el pedidoDTO actualizado
            }

            // Mostrar la pantalla del resumen de pedidos
            ConsultaPedidos resumen = new ConsultaPedidos( pedido, pedidoDTO,inicioSesion);
            resumen.setVisible(true);
            this.dispose();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btRealizarPedidoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RealizarPedido realizarPedido = new RealizarPedido(pedido); // Asegúrate de tener la clase ConsultaPedidos implementada
        realizarPedido.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btActualizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarPedidoActionPerformed
        // Lógica para actualizar el pedido
        obtenerPedidoDto();
        try {
            // Actualizar el pedido utilizando el método en PedidoBO
            if (modificar.actualizarPedido(pedidoDTO)) {
                JOptionPane.showMessageDialog(this, "Pedido actualizado correctamente.");

                // Mostrar la pantalla de ConsultaPedidos con los detalles actualizados
                ConsultaPedidos consultaPedidos = new ConsultaPedidos( pedido, pedidoDTO,inicioSesion);
                consultaPedidos.setVisible(true);
                this.dispose(); // Cerrar la pantalla actual
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el pedido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btActualizarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizarPedido;
    private javax.swing.JButton btRealizarPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbOblea;
    private javax.swing.JComboBox<String> cmbSaborPan;
    private javax.swing.JComboBox<String> cmbSaborRelleno;
    private com.toedter.calendar.JDateChooser dtcAgregarFecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spTotalPersonas;
    private javax.swing.JSpinner spVelas;
    private javax.swing.JTextField txtColores;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

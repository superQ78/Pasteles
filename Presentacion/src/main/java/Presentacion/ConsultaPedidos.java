/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import InterfaceInicioSesion.IInicioSesion;
import InterfaceRealizarPedido.IPedido;
import com.mycompany.dto.PedidoDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria
 */
public class ConsultaPedidos extends javax.swing.JFrame {

   private PedidoDTO pedidoDTO;
    private IInicioSesion inicioSesion;
private IPedido pedido;
    /**
     * Creates new form ConsultaPedido
     *
     *
     * @param pedido
     * @param pedidoDTO
     * @param inicioSesion
     */
    public ConsultaPedidos(IPedido pedido, PedidoDTO pedidoDTO, IInicioSesion inicioSesion) {
       

        this.inicioSesion = inicioSesion;
        initComponents();
        setSize(430, 600);
        setResizable(false);
        this.setLocationRelativeTo(this);
        llenarDetallesPedido(pedidoDTO);

    }

    private void llenarDetallesPedido(PedidoDTO pedidoDTO) { 

    // Actualización de etiquetas de UI
    PersonasLabel.setText(String.valueOf(pedidoDTO.getTotalPersonas()));
    coloresLabel.setText(pedidoDTO.getColoresDecorativos());
    ObleaLabel.setText(pedidoDTO.isObleaDecorativa() ? "Sí" : "No");
    rellenoLabel.setText(pedidoDTO.getRellenoSabor());
    panLabel.setText(pedidoDTO.getSaborPan());
    velasLabel.setText(String.valueOf(pedidoDTO.getTotalVelas()));
    fechaLabel.setText(pedidoDTO.getFechaPedido().toString());
    precioLabel.setText("Precio Total: $" + pedidoDTO.getPrecioTotal());
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        obleaLabel = new javax.swing.JPanel();
        PersonasLabel = new javax.swing.JLabel();
        panLabel = new javax.swing.JLabel();
        ObleaLabel = new javax.swing.JLabel();
        coloresLabel = new javax.swing.JLabel();
        rellenoLabel = new javax.swing.JLabel();
        velasLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        precioLabel = new javax.swing.JLabel();
        jButtonTramitarFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        obleaLabel.setBackground(new java.awt.Color(247, 239, 255));
        obleaLabel.setPreferredSize(new java.awt.Dimension(345, 530));
        obleaLabel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PersonasLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PersonasLabel.setText("Personas");
        obleaLabel.add(PersonasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 150, 30));

        panLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panLabel.setText("Pan");
        obleaLabel.add(panLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 150, 30));

        ObleaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ObleaLabel.setText("Oblea");
        obleaLabel.add(ObleaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 150, 30));

        coloresLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coloresLabel.setText("Colores");
        obleaLabel.add(coloresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 150, 30));

        rellenoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rellenoLabel.setText("Relleno");
        obleaLabel.add(rellenoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 150, 30));

        velasLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        velasLabel.setText("Velas");
        obleaLabel.add(velasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 150, 30));

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechaLabel.setText("Fecha");
        obleaLabel.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        obleaLabel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Total de personas:");
        obleaLabel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Sabor de pan:");
        obleaLabel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Oblea decorativa:");
        obleaLabel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Colores decorativos:");
        obleaLabel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Sabor de relleno:");
        obleaLabel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Total de velas:");
        obleaLabel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Agregar fecha:");
        obleaLabel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Detalles del pedido");
        obleaLabel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        obleaLabel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 380, 320));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        obleaLabel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        precioLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precioLabel.setText("Total");
        obleaLabel.add(precioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jButtonTramitarFactura.setText("Tramitar Factura");
        jButtonTramitarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTramitarFacturaActionPerformed(evt);
            }
        });
        obleaLabel.add(jButtonTramitarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, -1));

        getContentPane().add(obleaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        RealizarPedido regresar = new RealizarPedido(pedido); // Asegúrate de tener la clase ConsultaPedidos implementada
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonTramitarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTramitarFacturaActionPerformed

        int option = JOptionPane.showConfirmDialog(this,
                "Solo gerencia puede tramitar facturas, ¿desea iniciar sesión como gerente?",
                "Tramitar Factura",
                JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            InicioSesion ini = new InicioSesion(inicioSesion, pedido);
            ini.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_jButtonTramitarFacturaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ObleaLabel;
    private javax.swing.JLabel PersonasLabel;
    private javax.swing.JLabel coloresLabel;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonTramitarFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel obleaLabel;
    private javax.swing.JLabel panLabel;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JLabel rellenoLabel;
    private javax.swing.JLabel velasLabel;
    // End of variables declaration//GEN-END:variables
}

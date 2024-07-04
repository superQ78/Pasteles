package Presentacion;

import InterfaceInicioSesion.IInicioSesion;
import InterfaceRealizarPedido.IPedido;
import com.mycompany.dto.PedidoDTO;

/**
 *
 *
 * @author Valeria
 */
public final class ImprimirPedido extends javax.swing.JFrame {
    private PedidoDTO pedidoDTO;
    private IPedido pedido;
    private IInicioSesion inicioSesion;

    /**
     * Creates new form Impresion
     */
    public ImprimirPedido(PedidoDTO pedidoDTO) {
        this.pedidoDTO = pedidoDTO;
        initComponents();
        setSize(590, 680);
        setResizable(false);
        this.setLocationRelativeTo(this);
        imprimeDatosPedido(pedidoDTO);
    }

    // Método para actualizar los datos del pedido
    public void imprimeDatosPedido(PedidoDTO pedidoDTO) {
        idLabel.setText(String.valueOf(pedidoDTO.getPedidoid()));
        telefonoLabel.setText(pedidoDTO.getClienteId());
        PersonasLabel.setText(String.valueOf(pedidoDTO.getTotalPersonas()));
        coloresLabel.setText(pedidoDTO.getColoresDecorativos());
        ObleaLabel.setText(pedidoDTO.isObleaDecorativa() ? "Sí" : "No");
        rellenoLabel.setText(pedidoDTO.getRellenoSabor());
        panLabel.setText(pedidoDTO.getSaborPan());
        velasLabel.setText(String.valueOf(pedidoDTO.getTotalVelas()));
        fechaLabel.setText(pedidoDTO.getFechaPedido().toString());
        precioTotalLabel.setText("$" + pedidoDTO.getPrecioTotal());

        // Actualizar los labels con los precios individuales
        int precioVelas = pedidoDTO.getTotalVelas() * 5;
        int precioPersonas = pedidoDTO.getTotalPersonas() * 10;
        int precioOblea = pedidoDTO.isObleaDecorativa() ? 20 : 0;
        int precioRelleno = 25;
        int precioPan = 200;
        // Calcular el precio total
        int precioTotal = (precioVelas + precioPersonas + precioOblea + precioRelleno + precioPan) * 2; // Multiplicar por el factor de mano de obra

        totalMano.setText("$ " + precioVelas);
        totalPersonasLabel.setText("$ " + precioPersonas);
        totalOblea.setText("$ " + precioOblea);
        totalRelleno.setText("$ " + precioRelleno);
        totalPanLabel.setText("$" + precioPan);
        //precioTotalLabel.setText("$ " + precioTotal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        personas = new javax.swing.JLabel();
        PersonasLabel = new javax.swing.JLabel();
        panLabel = new javax.swing.JLabel();
        pan = new javax.swing.JLabel();
        oblea = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        sabor = new javax.swing.JLabel();
        vela = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        precioTotalLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        velasLabel = new javax.swing.JLabel();
        rellenoLabel = new javax.swing.JLabel();
        coloresLabel = new javax.swing.JLabel();
        ObleaLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        telefono = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        totalRelleno = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        total = new javax.swing.JLabel();
        totalPersonasLabel = new javax.swing.JLabel();
        totalPanLabel = new javax.swing.JLabel();
        totalMano = new javax.swing.JLabel();
        totalOblea = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        menu = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 239, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(565, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(102, 0, 102));
        titulo.setText("Detalles del pedido");
        jPanel2.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        personas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personas.setText("Total de personas:");
        jPanel2.add(personas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 30));

        PersonasLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PersonasLabel.setText("Personas");
        jPanel2.add(PersonasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 150, 30));

        panLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panLabel.setText("Pan");
        jPanel2.add(panLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 150, 30));

        pan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pan.setText("Sabor de pan:");
        jPanel2.add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        oblea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        oblea.setText("Oblea decorativa:");
        jPanel2.add(oblea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 30));

        color.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        color.setText("Colores decorativos:");
        jPanel2.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        sabor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sabor.setText("Sabor de relleno:");
        jPanel2.add(sabor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 30));

        vela.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vela.setText("Total de velas:");
        jPanel2.add(vela, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 30));

        fecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fecha.setText("Fecha de entrega:");
        jPanel2.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));

        precioTotalLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        precioTotalLabel.setText("Total");
        jPanel2.add(precioTotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 50, -1));

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fechaLabel.setText("Fecha");
        jPanel2.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, 30));

        velasLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        velasLabel.setText("Velas");
        jPanel2.add(velasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 150, 30));

        rellenoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rellenoLabel.setText("Relleno");
        jPanel2.add(rellenoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 150, 30));

        coloresLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        coloresLabel.setText("Colores");
        jPanel2.add(coloresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 150, 30));

        ObleaLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ObleaLabel.setText("Oblea");
        jPanel2.add(ObleaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 150, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(102, 0, 102));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 380, 240));

        telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        telefono.setText("Num. Teléfono:");
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        telefonoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        telefonoLabel.setText("Numero teléfono");
        jPanel2.add(telefonoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Id del pedido:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        idLabel.setText("id");
        jPanel2.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 30));

        totalRelleno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalRelleno.setText("totalSabor");
        jPanel2.add(totalRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 100, 10));

        total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        total.setText("Precio total:");
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        totalPersonasLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalPersonasLabel.setText("totalPersonas");
        jPanel2.add(totalPersonasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, 30));

        totalPanLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalPanLabel.setText("totalPan");
        jPanel2.add(totalPanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, 30));

        totalMano.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalMano.setText("totalVelas");
        jPanel2.add(totalMano, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, 30));

        totalOblea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalOblea.setText("totalOblea");
        jPanel2.add(totalOblea, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 480, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 12, 550, 570));

        menu.setBackground(new java.awt.Color(153, 0, 153));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("Menú");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, -1, -1));

        regresar.setBackground(new java.awt.Color(153, 0, 153));
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        RealizarPedido realizarPedido = new RealizarPedido(pedido); // Asegúrate de tener la clase ConsultaPedidos implementada
        realizarPedido.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        ConsultaPedidos resumen = new ConsultaPedidos(pedido, pedidoDTO,inicioSesion);
        resumen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
    /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ImprimirPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ImprimirPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ImprimirPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ImprimirPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

    /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ImprimirPedido().setVisible(true);
//            }
//        });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ObleaLabel;
    private javax.swing.JLabel PersonasLabel;
    private javax.swing.JLabel color;
    private javax.swing.JLabel coloresLabel;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton menu;
    private javax.swing.JLabel oblea;
    private javax.swing.JLabel pan;
    private javax.swing.JLabel panLabel;
    private javax.swing.JLabel personas;
    private javax.swing.JLabel precioTotalLabel;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel rellenoLabel;
    private javax.swing.JLabel sabor;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefonoLabel;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalMano;
    private javax.swing.JLabel totalOblea;
    private javax.swing.JLabel totalPanLabel;
    private javax.swing.JLabel totalPersonasLabel;
    private javax.swing.JLabel totalRelleno;
    private javax.swing.JLabel vela;
    private javax.swing.JLabel velasLabel;
    // End of variables declaration//GEN-END:variables
}

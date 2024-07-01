/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import InterfaceFinanza.IFinanza;
import com.mycompany.dto.ClienteDTO;
import com.mycompany.pasteleriabo.FinanzasBO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesar
 */
public class Cliente extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private FinanzasBO finanzaBO;

    /**
     * Creates new form Cliente
     */
    public Cliente( ) {
        initComponents();
        finanzaBO = new FinanzasBO();
        cargarClientes();
        setLocationRelativeTo(null);

        
    }
   

    private void cargarClientes() {
        List<ClienteDTO> clientes = finanzaBO.obtenerClientes();
        DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();
        model.setRowCount(0); 

        for (ClienteDTO cliente : clientes) {
            model.addRow(new Object[]{cliente.getClienteid(), cliente.getNombre(), cliente.getApellido(), cliente.getCelular(), cliente.getCorreo()});
        }
    }


  private void agregarNuevoCliente() {
        String nombre = nombreField.getText();
    String apellido = apellidoField.getText();
       String celular = celularField.getText();
    String correo = correoField.getText();

    if (finanzaBO.existeNumeroDeCelular(celular)) {
        JOptionPane.showMessageDialog(this, "El número de celular ya está registrado. Por favor, ingrese otro número.");
        return;
    }

    ClienteDTO nuevoCliente = new ClienteDTO();
    nuevoCliente.setNombre(nombre);
    nuevoCliente.setApellido(apellido);
    nuevoCliente.setCelular(celular);
    nuevoCliente.setCorreo(correo);

    finanzaBO.agregarCliente(nuevoCliente);
    cargarClientes(); // Recargar la tabla para mostrar el nuevo cliente

    // Después de agregar el nuevo cliente, avanzar a la siguiente pantalla
    SeleccionFactur seleccion = new SeleccionFactur(celular);
    seleccion.setVisible(true);
    this.dispose();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        apellidoField = new javax.swing.JTextField();
        celularField = new javax.swing.JTextField();
        correoField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 239, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setText("Datos Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel2.setText("Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("Celular:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel5.setText("Correo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, -1));
        jPanel1.add(apellidoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 130, -1));
        jPanel1.add(celularField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 130, -1));
        jPanel1.add(correoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 130, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Agregar Nuevo Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, 40));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 277, 380, 160));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Seleccionar Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregarNuevoCliente();
//        String celular=celularField.getText();
//        SeleccionFactur seleccion= new SeleccionFactur(celular);
//        seleccion.setVisible(true);
//        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = tblClientes.getSelectedRow();
    if (selectedRow >= 0) {
        DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();
        String id = (String) model.getValueAt(selectedRow, 0);  // Suponiendo que la columna 0 tiene el ID del cliente
        ClienteDTO cliente = finanzaBO.obtenerClientePorId(id);  // Implementa este método en FinanzasBO
    String celular =  (String) model.getValueAt(selectedRow, 3);

        SeleccionFactur seleccion = new SeleccionFactur(celular);
        seleccion.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un cliente para continuar.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
 
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoField;
    private javax.swing.JTextField celularField;
    private javax.swing.JTextField correoField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}

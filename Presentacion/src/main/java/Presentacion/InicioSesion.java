/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

//import FachadaConsulta.FachadaConsulta;
import FachadaInisioSesion.UsuarioFachada;
import FachadaRealizarPedido.PedidoFachada;
//import InterfaceConsulta.IConsulta;
import InterfaceInicioSesion.IInicioSesion;
import InterfaceRealizarPedido.IPedido;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class InicioSesion extends javax.swing.JFrame {

    private IPedido pedido;
    private IInicioSesion inicioSesion;
    //private IConsultaPedido consulta;

    public InicioSesion(IInicioSesion inicioSesion, IPedido pedido) {
        this.inicioSesion = new UsuarioFachada();
        this.pedido = pedido;
        initComponents();
        setSize(430, 560);
        setResizable(false);
        this.setLocationRelativeTo(this);
    }

    public void setInicioSesion(IInicioSesion inicioSesion) {
        this.inicioSesion = inicioSesion;
    }

    /**
     * Creates new form InicioSesion
     */
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
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(430, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(247, 239, 255));
        jPanel1.setForeground(new java.awt.Color(255, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Inicio Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 300, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setText("Contarseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(153, 0, 153));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 150, 40));

        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 300, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setText("Empleado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 433, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

        String nombre = txtNombre.getText();
        String contrasena = new String(txtContrasena.getPassword());
        if (inicioSesion.validarUsuario(nombre, contrasena, "Empleado")) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso como Empleado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            // Redirige al empleado a la ventana RealizarPedido
            RealizarPedido realizar = new RealizarPedido(pedido);
            realizar.setVisible(true);
            this.dispose();
        } else if (inicioSesion.validarUsuario(nombre, contrasena, "Gerente")) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso como Gerente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            // Redirige al gerente a la ventana RealizarPedido (con funcionalidad adicional)
            Menu menu = new Menu();
            menu.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed


    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PedidoFachada pedidoFachada = new PedidoFachada();
        UsuarioFachada usuarioFachada = new UsuarioFachada();
        //IInicioSesion usuarioFachada = new UsuarioFachada();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion(usuarioFachada, pedidoFachada).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

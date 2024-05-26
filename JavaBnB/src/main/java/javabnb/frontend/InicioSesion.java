/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;

import java.util.ArrayList;

import javabnb.backend.GestorInmueble;
import javabnb.backend.Persona;
import javabnb.backend.Anfitrion;
import javabnb.backend.ClienteParticular;
import javax.swing.JOptionPane;

/**
 *
 * @author sco23
 */
public class InicioSesion extends javax.swing.JFrame {

    
    ArrayList<Persona> personas = new ArrayList<>();
    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        imgLabel.requestFocusInWindow();
        GestorInmueble.recuperarDatosPersonas();
        GestorInmueble.recuperarDatosInmuebles();
        GestorInmueble.recuperarDatosReservas();
        personas = GestorInmueble.getPersonas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        crearAnfitrion = new javax.swing.JButton();
        crearCliente = new javax.swing.JButton();
        textoEmail = new javax.swing.JTextField();
        botonInicioSesion = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        textoContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(572, 418));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("¿No tienes cuenta? Crea una como");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel2.setText("o como");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 392, -1, -1));

        crearAnfitrion.setText("Anfitrión");
        crearAnfitrion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAnfitrionActionPerformed(evt);
            }
        });
        getContentPane().add(crearAnfitrion, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 389, -1, -1));

        crearCliente.setText("Cliente");
        crearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteActionPerformed(evt);
            }
        });
        getContentPane().add(crearCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 389, -1, -1));

        textoEmail.setText("Email");
        textoEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textoEmailFocusGained(evt);
            }
        });
        getContentPane().add(textoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 280, 151, -1));

        botonInicioSesion.setText("Iniciar Sesión");
        botonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioSesionActionPerformed(evt);
            }
        });
        getContentPane().add(botonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 351, -1, -1));

        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoJavaBnB-removebg.png"))); // NOI18N
        getContentPane().add(imgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 44, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_size_invert.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));
        getContentPane().add(textoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 311, 151, -1));

        jLabel3.setText("Correo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 283, -1, -1));

        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 313, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearAnfitrionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAnfitrionActionPerformed
CrearAnfitrion crearAnfitrion = new CrearAnfitrion(this.getLocation());
        crearAnfitrion.setVisible(true); // Mostrar la ventana CrearCliente
        this.setVisible(false); // Ocultar la ventana InicioSesion        
    }//GEN-LAST:event_crearAnfitrionActionPerformed

    private void textoEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textoEmailFocusGained
       if (textoEmail.getText().equals("Email")){
       textoEmail.setText("");
       }
    }//GEN-LAST:event_textoEmailFocusGained

    private void botonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioSesionActionPerformed
        String email = textoEmail.getText();
        char[] arrayC = textoContraseña.getPassword();
        String contraseña = new String(arrayC);
        
        boolean mostrar = false;
        for (Persona persona: personas){
            if (persona.getCorreo().equals(email) && persona.getClave().equals(contraseña)){
                System.out.println(persona);
                if (persona instanceof ClienteParticular){
                    System.out.println(persona);
                MenuPrincipalCliente menuCliente = new MenuPrincipalCliente((ClienteParticular)persona);
                menuCliente.setLocation(this.getLocation());
                this.setVisible(false);
                }
                if (persona instanceof Anfitrion) {
                MenuPrincipalAnfitrion menuAnfitiron = new MenuPrincipalAnfitrion((Anfitrion)persona);
                menuAnfitiron.setLocation(this.getLocation());
                this.setVisible(false);
                }
            } else {
                mostrar = true;
            }
        }
        if (mostrar){
            JOptionPane.showMessageDialog(this,"Coreo o ontraseña incorrectos ","Error de inicio sesion",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonInicioSesionActionPerformed

    private void crearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearClienteActionPerformed
        CrearCliente crearCliente = new CrearCliente(this.getLocation());
        crearCliente.setVisible(true); // Mostrar la ventana CrearCliente
        this.setVisible(false); // Ocultar la ventana InicioSesion
    }//GEN-LAST:event_crearClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicioSesion;
    private javax.swing.JButton crearAnfitrion;
    private javax.swing.JButton crearCliente;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField textoContraseña;
    private javax.swing.JTextField textoEmail;
    // End of variables declaration//GEN-END:variables
}

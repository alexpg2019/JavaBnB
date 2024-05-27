

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;

import java.awt.Point;
import java.util.ArrayList;
import javabnb.backend.*;
import javabnb.frontend.EditarAnfitrion;
import javabnb.frontend.EditarCliente;
import javax.swing.JLabel;

/**
 *
 * @author ALEJANDRO
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private Persona persona;
    /**
     * Creates new form MenuPrincipal
     * 
     * @param localizacion
     * @param persona
     */
    public MenuPrincipal( Point localizacion, Persona persona) {
        this.setLocation(localizacion);
        this.persona = persona;
        initComponents();
        this.setVisible(true);
        if (persona instanceof ClienteParticular) {
            jMenu1.setText("Busqueda");
            buscarGestionarInmuebles.setText("Busqueda Inmuebles");
        }
        else {
            jMenu1.setText("Añadir");
            buscarGestionarInmuebles.setText("Añadir inmueble");
        }

        if (persona instanceof ClienteParticular) {
            jMenu2.setText("Reseñas");
            btnReseñaModInm.setText("Escribir Reseñas");
        }
        else {
            jMenu2.setText("Gestionar");
            btnReseñaModInm.setText("Modificar inmueble");
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBusqueda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        buscarGestionarInmuebles = new javax.swing.JMenuItem();
        btnReseñaModInm = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btnReservas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        botonPerfil = new javax.swing.JMenuItem();

        jPanelBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanelBusqueda.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 70, -1, -1));

        jButton1.setText("jButton1");
        jPanelBusqueda.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 174, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaBnB");
        setMinimumSize(new java.awt.Dimension(1100, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoJavaBnB-PNGx2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 73));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 73));

        jMenu1.setText("Busqueda");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setMaximumSize(new java.awt.Dimension(120, 32767));
        jMenu1.setMinimumSize(new java.awt.Dimension(120, 22));

        buscarGestionarInmuebles.setText("Buscar inmuebles");
        buscarGestionarInmuebles.setToolTipText("");
        buscarGestionarInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarGestionarInmueblesActionPerformed(evt);
            }
        });
        jMenu1.add(buscarGestionarInmuebles);

        btnReseñaModInm.setText("Escribir reseña");
        btnReseñaModInm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReseñaModInmActionPerformed(evt);
            }
        });
        jMenu1.add(btnReseñaModInm);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reseñas");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setMaximumSize(new java.awt.Dimension(120, 32767));
        jMenu2.setMinimumSize(new java.awt.Dimension(120, 22));
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reservas");
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setMaximumSize(new java.awt.Dimension(120, 32767));
        jMenu3.setMinimumSize(new java.awt.Dimension(120, 22));

        btnReservas.setText("Consultar reservas");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });
        jMenu3.add(btnReservas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Perfil");
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setMaximumSize(new java.awt.Dimension(120, 32767));
        jMenu4.setMinimumSize(new java.awt.Dimension(120, 45));

        botonPerfil.setText("Modificar datos");
        botonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilActionPerformed(evt);
            }
        });
        jMenu4.add(botonPerfil);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilActionPerformed
        if (persona instanceof Anfitrion) {
            EditarAnfitrion editaranfitrion = new EditarAnfitrion(this.getLocation(),persona);
            this.dispose();
        }
        else {
            EditarCliente editarcliente = new EditarCliente(this.getLocation(),persona);
            this.dispose();
        }  
    }//GEN-LAST:event_botonPerfilActionPerformed

    private void buscarGestionarInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarGestionarInmueblesActionPerformed
        if (persona instanceof ClienteParticular) {
            BuscarInmuebles busquedaInm = new BuscarInmuebles(this.getLocation(),persona);
            this.dispose();
        } else {
            CrearInmueble crearInmueble = new CrearInmueble(this.getLocation(),persona);
            this.dispose();
        }
    }//GEN-LAST:event_buscarGestionarInmueblesActionPerformed

    private void btnReseñaModInmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReseñaModInmActionPerformed
        if (persona instanceof Anfitrion) {
            ModificarInmueble modInmueble = new ModificarInmueble(this.getLocation(),persona);
            this.dispose();
        }
        else {
            AñadirReseña añadirReseña = new AñadirReseña(this.getLocation(),persona);
            this.dispose();
        }  
    }//GEN-LAST:event_btnReseñaModInmActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        ConsultarReservasCliente consultarReservas = new ConsultarReservasCliente(this.getLocation(),persona);
        this.dispose();
    }//GEN-LAST:event_btnReservasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botonPerfil;
    private javax.swing.JMenuItem btnReservas;
    private javax.swing.JMenuItem btnReseñaModInm;
    private javax.swing.JMenuItem buscarGestionarInmuebles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelBusqueda;
    // End of variables declaration//GEN-END:variables
}

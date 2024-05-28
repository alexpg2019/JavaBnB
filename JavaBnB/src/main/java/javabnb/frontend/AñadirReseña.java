

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;

import java.awt.Container;
import java.awt.Point;
import java.time.LocalDate;
import java.util.ArrayList;
import javabnb.backend.*;
import javabnb.frontend.EditarAnfitrion;
import javabnb.frontend.EditarCliente;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO
 */
public class AñadirReseña extends javax.swing.JFrame {
    private Persona persona;
    private  ClienteParticular cliente;
    ArrayList<Reserva> listaRes;
    ArrayList<Reserva> listaReservas;
    int pagAct = 0; 
    int numPag;
    int startIndex = pagAct*4;
    
     
         
    /**
     * Creates new form MenuPrincipal
     * 
     * @param localizacion
     * @param persona
     */
    public AñadirReseña( Point localizacion, Persona persona) {
        this.setLocation(localizacion);
        this.persona = persona;
        this.cliente = (ClienteParticular) persona;
        this.listaRes = cliente.getReservas();
        this.listaReservas = new ArrayList<>();
        for (Reserva reserva : listaRes){
    if (!reserva.getFechaSalida().isAfter(LocalDate.now())){
        listaReservas.add(reserva);}
    }
        
        
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
        
         
    
    this.numPag = (int) Math.ceil(listaReservas.size()/4);
    
        titulo1.setText("");
        foto1.setIcon(null);

        titulo2.setText("");
        foto2.setIcon(null);

        titulo3.setText("");
        foto3.setIcon(null);

        titulo4.setText("");
        foto4.setIcon(null);

        titulo1.setText("");
        foto1.setIcon(null);

        titulo2.setText("");
        foto2.setIcon(null);

        titulo3.setText("");
        foto3.setIcon(null);

        titulo4.setText("");
        foto4.setIcon(null);

        if (startIndex < listaReservas.size()) {
            Reserva reserva1 = listaReservas.get(pagAct*4);
            titulo1.setText(reserva1.getInmueble().getTitulo());
            foto1.setIcon(reserva1.getInmueble().getFotos().get(0)); // Asegúrate de manejar bien las fotos
        }
        if (startIndex + 1 < listaReservas.size()) {
            Reserva reserva2 = listaReservas.get(pagAct*4 + 1);
            titulo2.setText(reserva2.getInmueble().getTitulo());
            foto2.setIcon(reserva2.getInmueble().getFotos().get(0));
        }
        if (startIndex + 2 < listaReservas.size()) {
            Reserva reserva3 = listaReservas.get(pagAct*4 + 2);
            titulo3.setText(reserva3.getInmueble().getTitulo());
            foto3.setIcon(reserva3.getInmueble().getFotos().get(0));
        }
        if (startIndex + 3 < listaReservas.size()) {
            Reserva reserva4 = listaReservas.get(pagAct*4 + 3);
            titulo4.setText(reserva4.getInmueble().getTitulo());
            foto4.setIcon(reserva4.getInmueble().getFotos().get(0));
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
        jPanel4 = new javax.swing.JPanel();
        foto1 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        media1 = new javax.swing.JLabel();
        AmpliarInmueble1 = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        foto2 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        media2 = new javax.swing.JLabel();
        inmueble2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        foto3 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        media3 = new javax.swing.JLabel();
        inmueble3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        foto4 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        media4 = new javax.swing.JLabel();
        inmueble4 = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        buscarGestionarInmuebles = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnReseñaModInm = new javax.swing.JMenuItem();
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
        setMinimumSize(new java.awt.Dimension(900, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 110));

        titulo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel4.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 370, 40));
        jPanel4.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 100, -1));
        jPanel4.add(media1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        AmpliarInmueble1.setText("Hacer reseña");
        AmpliarInmueble1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmpliarInmueble1ActionPerformed(evt);
            }
        });
        jPanel4.add(AmpliarInmueble1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 130, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 690, 130));

        botonAtras.setText("Anterior");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 110));

        titulo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel5.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 370, 40));
        jPanel5.add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 100, -1));
        jPanel5.add(media2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        inmueble2.setText("Hacer reseña");
        inmueble2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmueble2ActionPerformed(evt);
            }
        });
        jPanel5.add(inmueble2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 130, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 690, 130));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(foto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 110));

        titulo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel6.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 370, 40));
        jPanel6.add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 100, -1));
        jPanel6.add(media3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        inmueble3.setText("Hacer reseña");
        inmueble3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmueble3ActionPerformed(evt);
            }
        });
        jPanel6.add(inmueble3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 130, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 690, 130));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(foto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 110));

        titulo4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel7.add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 370, 40));
        jPanel7.add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 100, -1));
        jPanel7.add(media4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        inmueble4.setText("Hacer reseña");
        inmueble4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmueble4ActionPerformed(evt);
            }
        });
        jPanel7.add(inmueble4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 130, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 690, 130));

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

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

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reseñas");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setMaximumSize(new java.awt.Dimension(120, 32767));
        jMenu2.setMinimumSize(new java.awt.Dimension(120, 22));

        btnReseñaModInm.setText("Escribir reseña");
        btnReseñaModInm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReseñaModInmActionPerformed(evt);
            }
        });
        jMenu2.add(btnReseñaModInm);

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

    private void AmpliarInmueble1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmpliarInmueble1ActionPerformed
        Reserva reserva1 = listaReservas.get(pagAct*4);

        if (!titulo1.getText().equals("")){
            HacerReseña hacerReseña = new HacerReseña(this.getLocation(),persona,reserva1);
            hacerReseña.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_AmpliarInmueble1ActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        if (pagAct >0) {pagAct--;}
        titulo1.setText("");
        foto1.setIcon(null);

        titulo2.setText("");
        foto2.setIcon(null);

        titulo3.setText("");
        foto3.setIcon(null);

        titulo4.setText("");
        foto4.setIcon(null);

        titulo1.setText("");
        foto1.setIcon(null);

        titulo2.setText("");
        foto2.setIcon(null);

        titulo3.setText("");
        foto3.setIcon(null);

        titulo4.setText("");
        foto4.setIcon(null);

        if (startIndex < listaReservas.size()) {
            Reserva reserva1 = listaReservas.get(pagAct*4);
            titulo1.setText(reserva1.getInmueble().getTitulo());
            foto1.setIcon(reserva1.getInmueble().getFotos().get(0)); // Asegúrate de manejar bien las fotos
        }
        if (startIndex + 1 < listaReservas.size()) {
            Reserva reserva2 = listaReservas.get(pagAct*4 + 1);
            titulo2.setText(reserva2.getInmueble().getTitulo());
            foto2.setIcon(reserva2.getInmueble().getFotos().get(0));
        }
        if (startIndex + 2 < listaReservas.size()) {
            Reserva reserva3 = listaReservas.get(pagAct*4 + 2);
            titulo3.setText(reserva3.getInmueble().getTitulo());
            foto3.setIcon(reserva3.getInmueble().getFotos().get(0));
        }
        if (startIndex + 3 < listaReservas.size()) {
            Reserva reserva4 = listaReservas.get(pagAct*4 + 3);
            titulo4.setText(reserva4.getInmueble().getTitulo());
            foto4.setIcon(reserva4.getInmueble().getFotos().get(0));
        }
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void inmueble2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmueble2ActionPerformed
        Reserva reserva2 = listaReservas.get(1 + pagAct*4);

        if (!titulo2.getText().equals("")){
            HacerReseña hacerReseña = new HacerReseña(this.getLocation(),persona,reserva2);
            hacerReseña.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_inmueble2ActionPerformed

    private void inmueble3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmueble3ActionPerformed
        Reserva reserva3 = listaReservas.get(2 + pagAct*4);

        if (!titulo1.getText().equals("")){
            HacerReseña hacerReseña = new HacerReseña(this.getLocation(),persona,reserva3);
            hacerReseña.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_inmueble3ActionPerformed

    private void inmueble4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmueble4ActionPerformed
        Reserva reserva4 = listaReservas.get(3 + pagAct*4);

        if (!titulo1.getText().equals("")){
            HacerReseña hacerReseña = new HacerReseña(this.getLocation(),persona,reserva4);
            hacerReseña.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_inmueble4ActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        if (pagAct < numPag){ pagAct++;}

        titulo1.setText("");
        foto1.setIcon(null);

        titulo2.setText("");
        foto2.setIcon(null);

        titulo3.setText("");
        foto3.setIcon(null);

        titulo4.setText("");
        foto4.setIcon(null);

        if (startIndex < listaReservas.size()) {
            Reserva reserva1 = listaReservas.get(pagAct*4);
            titulo1.setText(reserva1.getInmueble().getTitulo());
            foto1.setIcon(reserva1.getInmueble().getFotos().get(0)); // Asegúrate de manejar bien las fotos
        }
        if (startIndex + 1 < listaReservas.size()) {
            Reserva reserva2 = listaReservas.get(pagAct*4 + 1);
            titulo2.setText(reserva2.getInmueble().getTitulo());
            foto2.setIcon(reserva2.getInmueble().getFotos().get(0));
        }
        if (startIndex + 2 < listaReservas.size()) {
            Reserva reserva3 = listaReservas.get(pagAct*4 + 2);
            titulo3.setText(reserva3.getInmueble().getTitulo());
            foto3.setIcon(reserva3.getInmueble().getFotos().get(0));
        }
        if (startIndex + 3 < listaReservas.size()) {
            Reserva reserva4 = listaReservas.get(pagAct*4 + 3);
            titulo4.setText(reserva4.getInmueble().getTitulo());
            foto4.setIcon(reserva4.getInmueble().getFotos().get(0));
  
    }
        
    }//GEN-LAST:event_botonSiguienteActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmpliarInmueble1;
    private javax.swing.JButton botonAtras;
    private javax.swing.JMenuItem botonPerfil;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JMenuItem btnReservas;
    private javax.swing.JMenuItem btnReseñaModInm;
    private javax.swing.JMenuItem buscarGestionarInmuebles;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel foto3;
    private javax.swing.JLabel foto4;
    private javax.swing.JButton inmueble2;
    private javax.swing.JButton inmueble3;
    private javax.swing.JButton inmueble4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JLabel media1;
    private javax.swing.JLabel media2;
    private javax.swing.JLabel media3;
    private javax.swing.JLabel media4;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables
}

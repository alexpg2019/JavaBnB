

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;

import java.awt.Image;
import java.awt.Point;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javabnb.backend.*;
import javabnb.frontend.EditarAnfitrion;
import javabnb.frontend.EditarCliente;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO
 */
public class MostrarReserva extends javax.swing.JFrame {

    private Persona persona;
    private ImageIcon image1;
    private ImageIcon image2;
    private ImageIcon image3;
    private  Reserva reserva;
    
    /**
     * Creates new form MenuPrincipal
     * 
     * @param localizacion
     * @param persona
     * @param inmueble
     */
    public MostrarReserva( Point localizacion, Persona persona, Reserva reserva) {
        this.setLocation(localizacion);
        this.persona = persona;
        this.reserva = reserva;
        Image imagen1 = reserva.getInmueble().getFotos().get(0).getImage(); // transform it 
        Image newimg1 = imagen1.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        this.image1 = new ImageIcon(newimg1);  // transform it back
        Image imagen2 = reserva.getInmueble().getFotos().get(1).getImage(); // transform it 
        Image newimg2 = imagen2.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        this.image2 = new ImageIcon(newimg2);  // transform it back
        Image imagen3 = reserva.getInmueble().getFotos().get(2).getImage(); // transform it 
        Image newimg3 = imagen3.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        this.image3 = new ImageIcon(newimg3);  // transform it back
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
        imgPrincipal.setIcon(image1);
        btnImg1.setIcon(image1);
        btnImg2.setIcon(image2);
        btnImg3.setIcon(image3);
        etiquetaBaños.setText(String.valueOf(reserva.getInmueble().getBaños()));
        etiquetaCalificacion.setText(String.valueOf(reserva.getInmueble().getCalificacion()));
        etiquetaCamas.setText(String.valueOf(reserva.getInmueble().getCamas()));
        
        FechaSalida.setText(FechaSalida.getText());
        etiquetaDireccion.setText(reserva.getInmueble().getDireccion().getCalle() + ", " + reserva.getInmueble().getDireccion().getNumero() + ", " + reserva.getInmueble().getDireccion().getCodigoPostal() + ", " + reserva.getInmueble().getDireccion().getCiudad());
        etiquetaHabitaciones.setText(String.valueOf(reserva.getInmueble().getHabitaciones()));
        etiquetaHuespedes.setText(String.valueOf(reserva.getInmueble().getHuespedesMax()));
        etiquetaPrecio.setText(String.valueOf(reserva.getInmueble().getPrecioNoche()));
        etiquetaTitulo.setText(reserva.getInmueble().getTitulo());
        nombreCliente.setText(reserva.getCliente().getNombre());
        dniCliente.setText(reserva.getCliente().getDni());
        telefonoCliente.setText(String.valueOf(reserva.getCliente().getTelefono()));

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
        imgPrincipal = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        btnImg1 = new javax.swing.JButton();
        btnImg2 = new javax.swing.JButton();
        btnImg3 = new javax.swing.JButton();
        etiquetaPrecio = new javax.swing.JLabel();
        etiquetaCalificacion = new javax.swing.JLabel();
        etiquetaBaños = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        etiquetaHuespedes = new javax.swing.JLabel();
        etiquetaHabitaciones = new javax.swing.JLabel();
        etiquetaCamas = new javax.swing.JLabel();
        etiquetaDireccion = new javax.swing.JLabel();
        FechaSalida = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fechaReserva = new javax.swing.JLabel();
        FechaEntrada = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JLabel();
        dniCliente = new javax.swing.JLabel();
        telefonoCliente = new javax.swing.JLabel();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoJavaBnB-PNGx2.png"))); // NOI18N
        imgPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgPrincipal.setMaximumSize(new java.awt.Dimension(250, 250));
        imgPrincipal.setMinimumSize(new java.awt.Dimension(250, 250));
        imgPrincipal.setPreferredSize(new java.awt.Dimension(250, 250));
        getContentPane().add(imgPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        etiquetaTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etiquetaTitulo.setText("Titulo del inmueble");
        etiquetaTitulo.setMaximumSize(new java.awt.Dimension(600, 33));
        etiquetaTitulo.setMinimumSize(new java.awt.Dimension(600, 33));
        etiquetaTitulo.setPreferredSize(new java.awt.Dimension(600, 33));
        getContentPane().add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        btnImg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_size_invert.jpg"))); // NOI18N
        btnImg1.setBorder(null);
        btnImg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImg1.setMaximumSize(new java.awt.Dimension(75, 75));
        btnImg1.setMinimumSize(new java.awt.Dimension(75, 75));
        btnImg1.setPreferredSize(new java.awt.Dimension(75, 75));
        btnImg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImg1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnImg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        btnImg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_size_invert.jpg"))); // NOI18N
        btnImg2.setBorder(null);
        btnImg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImg2.setMaximumSize(new java.awt.Dimension(75, 75));
        btnImg2.setMinimumSize(new java.awt.Dimension(75, 75));
        btnImg2.setPreferredSize(new java.awt.Dimension(75, 75));
        btnImg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImg2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnImg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 310, -1, -1));

        btnImg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_size_invert.jpg"))); // NOI18N
        btnImg3.setBorder(null);
        btnImg3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImg3.setMaximumSize(new java.awt.Dimension(75, 75));
        btnImg3.setMinimumSize(new java.awt.Dimension(75, 75));
        btnImg3.setPreferredSize(new java.awt.Dimension(75, 75));
        btnImg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImg3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnImg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        etiquetaPrecio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etiquetaPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPrecio.setText("000.00");
        etiquetaPrecio.setMaximumSize(new java.awt.Dimension(100, 33));
        etiquetaPrecio.setMinimumSize(new java.awt.Dimension(100, 33));
        etiquetaPrecio.setPreferredSize(new java.awt.Dimension(100, 33));
        getContentPane().add(etiquetaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        etiquetaCalificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaCalificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaCalificacion.setText("Calificacion");
        etiquetaCalificacion.setMaximumSize(new java.awt.Dimension(60, 25));
        etiquetaCalificacion.setMinimumSize(new java.awt.Dimension(60, 25));
        etiquetaCalificacion.setPreferredSize(new java.awt.Dimension(60, 25));
        getContentPane().add(etiquetaCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 60, -1));

        etiquetaBaños.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaBaños.setText("0");
        etiquetaBaños.setMaximumSize(new java.awt.Dimension(30, 25));
        etiquetaBaños.setMinimumSize(new java.awt.Dimension(30, 25));
        etiquetaBaños.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(etiquetaBaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Baños");
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Habitaciones");
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Camas");
        jLabel5.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Huespedes máximos");
        jLabel6.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        etiquetaHuespedes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaHuespedes.setText("0");
        etiquetaHuespedes.setMaximumSize(new java.awt.Dimension(30, 25));
        etiquetaHuespedes.setMinimumSize(new java.awt.Dimension(30, 25));
        etiquetaHuespedes.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(etiquetaHuespedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        etiquetaHabitaciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaHabitaciones.setText("0");
        etiquetaHabitaciones.setMaximumSize(new java.awt.Dimension(30, 25));
        etiquetaHabitaciones.setMinimumSize(new java.awt.Dimension(30, 25));
        etiquetaHabitaciones.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(etiquetaHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        etiquetaCamas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaCamas.setText("0");
        etiquetaCamas.setMaximumSize(new java.awt.Dimension(30, 25));
        etiquetaCamas.setMinimumSize(new java.awt.Dimension(30, 25));
        etiquetaCamas.setPreferredSize(new java.awt.Dimension(30, 25));
        getContentPane().add(etiquetaCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        etiquetaDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaDireccion.setText("Calle, numero, codPostal, Ciudad");
        etiquetaDireccion.setMaximumSize(new java.awt.Dimension(200, 25));
        etiquetaDireccion.setMinimumSize(new java.awt.Dimension(200, 25));
        etiquetaDireccion.setPreferredSize(new java.awt.Dimension(300, 25));
        getContentPane().add(etiquetaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        FechaSalida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FechaSalida.setText(reserva.getFechaSalida().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        FechaSalida.setMaximumSize(new java.awt.Dimension(450, 25));
        FechaSalida.setMinimumSize(new java.awt.Dimension(450, 25));
        FechaSalida.setPreferredSize(new java.awt.Dimension(550, 25));
        getContentPane().add(FechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 120, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fecha de Reserva:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de Inicio:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de fin:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        fechaReserva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechaReserva.setText(reserva.getFechaReserva().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        getContentPane().add(fechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 160, -1));

        FechaEntrada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FechaEntrada.setText(reserva.getFechaEntrada().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        getContentPane().add(FechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 110, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Calificación");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 80, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Datos anfitrión");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jLabel11.setText("DNI: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        jLabel12.setText("Nombre: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        jLabel13.setText("Telefono: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, -1));

        nombreCliente.setText("nombre");
        nombreCliente.setMaximumSize(new java.awt.Dimension(77, 16));
        nombreCliente.setMinimumSize(new java.awt.Dimension(77, 16));
        nombreCliente.setPreferredSize(new java.awt.Dimension(77, 16));
        getContentPane().add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, -1, -1));

        dniCliente.setText("dni");
        dniCliente.setMaximumSize(new java.awt.Dimension(77, 16));
        dniCliente.setMinimumSize(new java.awt.Dimension(77, 16));
        dniCliente.setPreferredSize(new java.awt.Dimension(77, 16));
        getContentPane().add(dniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));

        telefonoCliente.setText("telefono");
        telefonoCliente.setMaximumSize(new java.awt.Dimension(77, 16));
        telefonoCliente.setMinimumSize(new java.awt.Dimension(77, 16));
        telefonoCliente.setPreferredSize(new java.awt.Dimension(77, 16));
        getContentPane().add(telefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

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
        ConsultarReservasAnfitrion consultarReservas = new ConsultarReservasAnfitrion(this.getLocation(),persona);
        this.dispose();
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnImg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImg1ActionPerformed
        imgPrincipal.setIcon(image1);
    }//GEN-LAST:event_btnImg1ActionPerformed

    private void btnImg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImg2ActionPerformed
        imgPrincipal.setIcon(image2);
    }//GEN-LAST:event_btnImg2ActionPerformed

    private void btnImg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImg3ActionPerformed
        imgPrincipal.setIcon(image3);
    }//GEN-LAST:event_btnImg3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(this,"Estas seguro de cerrar","Cierre programa",JOptionPane.WARNING_MESSAGE);
        GestorInmueble.guardarDatosInmuebles();
        System.out.println("Guardando datos de inmuebles");
        GestorInmueble.guardarDatosPersonas();
        System.out.println("Guardando datos de personas");
        GestorInmueble.guardarDatosReservas();
        System.out.println("Guardando datos de reservas");
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaEntrada;
    private javax.swing.JLabel FechaSalida;
    private javax.swing.JMenuItem botonPerfil;
    private javax.swing.JButton btnImg1;
    private javax.swing.JButton btnImg2;
    private javax.swing.JButton btnImg3;
    private javax.swing.JMenuItem btnReservas;
    private javax.swing.JMenuItem btnReseñaModInm;
    private javax.swing.JMenuItem buscarGestionarInmuebles;
    private javax.swing.JLabel dniCliente;
    private javax.swing.JLabel etiquetaBaños;
    private javax.swing.JLabel etiquetaCalificacion;
    private javax.swing.JLabel etiquetaCamas;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaHabitaciones;
    private javax.swing.JLabel etiquetaHuespedes;
    private javax.swing.JLabel etiquetaPrecio;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel fechaReserva;
    private javax.swing.JLabel imgPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JLabel nombreCliente;
    private javax.swing.JLabel telefonoCliente;
    // End of variables declaration//GEN-END:variables
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;


import java.awt.Container;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javabnb.backend.*;
import javabnb.frontend.EditarAnfitrion;
import javabnb.frontend.EditarCliente;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ALEJANDRO
 */
public class MenuModificar extends javax.swing.JFrame {

    private Persona persona;
    private Anfitrion anfitrion;
    private final Inmueble inmueble;
    /**
     * Creates new form MenuPrincipal
     * 
     * @param localizacion
     * @param persona
     */
    public MenuModificar( Point localizacion, Persona persona, Inmueble inmueble) {
        this.setLocation(localizacion);
        this.persona = persona;
        this.anfitrion = (Anfitrion) persona;
        this.inmueble = inmueble;
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
        icono2.setIcon(inmueble.getFotos().get(0));
        icono3.setIcon(inmueble.getFotos().get(1));
        icono4.setIcon(inmueble.getFotos().get(2));
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
        icono2 = new javax.swing.JButton();
        icono3 = new javax.swing.JButton();
        icono4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nombreCalle = new javax.swing.JTextField();
        numeroCalle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        serviciosAdicionales = new javax.swing.JTextArea();
        detallesCalle = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        comunidad = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        precioNoche = new javax.swing.JTextField();
        tipoInmueble = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        codigoPostal = new javax.swing.JFormattedTextField();
        huespedesMax = new javax.swing.JTextField();
        habitaciones = new javax.swing.JTextField();
        camas = new javax.swing.JTextField();
        baños = new javax.swing.JTextField();
        foto2 = new javax.swing.JButton();
        foto4 = new javax.swing.JButton();
        foto3 = new javax.swing.JButton();
        nombreInmueble = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
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

        imgPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        imgPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imgPrincipal.setMaximumSize(new java.awt.Dimension(250, 250));
        imgPrincipal.setMinimumSize(new java.awt.Dimension(250, 250));
        imgPrincipal.setPreferredSize(new java.awt.Dimension(250, 250));
        imgPrincipal.setRequestFocusEnabled(false);
        getContentPane().add(imgPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        icono2.setBackground(new java.awt.Color(102, 102, 102));
        icono2.setText("FOTO 2");
        icono2.setBorder(null);
        icono2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono2.setMaximumSize(new java.awt.Dimension(75, 75));
        icono2.setMinimumSize(new java.awt.Dimension(75, 75));
        icono2.setPreferredSize(new java.awt.Dimension(75, 75));
        icono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono2ActionPerformed(evt);
            }
        });
        getContentPane().add(icono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        icono3.setBackground(new java.awt.Color(102, 102, 102));
        icono3.setText("FOTO 3");
        icono3.setBorder(null);
        icono3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono3.setMaximumSize(new java.awt.Dimension(75, 75));
        icono3.setMinimumSize(new java.awt.Dimension(75, 75));
        icono3.setPreferredSize(new java.awt.Dimension(75, 75));
        icono3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono3ActionPerformed(evt);
            }
        });
        getContentPane().add(icono3, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 310, -1, -1));

        icono4.setBackground(new java.awt.Color(102, 102, 102));
        icono4.setText("foto4");
        icono4.setBorder(null);
        icono4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icono4.setMaximumSize(new java.awt.Dimension(75, 75));
        icono4.setMinimumSize(new java.awt.Dimension(75, 75));
        icono4.setPreferredSize(new java.awt.Dimension(75, 75));
        icono4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icono4ActionPerformed(evt);
            }
        });
        getContentPane().add(icono4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabel3.setText("Baños");
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, 40));

        jLabel4.setText("Habitaciones");
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, -1, 30));

        jLabel5.setText("Camas");
        jLabel5.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, 40));

        jLabel6.setText("Huespedes máximos");
        jLabel6.setMaximumSize(new java.awt.Dimension(120, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 25));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, 50));

        jLabel2.setText("Calle");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel7.setText("Numero");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel8.setText("Planta, letra");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel9.setText("Código Postal");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel10.setText("Ciudad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel11.setText("Comunidad");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jLabel12.setText("País");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel13.setText("Servicios adicionales");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        nombreCalle.setText(inmueble.getDireccion().getCalle());
        nombreCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCalleActionPerformed(evt);
            }
        });
        getContentPane().add(nombreCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 180, -1));

        numeroCalle.setText(String.valueOf(inmueble.getDireccion().getNumero())
        );
        numeroCalle.setToolTipText("");
        getContentPane().add(numeroCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 180, -1));

        serviciosAdicionales.setColumns(20);
        serviciosAdicionales.setRows(5);
        serviciosAdicionales.setText(String.join(", ", inmueble.getServicios())
        );
        jScrollPane1.setViewportView(serviciosAdicionales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 360, -1));

        detallesCalle.setText(inmueble.getDireccion().getDetallesDireccion());
        getContentPane().add(detallesCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 180, -1));

        ciudad.setText(inmueble.getDireccion().getCiudad());
        getContentPane().add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 180, -1));

        comunidad.setText(inmueble.getDireccion().getProvincia());
        getContentPane().add(comunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 180, -1));

        pais.setText(inmueble.getDireccion().getPais());
        getContentPane().add(pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 180, -1));

        jButton2.setText("Publicar Inmueble");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 250, -1));

        jLabel14.setText("Precio");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        precioNoche.setText(Double.toString(inmueble.getPrecioNoche()));
        getContentPane().add(precioNoche, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 70, -1));

        tipoInmueble.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASA", "APARTAMENTO", " " }));
        getContentPane().add(tipoInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, -1));

        jLabel15.setText("Tipo de inmueble");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 110, -1));

        try {
            codigoPostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        codigoPostal.setText(String.valueOf(inmueble.getDireccion().getCodigoPostal()));
        getContentPane().add(codigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 180, -1));

        huespedesMax.setText(Integer.toString(inmueble.getHuespedesMax())
        );
        getContentPane().add(huespedesMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 80, -1));

        habitaciones.setText(Integer.toString(inmueble.getHabitaciones()));
        getContentPane().add(habitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 80, -1));

        camas.setText(Integer.toString(inmueble.getCamas()));
        getContentPane().add(camas, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 80, -1));

        baños.setText(Integer.toString(inmueble.getBaños()));
        getContentPane().add(baños, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 80, -1));

        foto2.setText("Añadir");
        foto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto2ActionPerformed(evt);
            }
        });
        getContentPane().add(foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 70, -1));

        foto4.setText("Añadir");
        foto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto4ActionPerformed(evt);
            }
        });
        getContentPane().add(foto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 70, -1));

        foto3.setText("Añadir");
        foto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto3ActionPerformed(evt);
            }
        });
        getContentPane().add(foto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 390, 70, -1));

        nombreInmueble.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreInmueble.setText(inmueble.getTitulo());
        nombreInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreInmuebleActionPerformed(evt);
            }
        });
        getContentPane().add(nombreInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 32, 510, 40));

        jLabel16.setText("Nombre del inmueble");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jButton3.setText("Eliminar Inmueble");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 250, -1));

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

    private void icono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono2ActionPerformed
        imgPrincipal.setIcon(foto2.getIcon());
        if (inmueble.getFotos().size() > 0) {}
    }//GEN-LAST:event_icono2ActionPerformed

    private void icono3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono3ActionPerformed
        imgPrincipal.setIcon(foto3.getIcon());
    }//GEN-LAST:event_icono3ActionPerformed

    private void icono4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icono4ActionPerformed
        imgPrincipal.setIcon(foto4.getIcon());
    }//GEN-LAST:event_icono4ActionPerformed

    private void nombreCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCalleActionPerformed
        
    }//GEN-LAST:event_nombreCalleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if (!nombreInmueble.getText().equals("") )   {nombreValido = true;}
        if (!nombreCalle.getText().equals("") )   {calleValida = true;}
        if (!numeroCalle.getText().equals("") )   {
            try {
        Integer.valueOf(numeroCalle.getText());
        numeroValido = true;
    } catch (NumberFormatException e) {
        numeroValido = false;    }}
        if (!detallesCalle.getText().equals("") )   {detallesValidos = true;}
        if (!codigoPostal.getText().equals("") )   {codigoValido = true;}
        if (!ciudad.getText().equals("") )   {ciudadValida = true;}
        if (!pais.getText().equals("") )   {paisValido = true;}
        if (!comunidad.getText().equals("") )   {comunidadValida = true;}
    if (calleValida && numeroValido && codigoValido && detallesValidos && ciudadValida && paisValido && comunidadValida) {
        //Direccion dir = new Direccion(nombreCalle.getText(),Integer.parseInt(numeroCalle.getText()),detallesCalle.getText(),Integer.parseInt(codigoPostal.getText()),ciudad.getText(),comunidad.getText(),pais.getText());
         direccionValida = true;   
    }
    if (!huespedesMax.getText().equals("") )   {
        try {
        Integer.valueOf(huespedesMax.getText());huespedesValidos = true;} 
        catch (NumberFormatException e) {huespedesValidos = false;    }
        }
     if (!habitaciones.getText().equals("") )   {
        try {
        Integer.valueOf(habitaciones.getText());habitacionesValidas = true;} 
        catch (NumberFormatException e) {habitacionesValidas = false;    }
        }
     if (!baños.getText().equals("") )   {
        try {
        Integer.valueOf(baños.getText());bañosValidos = true;} 
        catch (NumberFormatException e) {bañosValidos = false;    }
        }
    if (!camas.getText().equals("") )   {
        try {
        Integer.valueOf(camas.getText());camasValidas = true;} 
        catch (NumberFormatException e) {camasValidas = false;    }
        }
    if (!precioNoche.getText().equals("") )   {
        try {
        Double.valueOf(precioNoche.getText());precioValido = true;} 
        catch (NumberFormatException e) {precioValido = false;    }
        }
    if (icono2.getIcon()!= null) {fotos.add((ImageIcon)icono2.getIcon());}
    if (icono3.getIcon()!= null) {fotos.add((ImageIcon)icono3.getIcon());}
    if (icono4.getIcon()!= null) {fotos.add((ImageIcon)icono4.getIcon());}
    
    if (!fotos.isEmpty() && nombreValido && huespedesValidos && camasValidas && bañosValidos && habitacionesValidas && precioValido && direccionValida){
        String[] serviciosArray = serviciosAdicionales.getText().split(",");
        ArrayList<String> serviciosLista = new ArrayList<String>(Arrays.asList(serviciosArray));
        //Inmueble nuevoInmueble = new Inmueble(nombreInmueble.getText(), (Anfitrion) persona, dir,Integer.parseInt(huespedesMax.getText()),Integer.parseInt(habitaciones.getText()),Integer.parseInt(camas.getText()),Integer.parseInt(baños.getText()),tipoInmueble.getSelectedItem().toString(),Double.parseDouble(precioNoche.getText()),serviciosLista,fotos,0);
        inmueble.setTitulo(nombreInmueble.getText());
        inmueble.getDireccion().setCalle(nombreCalle.getText());
        inmueble.getDireccion().setNumero(Integer.parseInt(numeroCalle.getText()));
        inmueble.getDireccion().setDetallesDireccion(detallesCalle.getText());
        inmueble.getDireccion().setCodigoPostal(Integer.parseInt(codigoPostal.getText()));
        inmueble.getDireccion().setCiudad(ciudad.getText());
        inmueble.getDireccion().setProvincia(comunidad.getText());
        inmueble.getDireccion().setPais(pais.getText());
        inmueble.setHuespedesMax(Integer.parseInt(huespedesMax.getText()));
        inmueble.setHabitaciones(Integer.parseInt(habitaciones.getText()));
        inmueble.setCamas(Integer.parseInt(camas.getText()));
        inmueble.setBaños(Integer.parseInt(baños.getText()));
        inmueble.setPrecioNoche(Double.parseDouble(precioNoche.getText()));
        inmueble.setTipoInmueble(tipoInmueble.getSelectedItem().toString());
        inmueble.setServicios(serviciosLista);
        inmueble.setFotos(fotos);

        MenuPrincipal menu = new MenuPrincipal(this.getLocation(),persona);
        this.dispose();
        }
    else {
        JOptionPane.showMessageDialog(this,"Rellena todos los datos correctamente antes de publicar","Error de inicio sesion",JOptionPane.WARNING_MESSAGE);
}
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void foto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image files", "jpg", "png", "gif", "bmp"));
        fileChooser.setAcceptAllFileFilterUsed(false);

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
        File  selectedFile = fileChooser.getSelectedFile();
        ImageIcon imagenIcon = new ImageIcon(selectedFile.getAbsolutePath());
        
        Image imagen2 = imagenIcon.getImage();
        Image newimg2 = imagen2.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH); 
        ImageIcon imagen22 = new ImageIcon(newimg2);
        
        icono2.setIcon(imagen22);
        }
    
              
    }//GEN-LAST:event_foto2ActionPerformed

    private void foto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto3ActionPerformed
JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image files", "jpg", "png", "gif", "bmp"));
        fileChooser.setAcceptAllFileFilterUsed(false);

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
        File  selectedFile = fileChooser.getSelectedFile();
        ImageIcon imagenIcon = new ImageIcon(selectedFile.getAbsolutePath());
        
        Image imagen3 = imagenIcon.getImage();
        Image newimg3 = imagen3.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH); 
        ImageIcon imagen33 = new ImageIcon(newimg3);
        
        icono3.setIcon(imagen33);
        }
    }//GEN-LAST:event_foto3ActionPerformed

    private void foto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto4ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image files", "jpg", "png", "gif", "bmp"));
        fileChooser.setAcceptAllFileFilterUsed(false);

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
        File  selectedFile = fileChooser.getSelectedFile();
        ImageIcon imagenIcon = new ImageIcon(selectedFile.getAbsolutePath());
        
        Image imagen4 = imagenIcon.getImage();
        Image newimg4 = imagen4.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH); 
        ImageIcon imagen44 = new ImageIcon(newimg4);
        
        icono4.setIcon(imagen44);}
    }//GEN-LAST:event_foto4ActionPerformed

    private void nombreInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreInmuebleActionPerformed
    }//GEN-LAST:event_nombreInmuebleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            GestorInmueble.removeInmueble(inmueble);
            MenuPrincipal menup = new MenuPrincipal(this.getLocation(),persona);
            this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(this,"Estas seguro de cerrar","Cierre programa",JOptionPane.WARNING_MESSAGE);
        GestorInmueble.guardarDatosInmuebles();
        System.out.println("Guardando datos de inmuebles");
        GestorInmueble.guardarDatosPersonas();
        System.out.println("Guardando datos de personas");
        GestorInmueble.guardarDatosReservas();
        System.out.println("Guardando datos de reservas");
    }//GEN-LAST:event_formWindowClosing
    boolean nombreValido = false;
    boolean calleValida = false;
    boolean numeroValido= false;
    boolean detallesValidos= false;
    boolean codigoValido= false;
    boolean ciudadValida= false;
    boolean comunidadValida= false;
    boolean paisValido= false;
    boolean huespedesValidos= false;
    boolean habitacionesValidas= false;
    boolean bañosValidos= false;
    boolean precioValido= false;
    boolean camasValidas= false;
    boolean direccionValida = false;
    Direccion dir;
    private ArrayList<ImageIcon> fotos = new ArrayList<ImageIcon>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField baños;
    private javax.swing.JMenuItem botonPerfil;
    private javax.swing.JMenuItem btnReservas;
    private javax.swing.JMenuItem btnReseñaModInm;
    private javax.swing.JMenuItem buscarGestionarInmuebles;
    private javax.swing.JTextField camas;
    private javax.swing.JTextField ciudad;
    private javax.swing.JFormattedTextField codigoPostal;
    private javax.swing.JTextField comunidad;
    private javax.swing.JTextField detallesCalle;
    private javax.swing.JButton foto2;
    private javax.swing.JButton foto3;
    private javax.swing.JButton foto4;
    private javax.swing.JTextField habitaciones;
    private javax.swing.JTextField huespedesMax;
    private javax.swing.JButton icono2;
    private javax.swing.JButton icono3;
    private javax.swing.JButton icono4;
    private javax.swing.JLabel imgPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreCalle;
    private javax.swing.JTextField nombreInmueble;
    private javax.swing.JTextField numeroCalle;
    private javax.swing.JTextField pais;
    private javax.swing.JTextField precioNoche;
    private javax.swing.JTextArea serviciosAdicionales;
    private javax.swing.JComboBox<String> tipoInmueble;
    // End of variables declaration//GEN-END:variables
}

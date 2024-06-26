/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;

import java.awt.Point;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javabnb.backend.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sco23
 */
public class CrearCliente extends javax.swing.JFrame {

    /**
     * Creates new form CrearCliente
     */
    public CrearCliente(Point location) {
        initComponents();
         this.setLocation(location);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        botonCrearCuenta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        telefonoCliente = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        esClienteVIP = new javax.swing.JCheckBox();
        emailCliente = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        DNICliente = new javax.swing.JFormattedTextField();
        contraseñaCliente = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        numeroTarjetaCliente = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        titularTarjetaCliente = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        fechaCaducidadCliente = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jButton1.setText("jButton1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaBnB");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TUS DATOS");

        botonCrearCuenta.setText("CREAR CUENTA");
        botonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCuentaActionPerformed(evt);
            }
        });

        jLabel5.setText("Clave");

        try {
            telefonoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ## ## ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonoCliente.setToolTipText("");
        telefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI");

        esClienteVIP.setText("VIP (9.99€/mes)");
        esClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esClienteVIPActionPerformed(evt);
            }
        });

        emailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Cliente VIP");

        DNICliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DNIClienteFocusLost(evt);
            }
        });
        DNICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNIClienteActionPerformed(evt);
            }
        });

        contraseñaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("E-mail");

        jLabel2.setText("Nombre");

        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Teléfono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DNICliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefonoCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(emailCliente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombreCliente)
                        .addComponent(contraseñaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(esClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esClienteVIP))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("AÑADIR TARJETA");

        try {
            numeroTarjetaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        numeroTarjetaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numeroTarjetaClienteFocusGained(evt);
            }
        });
        numeroTarjetaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTarjetaClienteActionPerformed(evt);
            }
        });

        jLabel10.setText("Número");

        titularTarjetaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titularTarjetaClienteActionPerformed(evt);
            }
        });

        jLabel11.setText("Fecha de Caducidad");

        fechaCaducidadCliente.setText("dd/mm/yyyy");
        fechaCaducidadCliente.setToolTipText("");
        fechaCaducidadCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechaCaducidadClienteFocusGained(evt);
            }
        });
        fechaCaducidadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaCaducidadClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Titular");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(numeroTarjetaCliente)
                            .addComponent(titularTarjetaCliente)
                            .addComponent(fechaCaducidadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                    .addComponent(jLabel12))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titularTarjetaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(numeroTarjetaCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaCaducidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BackButton.setText("Volver Atrás");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(183, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(botonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botonCrearCuenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCuentaActionPerformed
    if (!nombreCliente.getText().equals("")) {
        nombreValido = true; 
    }
    if (!DNICliente.getText().equals("") && DNICliente.getText().length() == 9 ) {
        DNIValido = true; 
    }
    if (!telefonoCliente.getText().equals("") && telefonoCliente.getText().length() == 12 ) {
        telefonoValido = true; 
    }
    if (contraseñaCliente.getPassword().length > 0) {
        contraseñaValida = true; 
    }
    if (!emailCliente.getText().equals("")) {
        emailValido = true;
    }
    if (!titularTarjetaCliente.getText().equals("")) {
        titularValido = true; 
    }
    if (!numeroTarjetaCliente.getText().equals("") && numeroTarjetaCliente.getText().length() == 19) {
        numeroTarjetaValido = true;
    }
    for (Persona persona: GestorInmueble.getPersonas()){
         if (persona.getCorreo().equals(emailCliente.getText())) {
         emailexistente = true;}}
    if (emailexistente){
             JOptionPane.showMessageDialog(this,"el correo pertenece a una cuenta ya existente","error de correo",JOptionPane.WARNING_MESSAGE);
    }
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    try {
            LocalDate fechaConvertida = LocalDate.parse(fechaCaducidadCliente.getText(), formato);
            fechaCadTarjetaValida = true;
            if (LocalDate.now().isAfter(fechaConvertida)) {fechaCadTarjetaValida = false;
            fechaCaducidadCliente.setText("");
            }
        } catch (DateTimeParseException e) {
            fechaCaducidadCliente.setText("");
            fechaCadTarjetaValida = false;}
          
        if (nombreValido && DNIValido && telefonoValido && contraseñaValida && emailValido && titularValido && numeroTarjetaValido && fechaCadTarjetaValida){
            botonCrearCuenta.setText("aaaa");
            LocalDate fechaConvertida = LocalDate.parse(fechaCaducidadCliente.getText(), formato);
             String contraseña = new String(contraseñaCliente.getPassword());
             String numeroTarj = numeroTarjetaCliente.getText().replace(" ","");
             int telefonoC = Integer.parseInt(telefonoCliente.getText().replace(" ",""));
            TarjetaCredito tarjeta = new TarjetaCredito(titularTarjetaCliente.getText(),Long.parseLong(numeroTarj),fechaConvertida);
            ClienteParticular cliente = new ClienteParticular(DNICliente.getText(),nombreCliente.getText(),emailCliente.getText(),contraseña,telefonoC,tarjeta,esVip);
            
            this.dispose();
            InicioSesion ini = new InicioSesion();
            ini.setLocation(this.getLocation());
            ini.setVisible(true);
            
        }
    
    }//GEN-LAST:event_botonCrearCuentaActionPerformed
    
    private void titularTarjetaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titularTarjetaClienteActionPerformed

    }//GEN-LAST:event_titularTarjetaClienteActionPerformed

    private void numeroTarjetaClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroTarjetaClienteFocusGained
        if (numeroTarjetaCliente.getText().equals("####-####-####-####")){
            numeroTarjetaCliente.setText("");
        }
    }//GEN-LAST:event_numeroTarjetaClienteFocusGained

    private void fechaCaducidadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCaducidadClienteActionPerformed

         
    }//GEN-LAST:event_fechaCaducidadClienteActionPerformed

    private void fechaCaducidadClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaCaducidadClienteFocusGained
            if (fechaCaducidadCliente.getText().equals("dd/mm/yyyy")) {
              fechaCaducidadCliente.setText("");
             }
    }//GEN-LAST:event_fechaCaducidadClienteFocusGained

    private void numeroTarjetaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTarjetaClienteActionPerformed

    }//GEN-LAST:event_numeroTarjetaClienteActionPerformed

    private void contraseñaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaClienteActionPerformed

    }//GEN-LAST:event_contraseñaClienteActionPerformed

    private void emailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailClienteActionPerformed

    }//GEN-LAST:event_emailClienteActionPerformed

    private void telefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoClienteActionPerformed

    
    }//GEN-LAST:event_telefonoClienteActionPerformed

    private void DNIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIClienteActionPerformed

    }//GEN-LAST:event_DNIClienteActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed

    }//GEN-LAST:event_nombreClienteActionPerformed

    private void esClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esClienteVIPActionPerformed
       esVip = true;
    }//GEN-LAST:event_esClienteVIPActionPerformed

    private void DNIClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DNIClienteFocusLost
       if (DNICliente.getText().length() != 9){
        DNICliente.setText("");
       }
    }//GEN-LAST:event_DNIClienteFocusLost

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        InicioSesion c = new InicioSesion();
        c.setLocation(this.getLocation());
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(this,"Estas seguro de cerrar","Cierre programa",JOptionPane.WARNING_MESSAGE);
        GestorInmueble.guardarDatosInmuebles();
        System.out.println("Guardando datos de inmuebles");
        GestorInmueble.guardarDatosPersonas();
        System.out.println("Guardando datos de personas");
        GestorInmueble.guardarDatosReservas();
        System.out.println("Guardando datos de reservas");
    }//GEN-LAST:event_formWindowClosing

    boolean emailValido = false;
    boolean telefonoValido = false;
    boolean nombreValido = false;
    boolean DNIValido = false;
    boolean contraseñaValida = false;
    boolean esVip = false;
    boolean titularValido = false;
    boolean numeroTarjetaValido = false;
    boolean fechaCadTarjetaValida = false;
    boolean emailexistente = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JFormattedTextField DNICliente;
    private javax.swing.JButton botonCrearCuenta;
    private javax.swing.JPasswordField contraseñaCliente;
    private javax.swing.JFormattedTextField emailCliente;
    private javax.swing.JCheckBox esClienteVIP;
    private javax.swing.JFormattedTextField fechaCaducidadCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JFormattedTextField nombreCliente;
    private javax.swing.JFormattedTextField numeroTarjetaCliente;
    private javax.swing.JFormattedTextField telefonoCliente;
    private javax.swing.JFormattedTextField titularTarjetaCliente;
    // End of variables declaration//GEN-END:variables
}

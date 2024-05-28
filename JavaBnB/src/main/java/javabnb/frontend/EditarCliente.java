/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javabnb.frontend;

import java.awt.Container;
import java.awt.Point;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javabnb.backend.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**this.cliente = (ClienteParticular) persona;
 *
 * @author ALEJANDRO
 */
public class EditarCliente extends javax.swing.JFrame {

    private Persona persona;
     boolean emailValido = false;
    boolean telefonoValido = false;
    boolean nombreValido = false;
    private ClienteParticular cliente;
    boolean titularValido = false;
    boolean numeroTarjetaValido = false;
    boolean fechaCadTarjetaValida = false;
    /**
     * Creates new form MenuPrincipal
     * 
     * @param inicioSesion
     */
    public EditarCliente( Point localizacion, Persona persona) {
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
        jLabel4 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        numeroTarjetaCliente = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        titularTarjetaCliente = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        fechaCaducidadCliente = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        editarNombre = new javax.swing.JButton();
        editarTel = new javax.swing.JButton();
        editarCorreo = new javax.swing.JButton();
        EditarClave = new javax.swing.JButton();
        editarTitular = new javax.swing.JButton();
        EditarNumeroTar = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        buscarGestionarInmuebles = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnReseñaModInm = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MODIFICAR DATOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 130));

        jLabel5.setText("Clave");

        telefonoCliente.setEditable(false);
        try {
            telefonoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ## ## ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonoCliente.setText(String.valueOf(persona.getTelefono()));
        telefonoCliente.setToolTipText("");
        telefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI");

        esClienteVIP.setSelected(cliente.isVip());
        esClienteVIP.setText("VIP (9.99€/mes)");
        esClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esClienteVIPActionPerformed(evt);
            }
        });

        emailCliente.setEditable(false);
        emailCliente.setText(cliente.getCorreo());
        emailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Cliente VIP");

        DNICliente.setEditable(false);
        DNICliente.setText(persona.getDni());
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

        contraseñaCliente.setEditable(false);
        contraseñaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("E-mail");

        jLabel4.setText("Nombre");

        nombreCliente.setEditable(false);
        nombreCliente.setText(persona.getNombre());
        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });

        jLabel8.setText("Teléfono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("MODIFICAR TARJETA");

        numeroTarjetaCliente.setEditable(false);
        try {
            numeroTarjetaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        numeroTarjetaCliente.setText(Long.toString(cliente.getTarjetaCredito().getNumeroTarjeta()));
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

        titularTarjetaCliente.setEditable(false);
        titularTarjetaCliente.setText(cliente.getTarjetaCredito().getNombre());
        titularTarjetaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titularTarjetaClienteActionPerformed(evt);
            }
        });

        jLabel11.setText("Fecha de Caducidad");

        fechaCaducidadCliente.setEditable(false);
        fechaCaducidadCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        fechaCaducidadCliente.setText(cliente.getTarjetaCredito().getFechaCaducidad().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
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
                            .addComponent(titularTarjetaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(fechaCaducidadCliente)))
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
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numeroTarjetaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaCaducidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, 180));

        BotonGuardar.setText("Guardar Datos");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 170, -1));

        editarNombre.setText("Editar");
        editarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(editarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 123, 75, -1));

        editarTel.setText("Editar");
        editarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTelActionPerformed(evt);
            }
        });
        getContentPane().add(editarTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 75, -1));

        editarCorreo.setText("Editar");
        editarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(editarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 75, -1));

        EditarClave.setText("Editar");
        EditarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarClaveActionPerformed(evt);
            }
        });
        getContentPane().add(EditarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 75, -1));

        editarTitular.setText("Editar");
        editarTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTitularActionPerformed(evt);
            }
        });
        getContentPane().add(editarTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 75, -1));

        EditarNumeroTar.setText("Editar");
        EditarNumeroTar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarNumeroTarActionPerformed(evt);
            }
        });
        getContentPane().add(EditarNumeroTar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 75, -1));

        jButton9.setText("Editar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 75, -1));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 73));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 73));

        jMenu1.setText("Busqueda");
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setMinimumSize(new java.awt.Dimension(120, 22));
        jMenu1.setPreferredSize(new java.awt.Dimension(120, 22));

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
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setMaximumSize(new java.awt.Dimension(120, 32767));
        jMenu3.setMinimumSize(new java.awt.Dimension(120, 22));

        jMenuItem2.setText("Consultar reservas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Perfil");
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setMaximumSize(new java.awt.Dimension(120, 32767));
        jMenu4.setMinimumSize(new java.awt.Dimension(120, 22));

        jMenuItem1.setText("Modificar datos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoClienteActionPerformed

    }//GEN-LAST:event_telefonoClienteActionPerformed

    private void esClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esClienteVIPActionPerformed
        
    }//GEN-LAST:event_esClienteVIPActionPerformed

    private void emailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailClienteActionPerformed

    }//GEN-LAST:event_emailClienteActionPerformed

    private void DNIClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DNIClienteFocusLost
        if (DNICliente.getText().length() != 9){
            DNICliente.setText("");
        }
    }//GEN-LAST:event_DNIClienteFocusLost

    private void DNIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNIClienteActionPerformed

    }//GEN-LAST:event_DNIClienteActionPerformed

    private void contraseñaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaClienteActionPerformed

    }//GEN-LAST:event_contraseñaClienteActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed

    }//GEN-LAST:event_nombreClienteActionPerformed

    private void numeroTarjetaClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroTarjetaClienteFocusGained
        if (numeroTarjetaCliente.getText().equals("####-####-####-####")){
            numeroTarjetaCliente.setText("");
        }
    }//GEN-LAST:event_numeroTarjetaClienteFocusGained

    private void numeroTarjetaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTarjetaClienteActionPerformed

    }//GEN-LAST:event_numeroTarjetaClienteActionPerformed

    private void titularTarjetaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titularTarjetaClienteActionPerformed

    }//GEN-LAST:event_titularTarjetaClienteActionPerformed

    private void fechaCaducidadClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaCaducidadClienteFocusGained
        if (fechaCaducidadCliente.getText().equals("dd/mm/yyyy")) {
            fechaCaducidadCliente.setText("");
        }
    }//GEN-LAST:event_fechaCaducidadClienteFocusGained

    private void fechaCaducidadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaCaducidadClienteActionPerformed

    }//GEN-LAST:event_fechaCaducidadClienteActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
    if (!nombreCliente.getText().equals("")) {
        nombreValido = true; 
    }
    if (!telefonoCliente.getText().equals("") && telefonoCliente.getText().length() == 12 ) {
        telefonoValido = true; 
    }
    if (!emailCliente.getText().equals("")) {
        emailValido = true;
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
     if (!titularTarjetaCliente.getText().equals("")) {
        titularValido = true; 
    }
    if (!numeroTarjetaCliente.getText().equals("") && numeroTarjetaCliente.getText().length() == 19) {
        numeroTarjetaValido = true;
    }     
    if (nombreValido &&  telefonoValido && emailValido && fechaCadTarjetaValida && numeroTarjetaValido  && titularValido){
            LocalDate fechaConvertida = LocalDate.parse(fechaCaducidadCliente.getText(), formato);
            cliente.setNombre(DNICliente.getText());
            cliente.setTelefono(Integer.parseInt(telefonoCliente.getText().replace(" ","")));
            cliente.setCorreo(emailCliente.getText());
            cliente.getTarjetaCredito().setNombre(titularTarjetaCliente.getText());
            cliente.getTarjetaCredito().setNumeroTarjeta(Long.parseLong(numeroTarjetaCliente.getText().replace(" ", "")));
            cliente.getTarjetaCredito().setFechaCaducidad(fechaConvertida);       
            MenuPrincipal menuPrincipal = new MenuPrincipal(this.getLocation(), (Persona) cliente);
            menuPrincipal.setVisible(true);
            this.dispose();
    }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void editarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarNombreActionPerformed
        nombreCliente.setEditable(true);
    }//GEN-LAST:event_editarNombreActionPerformed

    private void editarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTelActionPerformed
        telefonoCliente.setEditable(true);
    }//GEN-LAST:event_editarTelActionPerformed

    private void editarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCorreoActionPerformed
          emailCliente.setEditable(true);
    }//GEN-LAST:event_editarCorreoActionPerformed

    private void EditarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarClaveActionPerformed
         CambiarContraseña contr = new CambiarContraseña(this.getLocation(),persona);
         contr.setLocation(this.getLocation());
         contr.setVisible(true);
    }//GEN-LAST:event_EditarClaveActionPerformed

    private void editarTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTitularActionPerformed
        titularTarjetaCliente.setEditable(true);
    }//GEN-LAST:event_editarTitularActionPerformed

    private void EditarNumeroTarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarNumeroTarActionPerformed
        numeroTarjetaCliente.setEditable(true);
    }//GEN-LAST:event_EditarNumeroTarActionPerformed

    private void buscarGestionarInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarGestionarInmueblesActionPerformed
        if (persona instanceof ClienteParticular) {
            //BuscarInmuebles busquedaInm = new BuscarInmuebles(this.getLocation(),persona);
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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ConsultarReservasCliente consultarReservas = new ConsultarReservasCliente(this.getLocation(),persona);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (persona instanceof Anfitrion) {
            EditarAnfitrion editaranfitrion = new EditarAnfitrion(this.getLocation(),persona);
            this.dispose();
        }
        else {
            EditarCliente editarcliente = new EditarCliente(this.getLocation(),persona);
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JFormattedTextField DNICliente;
    private javax.swing.JButton EditarClave;
    private javax.swing.JButton EditarNumeroTar;
    private javax.swing.JMenuItem btnReseñaModInm;
    private javax.swing.JMenuItem buscarGestionarInmuebles;
    private javax.swing.JPasswordField contraseñaCliente;
    private javax.swing.JButton editarCorreo;
    private javax.swing.JButton editarNombre;
    private javax.swing.JButton editarTel;
    private javax.swing.JButton editarTitular;
    private javax.swing.JFormattedTextField emailCliente;
    private javax.swing.JCheckBox esClienteVIP;
    private javax.swing.JFormattedTextField fechaCaducidadCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JFormattedTextField nombreCliente;
    private javax.swing.JFormattedTextField numeroTarjetaCliente;
    private javax.swing.JFormattedTextField telefonoCliente;
    private javax.swing.JFormattedTextField titularTarjetaCliente;
    // End of variables declaration//GEN-END:variables
}

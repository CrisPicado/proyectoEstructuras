/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import static clases.Rutinas.inicioDC;
import static clases.Rutinas.finDC;
import clases.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Cris Picado
 */
public class RegistroCursoC extends javax.swing.JFrame {

    DefaultTableModel modelo;
    String[] titulos = {"No. Cédula", "Nombre", "Apellido Paterno", "Apellido Materno", "Contacto", "Correo Electronico", "Tipo Horario", "Horario"};
    String[] datos = new String[8];

    private String nombre, cedula, apePa, apeMa, tipoHorario, horarioDisponible, contacto, correo;

    /**
     * Creates new form RegistroCurso4
     */
    public RegistroCursoC() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro Matricula - Curso Ciencias");
        modelo = new DefaultTableModel(null, titulos);
        tblRegistro.setModel(modelo);
        ImageIcon IconoForm = new ImageIcon("src/imgs/icons8_physics_60px.png");
        this.setIconImage(IconoForm.getImage());
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        cbxHorarios = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtApM = new javax.swing.JTextField();
        cbxTH = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        txtCorreo1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnCln = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        txtCed = new javax.swing.JFormattedTextField();
        txtContacto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Matricula Estudiantes - Curso Ciencias:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número de Cédula:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Horarios Disponibles:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        txtNom.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido Paterno:");

        txtApP.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtApP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApPKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido Materno:");

        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRegistro);

        cbxHorarios.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cbxHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  -Horarios Disponibles-" }));
        cbxHorarios.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo Horario:");

        txtApM.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtApM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApMKeyTyped(evt);
            }
        });

        cbxTH.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cbxTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione Tipo Horario-", "Matutino", "Vespertino", "Nocturno" }));
        cbxTH.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTHItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de contacto:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_male_user_24px.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_male_user_24px.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_male_user_24px.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_male_user_24px.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_phone_26px.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_schedule_26px.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_calendar_26px_1.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_mail_26px.png"))); // NOI18N

        txtCorreo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setText("Correo Electrónico:");

        txtCorreo1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtCorreo1.setMinimumSize(new java.awt.Dimension(7, 29));
        txtCorreo1.setPreferredSize(new java.awt.Dimension(7, 29));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_back_to_32px.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        btnCln.setText("Limpiar Tabla");
        btnCln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClnActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar Lista");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        txtCed.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        try {
            txtCed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCed.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtCed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedKeyTyped(evt);
            }
        });

        try {
            txtContacto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApM)
                                    .addComponent(txtApP)
                                    .addComponent(txtNom)
                                    .addComponent(txtCed))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(55, 55, 55)
                                                    .addComponent(jLabel13))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel14)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCorreo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(btnCln)
                        .addGap(87, 87, 87)
                        .addComponent(btnGuardar)
                        .addGap(97, 97, 97)
                        .addComponent(btnEdit)
                        .addGap(92, 92, 92)
                        .addComponent(btnBuscar)
                        .addGap(121, 121, 121)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrar)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCorreo)
                                .addComponent(txtCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(cbxTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(cbxHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtApM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCln)
                        .addComponent(btnGuardar)
                        .addComponent(btnEdit)
                        .addComponent(btnBuscar)
                        .addComponent(btnEliminar)
                        .addComponent(btnMostrar)))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTHItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTHItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            if (this.cbxTH.getSelectedIndex() > 0) {

                this.cbxHorarios.setModel(new DefaultComboBoxModel(this.getHorarioCurso4(this.cbxTH.getSelectedItem().toString())));

            } else if (this.cbxTH.getSelectedIndex() == 0) {
                String[] opcion = new String[1];
                opcion[0] = "  -Horarios Disponibles-";
                this.cbxHorarios.setModel(new DefaultComboBoxModel(opcion));
            }

        }
    }//GEN-LAST:event_cbxTHItemStateChanged

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        RegistroCursoM r = new RegistroCursoM();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void txtContactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();//Permite ingresar unicamente valores numericos al textfield mediante el metodo consume
    }//GEN-LAST:event_txtContactoKeyTyped

    private void txtCedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtCedKeyTyped

    private void txtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); // se asigna a C el evento de obtener lo que se teclea
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' '))
            evt.consume();
    }//GEN-LAST:event_txtNomKeyTyped

    private void txtApPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); // se asigna a C el evento de obtener lo que se teclea
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' '))
            evt.consume();
    }//GEN-LAST:event_txtApPKeyTyped

    private void txtApMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar(); // se asigna a C el evento de obtener lo que se teclea
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' '))
            evt.consume();
    }//GEN-LAST:event_txtApMKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try{
            capturarDatos();
        }catch(Exception e){
            System.out.println(e);
        }
        Rutinas.insertarLDC(cedula, nombre, apePa, apeMa, contacto, correo, horarioDisponible, tipoHorario);
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnClnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClnActionPerformed
        // TODO add your handling code here:
        modelo = new DefaultTableModel(null, titulos);
        tblRegistro.setModel(modelo);
        limpiar();
    }//GEN-LAST:event_btnClnActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String cedula1 = JOptionPane.showInputDialog(null, "Digite la cedula del estudiante a buscar: ", "Consulta busqueda Matricula", JOptionPane.QUESTION_MESSAGE);
        buscarRegistroLDC(Validaciones.formatoCedula(cedula1));

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        ListadoEstudiantesC abrir = new ListadoEstudiantesC();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try{
            capturarDatos();
        }catch(Exception e){
            System.out.println(e);
        }
        Rutinas.editarRegistroLDC(cedula, nombre, apePa, apeMa, correo, contacto, tipoHorario, horarioDisponible);
        buscarRegistroLDC(cedula);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        limpiar();
        String cedula2 = JOptionPane.showInputDialog(null, "Digite la cedula del registro de usuario a eliminar:");
        Rutinas.eliminarRegistroLDC(Validaciones.formatoCedula(cedula2));
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void capturarDatos() {
        try {
            if (Validaciones.validarCedula(txtCed.getText()) == true && Validaciones.validarCorreo(txtCorreo1.getText()) == true) {

                cedula = txtCed.getText();
                nombre = txtNom.getText();
                apePa = txtApP.getText();
                apeMa = txtApM.getText();
                contacto = txtContacto.getText();
                correo = txtCorreo1.getText();
                tipoHorario = cbxTH.getSelectedItem().toString();
                horarioDisponible = cbxHorarios.getSelectedItem().toString();

            } else if (Validaciones.validarCedula(txtCed.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Error en ingreso de datos, favor revisar cedula!");
            }

        } catch (Exception e) {
            System.out.println("Error en ingreso de datos de formulario, revisar: " + e);
        }

    }

    public void limpiar() {
        txtCed.setText("");
        txtNom.setText("");
        txtApP.setText("");
        txtApM.setText("");
        txtContacto.setText("");
        txtCorreo1.setText("");
        cbxTH.setSelectedIndex(0);
        cbxHorarios.setSelectedIndex(0);
        cedula = null;
        nombre = null;
        apePa = null;
        apeMa = null;
        contacto = null;
        correo = null;
        tipoHorario = null;
        horarioDisponible = null;

    }

    public String[] getHorarioCurso4(String tipoHorario) {

        String[] horarios = new String[5];

        if (tipoHorario.equals("Matutino")) {
            horarios[0] = "L (9 am - 12 am)";
            horarios[1] = "K (6 am - 9 am)";
            horarios[2] = "M (7 am - 10 am)";
            horarios[3] = "J (8 am - 11 am)";
            horarios[4] = "V (6 am - 9 am)";
        }

        if (tipoHorario.equals("Vespertino")) {
            horarios[0] = "L (3 pm - 6 pm)";
            horarios[1] = "K (2 pm - 5 pm)";
            horarios[2] = "M (1 pm - 3 pm)";
            horarios[3] = "J (12 pm - 3 pm)";
            horarios[4] = "V (4 pm - 7 pm)";
        }

        if (tipoHorario.equals("Nocturno")) {
            horarios[0] = "L (7 pm - 9 pm)";
            horarios[1] = "K (10 pm - 12 mn)";
            horarios[2] = "M (8 pm - 10 pm)";
            horarios[3] = "J (9 pm - 11 pm)";
            horarios[4] = "V (10 pm - 12 mn)";
        }
        
        
        for (int x = 0; x < horarios.length; x++) {
            Rutinas.llenarPila(horarios[x]);
        }

        return horarios;

    }

    public void buscarRegistroLDC(String ced) {
        NodoDC aux = inicioDC;
        Boolean encontrado = false;

        if (!Rutinas.estaDCVacia()) {

            do {

                if (aux.getElemento().getNumCedula().equals(ced)) {
                    cedula = aux.getElemento().getNumCedula();
                    nombre = aux.getElemento().getNombre();
                    apePa = aux.getElemento().getApePaterno();
                    apeMa = aux.getElemento().getApeMaterno();
                    contacto = aux.getElemento().getContacto();
                    correo = aux.getElemento().getCorreo();
                    tipoHorario = aux.getElemento().getTipoHorario();
                    horarioDisponible = aux.getElemento().getHorario();

                    txtCed.setText(cedula);
                    txtNom.setText(nombre);
                    txtApP.setText(apePa);
                    txtApM.setText(apeMa);
                    txtContacto.setText(contacto);
                    txtCorreo1.setText(correo);
                    cbxTH.setSelectedItem(tipoHorario);
                    cbxHorarios.setSelectedItem(horarioDisponible);

                    Object[] fila = {cedula, nombre, apePa, apeMa, contacto, correo, tipoHorario, horarioDisponible};
                    modelo.addRow(fila);
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            } while (aux != inicioDC);
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Dato no encontrado , estudiante consultado no existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: Imposible mostrar Lista Doble Circular, lista vacia.", "Estado muestra de lista estudiantes", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(RegistroCursoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCursoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCursoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCursoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCursoC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCln;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cbxHorarios;
    private javax.swing.JComboBox<String> cbxTH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtApM;
    private javax.swing.JTextField txtApP;
    private javax.swing.JFormattedTextField txtCed;
    private javax.swing.JFormattedTextField txtContacto;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.vistas;

import clinicaveterinaria.Modelo.Cliente;
import clinicaveterinaria.Modelo.Mascota;
import clinicaveterinaria.Modelo.MascotaData;
import clinicaveterinaria.Modelo.Conexion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VistaMascota extends javax.swing.JInternalFrame {
private MascotaData MascotaData;
 private Conexion conexion;

    public VistaMascota() {
        initComponents();
          try {
        conexion = new Conexion("jdbc:mysql://localhost/clinicaveterinaria", "root", "");
        MascotaData = new MascotaData(conexion);
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaMascota.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jl_Mascota_Dueño = new javax.swing.JLabel();
        jt_idDueño = new javax.swing.JTextField();
        jl_idMascota = new javax.swing.JLabel();
        jt_idMascota = new javax.swing.JTextField();
        jl_Mascota_Alias = new javax.swing.JLabel();
        jt_alias = new javax.swing.JTextField();
        jl_sexo = new javax.swing.JLabel();
        jrb_Mascota_M = new javax.swing.JRadioButton();
        jrb_Mascota_F = new javax.swing.JRadioButton();
        jl_Mascota_Especie = new javax.swing.JLabel();
        jl_Mascota_Raza = new javax.swing.JLabel();
        jt_raza = new javax.swing.JTextField();
        jl_Mascota_Pelo = new javax.swing.JLabel();
        jtf_Mascota_Pelo = new javax.swing.JTextField();
        jl_Mascota_Fecha = new javax.swing.JLabel();
        jt_fecha = new javax.swing.JTextField();
        jl_Mascota_Peso = new javax.swing.JLabel();
        jtf_Mascota_PesoActual = new javax.swing.JTextField();
        jcb_Especie = new javax.swing.JComboBox<>();
        jl_Mascota_Codigo = new javax.swing.JLabel();
        jt_Codigo = new javax.swing.JTextField();
        jl_Mascota_Peso1 = new javax.swing.JLabel();
        jtf_Mascota_PesoPromedio = new javax.swing.JTextField();
        jb_modificar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_buscar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jl_Mascota = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton4.setText("jButton4");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jl_Mascota_Dueño.setText("ID DUEÑO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        jPanel1.add(jl_Mascota_Dueño, gridBagConstraints);

        jt_idDueño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_idDueñoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 4, 0, 0);
        jPanel1.add(jt_idDueño, gridBagConstraints);

        jl_idMascota.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jPanel1.add(jl_idMascota, gridBagConstraints);

        jt_idMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_idMascotaActionPerformed(evt);
            }
        });
        jt_idMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_idMascotaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 4, 0, 0);
        jPanel1.add(jt_idMascota, gridBagConstraints);

        jl_Mascota_Alias.setText("ALIAS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel1.add(jl_Mascota_Alias, gridBagConstraints);

        jt_alias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_aliasActionPerformed(evt);
            }
        });
        jt_alias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_aliasKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 4, 0, 0);
        jPanel1.add(jt_alias, gridBagConstraints);

        jl_sexo.setText("SEXO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel1.add(jl_sexo, gridBagConstraints);

        jrb_Mascota_M.setText("Masculino");
        jrb_Mascota_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_Mascota_MActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel1.add(jrb_Mascota_M, gridBagConstraints);

        jrb_Mascota_F.setText("Femenino");
        jrb_Mascota_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_Mascota_FActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 26;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(jrb_Mascota_F, gridBagConstraints);

        jl_Mascota_Especie.setText("ESPECIE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel1.add(jl_Mascota_Especie, gridBagConstraints);

        jl_Mascota_Raza.setText("RAZA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel1.add(jl_Mascota_Raza, gridBagConstraints);

        jt_raza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_razaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel1.add(jt_raza, gridBagConstraints);

        jl_Mascota_Pelo.setText("COLOR DE PELO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel1.add(jl_Mascota_Pelo, gridBagConstraints);

        jtf_Mascota_Pelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_Mascota_PeloKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 4, 0, 0);
        jPanel1.add(jtf_Mascota_Pelo, gridBagConstraints);

        jl_Mascota_Fecha.setText("FECHA DE NACIMIENTO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel1.add(jl_Mascota_Fecha, gridBagConstraints);

        jt_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_fechaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel1.add(jt_fecha, gridBagConstraints);

        jl_Mascota_Peso.setText("PESO ACTUAL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jPanel1.add(jl_Mascota_Peso, gridBagConstraints);

        jtf_Mascota_PesoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_Mascota_PesoActualKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 0);
        jPanel1.add(jtf_Mascota_PesoActual, gridBagConstraints);

        jcb_Especie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERRO", "GATO", "LORO", "HAMSTER" }));
        jcb_Especie.setToolTipText("PERRO\nGATO\nLORO\nHAMSTER");
        jcb_Especie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_EspecieActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel1.add(jcb_Especie, gridBagConstraints);

        jl_Mascota_Codigo.setText("CODIGO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        jPanel1.add(jl_Mascota_Codigo, gridBagConstraints);

        jt_Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_CodigoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 4, 0, 0);
        jPanel1.add(jt_Codigo, gridBagConstraints);

        jl_Mascota_Peso1.setText("PESO PROMEDIO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 0);
        jPanel1.add(jl_Mascota_Peso1, gridBagConstraints);

        jtf_Mascota_PesoPromedio.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 0, 0);
        jPanel1.add(jtf_Mascota_PesoPromedio, gridBagConstraints);

        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 56, 0, 10);
        jPanel1.add(jb_modificar, gridBagConstraints);

        jb_borrar.setText("Borrar");
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 56, 0, 10);
        jPanel1.add(jb_borrar, gridBagConstraints);

        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 56, 0, 10);
        jPanel1.add(jb_buscar, gridBagConstraints);

        jb_guardar.setText("Guardar");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 13, 0);
        jPanel1.add(jb_guardar, gridBagConstraints);

        jb_limpiar.setText("Limpiar");
        jb_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 9, 13, 0);
        jPanel1.add(jb_limpiar, gridBagConstraints);

        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 26;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 13, 0);
        jPanel1.add(jb_cancelar, gridBagConstraints);

        jl_Mascota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_Mascota.setText("MASCOTA");
        jl_Mascota.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_Mascota))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jl_Mascota, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        jl_Mascota.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        
        
        int id_cliente=Integer.parseInt(jt_idDueño.getText());
        Cliente cliente= MascotaData.buscarCliente(id_cliente);
        
        if (cliente != null){
            String codigo=jt_Codigo.getText();
            String alias=jt_alias.getText();
            String sexo="Desconocido";
            if(jrb_Mascota_M.isSelected() == true)
                sexo="Masculino";
            if(jrb_Mascota_F.isSelected() == true)
                sexo="Femenino";
            String especie="Desconocido";
            switch(jcb_Especie.getSelectedIndex()){
                case 0: especie="Perro";
                break;
                case 1: especie="Gato";
                break;
                case 2: especie="Loro";
                break;
                case 3: especie="Hamster";
                break;
            }
            String raza=jt_raza.getText();
            String color_pelo=jtf_Mascota_Pelo.getText();            
            
            LocalDate fecha_nac;
            try{
                fecha_nac = LocalDate.parse(jt_fecha.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
            catch(DateTimeParseException ex){
               JOptionPane.showMessageDialog(null, "Fecha incorrecta");
               return;
            }            
            
            Double peso_actual=Double.parseDouble(jtf_Mascota_PesoActual.getText());
            Double peso_promedio=peso_actual;
         
            Mascota mascota= new Mascota(cliente,codigo,alias,sexo, especie, raza, color_pelo,fecha_nac,peso_actual,peso_promedio);            
            MascotaData.guardarMascota(mascota);
            jt_idMascota.setText(mascota.getId_mascota()+"");
            jtf_Mascota_PesoPromedio.setText(Double.toString(mascota.getPeso_promedio()));
            jt_idMascota.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Guardado exitoso.");
            
           
        }
        else  
            JOptionPane.showMessageDialog(null, "El ID del dueño no existe. Genere un cliente nuevo.");    
                                                
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
     jt_idMascota.setEnabled(true);
     jt_idMascota.setText(""); 
     jt_idDueño.setText("");
     jt_Codigo.setText("");
     jt_alias.setText("");
     jrb_Mascota_M.setSelected(false);
     jrb_Mascota_F.setSelected(false);
     jcb_Especie.setSelectedIndex(0);
     jt_raza.setText("");
     jtf_Mascota_Pelo.setText("");
     jt_fecha.setText(""); 
     jtf_Mascota_PesoActual.setText("");
     jtf_Mascota_PesoPromedio.setText("");

    }//GEN-LAST:event_jb_limpiarActionPerformed

    private void jt_aliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_aliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_aliasActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        if(!jt_idMascota.getText().equals("")){
            int id=Integer.parseInt(jt_idMascota.getText());
            Mascota mascota=MascotaData.buscarMascota(id);
            if(mascota!=null){
                jt_idMascota.setText(mascota.getId_mascota()+"");
                jt_idDueño.setText(mascota.getCliente().getId_cliente()+"");
                jt_Codigo.setText(mascota.getCod_mascota());
                jt_alias.setText(mascota.getAlias());
                
                if(mascota.getSexo().equalsIgnoreCase("femenino")){
                    jrb_Mascota_F.setSelected(true);
                    jrb_Mascota_M.setSelected(false);
                }
                if(mascota.getSexo().equalsIgnoreCase("masculino")){
                    jrb_Mascota_M.setSelected(true);
                    jrb_Mascota_F.setSelected(false);
                }
                switch(mascota.getEspecie().toUpperCase()){
                    case "PERRO":jcb_Especie.setSelectedIndex(0);
                    break;
                    case "GATO":jcb_Especie.setSelectedIndex(1);
                    break;
                    case "LORO":jcb_Especie.setSelectedIndex(2);
                    break;
                    case "HAMSTER":jcb_Especie.setSelectedIndex(3);
                    break;
                }
           
                jt_raza.setText(mascota.getRaza());
                jtf_Mascota_Pelo.setText(mascota.getColor_pelo());
                jt_fecha.setText(mascota.getFecha_nac().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                jtf_Mascota_PesoActual.setText(Double.toString(mascota.getPeso_actual()));
                jtf_Mascota_PesoPromedio.setText(Double.toString(mascota.getPeso_promedio()));
                jt_idMascota.setEnabled(false);
                
        }
        else{
            JOptionPane.showMessageDialog(null, "No existe mascota con el ID ingresado.");    
            jt_idMascota.setText("");
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Ingrese el ID de la mascota.");
            
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
      int id=Integer.parseInt(jt_idMascota.getText());
      int resp = JOptionPane.showConfirmDialog(null, "Tambien se eliminaran las VISITAS que registra esta mascota. ¿Está seguro?");
        if(resp == 0){
            MascotaData.borrarMascota(id);       
            JOptionPane.showMessageDialog(null, "Borrado exitoso.");
            jb_limpiarActionPerformed(evt);
        }
    }//GEN-LAST:event_jb_borrarActionPerformed

    private void jrb_Mascota_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_Mascota_FActionPerformed
        
        jrb_Mascota_M.setSelected(false);
    }//GEN-LAST:event_jrb_Mascota_FActionPerformed

    private void jrb_Mascota_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_Mascota_MActionPerformed
        
        jrb_Mascota_F.setSelected(false);
    }//GEN-LAST:event_jrb_Mascota_MActionPerformed

    private void jcb_EspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_EspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_EspecieActionPerformed

    private void jt_idMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_idMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_idMascotaActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        
            int id_mascota=Integer.parseInt(jt_idMascota.getText());
            int id_cliente=Integer.parseInt(jt_idDueño.getText());
            Cliente cliente= MascotaData.buscarCliente(id_cliente);
            String codigo=jt_Codigo.getText();
            String alias=jt_alias.getText();
            String sexo="Desconocido";
            if(jrb_Mascota_M.isSelected() == true)
                sexo="Masculino";
            if(jrb_Mascota_F.isSelected() == true)
                sexo="Femenino";
            String especie="Desconocido";
            switch(jcb_Especie.getSelectedIndex()){
                case 0: especie="Perro";
                break;
                case 1: especie="Gato";
                break;
                case 2: especie="Loro";
                break;
                case 3: especie="Hamster";
                break;
            }     
                
            String raza=jt_raza.getText();
            String color_pelo=jtf_Mascota_Pelo.getText();
            LocalDate fecha_nac;
            try{
                fecha_nac = LocalDate.parse(jt_fecha.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
            catch(DateTimeParseException ex){
               JOptionPane.showMessageDialog(null, "Fecha incorrecta");
               return;
            }
            Double peso_actual=Double.parseDouble(jtf_Mascota_PesoActual.getText());
            
            
            Mascota mascota= new Mascota(id_mascota,cliente,codigo,alias,sexo, especie, raza, color_pelo,fecha_nac,peso_actual);
            MascotaData.actualizarMascota(mascota);
            JOptionPane.showMessageDialog(null, "Actualizacion exitosa.");
            
          
        
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jt_idDueñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_idDueñoKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && c!='\u0008') { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese un entero."); 
               
          } 
    }//GEN-LAST:event_jt_idDueñoKeyTyped

    private void jt_CodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_CodigoKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && !Character.isLetter(c) && c!='\u0008') { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Se aceptan solos digitos y letras consecutivas."); 
               
          } 
    }//GEN-LAST:event_jt_CodigoKeyTyped

    private void jt_aliasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_aliasKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c) && c!='\u0008') { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras."); 
               
          } 
    }//GEN-LAST:event_jt_aliasKeyTyped

    private void jt_razaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_razaKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isLetter(c) && c!='\u0008') { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras."); 
               
          }
    }//GEN-LAST:event_jt_razaKeyTyped

    private void jtf_Mascota_PeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_Mascota_PeloKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isLetter(c) && c!='\u0008') { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras."); 
               
          }
    }//GEN-LAST:event_jtf_Mascota_PeloKeyTyped

    private void jt_fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_fechaKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && c!='/' && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo digitos."); 
               
          }
    }//GEN-LAST:event_jt_fechaKeyTyped

    private void jtf_Mascota_PesoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_Mascota_PesoActualKeyTyped
        char c=evt.getKeyChar(); 
        
       
        
          if(!Character.isDigit(c) && (c!='.' || jtf_Mascota_PesoActual.getText().contains(".")) && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo numeros decimales."); 
               
          }
    }//GEN-LAST:event_jtf_Mascota_PesoActualKeyTyped

    private void jt_idMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_idMascotaKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo digitos."); 
               
          }
    }//GEN-LAST:event_jt_idMascotaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_limpiar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JComboBox<String> jcb_Especie;
    private javax.swing.JLabel jl_Mascota;
    private javax.swing.JLabel jl_Mascota_Alias;
    private javax.swing.JLabel jl_Mascota_Codigo;
    private javax.swing.JLabel jl_Mascota_Dueño;
    private javax.swing.JLabel jl_Mascota_Especie;
    private javax.swing.JLabel jl_Mascota_Fecha;
    private javax.swing.JLabel jl_Mascota_Pelo;
    private javax.swing.JLabel jl_Mascota_Peso;
    private javax.swing.JLabel jl_Mascota_Peso1;
    private javax.swing.JLabel jl_Mascota_Raza;
    private javax.swing.JLabel jl_idMascota;
    private javax.swing.JLabel jl_sexo;
    private javax.swing.JRadioButton jrb_Mascota_F;
    private javax.swing.JRadioButton jrb_Mascota_M;
    private javax.swing.JTextField jt_Codigo;
    private javax.swing.JTextField jt_alias;
    private javax.swing.JTextField jt_fecha;
    private javax.swing.JTextField jt_idDueño;
    private javax.swing.JTextField jt_idMascota;
    private javax.swing.JTextField jt_raza;
    private javax.swing.JTextField jtf_Mascota_Pelo;
    private javax.swing.JTextField jtf_Mascota_PesoActual;
    private javax.swing.JTextField jtf_Mascota_PesoPromedio;
    // End of variables declaration//GEN-END:variables
}

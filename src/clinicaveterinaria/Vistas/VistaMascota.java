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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jl_Mascota = new javax.swing.JLabel();
        jb_guardar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
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
        jb_buscar = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();

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

        jl_Mascota.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_Mascota.setText("MASCOTA");

        jb_guardar.setText("Guardar");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        jb_borrar.setText("Borrar");
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
            }
        });

        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jl_Mascota_Dueño.setText("ID DUEÑO");

        jl_idMascota.setText("ID");

        jt_idMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_idMascotaActionPerformed(evt);
            }
        });

        jl_Mascota_Alias.setText("ALIAS");

        jt_alias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_aliasActionPerformed(evt);
            }
        });

        jl_sexo.setText("SEXO");

        jrb_Mascota_M.setText("Masculino");
        jrb_Mascota_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_Mascota_MActionPerformed(evt);
            }
        });

        jrb_Mascota_F.setText("Femenino");
        jrb_Mascota_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_Mascota_FActionPerformed(evt);
            }
        });

        jl_Mascota_Especie.setText("ESPECIE");

        jl_Mascota_Raza.setText("RAZA");

        jl_Mascota_Pelo.setText("COLOR DE PELO");

        jl_Mascota_Fecha.setText("FECHA DE NACIMIENTO");

        jl_Mascota_Peso.setText("PESO ACTUAL");

        jcb_Especie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERRO", "GATO", "LORO", "HAMSTER" }));
        jcb_Especie.setToolTipText("PERRO\nGATO\nLORO\nHAMSTER");
        jcb_Especie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_EspecieActionPerformed(evt);
            }
        });

        jl_Mascota_Codigo.setText("CODIGO");

        jl_Mascota_Peso1.setText("PESO PROMEDIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_Mascota_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jtf_Mascota_PesoPromedio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_idMascota)
                            .addComponent(jl_Mascota_Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_idMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_idDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jl_Mascota_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jl_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jl_Mascota_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jl_Mascota_Pelo)
                                .addComponent(jl_Mascota_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jl_Mascota_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jt_fecha)
                                .addComponent(jtf_Mascota_Pelo)
                                .addComponent(jt_raza)
                                .addComponent(jt_alias)
                                .addComponent(jtf_Mascota_PesoActual, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jrb_Mascota_M, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrb_Mascota_F, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jl_Mascota_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcb_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_Mascota_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_idMascota)
                    .addComponent(jt_idMascota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_idDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Mascota_Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Mascota_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrb_Mascota_M)
                        .addComponent(jrb_Mascota_F)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Mascota_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_Especie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Mascota_Raza, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Mascota_Pelo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Mascota_Pelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_Mascota_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl_Mascota_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_Mascota_PesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Mascota_Peso1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtf_Mascota_PesoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

        jb_limpiar.setText("Limpiar");
        jb_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarActionPerformed(evt);
            }
        });

        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addComponent(jb_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(jb_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(jb_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                .addContainerGap(116, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_modificar)
                                .addContainerGap(118, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jl_Mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_Mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_buscar)
                        .addGap(12, 12, 12)
                        .addComponent(jb_borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_modificar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_guardar)
                            .addComponent(jb_limpiar)
                            .addComponent(jb_cancelar))
                        .addGap(29, 29, 29))))
        );

        jl_Mascota.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        
        
        int id_cliente=Integer.parseInt(jt_idDueño.getText());
        Cliente cliente= MascotaData.buscarCliente(id_cliente);
        
        if (cliente != null){
            int codigo=Integer.parseInt(jt_Codigo.getText());
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
            LocalDate fecha_nac= LocalDate.parse(jt_fecha.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));            
            Double peso_promedio=Double.parseDouble(jtf_Mascota_PesoPromedio.getText());
            Double peso_actual=Double.parseDouble(jtf_Mascota_PesoActual.getText());
         
            Mascota mascota= new Mascota(cliente,codigo,alias,sexo, especie, raza, color_pelo,fecha_nac,peso_promedio,peso_actual);
            MascotaData.guardarMascota(mascota);
            jt_idMascota.setText(mascota.getId_mascota()+"");
            
           
        }
        else  
            JOptionPane.showMessageDialog(null, "El ID del dueño no existe. Genere un cliente nuevo.");    
                                                
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
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
                jt_Codigo.setText(Integer.toString(mascota.getCod_mascota()));
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
                
        }
        else
            JOptionPane.showMessageDialog(null, "No existe mascota con el ID ingresado.");    

        }
        else
            JOptionPane.showMessageDialog(null, "Ingrese el ID de la mascota.");
            
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
      int id=Integer.parseInt(jt_idMascota.getText());
      int resp = JOptionPane.showConfirmDialog(null, "Tambien se eliminaran las VISITAS que registra esta mascota. ¿Está seguro?");
        if(resp == 0)
            MascotaData.borrarMascota(id);       
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
        if (!jt_idMascota.getText().equals("")){
            int id_mascota=Integer.parseInt(jt_idMascota.getText());
            int id_cliente=Integer.parseInt(jt_idDueño.getText());
            Cliente cliente= MascotaData.buscarCliente(id_cliente);
            int codigo=Integer.parseInt(jt_Codigo.getText());
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
            LocalDate fecha_nac= LocalDate.parse(jt_fecha.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Double peso_promedio=Double.parseDouble(jtf_Mascota_PesoPromedio.getText());
            Double peso_actual=Double.parseDouble(jtf_Mascota_PesoActual.getText());
            
            Mascota mascota= new Mascota(id_mascota,cliente,codigo,alias,sexo, especie, raza, color_pelo,fecha_nac,peso_promedio,peso_actual);
            MascotaData.actualizarMascota(mascota);
            
          } 
        else
            JOptionPane.showMessageDialog(null, "Ingrese el ID de la mascota.");
        
    }//GEN-LAST:event_jb_modificarActionPerformed

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

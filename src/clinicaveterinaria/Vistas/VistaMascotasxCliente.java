/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.vistas;

import clinicaveterinaria.Modelo.Conexion;
import clinicaveterinaria.Modelo.Mascota;
import clinicaveterinaria.Modelo.MascotaData;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author elinote
 */
public class VistaMascotasxCliente extends javax.swing.JInternalFrame {
    private MascotaData mascotaData;
    private Conexion conexion;

    
    public VistaMascotasxCliente() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/clinicaveterinaria", "root", "");
        mascotaData = new MascotaData(conexion);
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ListadoTratamientosActivos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jb_buscar = new javax.swing.JButton();
        lb_idCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jt_idCliente = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO DE MASCOTAS POR CLIENTE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 301, 0, 0);
        jPanel1.add(jb_buscar, gridBagConstraints);

        lb_idCliente.setText("ID CLIENTE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 20, 0, 0);
        jPanel1.add(lb_idCliente, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Mascota", "Codigo", "Alias", "Sexo", "Especie", "Raza", "Color de pelo", "Fecha Nacimiento", "Peso actual", "Peso promedio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 635;
        gridBagConstraints.ipady = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(46, 10, 96, 10);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jt_idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_idClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 135;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 4, 0, 0);
        jPanel1.add(jt_idCliente, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_idClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_idClienteActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        List<Mascota> mascotas = new ArrayList<>();
        if(!jt_idCliente.getText().equals("")){
            if(mascotaData.buscarCliente(Integer.parseInt(jt_idCliente.getText())) != null){
                
                mascotas = mascotaData.MascotasPorCliente(Integer.parseInt(jt_idCliente.getText()));     
            
                if(!mascotas.isEmpty()){
                int a= mascotas.size();
                    for(int i=0;i<a;i++){

                    jTable1.setValueAt(mascotas.get(i).getId_mascota(), i, 0);
                    jTable1.setValueAt(mascotas.get(i).getCod_mascota(), i, 1);
                    jTable1.setValueAt(mascotas.get(i).getAlias(), i, 2);
                    jTable1.setValueAt(mascotas.get(i).getSexo(), i, 3);
                    jTable1.setValueAt(mascotas.get(i).getEspecie(), i, 4);
                    jTable1.setValueAt(mascotas.get(i).getRaza(), i, 5);
                    jTable1.setValueAt(mascotas.get(i).getColor_pelo(), i, 6);
                    jTable1.setValueAt(mascotas.get(i).getFecha_nac(), i, 7);
                    jTable1.setValueAt(mascotas.get(i).getPeso_actual(), i, 8);
                    jTable1.setValueAt(mascotas.get(i).getPeso_promedio(), i, 9);

                }
                }
                else
                    JOptionPane.showMessageDialog(null, "El cliente no tiene mascotas.");
            }
            else
                JOptionPane.showMessageDialog(null, "El cliente no existe.");
        }
        else
            JOptionPane.showMessageDialog(null, "Ingrese el ID del cliente a buscar.");
            
    }//GEN-LAST:event_jb_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JTextField jt_idCliente;
    private javax.swing.JLabel lb_idCliente;
    // End of variables declaration//GEN-END:variables
}

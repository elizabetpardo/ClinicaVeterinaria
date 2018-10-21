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

        jLabel1 = new javax.swing.JLabel();
        lb_idCliente = new javax.swing.JLabel();
        jt_idCliente = new javax.swing.JTextField();
        jb_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LISTADO DE MASCOTAS POR CLIENTE");

        lb_idCliente.setText("ID CLIENTE");

        jt_idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_idClienteActionPerformed(evt);
            }
        });

        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lb_idCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_idCliente)
                .addGap(242, 242, 242)
                .addComponent(jb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JTextField jt_idCliente;
    private javax.swing.JLabel lb_idCliente;
    // End of variables declaration//GEN-END:variables
}

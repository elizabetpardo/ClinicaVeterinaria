/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.vistas;

import clinicaveterinaria.Modelo.ClienteData;
import clinicaveterinaria.Modelo.VisitasData;
import clinicaveterinaria.Modelo.Conexion;
import clinicaveterinaria.Modelo.VisitaDeAtencion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elinote
 */
public class VistaVisitaDeAtencion extends javax.swing.JInternalFrame {
  private VisitasData visitasData;
 private Conexion conexion;
    /**
     * Creates new form VistaVisitasDeAtencion
     */
    public VistaVisitaDeAtencion() {
        initComponents();
              try {
        conexion = new Conexion("jdbc:mysql://localhost/clinicaveterinaria", "root", "");
        visitasData = new VisitasData(conexion);
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaVisitaDeAtencion.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jl_idVisita = new javax.swing.JLabel();
        jt_idVisita = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jt_idMascota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jt_idTratamiento = new javax.swing.JTextField();
        jl_fecha = new javax.swing.JLabel();
        jt_fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_detalle = new javax.swing.JTextArea();
        jb_buscar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("VISITA DE ATENCIÓN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jl_idVisita.setText("ID VISITA");

        jt_idVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_idVisitaActionPerformed(evt);
            }
        });

        jLabel2.setText("ID MASCOTA");

        jLabel3.setText("ID TRATAMIENTO");

        jl_fecha.setText("FECHA");

        jLabel4.setText("DETALLE");

        jta_detalle.setColumns(20);
        jta_detalle.setRows(5);
        jScrollPane1.setViewportView(jta_detalle);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_idVisita)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jl_fecha)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jt_idVisita, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(jt_idMascota)
                        .addComponent(jt_idTratamiento)
                        .addComponent(jt_fecha))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_idVisita)
                    .addComponent(jt_idVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_idMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_idTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

        jb_borrar.setText("Borrar");
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
            }
        });

        jb_guardar.setText("Guardar");

        jb_limpiar.setText("Limpiar");
        jb_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarActionPerformed(evt);
            }
        });

        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jb_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jb_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jb_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jb_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_borrar)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardar)
                    .addComponent(jb_limpiar)
                    .addComponent(jb_cancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_idVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_idVisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_idVisitaActionPerformed

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
       jt_idMascota.setText("");
    }//GEN-LAST:event_jb_limpiarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
        
        int id_mascota=Integer.parseInt(jt_idMascota.getText());
        int id_tratamiento=Integer.parseInt(jt_idTratamiento.getText());
        visitasData.borrarVisita(id_mascota,id_tratamiento);
        
        
        
    }//GEN-LAST:event_jb_borrarActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        /* int id_mascota=Integer.parseInt(jt_idMascota.getText());
         int id_tratamiento=Integer.parseInt(jt_idTratamiento.getText());
        VisitaDeAtencion visita=visitasData.buscarVisita(id_mascota,id_tratamiento);
        
        if(visita!=null){
                jt_idCliente.setText(cliente.getId_cliente()+"");
                jt_dni.setText(Integer.toString(cliente.getDni()));
                jt_apellido.setText(cliente.getApellido());
                jt_nombre.setText(cliente.getNombre());
                jt_direccion.setText(cliente.getDireccion());
                jt_telefono.setText(cliente.getTelefono());
                jt_personaAlternativa.setText(cliente.getPersona_alternativa());
        }    */ 
    }//GEN-LAST:event_jb_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_limpiar;
    private javax.swing.JLabel jl_fecha;
    private javax.swing.JLabel jl_idVisita;
    private javax.swing.JTextField jt_fecha;
    private javax.swing.JTextField jt_idMascota;
    private javax.swing.JTextField jt_idTratamiento;
    private javax.swing.JTextField jt_idVisita;
    private javax.swing.JTextArea jta_detalle;
    // End of variables declaration//GEN-END:variables
}

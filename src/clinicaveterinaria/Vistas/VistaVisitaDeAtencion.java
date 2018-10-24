/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.vistas;


import clinicaveterinaria.Modelo.VisitasData;
import clinicaveterinaria.Modelo.Conexion;
import clinicaveterinaria.Modelo.Mascota;
import clinicaveterinaria.Modelo.MascotaData;
import clinicaveterinaria.Modelo.Tratamiento;
import clinicaveterinaria.Modelo.TratamientoData;
import clinicaveterinaria.Modelo.VisitaDeAtencion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elinote
 */
public class VistaVisitaDeAtencion extends javax.swing.JInternalFrame {
  private VisitasData visitasData;
  private MascotaData mascotaData;
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
        jt_pesoActual = new javax.swing.JTextField();
        jt_pesoPromedio = new javax.swing.JTextField();
        jl_pesoActual = new javax.swing.JLabel();
        jl_pesoPromedio = new javax.swing.JLabel();
        jb_buscar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();

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

        jl_pesoActual.setText("PESO ACTUAL");

        jl_pesoPromedio.setText("PESO PROMEDIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_idVisita)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jl_fecha)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jt_idVisita, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(jt_idMascota)
                                .addComponent(jt_idTratamiento)
                                .addComponent(jt_fecha, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_pesoActual)
                            .addComponent(jl_pesoPromedio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_pesoActual)
                            .addComponent(jt_pesoPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_pesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_pesoActual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_pesoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_pesoPromedio))
                .addContainerGap(14, Short.MAX_VALUE))
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
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jb_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jb_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_modificar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardar)
                    .addComponent(jb_limpiar)
                    .addComponent(jb_cancelar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_idVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_idVisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_idVisitaActionPerformed

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
        jt_idVisita.setText("");
        jt_idMascota.setText("");
        jt_idTratamiento.setText("");
        jt_fecha.setText("");
        jta_detalle.setText("");
        jt_pesoActual.setText("");
        jt_pesoPromedio.setText("");
    }//GEN-LAST:event_jb_limpiarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
        
        int idVisita=Integer.parseInt(jt_idVisita.getText());
        visitasData.borrarVisita(idVisita);
        
        
        
    }//GEN-LAST:event_jb_borrarActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
       
        int id=Integer.parseInt(jt_idVisita.getText());
        VisitaDeAtencion visita=visitasData.buscarVisita(id);
        
        if(visita!=null){
                jt_idVisita.setText(visita.getId_visita()+"");
                jt_idMascota.setText(visita.getMascota().getId_mascota()+"");
                jt_idTratamiento.setText(visita.getTratamiento().getId_tratamiento()+"");
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String fecha=visita.getFecha().format(format);
                jt_fecha.setText(fecha);
                jta_detalle.setText(visita.getDetalle());
                jt_pesoActual.setText(Double.toString(visita.getPeso_actual()));
                
                jt_pesoPromedio.setText(Double.toString(visita.getPeso_promedio()));
    }//GEN-LAST:event_jb_buscarActionPerformed
    }
    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
                  
      
        int idMascota= Integer.parseInt(jt_idMascota.getText());
        Mascota mascota = visitasData.buscarMascota(idMascota);
      
        int idTratamiento=Integer.parseInt(jt_idTratamiento.getText());
        Tratamiento tratamiento = visitasData.buscarTratamiento(idTratamiento);
          if(mascota != null && tratamiento != null)
        {
          LocalDate fecha= LocalDate.parse(jt_fecha.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
         String detalle=jta_detalle.getText();
         double pesoActual=Double.parseDouble(jt_pesoActual.getText());
         mascota.setPeso_actual(pesoActual);
        
   
         double pesoPromedio=mascota.getPeso_promedio();
          jt_pesoPromedio.setText(Double.toString(pesoPromedio));
         visitasData.PromediarPeso(mascota);
        
         VisitaDeAtencion visita= new VisitaDeAtencion(mascota,tratamiento,fecha,detalle,pesoActual,pesoPromedio);
         
         visitasData.guardarVisita(visita);
         jt_idVisita.setText(visita.getId_visita()+"");
         }
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
       
       if (jt_idVisita.getText()!=null){
           
           int idMascota=Integer.parseInt(jt_idMascota.getText());
            Mascota mascota = visitasData.buscarMascota(idMascota);
          
           int idTratamiento=Integer.parseInt(jt_idTratamiento.getText());
             Tratamiento tratamiento = visitasData.buscarTratamiento(idTratamiento);
           
           LocalDate fecha=LocalDate.parse(jt_fecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
           String detalle=jta_detalle.getText();
           
          double pesoActual=Double.parseDouble(jt_pesoActual.getText());
          mascota.setPeso_actual(pesoActual);
          
          double pesoPromedio=mascota.getPeso_promedio();
         jt_pesoPromedio.setText(Double.toString(pesoPromedio));
           
        VisitaDeAtencion visita=new VisitaDeAtencion(Integer.parseInt(jt_idVisita.getText()),mascota,tratamiento,fecha,detalle,pesoActual,pesoPromedio);
             visitasData.actualizarVisita(visita);
    }//GEN-LAST:event_jb_modificarActionPerformed
    }

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
    private javax.swing.JButton jb_modificar;
    private javax.swing.JLabel jl_fecha;
    private javax.swing.JLabel jl_idVisita;
    private javax.swing.JLabel jl_pesoActual;
    private javax.swing.JLabel jl_pesoPromedio;
    private javax.swing.JTextField jt_fecha;
    private javax.swing.JTextField jt_idMascota;
    private javax.swing.JTextField jt_idTratamiento;
    private javax.swing.JTextField jt_idVisita;
    private javax.swing.JTextField jt_pesoActual;
    private javax.swing.JTextField jt_pesoPromedio;
    private javax.swing.JTextArea jta_detalle;
    // End of variables declaration//GEN-END:variables
}

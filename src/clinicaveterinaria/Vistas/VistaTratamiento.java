/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.vistas;
import clinicaveterinaria.Modelo.Tratamiento;
import clinicaveterinaria.Modelo.TratamientoData;
import clinicaveterinaria.Modelo.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
public class VistaTratamiento extends javax.swing.JInternalFrame {
 
 private TratamientoData tratamientoData;
 private Conexion conexion;
   
    public VistaTratamiento() {
        initComponents();
        
          try {
        conexion = new Conexion("jdbc:mysql://localhost/clinicaveterinaria", "root", "");
        tratamientoData = new TratamientoData(conexion);
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaTratamiento.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_tratamiento = new javax.swing.JLabel();
        jp_Tratamiento = new javax.swing.JPanel();
        jl_idTratamiento = new javax.swing.JLabel();
        jt_idTratamiento = new javax.swing.JTextField();
        jl_codTratamiento = new javax.swing.JLabel();
        jt_codTratamiento = new javax.swing.JTextField();
        jl_tipo = new javax.swing.JLabel();
        jcbx_tipo = new javax.swing.JComboBox<>();
        jl_descripcion = new javax.swing.JLabel();
        jl_importe = new javax.swing.JLabel();
        jt_importe = new javax.swing.JTextField();
        jl_activo = new javax.swing.JLabel();
        jcb_Activo = new javax.swing.JCheckBox();
        jsp_Descripcion = new javax.swing.JScrollPane();
        jta_descripcion = new javax.swing.JTextArea();
        jb_guardar = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_Buscar = new javax.swing.JButton();
        jb_Borrar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jl_tratamiento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_tratamiento.setText("TRATAMIENTO");

        jp_Tratamiento.setBackground(new java.awt.Color(255, 255, 255));

        jl_idTratamiento.setText("ID");

        jl_codTratamiento.setText("CODIGO ");

        jl_tipo.setText("TIPO");

        jcbx_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VACUNACIÓN", "ENFERMEDAD", "CURACIONES", "BAÑO Y CORTE DE PELO", "CASTRACIÓN", "OTROS" }));

        jl_descripcion.setText("DESCRIPCIÓN");

        jl_importe.setText("IMPORTE");

        jl_activo.setText("ACTIVO");

        jta_descripcion.setColumns(20);
        jta_descripcion.setRows(5);
        jsp_Descripcion.setViewportView(jta_descripcion);

        javax.swing.GroupLayout jp_TratamientoLayout = new javax.swing.GroupLayout(jp_Tratamiento);
        jp_Tratamiento.setLayout(jp_TratamientoLayout);
        jp_TratamientoLayout.setHorizontalGroup(
            jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_TratamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_idTratamiento)
                    .addComponent(jl_codTratamiento)
                    .addComponent(jl_tipo)
                    .addComponent(jl_descripcion)
                    .addComponent(jl_importe)
                    .addComponent(jl_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt_idTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbx_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jt_importe)
                    .addComponent(jt_codTratamiento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcb_Activo)
                    .addComponent(jsp_Descripcion))
                .addGap(39, 39, 39))
        );
        jp_TratamientoLayout.setVerticalGroup(
            jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_TratamientoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_TratamientoLayout.createSequentialGroup()
                        .addComponent(jl_idTratamiento)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_TratamientoLayout.createSequentialGroup()
                        .addComponent(jt_idTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_codTratamiento)
                    .addComponent(jt_codTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_tipo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbx_tipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_descripcion)
                    .addComponent(jsp_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_TratamientoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jl_importe))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_TratamientoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jp_TratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcb_Activo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_activo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

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

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jb_Borrar.setText("Borrar");
        jb_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BorrarActionPerformed(evt);
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
                .addGap(141, 141, 141)
                .addComponent(jl_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jb_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jp_Tratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jl_tratamiento)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_Tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jb_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_modificar)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardar)
                    .addComponent(jb_limpiar)
                    .addComponent(jb_cancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
     dispose();
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
       jt_idTratamiento.setText("");
       jt_codTratamiento.setText("");
       jta_descripcion.setText("");
       jt_importe.setText("");
       jcbx_tipo.setSelectedIndex(0);
       jcb_Activo.setSelected(false);
    }//GEN-LAST:event_jb_limpiarActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        String codigo=jt_codTratamiento.getText();
        int tipo= jcbx_tipo.getSelectedIndex();
        String descripcion=jta_descripcion.getText();
        double importe = Double.parseDouble(jt_importe.getText());
        boolean activo =jcb_Activo.isSelected();
        
        Tratamiento tratamiento= new Tratamiento(codigo, tipo, descripcion, importe, activo);
        tratamientoData.guardarTratamiento(tratamiento);
         jt_idTratamiento.setText(tratamiento.getId_tratamiento()+"");
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
       int id=Integer.parseInt(jt_idTratamiento.getText());
        Tratamiento tratamiento= tratamientoData.buscarTratamiento(id);
        if(tratamiento!=null){
                jt_idTratamiento.setText(tratamiento.getId_tratamiento()+"");
                jt_codTratamiento.setText(tratamiento.getCod_tratamiento());
                jcbx_tipo.setSelectedIndex(tratamiento.getTipo()); 
                jta_descripcion.setText(tratamiento.getDescripcion());
                jt_importe.setText(Double.toString(tratamiento.getImporte()));
                jcb_Activo.setSelected(tratamiento.getActivo());
       }         
                
    }//GEN-LAST:event_jb_BuscarActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
                                             
         if (jt_idTratamiento.getText()!=null){
             
            String codigo=jt_codTratamiento.getText();
            int tipo=jcbx_tipo.getSelectedIndex();
            String descripcion=jta_descripcion.getText();
            double importe=Double.parseDouble(jt_importe.getText());
            boolean activo=jcb_Activo.isSelected();
            
            
             Tratamiento tratamiento=new Tratamiento(codigo, tipo, descripcion, importe, activo );
             tratamientoData.actualizarTratamiento(tratamiento);
          }   
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BorrarActionPerformed
       int id=Integer.parseInt(jt_idTratamiento.getText());
        tratamientoData.borrarTratamiento(id);
    }//GEN-LAST:event_jb_BorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Borrar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_limpiar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JCheckBox jcb_Activo;
    private javax.swing.JComboBox<String> jcbx_tipo;
    private javax.swing.JLabel jl_activo;
    private javax.swing.JLabel jl_codTratamiento;
    private javax.swing.JLabel jl_descripcion;
    private javax.swing.JLabel jl_idTratamiento;
    private javax.swing.JLabel jl_importe;
    private javax.swing.JLabel jl_tipo;
    private javax.swing.JLabel jl_tratamiento;
    private javax.swing.JPanel jp_Tratamiento;
    private javax.swing.JScrollPane jsp_Descripcion;
    private javax.swing.JTextField jt_codTratamiento;
    private javax.swing.JTextField jt_idTratamiento;
    private javax.swing.JTextField jt_importe;
    private javax.swing.JTextArea jta_descripcion;
    // End of variables declaration//GEN-END:variables
}

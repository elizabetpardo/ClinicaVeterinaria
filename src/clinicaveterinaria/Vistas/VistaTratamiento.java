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
import javax.swing.JOptionPane;
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        jb_Buscar = new javax.swing.JButton();
        jb_Borrar = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jl_tratamiento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_tratamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_tratamiento.setText("TRATAMIENTO");
        jl_tratamiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jp_Tratamiento.setBackground(new java.awt.Color(255, 255, 255));
        jp_Tratamiento.setLayout(new java.awt.GridBagLayout());

        jl_idTratamiento.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 10, 0, 0);
        jp_Tratamiento.add(jl_idTratamiento, gridBagConstraints);

        jt_idTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_idTratamientoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 43, 0, 0);
        jp_Tratamiento.add(jt_idTratamiento, gridBagConstraints);

        jl_codTratamiento.setText("CODIGO ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 10, 0, 0);
        jp_Tratamiento.add(jl_codTratamiento, gridBagConstraints);

        jt_codTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_codTratamientoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 43, 0, 0);
        jp_Tratamiento.add(jt_codTratamiento, gridBagConstraints);

        jl_tipo.setText("TIPO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 10, 0, 0);
        jp_Tratamiento.add(jl_tipo, gridBagConstraints);

        jcbx_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VACUNACIÓN", "ENFERMEDAD", "CURACIONES", "BAÑO Y CORTE DE PELO", "CASTRACIÓN", "OTROS" }));
        jcbx_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_tipoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 43, 0, 0);
        jp_Tratamiento.add(jcbx_tipo, gridBagConstraints);

        jl_descripcion.setText("DESCRIPCIÓN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jp_Tratamiento.add(jl_descripcion, gridBagConstraints);

        jl_importe.setText("IMPORTE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 0, 0);
        jp_Tratamiento.add(jl_importe, gridBagConstraints);

        jt_importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_importeKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 142;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 42, 0, 0);
        jp_Tratamiento.add(jt_importe, gridBagConstraints);

        jl_activo.setText("ACTIVO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jp_Tratamiento.add(jl_activo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 42, 0, 0);
        jp_Tratamiento.add(jcb_Activo, gridBagConstraints);

        jta_descripcion.setColumns(20);
        jta_descripcion.setRows(5);
        jsp_Descripcion.setViewportView(jta_descripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 277;
        gridBagConstraints.ipady = 124;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 42, 0, 0);
        jp_Tratamiento.add(jsp_Descripcion, gridBagConstraints);

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 46, 0, 10);
        jp_Tratamiento.add(jb_Buscar, gridBagConstraints);

        jb_Borrar.setText("Borrar");
        jb_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 46, 0, 10);
        jp_Tratamiento.add(jb_Borrar, gridBagConstraints);

        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 46, 0, 10);
        jp_Tratamiento.add(jb_modificar, gridBagConstraints);

        jb_limpiar.setText("Limpiar");
        jb_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 52, 11, 0);
        jp_Tratamiento.add(jb_limpiar, gridBagConstraints);

        jb_cancelar.setText("Cancelar");
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 23, 11, 0);
        jp_Tratamiento.add(jb_cancelar, gridBagConstraints);

        jb_guardar.setText("Guardar");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 10, 11, 0);
        jp_Tratamiento.add(jb_guardar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jp_Tratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addComponent(jl_tratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_tratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Tratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
     dispose();
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
       jt_idTratamiento.setEnabled(true);
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
        jt_idTratamiento.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Guardado exitoso.");
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
      if(!jt_idTratamiento.getText().equals("")){
        int id=Integer.parseInt(jt_idTratamiento.getText());
        Tratamiento tratamiento= tratamientoData.buscarTratamiento(id);
        if(tratamiento!=null){
                jt_idTratamiento.setText(tratamiento.getId_tratamiento()+"");
                jt_codTratamiento.setText(tratamiento.getCod_tratamiento());
                jcbx_tipo.setSelectedIndex(tratamiento.getTipo()); 
                jta_descripcion.setText(tratamiento.getDescripcion());
                jt_importe.setText(Double.toString(tratamiento.getImporte()));
                jcb_Activo.setSelected(tratamiento.getActivo());
                jt_idTratamiento.setEnabled(false);
       }
       else{
            JOptionPane.showMessageDialog(null, "No existe tratamiento con el ID ingresado.");    
            jt_idTratamiento.setText("");
            }
            
        }   
        else
            JOptionPane.showMessageDialog(null, "Ingrese el ID del tratamiento.");
                
    }//GEN-LAST:event_jb_BuscarActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
                                             
         if (jt_idTratamiento.getText()!=null){
             
            String codigo=jt_codTratamiento.getText();
            int tipo=jcbx_tipo.getSelectedIndex();
            String descripcion=jta_descripcion.getText();
            double importe=Double.parseDouble(jt_importe.getText());
            boolean activo=jcb_Activo.isSelected();
            
            
             Tratamiento tratamiento=new Tratamiento(Integer.parseInt(jt_idTratamiento.getText()),codigo, tipo, descripcion, importe, activo );
             tratamientoData.actualizarTratamiento(tratamiento);
             JOptionPane.showMessageDialog(null, "Actualizacion exitosa.");
          }   
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BorrarActionPerformed
        int id=Integer.parseInt(jt_idTratamiento.getText());
        
        int resp = JOptionPane.showConfirmDialog(null, "Tambien se eliminaran las VISITAS relacionados a este Tratamiento. ¿Está seguro?");
        if(resp == 0){
        
            if(tratamientoData.buscarTratamiento(id) != null){
            tratamientoData.borrarTratamiento(id);
            JOptionPane.showMessageDialog(null, "Borrado exitoso.");
            jb_limpiarActionPerformed(evt);
        }
        else
            JOptionPane.showMessageDialog(null, "El tratamiento no existe.");
        }      
    }//GEN-LAST:event_jb_BorrarActionPerformed

    private void jcbx_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbx_tipoActionPerformed

    private void jt_idTratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_idTratamientoKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo digitos."); 
               
          }
    }//GEN-LAST:event_jt_idTratamientoKeyTyped

    private void jt_codTratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_codTratamientoKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && !Character.isLetter(c) && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Se aceptan solos digitos y letras consecutivas."); 
               
          }
    }//GEN-LAST:event_jt_codTratamientoKeyTyped

    private void jt_importeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_importeKeyTyped
        char c=evt.getKeyChar(); 
        
       
        
          if(!Character.isDigit(c) && (c!='.' || jt_importe.getText().contains(".")) && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo numeros decimales."); 
               
          }
    }//GEN-LAST:event_jt_importeKeyTyped


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

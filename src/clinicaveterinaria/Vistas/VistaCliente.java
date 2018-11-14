/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.vistas;

import clinicaveterinaria.Modelo.Cliente;
import clinicaveterinaria.Modelo.ClienteData;
import clinicaveterinaria.Modelo.Conexion;
import clinicaveterinaria.Modelo.Mascota;
import clinicaveterinaria.Modelo.MascotaData;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author elinote
 */
public class VistaCliente extends javax.swing.JInternalFrame {
 private ClienteData clienteData;
 private MascotaData mascotaData;
 private Conexion conexion;
    /**
     * Creates new form Cliente
     */
    public VistaCliente() {
        initComponents();
          try {
        conexion = new Conexion("jdbc:mysql://localhost/clinicaveterinaria", "root", "");
        clienteData = new ClienteData(conexion);
        mascotaData = new MascotaData(conexion);

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
         
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jp_cliente = new javax.swing.JPanel();
        j_idCliente = new javax.swing.JTextField();
        jl_id = new javax.swing.JLabel();
        jt_dni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jt_apellido = new javax.swing.JTextField();
        jl_nombre = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jl_direccion = new javax.swing.JLabel();
        jt_direccion = new javax.swing.JTextField();
        jl_telefono = new javax.swing.JLabel();
        jt_telefono = new javax.swing.JTextField();
        jl_personaAlt = new javax.swing.JLabel();
        jt_personaAlternativa = new javax.swing.JTextField();
        jl_dni = new javax.swing.JLabel();
        jb_guardarCliente = new javax.swing.JButton();
        jb_limpiarCliente = new javax.swing.JButton();
        jb_cancelarCliente = new javax.swing.JButton();
        jb_buscarCliente = new javax.swing.JButton();
        jb_borrarCliente = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jp_cliente.setBackground(new java.awt.Color(255, 255, 255));
        jp_cliente.setName(""); // NOI18N
        jp_cliente.setLayout(new java.awt.GridBagLayout());

        j_idCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j_idClienteKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 43, 0, 0);
        jp_cliente.add(j_idCliente, gridBagConstraints);

        jl_id.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 68, 0, 0);
        jp_cliente.add(jl_id, gridBagConstraints);

        jt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_dniActionPerformed(evt);
            }
        });
        jt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_dniKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 43, 0, 0);
        jp_cliente.add(jt_dni, gridBagConstraints);

        jLabel1.setText("APELLIDO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 68, 0, 0);
        jp_cliente.add(jLabel1, gridBagConstraints);

        jt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_apellidoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 43, 0, 0);
        jp_cliente.add(jt_apellido, gridBagConstraints);

        jl_nombre.setText("NOMBRE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 68, 0, 0);
        jp_cliente.add(jl_nombre, gridBagConstraints);

        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_nombreKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 43, 0, 0);
        jp_cliente.add(jt_nombre, gridBagConstraints);

        jl_direccion.setText("DIRECCION");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 68, 0, 0);
        jp_cliente.add(jl_direccion, gridBagConstraints);

        jt_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_direccionKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 43, 0, 0);
        jp_cliente.add(jt_direccion, gridBagConstraints);

        jl_telefono.setText("TELEFONO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 68, 0, 0);
        jp_cliente.add(jl_telefono, gridBagConstraints);

        jt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_telefonoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 43, 0, 0);
        jp_cliente.add(jt_telefono, gridBagConstraints);

        jl_personaAlt.setText("PERSONA ALTERNATIVA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 68, 0, 0);
        jp_cliente.add(jl_personaAlt, gridBagConstraints);

        jt_personaAlternativa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_personaAlternativaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 19;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 138;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 43, 0, 0);
        jp_cliente.add(jt_personaAlternativa, gridBagConstraints);

        jl_dni.setText("DNI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 68, 0, 0);
        jp_cliente.add(jl_dni, gridBagConstraints);

        jb_guardarCliente.setText("Guardar");
        jb_guardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 77, 28, 0);
        jp_cliente.add(jb_guardarCliente, gridBagConstraints);

        jb_limpiarCliente.setText("Limpiar");
        jb_limpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 18, 28, 0);
        jp_cliente.add(jb_limpiarCliente, gridBagConstraints);

        jb_cancelarCliente.setText("Cancelar");
        jb_cancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 20;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 18, 28, 0);
        jp_cliente.add(jb_cancelarCliente, gridBagConstraints);

        jb_buscarCliente.setText("Buscar");
        jb_buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 44;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 23, 0, 85);
        jp_cliente.add(jb_buscarCliente, gridBagConstraints);

        jb_borrarCliente.setText("Borrar");
        jb_borrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 44;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 21, 0, 85);
        jp_cliente.add(jb_borrarCliente, gridBagConstraints);

        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 44;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 21, 0, 85);
        jp_cliente.add(jb_modificar, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLIENTE");
        jLabel2.setFocusable(false);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(238, 238, 238))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jp_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarClienteActionPerformed
      
        int dni=Integer.parseInt(jt_dni.getText().trim());
        String apellido=jt_apellido.getText();
        String nombre=jt_nombre.getText();
        String direccion=jt_direccion.getText();
        String telefono=jt_telefono.getText();
        String personaAlternativa=jt_personaAlternativa.getText();
         
        Cliente cliente= new Cliente(dni,apellido,nombre,direccion,telefono,personaAlternativa);
        clienteData.guardarCliente(cliente);       
        j_idCliente.setText(cliente.getId_cliente()+"");
        j_idCliente.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Guardado exitoso.");
        
    }//GEN-LAST:event_jb_guardarClienteActionPerformed

    private void jb_limpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarClienteActionPerformed
     j_idCliente.setEnabled(true);
     j_idCliente.setText(""); 
     jt_dni.setText("");
     jt_apellido.setText("");
     jt_nombre.setText("");
     jt_direccion.setText("");
     jt_telefono.setText("");
     jt_personaAlternativa.setText("");
    }//GEN-LAST:event_jb_limpiarClienteActionPerformed

    private void jb_cancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarClienteActionPerformed
     dispose();
    }//GEN-LAST:event_jb_cancelarClienteActionPerformed

    private void jt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_dniActionPerformed

    private void jb_buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarClienteActionPerformed
        if(!j_idCliente.getText().equals("")){
        int id=Integer.parseInt(j_idCliente.getText());
        Cliente cliente=clienteData.buscarCliente(id);
        if(cliente!=null){
                j_idCliente.setText(cliente.getId_cliente()+"");
                jt_dni.setText(Integer.toString(cliente.getDni()));
                jt_apellido.setText(cliente.getApellido());
                jt_nombre.setText(cliente.getNombre());
                jt_direccion.setText(cliente.getDireccion());
                jt_telefono.setText(cliente.getTelefono());
                jt_personaAlternativa.setText(cliente.getPersona_alternativa());
                j_idCliente.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "No existe cliente con el ID ingresado.");    
            j_idCliente.setText("");
            }
            
        }   
        else
            JOptionPane.showMessageDialog(null, "Ingrese el ID del cliente.");
            
    }//GEN-LAST:event_jb_buscarClienteActionPerformed

    private void jb_borrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarClienteActionPerformed
    int id_cliente=Integer.parseInt(j_idCliente.getText());
    
    int resp = JOptionPane.showConfirmDialog(null, "Tambien se eliminaran las MASCOTAS de este cliente. ¿Está seguro?");
    if(resp == 0){
        List<Mascota> mascotas = new ArrayList<>();
        if(clienteData.buscarCliente(id_cliente) != null){
            mascotas= mascotaData.MascotasPorCliente(id_cliente);
            
            int a = mascotas.size();
            for(int i=0; i<a ;i++){
                mascotaData.borrarMascota(mascotas.get(i).getId_mascota());
            }
        
            clienteData.borrarCliente(id_cliente);
            JOptionPane.showMessageDialog(null, "Borrado exitoso.");
            jb_limpiarClienteActionPerformed(evt);
        }
        else
            JOptionPane.showMessageDialog(null, "El cliente no existe.");
    }
    }//GEN-LAST:event_jb_borrarClienteActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
         
             
            int dni=Integer.parseInt(jt_dni.getText().trim());
            String apellido=jt_apellido.getText();
            String nombre=jt_nombre.getText();
            String direccion=jt_direccion.getText();
            String telefono=jt_telefono.getText();
            String personaAlternativa=jt_personaAlternativa.getText();
            
            

             Cliente cliente=new Cliente(Integer.parseInt(j_idCliente.getText()),dni,apellido,nombre,direccion,telefono,personaAlternativa);
             clienteData.actualizarCliente(cliente);
             JOptionPane.showMessageDialog(null, "Actualizacion exitosa.");
    
        
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void j_idClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_idClienteKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo digitos."); 
               
          }
    }//GEN-LAST:event_j_idClienteKeyTyped

    private void jt_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_dniKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo digitos."); 
               
          }
    }//GEN-LAST:event_jt_dniKeyTyped

    private void jt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_apellidoKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isLetter(c) && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras."); 
               
          }
    }//GEN-LAST:event_jt_apellidoKeyTyped

    private void jt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombreKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isLetter(c) && c!='\u0008') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras."); 
               
          }
    }//GEN-LAST:event_jt_nombreKeyTyped

    private void jt_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_direccionKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && !Character.isLetter(c) && c!='\u0008' && c!='\u0020') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo digitos y letras."); 
               
          }
    }//GEN-LAST:event_jt_direccionKeyTyped

    private void jt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_telefonoKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c) && c!='\u0008' && c!='\u002D') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo digitos."); 
               
          }
    }//GEN-LAST:event_jt_telefonoKeyTyped

    private void jt_personaAlternativaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_personaAlternativaKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isLetter(c) && c!='\u0008' && c!='\u0020') {
              
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(null, "Ingrese solo letras."); 
               
          }
    }//GEN-LAST:event_jt_personaAlternativaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField j_idCliente;
    private javax.swing.JButton jb_borrarCliente;
    private javax.swing.JButton jb_buscarCliente;
    private javax.swing.JButton jb_cancelarCliente;
    private javax.swing.JButton jb_guardarCliente;
    private javax.swing.JButton jb_limpiarCliente;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JLabel jl_direccion;
    private javax.swing.JLabel jl_dni;
    private javax.swing.JLabel jl_id;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_personaAlt;
    private javax.swing.JLabel jl_telefono;
    private javax.swing.JPanel jp_cliente;
    private javax.swing.JTextField jt_apellido;
    private javax.swing.JTextField jt_direccion;
    private javax.swing.JTextField jt_dni;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_personaAlternativa;
    private javax.swing.JTextField jt_telefono;
    // End of variables declaration//GEN-END:variables
}

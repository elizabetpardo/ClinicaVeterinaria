/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.vistas;

import java.beans.PropertyVetoException;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public VistaPrincipal() {
        initComponents();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jm_Clinica = new javax.swing.JMenuBar();
        jm_P_Archivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jm_P_Clientes = new javax.swing.JMenu();
        jmi_P_RegistrarCliente = new javax.swing.JMenuItem();
        jm_P_Mascotas = new javax.swing.JMenu();
        jmi_formuarioMascota = new javax.swing.JMenuItem();
        jmi_mascotasXcliente = new javax.swing.JMenuItem();
        jm_P_Tratamientos = new javax.swing.JMenu();
        jmi_Principal_ListadoMascota = new javax.swing.JMenuItem();
        jmi_listadoTratamientosActivos = new javax.swing.JMenuItem();
        jmi_fomularioTratamiento = new javax.swing.JMenuItem();
        jm_P_Visitas = new javax.swing.JMenu();
        jmi_visitasMascota = new javax.swing.JMenuItem();
        jmi_visistasxtratamiento = new javax.swing.JMenuItem();
        jmi_formularioVisitas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        escritorio.setBackground(new java.awt.Color(51, 255, 255));

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jm_Clinica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clinica Veterinaria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jm_Clinica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jm_P_Archivo.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jm_P_Archivo.add(jMenuItem1);

        jm_Clinica.add(jm_P_Archivo);

        jm_P_Clientes.setText("Clientes");

        jmi_P_RegistrarCliente.setText("Formulario de cliente");
        jmi_P_RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_P_RegistrarClienteActionPerformed(evt);
            }
        });
        jm_P_Clientes.add(jmi_P_RegistrarCliente);

        jm_Clinica.add(jm_P_Clientes);

        jm_P_Mascotas.setText("Mascotas");

        jmi_formuarioMascota.setText("Formulario de mascota");
        jmi_formuarioMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_formuarioMascotaActionPerformed(evt);
            }
        });
        jm_P_Mascotas.add(jmi_formuarioMascota);

        jmi_mascotasXcliente.setText("Mascotas por cliente");
        jmi_mascotasXcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_mascotasXclienteActionPerformed(evt);
            }
        });
        jm_P_Mascotas.add(jmi_mascotasXcliente);

        jm_Clinica.add(jm_P_Mascotas);

        jm_P_Tratamientos.setText("Tratamientos");

        jmi_Principal_ListadoMascota.setText("Listado de mascotas por tratamiento");
        jmi_Principal_ListadoMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Principal_ListadoMascotaActionPerformed(evt);
            }
        });
        jm_P_Tratamientos.add(jmi_Principal_ListadoMascota);

        jmi_listadoTratamientosActivos.setText("Listado Tratamientos Activos");
        jmi_listadoTratamientosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listadoTratamientosActivosActionPerformed(evt);
            }
        });
        jm_P_Tratamientos.add(jmi_listadoTratamientosActivos);

        jmi_fomularioTratamiento.setText("Formulario de tratamiento");
        jmi_fomularioTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_fomularioTratamientoActionPerformed(evt);
            }
        });
        jm_P_Tratamientos.add(jmi_fomularioTratamiento);

        jm_Clinica.add(jm_P_Tratamientos);

        jm_P_Visitas.setText(" Visitas de Atención");

        jmi_visitasMascota.setText("Visitas por Mascota");
        jmi_visitasMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_visitasMascotaActionPerformed(evt);
            }
        });
        jm_P_Visitas.add(jmi_visitasMascota);

        jmi_visistasxtratamiento.setText("Visitas por Tratamiento");
        jmi_visistasxtratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_visistasxtratamientoActionPerformed(evt);
            }
        });
        jm_P_Visitas.add(jmi_visistasxtratamiento);

        jmi_formularioVisitas.setText("Formulario de Visitas de atención");
        jmi_formularioVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_formularioVisitasActionPerformed(evt);
            }
        });
        jm_P_Visitas.add(jmi_formularioVisitas);

        jm_Clinica.add(jm_P_Visitas);

        setJMenuBar(jm_Clinica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
System.exit(0);           // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmi_P_RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_P_RegistrarClienteActionPerformed
escritorio.removeAll();
escritorio.repaint();
VistaCliente vm= new VistaCliente();
vm.setVisible(true);
escritorio.add(vm);
escritorio.moveToFront(vm);  
try {
      vm.setMaximum(true);

   } catch(PropertyVetoException e) {} 

    }//GEN-LAST:event_jmi_P_RegistrarClienteActionPerformed

    private void jmi_Principal_ListadoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Principal_ListadoMascotaActionPerformed
escritorio.removeAll();
escritorio.repaint();
ListadoMascotaxTratamiento vm= new ListadoMascotaxTratamiento();
vm.setVisible(true);
escritorio.add(vm);
escritorio.moveToFront(vm);   
 try {
      vm.setMaximum(true);

   } catch(PropertyVetoException e) {} 

    }//GEN-LAST:event_jmi_Principal_ListadoMascotaActionPerformed

    private void jmi_formuarioMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_formuarioMascotaActionPerformed
      escritorio.removeAll();
      escritorio.repaint();
      VistaMascota vm= new VistaMascota();
      vm.setVisible(true);
      escritorio.add(vm);
      escritorio.moveToFront(vm); 
      try {
      vm.setMaximum(true);

   } catch(PropertyVetoException e) {} 

    }//GEN-LAST:event_jmi_formuarioMascotaActionPerformed

    private void jmi_visitasMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_visitasMascotaActionPerformed
      escritorio.removeAll();
      escritorio.repaint();
      VistaVisitas vm= new VistaVisitas();
      vm.setVisible(true);
      escritorio.add(vm);
      escritorio.moveToFront(vm);
       try {
      vm.setMaximum(true);

   } catch(PropertyVetoException e) {} 

    }//GEN-LAST:event_jmi_visitasMascotaActionPerformed

    private void jmi_fomularioTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_fomularioTratamientoActionPerformed
      escritorio.removeAll();
      escritorio.repaint();
      VistaTratamiento vm= new VistaTratamiento();
      vm.setVisible(true);
      escritorio.add(vm);
      escritorio.moveToFront(vm);
       try {
      vm.setMaximum(true);

   } catch(PropertyVetoException e) {} 

    }//GEN-LAST:event_jmi_fomularioTratamientoActionPerformed

    private void jmi_mascotasXclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_mascotasXclienteActionPerformed
      escritorio.removeAll();
      escritorio.repaint();
      VistaMascotasxCliente vm= new VistaMascotasxCliente();
      vm.setVisible(true);
      escritorio.add(vm);
      escritorio.moveToFront(vm);
       try {
      vm.setMaximum(true);

   } catch(PropertyVetoException e) {} 

    }//GEN-LAST:event_jmi_mascotasXclienteActionPerformed

    private void jmi_formularioVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_formularioVisitasActionPerformed
      escritorio.removeAll();
      escritorio.repaint();
      VistaVisitaDeAtencion vm= new VistaVisitaDeAtencion();
      vm.setVisible(true);
      escritorio.add(vm);
      escritorio.moveToFront(vm);
       try {
      vm.setMaximum(true);

   } catch(PropertyVetoException e) {} 

    }//GEN-LAST:event_jmi_formularioVisitasActionPerformed

    private void jmi_listadoTratamientosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listadoTratamientosActivosActionPerformed
       escritorio.removeAll();
      escritorio.repaint();
      ListadoTratamientosActivos lta= new ListadoTratamientosActivos();
      lta.setVisible(true);
      escritorio.add(lta);
      escritorio.moveToFront(lta); 
       try {
      lta.setMaximum(true);

   } catch(PropertyVetoException e) {} 

    }//GEN-LAST:event_jmi_listadoTratamientosActivosActionPerformed

    private void jmi_visistasxtratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_visistasxtratamientoActionPerformed
      escritorio.removeAll();
      escritorio.repaint();
      ListadoVisitasxTratamiento lvt= new ListadoVisitasxTratamiento();
      lvt.setVisible(true);
      escritorio.add(lvt);
      escritorio.moveToFront(lvt); 
       try {
      lvt.setMaximum(true);

   } catch(PropertyVetoException e) {} 

    }//GEN-LAST:event_jmi_visistasxtratamientoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VistaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar jm_Clinica;
    private javax.swing.JMenu jm_P_Archivo;
    private javax.swing.JMenu jm_P_Clientes;
    private javax.swing.JMenu jm_P_Mascotas;
    private javax.swing.JMenu jm_P_Tratamientos;
    private javax.swing.JMenu jm_P_Visitas;
    private javax.swing.JMenuItem jmi_P_RegistrarCliente;
    private javax.swing.JMenuItem jmi_Principal_ListadoMascota;
    private javax.swing.JMenuItem jmi_fomularioTratamiento;
    private javax.swing.JMenuItem jmi_formuarioMascota;
    private javax.swing.JMenuItem jmi_formularioVisitas;
    private javax.swing.JMenuItem jmi_listadoTratamientosActivos;
    private javax.swing.JMenuItem jmi_mascotasXcliente;
    private javax.swing.JMenuItem jmi_visistasxtratamiento;
    private javax.swing.JMenuItem jmi_visitasMascota;
    // End of variables declaration//GEN-END:variables
}

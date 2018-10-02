/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Vistas;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jm_Clinica = new javax.swing.JMenuBar();
        jm_P_Archivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jm_P_Clientes = new javax.swing.JMenu();
        jmi_P_RegistrarCliente = new javax.swing.JMenuItem();
        jm_P_Mascotas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jm_P_Tratamientos = new javax.swing.JMenu();
        jmi_Principal_ListadoMascota = new javax.swing.JMenuItem();
        jm_P_Visitas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        escritorio.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jm_Clinica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clinica Veterinaria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

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

        jmi_P_RegistrarCliente.setText("Registrar Cliente");
        jmi_P_RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_P_RegistrarClienteActionPerformed(evt);
            }
        });
        jm_P_Clientes.add(jmi_P_RegistrarCliente);

        jm_Clinica.add(jm_P_Clientes);

        jm_P_Mascotas.setText("Mascotas");

        jMenuItem2.setText("jMenuItem2");
        jm_P_Mascotas.add(jMenuItem2);

        jm_Clinica.add(jm_P_Mascotas);

        jm_P_Tratamientos.setText("Tratamientos");

        jmi_Principal_ListadoMascota.setText("Listado de mascotas");
        jmi_Principal_ListadoMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_Principal_ListadoMascotaActionPerformed(evt);
            }
        });
        jm_P_Tratamientos.add(jmi_Principal_ListadoMascota);

        jm_Clinica.add(jm_P_Tratamientos);

        jm_P_Visitas.setText("visitas");
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
Cliente vm= new Cliente();
vm.setVisible(true);
escritorio.add(vm);
escritorio.moveToFront(vm);        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_P_RegistrarClienteActionPerformed

    private void jmi_Principal_ListadoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_Principal_ListadoMascotaActionPerformed
escritorio.removeAll();
escritorio.repaint();
ListadoMascotaxTratamiento vm= new ListadoMascotaxTratamiento();
vm.setVisible(true);
escritorio.add(vm);
escritorio.moveToFront(vm);    // TODO add your handling code here:
    }//GEN-LAST:event_jmi_Principal_ListadoMascotaActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar jm_Clinica;
    private javax.swing.JMenu jm_P_Archivo;
    private javax.swing.JMenu jm_P_Clientes;
    private javax.swing.JMenu jm_P_Mascotas;
    private javax.swing.JMenu jm_P_Tratamientos;
    private javax.swing.JMenu jm_P_Visitas;
    private javax.swing.JMenuItem jmi_P_RegistrarCliente;
    private javax.swing.JMenuItem jmi_Principal_ListadoMascota;
    // End of variables declaration//GEN-END:variables
}

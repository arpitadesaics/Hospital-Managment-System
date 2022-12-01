/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemAdmin;

import login.homePage;
import model.cityArrayList;
import model.communityArrayList;
import model.doctorArrayList;
import model.encounterArrayList;
import model.hospitalArrayList;
import model.houseArrayList;
import model.patientArrayList;
import model.system;
import model.vitalsignsArrayList;

/**
 *
 * @author DELL
 */
public class systemAdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    patientArrayList p;
    doctorArrayList d;
    hospitalArrayList h;
    cityArrayList c;
    houseArrayList ho;
    communityArrayList co;
    encounterArrayList e;
    vitalsignsArrayList vs;
    public systemAdminPanel(patientArrayList p,doctorArrayList d,hospitalArrayList h,cityArrayList c,communityArrayList co,houseArrayList ho,encounterArrayList e,vitalsignsArrayList vs) {
        initComponents();
     
        this.h = h;
        this.p =  p;
        this.d = d;
        this.c=c;
        this.co=co;
        this.ho=ho;
        this.e=e;
        this.vs=vs;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        patient = new javax.swing.JButton();
        doctor = new javax.swing.JButton();
        hospital = new javax.swing.JButton();
        encounter = new javax.swing.JButton();
        encounter1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patient.setText("Patient");
        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });

        doctor.setText("Doctor");
        doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorActionPerformed(evt);
            }
        });

        hospital.setText("Hospital");
        hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalActionPerformed(evt);
            }
        });

        encounter.setText("Encounter");
        encounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterActionPerformed(evt);
            }
        });

        encounter1.setText("Home");
        encounter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounter1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(encounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(encounter1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(hospital)
                .addGap(34, 34, 34)
                .addComponent(doctor)
                .addGap(36, 36, 36)
                .addComponent(patient)
                .addGap(34, 34, 34)
                .addComponent(encounter)
                .addGap(34, 34, 34)
                .addComponent(encounter1)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(splitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        // TODO add your handling code here:
        
        patientSysAdmin psa = new patientSysAdmin(p,c,co,ho);
        splitPane.setRightComponent(psa);
    }//GEN-LAST:event_patientActionPerformed

    private void doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorActionPerformed
        // TODO add your handling code here:
        doctorSysAdmin dsa = new doctorSysAdmin(d,h,c,co,ho);
        splitPane.setRightComponent(dsa);
    }//GEN-LAST:event_doctorActionPerformed

    private void hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalActionPerformed
        // TODO add your handling code here:
        hospitalSysAdmin hsa = new hospitalSysAdmin(h,c,co,ho);
        splitPane.setRightComponent(hsa);
    }//GEN-LAST:event_hospitalActionPerformed

    private void encounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterActionPerformed
        // TODO add your handling code here:
        encounterSysAdmin esa = new encounterSysAdmin(p,d,h,e);
        splitPane.setRightComponent(esa);
    }//GEN-LAST:event_encounterActionPerformed

    private void encounter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounter1ActionPerformed
        // TODO add your handling code here:
        homePage hframe = new homePage(p,d,h,c,co,ho,e,vs);
            hframe.setVisible(true);
            this.setVisible(false);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
            
            
    }//GEN-LAST:event_encounter1ActionPerformed

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
            java.util.logging.Logger.getLogger(systemAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(systemAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(systemAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(systemAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new systemAdminPanel().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doctor;
    private javax.swing.JButton encounter;
    private javax.swing.JButton encounter1;
    private javax.swing.JButton hospital;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton patient;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables

}
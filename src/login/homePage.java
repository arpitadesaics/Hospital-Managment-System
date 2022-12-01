/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import doctor.doctorPanel;
import patient.patientPanel;
import communityAdmin.communityAdminPanel;
import hospitalAdmin.hospitalAdminPanel;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Patient;
import model.cityArrayList;
import model.communityArrayList;
import model.doctorArrayList;
import model.encounterArrayList;
import model.hospitalArrayList;
import model.houseArrayList;
import model.patientArrayList;
import model.system;
import model.vitalsignsArrayList;
import systemAdmin.systemAdminPanel;

/**
 *
 * @author DELL
 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage1
     */
    patientArrayList p;
    doctorArrayList d;
    hospitalArrayList h;
    cityArrayList c;
    communityArrayList co;
    houseArrayList ho;
    encounterArrayList e;
    vitalsignsArrayList vs;
    public homePage(patientArrayList p,doctorArrayList d,hospitalArrayList h,cityArrayList c,communityArrayList co,houseArrayList ho, encounterArrayList e,vitalsignsArrayList vs) {
        initComponents();
        this.p=p;
        this.h=h;
        this.d=d;
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

        choice = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        password = new java.awt.TextField();
        username = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JComboBox<>();
        submit = new java.awt.Button();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel3.setText("User Role");

        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "System Admin", "Hospital Admin", "Community Admin", "Patient", "Doctor", " " }));

        submit.setLabel("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choiceLayout = new javax.swing.GroupLayout(choice);
        choice.setLayout(choiceLayout);
        choiceLayout.setHorizontalGroup(
            choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choiceLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(choiceLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user, 0, 191, Short.MAX_VALUE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        choiceLayout.setVerticalGroup(
            choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choiceLayout.createSequentialGroup()
                .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(choiceLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choiceLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        label1.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        label1.setText("Hospital Managment System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(482, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        String usern = username.getText();
        String pass = password.getText();
        String role = (String)user.getSelectedItem();
        
        if(usern.equals("system") && pass.equals("root") && role.equals("System Admin"))
        {
            JOptionPane.showMessageDialog(null," System Admin Login Successful");
            systemAdminPanel sapframe = new systemAdminPanel(p,d,h,c,co,ho,e,vs);
            sapframe.setVisible(true);
            this.setVisible(false);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
        }
        else if(usern.equals("community") && pass.equals("root") && role.equals("Community Admin"))
        {
            communityAdminPanel capframe = new communityAdminPanel(p,d,h,c,co,ho,e,vs);
            capframe.setVisible(true);
            this.setVisible(false);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
            
        }
                          
        else if(usern.equals("hospital") && pass.equals("root") && role.equals("Hospital Admin"))
        {
            hospitalAdminPanel hapframe = new hospitalAdminPanel(p,d,h,c,co,ho,e,vs);
            hapframe.setVisible(true);
            this.setVisible(false);
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.dispose();
            
        }
        else if(role.equals("Doctor"))
        {
            for(Doctor ep2: d.getD())
            {
                if(usern.equals(ep2.getUsername()) && pass.equals(ep2.getPassword()))
                {
                    doctorPanel dframe = new doctorPanel(d,h,c,co,ho,e,p,vs);
                    dframe.setVisible(true);
                    this.setVisible(false);
                    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
                    this.dispose();
                    doctorPanel x = new doctorPanel(d,h,c,co,ho,e,p,vs);
                    doctorPanel.display.setText(username.getText());
                    x.setVisible(false);
                }
            }
            
        }
        else if(role.equals("Patient"))
        {
            
            for (Patient ep1:p.getP()){
                if (usern.equals(ep1.getUsername()) && pass.equals(ep1.getPassword())){
                patientPanel pframe = new patientPanel(p,d,h,c,co,ho,e,vs);
                pframe.setVisible(true);
                this.setVisible(false);
                this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
                this.dispose();
                                          
                patientPanel x = new patientPanel(p,d,h,c,co,ho,e,vs);
                patientPanel.display.setText(username.getText());
                x.setVisible(false);
             //JOptionPane.showMessageDialog(this,"Password already exists, please try again");
            }
            }   
            
            
            
        }
        else
            JOptionPane.showMessageDialog(null,"Username or Password or User Role mismatch");
           
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                //new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel choice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.TextField password;
    private java.awt.Button submit;
    private javax.swing.JComboBox<String> user;
    public static java.awt.TextField username;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package doctor;

import javax.swing.JOptionPane;
import model.Doctor;
import model.doctorArrayList;

/**
 *
 * @author DELL
 */
public class Profile extends javax.swing.JPanel {

    /**
     * Creates new form Profile
     */
    doctorArrayList d;
    public Profile(doctorArrayList d) {
        initComponents();
        this.d=d;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titlePatient = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblName4 = new javax.swing.JLabel();
        doctorid = new javax.swing.JTextField();
        lblName5 = new javax.swing.JLabel();
        lblName6 = new javax.swing.JLabel();
        updatewaste = new javax.swing.JButton();
        lblName7 = new javax.swing.JLabel();
        cellphone = new javax.swing.JTextField();
        lblName8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        lblName9 = new javax.swing.JLabel();
        lblName10 = new javax.swing.JLabel();
        lblName11 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        lblName12 = new javax.swing.JLabel();
        lblName13 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        zipcode = new javax.swing.JTextField();
        hcountry = new javax.swing.JTextField();
        hcity = new javax.swing.JTextField();
        hstate = new javax.swing.JTextField();
        hcommunity = new javax.swing.JTextField();
        hresidence = new javax.swing.JTextField();
        hname = new javax.swing.JTextField();

        titlePatient.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        titlePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePatient.setText("Doctor Details");
        titlePatient.setToolTipText("");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name");

        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName1.setText("Age");

        lblName2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName2.setText("Gender");

        lblName3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName3.setText("Hospital Residence");

        lblName4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName4.setText("Hospital City");

        doctorid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoridActionPerformed(evt);
            }
        });

        lblName5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName5.setText("Hospital Community");

        lblName6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName6.setText("Doctor ID");

        updatewaste.setText("Update");
        updatewaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatewasteActionPerformed(evt);
            }
        });

        lblName7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName7.setText("Hospital Name");

        lblName8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName8.setText("Cell Phone");

        lblName9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName9.setText("Username");

        lblName10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName10.setText("Password");

        lblName11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName11.setText("Zipcode");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Male", "Female", "Other" }));

        lblName12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName12.setText("Hospital State");

        lblName13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName13.setText("Hospital Country");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cellphone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblName2)
                        .addGap(136, 136, 136))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblName6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doctorid, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName)
                                    .addComponent(lblName1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)))))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hname, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hcity, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1478, 1478, 1478)
                        .addComponent(updatewaste, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(hstate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hresidence, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(871, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titlePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titlePatient)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName1))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatewaste, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName6))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName9)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName10)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName7)
                            .addComponent(hname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName3)
                            .addComponent(hresidence, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName5)
                            .addComponent(hcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName4)
                            .addComponent(hcity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName12)
                            .addComponent(hstate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName13)
                            .addComponent(hcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName11)
                            .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1333, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctoridActionPerformed

    private void updatewasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatewasteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updatewasteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        Doctor ep = null;
        for (Doctor epp:d.getD()){
            if (username.getText().equals(epp.getUsername())){
                ep = epp;
            }
        }
        d.deleteD(ep);
        int flag =1;
        String s1 = name.getText();
        if(s1.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
            return;
        }
        char[] chars = s1.toCharArray();
        for(char c : chars)
        {
            if(Character.isDigit(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Name field cannot be empty or contain numbers");
                return;
            }
        }

        String ss2 = age.getText();

        if(ss2.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Age field cannot be empty or contain alphabet");
            return;
        }
        char[] chars1 = ss2.toCharArray();
        for(char c : chars1)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Age field cannot be empty or contain alphabet");
                return;
            }
        }
        int s2 = Integer.parseInt(ss2);

        String s3 = (String)gender.getSelectedItem();
        if(s3.equals("select"))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Gender field cannot be empty");
            return;
        }
        String ss4 = doctorid.getText();

        if(ss4.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars3 = ss4.toCharArray();
        for(char c : chars3)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s4 = Integer.parseInt(ss4);
        for (Doctor eppp:d.getD()){
            if (s4 == (eppp.getDoctorId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
            }
        }

        String s5 = username.getText();
        if(s5.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Username field cannot be empty");
            return;
        }
        for (Doctor ep1:d.getD()){
            if (s5.equals(ep1.getUsername())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Username already exists, please try again");
            }
        }

        String s6 = password.getText();
        if(s6.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Password field cannot be empty");
            return;
        }
        for (Doctor ep1:d.getD()){
            if (s6.equals(ep1.getPassword())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Password already exists, please try again");
            }

        }

        String ss7 =  cellphone.getText();

        if(ss7.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
            return;
        }
        if(ss7.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number must be 10 digits");
            return;
        }
        char[] chars5 = ss7.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
                return;
            }
        }

        long s7 = Long.parseLong(ss7);
        for (Doctor epp2:d.getD()){
            if (s7 == (epp2.getCellPhone())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Phone Number already exists, please fill the details again");
            }
        }
        String s8 = (String)hname.getText();
        if(s8.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Hospital Name cannot be empty or have numbers");
            return;
        }
        char[] chars6 = s8.toCharArray();
        for(char c: chars6){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Hospital Name cannot be empty or have numbers");
                return;

            }
        }
        String s9 = (String)hresidence.getText();

        if(s9.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Hospital Residence cannot be empty");
            return;
        }

        String s10 = (String)hcommunity.getText();

        if(s10.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this," Hospital Community cannot be empty or have numbers");
            return;
        }
        char[] chars7 = s10.toCharArray();
        for(char c: chars7){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Hospital Community cannot be empty or have numbers");
                return;

            }
        }
        String s11 = (String)hcity.getText();

        if(s11.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Hospital City cannot be empty or have numbers");
            return;
        }
        char[] chars8 = s11.toCharArray();
        for(char c: chars8){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Hospital City cannot be empty or have numbers");
                return;

            }
        }
        String s12 = (String)hstate.getText();

        if(s12.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Hospital State cannot be empty or have numbers");
            return;
        }
        char[] chars9 = s12.toCharArray();
        for(char c: chars9){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Hospital State cannot be empty or have numbers");
                return;

            }
        }
        String s13 = (String)hcountry.getText();

        if(s13.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Hospital Country cannot be empty or have numbers");
            return;
        }
        char[] chars10 = s13.toCharArray();
        for(char c: chars10){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Hospital Country cannot be empty or have numbers");
                return;

            }
        }
        String ss14 = (String)zipcode.getText();

        if(ss14.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Hospital Zipcode cannot be empty or have alphabets");
            return;
        }
        char[] chars12 = ss14.toCharArray();
        for(char c: chars12){
            if(Character.isAlphabetic(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Hospital Zipcode cannot be empty or have alphabets");
                return;

            }
        }
        long s14 = Long.parseLong(ss14);

        if(flag == 1)
        {
            Doctor pp = d.addNewD();
            pp.setName(s1);
            pp.setAge(s2);
            pp.setGender(s3);
            pp.setDoctorId(s4);
            pp.setUsername(s5);
            pp.setPassword(s6);
            pp.setCellPhone(s7);
            pp.setHospitalName(s8);
            pp.setHospitalResidence(s9);
            pp.setCommunity(s10);
            pp.setCity(s11);
            pp.setState(s12);
            pp.setCountry(s13);
            pp.setZipcode(s14);

            JOptionPane.showMessageDialog(this,"Doctor Profile updated successfully");

         

        }
            
        
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField age;
    public static javax.swing.JTextField cellphone;
    public static javax.swing.JTextField doctorid;
    public static javax.swing.JComboBox<String> gender;
    public static javax.swing.JTextField hcity;
    public static javax.swing.JTextField hcommunity;
    public static javax.swing.JTextField hcountry;
    public static javax.swing.JTextField hname;
    public static javax.swing.JTextField hresidence;
    public static javax.swing.JTextField hstate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName10;
    private javax.swing.JLabel lblName11;
    private javax.swing.JLabel lblName12;
    private javax.swing.JLabel lblName13;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblName5;
    private javax.swing.JLabel lblName6;
    private javax.swing.JLabel lblName7;
    private javax.swing.JLabel lblName8;
    private javax.swing.JLabel lblName9;
    public static javax.swing.JTextField name;
    public static javax.swing.JTextField password;
    private javax.swing.JLabel titlePatient;
    private javax.swing.JButton update;
    private javax.swing.JButton updatewaste;
    public static javax.swing.JTextField username;
    public static javax.swing.JTextField zipcode;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package communityAdmin;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

import model.Community;
import model.cityArrayList;
import model.communityArrayList;
/**
 *
 * @author DELL
 */
public class commCommunityAdmin extends javax.swing.JPanel {

    /**
     * Creates new form commCommunityAdmin
     */
    communityArrayList co;
    cityArrayList c;
    public commCommunityAdmin(communityArrayList co,cityArrayList c) {
        initComponents();
        this.co=co;
        this.c=c;
        populateTable();
        populateCity();
        populateCountry();
        populateState();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titlePatient = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablecomm = new javax.swing.JTable();
        communityid = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        update = new javax.swing.JButton();
        view = new javax.swing.JButton();
        communityname = new javax.swing.JTextField();
        zipcode = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblName5 = new javax.swing.JLabel();
        jjjj = new javax.swing.JLabel();
        city = new javax.swing.JComboBox<>();
        country = new javax.swing.JComboBox<>();
        communitystate = new javax.swing.JComboBox<>();

        titlePatient.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        titlePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePatient.setText("Community Details");
        titlePatient.setToolTipText("");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Community Name");

        tablecomm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community Name", "Community Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablecomm);

        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName1.setText("Community Id");

        lblName2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName2.setText("Zipcode");

        lblName3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName3.setText("City");

        lblName5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName5.setText("Country");

        jjjj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jjjj.setText("State");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblName1)
                            .addComponent(lblName2)
                            .addComponent(lblName3)
                            .addComponent(lblName5)
                            .addComponent(jjjj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(communityname, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(communityid, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(zipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(city, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(country, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(communitystate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(titlePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 183, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titlePatient)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(communityname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(communityid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName1)
                            .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName2)
                            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName3)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jjjj)
                            .addComponent(communitystate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(837, 837, 837))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1376, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
        
        int flag =1;
        String s1 = communityname.getText();
        if(s1.equals("")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Community Name cannot be empty or contain number");
            return;
        }
        
        char[] chars = s1.toCharArray();
        for(char c : chars){
            if (Character.isDigit(c)){
                flag =0;
                JOptionPane.showMessageDialog(this,"Community Name cannot be empty or contain number");
                return;
            }
        }
        
        String ss2 = communityid.getText();
        if(ss2.equals("")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Community Id cannot be empty or contain alphabets");
            return;
        }
        char[] chars1 = ss2.toCharArray();
        for(char c: chars1)
        {
            if(Character.isAlphabetic(c)){
               flag=0;
               JOptionPane.showMessageDialog(this,"Community Id cannot be empty or contain alphabets");
               return;
            }
        }
        int s2 = Integer.parseInt(ss2);
        for (Community cc : co.getCo()){
            
            if(s2 == (cc.getCommunityId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Community Id already exists, please try again");
                return;
            }
            
        }
        
        
        
        String ss3 = zipcode.getText();
        
        if(ss3.equals("")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Zipcode cannot be empty or have alphabets");
            return;
        }
        char[] chars2 = ss3.toCharArray();
        for(char c: chars2){
            if(Character.isAlphabetic(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Zipcode cannot be empty or have alphabets");
                return;
                
            }
        }
        int s3 = Integer.parseInt(ss3);
        
        String s4 = (String)city.getSelectedItem();
        if(s4.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"City Name cannot be empty or contain number");
            return;
        }
        
        char[] chars4 = s4.toCharArray();
        for(char c : chars4){
            if (Character.isDigit(c)){
                flag =0;
                JOptionPane.showMessageDialog(this,"City Name cannot be empty or contain number");
                return;
            }
        }
        
        String s5 = (String)country.getSelectedItem();
        
        if(s5.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Country cannot be empty or have numbers");
            return;
        }
        char[] chars5 = s5.toCharArray();
        for(char c: chars5){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Country cannot be empty or have numbers");
                return;
                
            }
        }
        
       String s6 = (String)communitystate.getSelectedItem();
       
       if(s6.equals("select")){
           flag=0;
           JOptionPane.showMessageDialog(this,"State cannot be empty or have numbers");
            return;
        }
       char[] chars6 = s6.toCharArray();
       for(char c: chars6){
           if(Character.isDigit(c)){
               flag=0;
               JOptionPane.showMessageDialog(this,"State cannot be empty or have numbers");
            return;
               
           }
       }
       
      
       
       if(flag==1){
           
           Community cc = co.addNewCo();
           cc.setCommunityName(s1);
           cc.setCommunityId(s2);
           cc.setZipcode(s3);
           cc.setCityName(s4);
           cc.setCountry(s5);
           cc.setState(s6);
           
           JOptionPane.showMessageDialog(this,"Community Profile created successfully");
           populateTable();
           
       }
       
       communityname.setText("");
       communityid.setText("");
       zipcode.setText("");
       city.setSelectedItem("select");
       country.setSelectedItem("select");
       communitystate.setSelectedItem("select");
       
                                   

          
        
    }//GEN-LAST:event_createActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        int row = tablecomm.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"Please select row to delete");
            return;

        }
        DefaultTableModel model = (DefaultTableModel) tablecomm.getModel();
        Community selectedep = (Community)model.getValueAt(row, 0);
        
        communityname.setText(String.valueOf(selectedep.getCommunityName()));
        communityid.setText(String.valueOf(selectedep.getCommunityId()));
        zipcode.setText(String.valueOf(selectedep.getZipcode()));
        city.setSelectedItem(String.valueOf(selectedep.getCityName()));
        country.setSelectedItem(String.valueOf(selectedep.getCountry()));
        communitystate.setSelectedItem(String.valueOf(selectedep.getState()));
        
    }//GEN-LAST:event_viewActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int row = tablecomm.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"Please select row to delete");
            return;

        }
        DefaultTableModel model = (DefaultTableModel) tablecomm.getModel();
        Community selectedep = (Community)model.getValueAt(row, 0);
        
        co.deletedCo(selectedep);
        int flag =1;
        String s1 = communityname.getText();
        if(s1.equals("")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Community Name cannot be empty or contain number");
            return;
        }
        
        char[] chars = s1.toCharArray();
        for(char c : chars){
            if (Character.isDigit(c)){
                flag =0;
                JOptionPane.showMessageDialog(this,"Community Name cannot be empty or contain number");
                return;
            }
        }
        
        String ss2 = communityid.getText();
        if(ss2.equals("")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Community Id cannot be empty or contain alphabets");
            return;
        }
        char[] chars1 = ss2.toCharArray();
        for(char c: chars1)
        {
            if(Character.isAlphabetic(c)){
               flag=0;
               JOptionPane.showMessageDialog(this,"Community Id cannot be empty or contain alphabets");
               return;
            }
        }
        
                
        int s2 = Integer.parseInt(ss2);
        for (Community cc : co.getCo()){
            
            if(s2 == (cc.getCommunityId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Community Id already exists, please try again");
                return;
            }
            
        }
        
        String ss3 = zipcode.getText();
        
        if(ss3.equals("")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Zipcode cannot be empty or have alphabets");
            return;
        }
        char[] chars2 = ss3.toCharArray();
        for(char c: chars2){
            if(Character.isAlphabetic(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Zipcode cannot be empty or have alphabets");
                return;
                
            }
        }
        long s3 = Long.parseLong(ss3);
        
        String s4 = (String)city.getSelectedItem();
        if(s4.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"City Name cannot be empty or contain number");
            return;
        }
        
        char[] chars4 = s4.toCharArray();
        for(char c : chars4){
            if (Character.isDigit(c)){
                flag =0;
                JOptionPane.showMessageDialog(this,"City Name cannot be empty or contain number");
                return;
            }
        }
        
        String s5 = (String)country.getSelectedItem();        
        if(s5.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Country cannot be empty or contain numbers");
            return;
        }
        char[] chars5 = s5.toCharArray();
        for(char c: chars5){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Country cannot be empty or have numbers");
                return;
                
            }
        }
        
       String s6 = (String)communitystate.getSelectedItem();
       
       if(s6.equals("select")){
           flag=0;
           JOptionPane.showMessageDialog(this,"State cannot be empty or have numbers");
            return;
        }
       char[] chars6 = s6.toCharArray();
       for(char c: chars6){
           if(Character.isDigit(c)){
               flag=0;
               JOptionPane.showMessageDialog(this,"State cannot be empty or have numbers");
            return;
               
           }
       }
       
      
       
       if(flag==1){
           
           Community cc = co.addNewCo();
           cc.setCommunityName(s1);
           cc.setCommunityId(s2);
           cc.setZipcode(s3);
           cc.setCityName(s4);
           cc.setCountry(s5);
           cc.setState(s6);
           
           JOptionPane.showMessageDialog(this,"Community Profile updated successfully");
           populateTable();
           
       }
       
       communityname.setText("");
       communityid.setText("");
       zipcode.setText("");
       city.setSelectedItem("select");
       country.setSelectedItem("select");
       communitystate.setSelectedItem("select");
       
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> city;
    private javax.swing.JTextField communityid;
    private javax.swing.JTextField communityname;
    private javax.swing.JComboBox<String> communitystate;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JButton create;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jjjj;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName5;
    private javax.swing.JTable tablecomm;
    private javax.swing.JLabel titlePatient;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    private javax.swing.JTextField zipcode;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
          DefaultTableModel model = (DefaultTableModel) tablecomm.getModel();
          model.setRowCount(0);
        
        for (Community ep:co.getCo()){
            
            Object[] row = new Object[2];
            row[0] = ep;
            row[1] = ep.getCommunityId();
            
            model.addRow(row);
            
        }
        
    }
private void populateCity(){
     String[] cc = c.cityArray();
     DefaultComboBoxModel c = new DefaultComboBoxModel(cc);
     city.setModel(c);
     
 
}
private void populateCountry(){
     String[] cc = c.countryArray();
     DefaultComboBoxModel c = new DefaultComboBoxModel(cc);
     country.setModel(c);
     
 }
private void populateState(){
     String[] cc = c.stateArray();
     DefaultComboBoxModel c = new DefaultComboBoxModel(cc);
     communitystate.setModel(c);
     
 }

}

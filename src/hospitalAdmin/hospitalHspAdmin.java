/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hospitalAdmin;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Hospital;
import model.cityArrayList;
import model.communityArrayList;
import model.hospitalArrayList;
import model.houseArrayList;

/**
 *
 * @author DELL
 */
public class hospitalHspAdmin extends javax.swing.JPanel {

    /**
     * Creates new form hospitalHspAdmin
     */
    hospitalArrayList h;
    cityArrayList c;
    communityArrayList co;
    houseArrayList ho;
    public hospitalHspAdmin(hospitalArrayList h,cityArrayList c,communityArrayList co,houseArrayList ho) {
        initComponents();
        this.h=h;
        this.c=c;
        this.co=co;
        this.ho=ho;
        populateTable();
        populateCity();
        populateCountry();
        populateState();
        populateCommunity();
        populateZipcode();
        populateHouse();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableh = new javax.swing.JTable();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        lblName3 = new javax.swing.JLabel();
        lblName4 = new javax.swing.JLabel();
        lblName5 = new javax.swing.JLabel();
        lblName6 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        update = new javax.swing.JButton();
        view = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        search = new javax.swing.JTextArea();
        cellphone = new javax.swing.JTextField();
        lblName7 = new javax.swing.JLabel();
        lblName8 = new javax.swing.JLabel();
        state = new javax.swing.JComboBox<>();
        community = new javax.swing.JComboBox<>();
        residence = new javax.swing.JComboBox<>();
        country = new javax.swing.JComboBox<>();
        city = new javax.swing.JComboBox<>();
        lblName9 = new javax.swing.JLabel();
        lblName10 = new javax.swing.JLabel();
        zipcode = new javax.swing.JComboBox<>();

        titlePatient.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        titlePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePatient.setText("Hospital Details");
        titlePatient.setToolTipText("");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name");

        tableh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Hospital ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableh);

        lblName3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName3.setText("Residence");

        lblName4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName4.setText("City");

        lblName5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName5.setText("Community");

        lblName6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName6.setText("Hospital ID");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Search");

        search.setColumns(20);
        search.setRows(5);
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(search);

        cellphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellphoneActionPerformed(evt);
            }
        });

        lblName7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName7.setText(" Cell Phone");

        lblName8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName8.setText("Zipcode");

        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        community.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "vidyanagar" }));
        community.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityActionPerformed(evt);
            }
        });

        residence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "heath" }));

        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        lblName9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName9.setText("State");

        lblName10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName10.setText("Country");

        zipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName)
                                    .addComponent(lblName6)
                                    .addComponent(lblName7)
                                    .addComponent(lblName3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cellphone, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                        .addComponent(id)
                                        .addComponent(name))
                                    .addComponent(residence, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(lblName4)
                                    .addGap(18, 18, 18)
                                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblName8)
                                                .addComponent(lblName9)
                                                .addComponent(lblName10)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblName5)))
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(community, javax.swing.GroupLayout.Alignment.TRAILING, 0, 122, Short.MAX_VALUE)
                                        .addComponent(state, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(country, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(zipcode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titlePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titlePatient)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(residence, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName10))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName8)
                            .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 231, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 478, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:

        int flag =1;
        String s1 = name.getText();
        if(s1.equals(""))        {
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

        String ss2 = id.getText();

        if(ss2.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars3 = ss2.toCharArray();
        for(char c : chars3)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s2 = Integer.parseInt(ss2);
        for (Hospital epp:h.getH()){
            if (s2 == (epp.getHospitalId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
            }
        }

        String ss3 =  cellphone.getText();

        if(ss3.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
            return;
        }
        if(ss3.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number must be 10 digits");
            return;
        }
        char[] chars5 = ss3.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
                return;
            }
        }

        long s3 = Long.parseLong(ss3);
        for (Hospital epp:h.getH()){
            if (s3 == (epp.getHospitalCellPhone())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Phone Number already exists, please fill the details again");
            }
        }

        String s4 = (String)residence.getSelectedItem();

        if(s4.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Residence cannot be empty or have numbers");
            return;
        }

        String s5 = (String)community.getSelectedItem();

        if(s5.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Community cannot be empty or have numbers");
            return;
        }
        char[] chars7 = s5.toCharArray();
        for(char c: chars7){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Community cannot be empty or have numbers");
                return;

            }
        }
        String s6 = (String)city.getSelectedItem();

        if(s6.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"City cannot be empty or have numbers");
            return;
        }
        char[] chars8 = s6.toCharArray();
        for(char c: chars8){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"City cannot be empty or have numbers");
                return;

            }
        }
        String s7 = (String)state.getSelectedItem();

        if(s7.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"State cannot be empty or have numbers");
            return;
        }
        char[] chars9 = s7.toCharArray();
        for(char c: chars9){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"State cannot be empty or have numbers");
                return;

            }
        }
        String s8 = (String)country.getSelectedItem();

        if(s8.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Country cannot be empty or have numbers");
            return;
        }
        char[] chars10 = s8.toCharArray();
        for(char c: chars10){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Country cannot be empty or have numbers");
                return;

            }
        }
        String ss9 = (String)zipcode.getSelectedItem();

        if(ss9.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Zipcode cannot be empty or have alphabets");
            return;
        }
        char[] chars12 = ss9.toCharArray();
        for(char c: chars12){
            if(Character.isAlphabetic(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Zipcode cannot be empty or have alphabets");
                return;
            }
        }
        long s9 = Long.parseLong(ss9);
        if(flag == 1)
        {
            Hospital hh = h.addNewH();
            hh.setHospitalName(s1);
            hh.setHospitalId(s2);
            hh.setHospitalCellPhone(s3);
            hh.setHospitalResidence(s4);
            hh.setHospitalCommunity(s5);
            hh.setHospitalCity(s6);
            hh.setHospitalState(s7);
            hh.setHospitalCountry(s8);
            hh.setHospitalZipcode(s9);

            JOptionPane.showMessageDialog(this,"HospitalProfile created successfully");

            populateTable();
        }
        name.setText("");
        id.setText("");
        cellphone.setText("");
        residence.setSelectedItem("select");
        community.setSelectedItem("select");
        city.setSelectedItem("select");
        state.setSelectedItem("select");
        country.setSelectedItem("select");
        zipcode.setSelectedItem("select");

    }//GEN-LAST:event_createActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int row = tableh.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableh.getModel();
        Hospital selectedep = (Hospital)model.getValueAt(row, 0);
        h.deleteH(selectedep);
        int flag =1;
        String s1 = name.getText();
        if(s1.equals(""))        {
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

        String ss2 = id.getText();

        if(ss2.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
            return;
        }
        char[] chars3 = ss2.toCharArray();
        for(char c : chars3)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Id field cannot be empty or contain alphabet");
                return;
            }
        }
        int s2 = Integer.parseInt(ss2);
        for (Hospital epp:h.getH()){
            if (s2 == (epp.getHospitalId())){
                flag=0;
                JOptionPane.showMessageDialog(this,"ID already exists, please fill the details again");
            }
        }

        String ss3 =  cellphone.getText();

        if(ss3.equals(""))
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
            return;
        }
        if(ss3.length()!=10)
        {
            flag=0;
            JOptionPane.showMessageDialog(this,"Cell phone number must be 10 digits");
            return;
        }
        char[] chars5 = ss3.toCharArray();
        for(char c : chars5)
        {
            if(Character.isAlphabetic(c))
            {
                flag=0;
                JOptionPane.showMessageDialog(this,"Cell phone number field cannot be empty or contain alphabet");
                return;
            }
        }

        long s3 = Long.parseLong(ss3);
        for (Hospital epp:h.getH()){
            if (s3 == (epp.getHospitalCellPhone())){
                flag=0;
                JOptionPane.showMessageDialog(this,"Phone Number already exists, please fill the details again");
            }
        }

        String s4 = (String)residence.getSelectedItem();

        if(s4.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Residence cannot be empty or have numbers");
            return;
        }
        
        String s5 = (String)community.getSelectedItem();

        if(s5.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Community cannot be empty or have numbers");
            return;
        }
        char[] chars7 = s5.toCharArray();
        for(char c: chars7){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Community cannot be empty or have numbers");
                return;

            }
        }
        String s6 = (String)city.getSelectedItem();

        if(s6.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"City cannot be empty or have numbers");
            return;
        }
        char[] chars8 = s6.toCharArray();
        for(char c: chars8){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"City cannot be empty or have numbers");
                return;

            }
        }
        String s7 = (String)state.getSelectedItem();

        if(s7.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"State cannot be empty or have numbers");
            return;
        }
        char[] chars9 = s7.toCharArray();
        for(char c: chars9){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"State cannot be empty or have numbers");
                return;

            }
        }
        String s8 = (String)country.getSelectedItem();

        if(s8.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Country cannot be empty or have numbers");
            return;
        }
        char[] chars10 = s8.toCharArray();
        for(char c: chars10){
            if(Character.isDigit(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Country cannot be empty or have numbers");
                return;

            }
        }
        String ss9 = (String)zipcode.getSelectedItem();

        if(ss9.equals("select")){
            flag=0;
            JOptionPane.showMessageDialog(this,"Zipcode cannot be empty or have alphabets");
            return;
        }
        char[] chars12 = ss9.toCharArray();
        for(char c: chars12){
            if(Character.isAlphabetic(c)){
                flag=0;
                JOptionPane.showMessageDialog(this,"Zipcode cannot be empty or have alphabets");
                return;
            }
        }
        long s9 = Long.parseLong(ss9);
        if(flag == 1)
        {
            Hospital hh = h.addNewH();
            hh.setHospitalName(s1);
            hh.setHospitalId(s2);
            hh.setHospitalCellPhone(s3);
            hh.setHospitalResidence(s4);
            hh.setHospitalCommunity(s5);
            hh.setHospitalCity(s6);
            hh.setHospitalState(s7);
            hh.setHospitalCountry(s8);
            hh.setHospitalZipcode(s9);

            JOptionPane.showMessageDialog(this,"Hospital Profile updated successfully");

            populateTable();
        }
        name.setText("");
        id.setText("");
        cellphone.setText("");
        residence.setSelectedItem("select");
        community.setSelectedItem("select");
        city.setSelectedItem("select");
        state.setSelectedItem("select");
        country.setSelectedItem("select");
        zipcode.setSelectedItem("select");
    }//GEN-LAST:event_updateActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        int row = tableh.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableh.getModel();
        Hospital selectedep = (Hospital)model.getValueAt(row, 0);

        name.setText(String.valueOf(selectedep.getHospitalName()));
        residence.setSelectedItem(String.valueOf(selectedep.getHospitalResidence()));
        community.setSelectedItem(String.valueOf(selectedep.getHospitalCommunity()));
        id.setText(String.valueOf(selectedep.getHospitalId()));
        city.setSelectedItem(String.valueOf(selectedep.getHospitalCity()));
        state.setSelectedItem(String.valueOf(selectedep.getHospitalState()));
        cellphone.setText(String.valueOf(selectedep.getHospitalCellPhone()));
        zipcode.setSelectedItem(String.valueOf(selectedep.getHospitalZipcode()));
        country.setSelectedItem(String.valueOf(selectedep.getHospitalCountry()));
    }//GEN-LAST:event_viewActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableh.getModel();
        String value = search.getText();
        TableRowSorter<DefaultTableModel> key = new TableRowSorter<DefaultTableModel>(model);
        tableh.setRowSorter(key);
        key.setRowFilter(RowFilter.regexFilter(value));
    }//GEN-LAST:event_searchKeyReleased

    private void cellphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellphoneActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void communityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void zipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipcodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cellphone;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JComboBox<String> community;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JButton create;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName10;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblName5;
    private javax.swing.JLabel lblName6;
    private javax.swing.JLabel lblName7;
    private javax.swing.JLabel lblName8;
    private javax.swing.JLabel lblName9;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> residence;
    private javax.swing.JTextArea search;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JTable tableh;
    private javax.swing.JLabel titlePatient;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    private javax.swing.JComboBox<String> zipcode;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
          DefaultTableModel model = (DefaultTableModel) tableh.getModel();
          model.setRowCount(0);
        
        for (Hospital ep:h.getH()){
            
            Object[] row = new Object[2];
            row[0] = ep;
            row[1] = ep.getHospitalId();
            
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
     state.setModel(c);
     
 }

private void populateCommunity(){
     String[] cc = co.communityArray();
     DefaultComboBoxModel c = new DefaultComboBoxModel(cc);
     community.setModel(c);
     
 }
private void populateZipcode(){
     String[] cc = co.zipcodeArray();
     DefaultComboBoxModel c = new DefaultComboBoxModel(cc);
     zipcode.setModel(c);
     
 }
private void populateHouse(){
     String[] cc = ho.houseArray();
     DefaultComboBoxModel c = new DefaultComboBoxModel(cc);
     residence.setModel(c);
     
 }

}

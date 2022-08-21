/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dental_clinic_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author User
 */
public class PatientsForm extends javax.swing.JFrame {

    /**
     * Creates new form PatientsForm
     */
    public PatientsForm() {
        initComponents();
        DisplayPatients();
        P_ID_Count();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        patient2 = new javax.swing.JLabel();
        prescription2 = new javax.swing.JLabel();
        appoinments2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logout2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_P_Name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_Address = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmb_Gender = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_allergies = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_patient = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_patient_save = new javax.swing.JButton();
        btn_patient_edit = new javax.swing.JButton();
        btn_patient_delete = new javax.swing.JButton();
        btn_patient_clear1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Dental Clinic");

        patient2.setBackground(new java.awt.Color(51, 51, 51));
        patient2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patient2.setText("Appoinment");
        patient2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        patient2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patient2MouseClicked(evt);
            }
        });

        prescription2.setBackground(new java.awt.Color(51, 51, 51));
        prescription2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prescription2.setText("Prescription");
        prescription2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        prescription2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescription2MouseClicked(evt);
            }
        });

        appoinments2.setBackground(new java.awt.Color(51, 51, 51));
        appoinments2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        appoinments2.setText("Dashboard");
        appoinments2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        appoinments2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appoinments2MouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(51, 51, 51));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Treatments");
        jLabel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        logout2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout2.setForeground(new java.awt.Color(255, 0, 0));
        logout2.setText("LOGOUT");
        logout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19)
                        .addComponent(appoinments2)
                        .addComponent(prescription2)
                        .addComponent(patient2)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout2))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel18)
                .addGap(93, 93, 93)
                .addComponent(patient2)
                .addGap(41, 41, 41)
                .addComponent(prescription2)
                .addGap(38, 38, 38)
                .addComponent(appoinments2)
                .addGap(42, 42, 42)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout2)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");

        txt_P_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_P_NameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");

        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Age");

        cmb_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Alergies");

        tbl_patient.setBackground(new java.awt.Color(255, 255, 102));
        tbl_patient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Patient_Name", "Phone", "Address", "Age", "Gender", "Allergies"
            }
        ));
        tbl_patient.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tbl_patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_patientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_patient);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Patient List");

        jLabel15.setBackground(new java.awt.Color(255, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText(" X");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        btn_patient_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_patient_save.setText("Save");
        btn_patient_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_patient_saveMouseClicked(evt);
            }
        });
        btn_patient_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_patient_saveActionPerformed(evt);
            }
        });

        btn_patient_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_patient_edit.setText("Edit");
        btn_patient_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_patient_editMouseClicked(evt);
            }
        });

        btn_patient_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_patient_delete.setText("Delete");
        btn_patient_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_patient_deleteMouseClicked(evt);
            }
        });

        btn_patient_clear1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_patient_clear1.setText("Clear");
        btn_patient_clear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_patient_clear1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Patients");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_Address)
                                        .addComponent(txt_phone)
                                        .addComponent(txt_P_Name)
                                        .addComponent(cmb_Gender, 0, 128, Short.MAX_VALUE)
                                        .addComponent(txt_allergies, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_age))
                                    .addGap(174, 174, 174)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_patient_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addComponent(btn_patient_clear1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addComponent(btn_patient_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_patient_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_P_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_patient_save)
                        .addGap(28, 28, 28)
                        .addComponent(btn_patient_edit)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_allergies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_patient_delete)
                        .addGap(28, 28, 28)
                        .addComponent(btn_patient_clear1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmb_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_P_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_P_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_P_NameActionPerformed

    private void btn_patient_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_patient_saveActionPerformed
       
        
        
    }//GEN-LAST:event_btn_patient_saveActionPerformed
    
    Connection conn=null;
    ResultSet rs=null,rs1=null;
    Statement st=null,st1=null;
    int key;
    int Patient_ID=0;
    DefaultTableModel tblModel;
    
    private void Clear()
    {
        txt_P_Name.setText("");
        txt_phone.setText("");
        txt_Address.setText("");
        txt_age.setText("");
        txt_allergies.setText("");
    }
    private void DisplayPatients()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_management","root","");
            st=(Statement) conn.createStatement();
            rs=st.executeQuery("Select * from patient_details");
            
            
            while(rs.next())
            {
                String ID=String.valueOf(rs.getString("P_ID"));
                String Patient_Name=String.valueOf(rs.getString("P_Name"));
                String Phone=String.valueOf(rs.getString("Phone"));
                String Address=String.valueOf(rs.getString("Address"));
                String Age=String.valueOf(rs.getString("Age"));
                String Gender=String.valueOf(rs.getString("Gender"));
                String Allergies=String.valueOf(rs.getString("Allergies"));
                
                String tbData[]={ID,Patient_Name,Phone,Address,Age,Gender,Allergies};
                tblModel=(DefaultTableModel)tbl_patient.getModel();
                
         
                tblModel.addRow(tbData);
            }
        } catch (Exception e) {
        }
    }
    
    private void P_ID_Count()
    {
        try {
            st1=conn.createStatement();
            rs1=st1.executeQuery("select Max(P_ID) from patient_details");
            rs1.next();
            Patient_ID= rs1.getInt(1)+1;
        } catch (Exception e) {
        }
    }
    private void btn_patient_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_patient_saveMouseClicked
       if(txt_P_Name.getText().isEmpty() || txt_phone.getText().isEmpty() || txt_age.getText().isEmpty() ||txt_Address.getText().isEmpty() ||txt_allergies.getText().isEmpty()||cmb_Gender.getSelectedItem().toString().isEmpty())
       {
           
           JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else
       {
        
        try{
           
           P_ID_Count();
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_management","root","");
           String sql = "insert into patient_details values (?,?,?,?,?,?,?)";
           PreparedStatement add= conn.prepareStatement(sql);
           
           add.setInt(1, Patient_ID);
           add.setString(2, txt_P_Name.getText());
           add.setString(3, txt_phone.getText());
           add.setString(4, txt_Address.getText());
           add.setString(5, txt_age.getText());
           add.setString(6, cmb_Gender.getSelectedItem().toString());
           add.setString(7, txt_allergies.getText());
           int row=add.executeUpdate();
           JOptionPane.showMessageDialog(this, "Patient Insereted Successfully");
           conn.close();
           tblModel.setRowCount(0);
          DisplayPatients();
          Clear();
           
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         }
       }    
       
    }//GEN-LAST:event_btn_patient_saveMouseClicked

         
    private void tbl_patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_patientMouseClicked
        DefaultTableModel Model=(DefaultTableModel)tbl_patient.getModel();
        int Myindex=tbl_patient.getSelectedRow();
        
        key=Integer.valueOf(Model.getValueAt(Myindex, 0).toString());
        
       
        txt_P_Name.setText(Model.getValueAt(Myindex, 1).toString());
        txt_phone.setText(Model.getValueAt(Myindex, 2).toString());
        txt_Address.setText(Model.getValueAt(Myindex, 3).toString());
        txt_age.setText(Model.getValueAt(Myindex, 4).toString());
        cmb_Gender.setSelectedItem(Model.getValueAt(Myindex, 5).toString());
        txt_allergies.setText(Model.getValueAt(Myindex, 6).toString());
        
        
    }//GEN-LAST:event_tbl_patientMouseClicked

    private void btn_patient_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_patient_editMouseClicked
        if(key==0)
       {
           
           JOptionPane.showMessageDialog(this, "Select the patient ID");
       }
       else
       {
        
        try{
           
           
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_management","root","");
           String Query="Update patient_details set P_Name='"+txt_P_Name.getText()+"'"+",Phone='"+txt_phone.getText()+"'"+",Address='"+txt_Address.getText()+"'"+",Age='"+txt_age.getText()+"'"+",Gender='"+cmb_Gender.getSelectedItem().toString()+"'"+",Allergies='"+txt_allergies.getText()+"'"+" Where P_ID="+key;
           Statement up=conn.createStatement();
           up.execute(Query);
           JOptionPane.showMessageDialog(this, "Patient Updated Successfully");
           conn.close();
           tblModel.setRowCount(0);
           DisplayPatients();
           Clear();
           
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         }
       }   
    }//GEN-LAST:event_btn_patient_editMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btn_patient_clear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_patient_clear1MouseClicked
        Clear();
    }//GEN-LAST:event_btn_patient_clear1MouseClicked

   
    private void btn_patient_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_patient_deleteMouseClicked
        if(key==0)
        {

            JOptionPane.showMessageDialog(this, "Select the patient ID");
        }
        else
        {

            try{

                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_management","root","");
                String Q="Delete from patient_details where P_ID="+key;
                Statement up=conn.createStatement();
                up.execute(Q);
                JOptionPane.showMessageDialog(this, "Patient Deleted Successfully");
                conn.close();
                tblModel.setRowCount(0);
                DisplayPatients();
                Clear();

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_patient_deleteMouseClicked

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void patient2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patient2MouseClicked
        AppointmentsForm t1=new AppointmentsForm();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patient2MouseClicked

    private void prescription2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescription2MouseClicked
        PrescriptionForm p1=new PrescriptionForm();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prescription2MouseClicked

    private void appoinments2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appoinments2MouseClicked
        Dashbord a1=new Dashbord();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appoinments2MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        TreatmentForm t1=new TreatmentForm();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void logout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout2MouseClicked
        LoginForm l1=new LoginForm();
        l1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout2MouseClicked

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
            java.util.logging.Logger.getLogger(PatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appoinments2;
    private javax.swing.JButton btn_patient_clear1;
    private javax.swing.JButton btn_patient_delete;
    private javax.swing.JButton btn_patient_edit;
    private javax.swing.JButton btn_patient_save;
    private javax.swing.JComboBox<String> cmb_Gender;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout2;
    private javax.swing.JLabel patient2;
    private javax.swing.JLabel prescription2;
    private javax.swing.JTable tbl_patient;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_P_Name;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_allergies;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}

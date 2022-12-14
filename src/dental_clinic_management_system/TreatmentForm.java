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
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class TreatmentForm extends javax.swing.JFrame {

    /**
     * Creates new form TreatmentForm
     */
    public TreatmentForm() {
        initComponents();
        DisplayTreatments();
        T_ID_Count();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_T_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_T_medicin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_treatment = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_T_edit = new javax.swing.JButton();
        btn_T_save = new javax.swing.JButton();
        btn_T_delete = new javax.swing.JButton();
        txt_T_cost = new javax.swing.JTextField();
        btn_T_clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        patient = new javax.swing.JLabel();
        dashbord = new javax.swing.JLabel();
        appoinments = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        prescription = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");

        txt_T_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_T_nameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cost");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Medicine");

        tbl_treatment.setBackground(new java.awt.Color(255, 255, 102));
        tbl_treatment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Treatment_Name", "Cost", "Medicine"
            }
        ));
        tbl_treatment.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tbl_treatment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_treatmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_treatment);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Treatment List");

        jLabel15.setBackground(new java.awt.Color(255, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText(" X");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        btn_T_edit.setBackground(new java.awt.Color(102, 102, 102));
        btn_T_edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_T_edit.setText("Edit");
        btn_T_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_T_editMouseClicked(evt);
            }
        });

        btn_T_save.setBackground(new java.awt.Color(102, 102, 102));
        btn_T_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_T_save.setText("Save");
        btn_T_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_T_saveMouseClicked(evt);
            }
        });

        btn_T_delete.setBackground(new java.awt.Color(102, 102, 102));
        btn_T_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_T_delete.setText("Delete");
        btn_T_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_T_deleteMouseClicked(evt);
            }
        });

        btn_T_clear.setBackground(new java.awt.Color(102, 102, 102));
        btn_T_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_T_clear.setText("Clear");
        btn_T_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_T_clearMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 23)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Treatment");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Treatment List");

        jLabel17.setBackground(new java.awt.Color(255, 0, 0));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText(" X");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_T_medicin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_T_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_T_name, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(289, 289, 289)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_T_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_T_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_T_clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_T_save, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(255, 255, 255)
                                .addComponent(jLabel14)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_T_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btn_T_save)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(txt_T_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_T_medicin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btn_T_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_T_delete)
                        .addGap(11, 11, 11)
                        .addComponent(btn_T_clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel14)))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        patient.setBackground(new java.awt.Color(51, 51, 51));
        patient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patient.setText("Patients");
        patient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientMouseClicked(evt);
            }
        });

        dashbord.setBackground(new java.awt.Color(51, 51, 51));
        dashbord.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dashbord.setText("Dashbord");
        dashbord.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        dashbord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashbordMouseClicked(evt);
            }
        });

        appoinments.setBackground(new java.awt.Color(51, 51, 51));
        appoinments.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        appoinments.setText("Appointments");
        appoinments.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        appoinments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appoinmentsMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Dashboard");

        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 0, 0));
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        prescription.setBackground(new java.awt.Color(51, 51, 51));
        prescription.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prescription.setText("Prescription");
        prescription.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        prescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescriptionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(patient))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logout)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dashbord)
                                    .addComponent(prescription))
                                .addGap(16, 16, 16)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appoinments)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(121, 121, 121)
                .addComponent(patient)
                .addGap(35, 35, 35)
                .addComponent(prescription)
                .addGap(39, 39, 39)
                .addComponent(appoinments)
                .addGap(41, 41, 41)
                .addComponent(dashbord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    Connection conn=null;
    ResultSet rs=null,rs1=null;
    Statement st=null,st1=null;
    int key;
    int treatment_ID=0;
    DefaultTableModel tblModel;
    
    private void Clear()
    {
        txt_T_name.setText("");
        txt_T_cost.setText("");
        txt_T_medicin.setText("");
        
    }
    private void DisplayTreatments()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_management","root","");
            st=(Statement) conn.createStatement();
            rs=st.executeQuery("Select * from treatment_details");
            
            
            while(rs.next())
            {
                String ID=String.valueOf(rs.getString("Treat_ID"));
                String Treatment_Name=String.valueOf(rs.getString("Treatment_Name"));
                String Cost=String.valueOf(rs.getString("Cost"));
                String Medicine=String.valueOf(rs.getString("Medicines"));
                
                String tbData[]={ID,Treatment_Name,Cost,Medicine};
                tblModel=(DefaultTableModel)tbl_treatment.getModel();
                
         
                tblModel.addRow(tbData);
            }
        } catch (Exception e) {
        }
    }
    
    private void T_ID_Count()
    {
        try {
            st1=conn.createStatement();
            rs1=st1.executeQuery("select Max(Treat_ID) from treatment_details");
            rs1.next();
            treatment_ID= rs1.getInt(1)+1;
        } catch (Exception e) {
        }
    }
    
    private void txt_T_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_T_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_T_nameActionPerformed

    private void btn_T_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_T_clearMouseClicked
         Clear();
    }//GEN-LAST:event_btn_T_clearMouseClicked

    private void btn_T_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_T_saveMouseClicked
        if(txt_T_name.getText().isEmpty() || txt_T_medicin.getText().isEmpty() || txt_T_cost.getText().isEmpty())
       {
           
           JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else
       {
        
        try{
           
           T_ID_Count();
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_management","root","");
           String sql = "insert into treatment_details values (?,?,?,?)";
           PreparedStatement add= conn.prepareStatement(sql);
           
           add.setInt(1, treatment_ID);
           add.setString(2, txt_T_name.getText());
           add.setString(3, txt_T_cost.getText());
           add.setString(4, txt_T_medicin.getText());
           
           int row=add.executeUpdate();
           JOptionPane.showMessageDialog(this, "Treatment Insereted Successfully");
           conn.close();
           tblModel.setRowCount(0);
          DisplayTreatments();
          Clear();
          
           
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         }
       }
    }//GEN-LAST:event_btn_T_saveMouseClicked

    private void tbl_treatmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_treatmentMouseClicked
        DefaultTableModel Model=(DefaultTableModel)tbl_treatment.getModel();
        int Myindex=tbl_treatment.getSelectedRow();
        
        key=Integer.valueOf(Model.getValueAt(Myindex, 0).toString());
        
       
        txt_T_name.setText(Model.getValueAt(Myindex, 1).toString());
        txt_T_cost.setText(Model.getValueAt(Myindex, 2).toString());
        txt_T_medicin.setText(Model.getValueAt(Myindex, 3).toString());
        
    }//GEN-LAST:event_tbl_treatmentMouseClicked

    private void btn_T_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_T_editMouseClicked
        if(key==0)
       {
           
           JOptionPane.showMessageDialog(this, "Select the Treatment ID");
       }
       else
       {
        
        try{
           
           
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_management","root","");
           String Query="Update treatment_details set Treatment_Name='"+txt_T_name.getText()+"'"+",Cost='"+txt_T_cost.getText()+"'"+",Medicines='"+txt_T_medicin.getText()+"' Where Treat_ID="+key;
           Statement up=conn.createStatement();
           up.execute(Query);
           JOptionPane.showMessageDialog(this, "Treatment Updated Successfully");
           conn.close();
           tblModel.setRowCount(0);
           DisplayTreatments();
           Clear();
           
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         }
       }
    }//GEN-LAST:event_btn_T_editMouseClicked

    private void btn_T_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_T_deleteMouseClicked
        if(key==0)
        {

            JOptionPane.showMessageDialog(this, "Select the Treatment ID");
        }
        else
        {

            try{

                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_management","root","");
                String Q="Delete from treatment_details where Treat_ID="+key;
                Statement up=conn.createStatement();
                up.execute(Q);
                JOptionPane.showMessageDialog(this, "Treatment Deleted Successfully");
                conn.close();
                tblModel.setRowCount(0);
                DisplayTreatments();
                Clear();

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_T_deleteMouseClicked

    private void patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseClicked
        PatientsForm t1=new PatientsForm();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientMouseClicked

    private void dashbordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbordMouseClicked
        Dashbord t1=new Dashbord();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashbordMouseClicked

    private void appoinmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appoinmentsMouseClicked
        AppointmentsForm a1=new AppointmentsForm();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appoinmentsMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        LoginForm l1=new LoginForm();
        l1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void prescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescriptionMouseClicked
        PrescriptionForm p1=new PrescriptionForm();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prescriptionMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(TreatmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreatmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreatmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreatmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreatmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appoinments;
    private javax.swing.JButton btn_T_clear;
    private javax.swing.JButton btn_T_delete;
    private javax.swing.JButton btn_T_edit;
    private javax.swing.JButton btn_T_save;
    private javax.swing.JLabel dashbord;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel patient;
    private javax.swing.JLabel prescription;
    private javax.swing.JTable tbl_treatment;
    private javax.swing.JTextField txt_T_cost;
    private javax.swing.JTextField txt_T_medicin;
    private javax.swing.JTextField txt_T_name;
    // End of variables declaration//GEN-END:variables
}

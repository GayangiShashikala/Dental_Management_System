
package dental_clinic_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Dashbord extends javax.swing.JFrame {

    
    public Dashbord() {
        initComponents();
        getData();
    }

   Connection conn=null;
    ResultSet rs=null,rs1=null,rs2=null,rs3=null;
    Statement st=null,st1=null,st2=null,st3=null;
    
    private void getData()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_management","root","");
            st=(Statement) conn.createStatement();
            st1=(Statement) conn.createStatement();
            st2=(Statement) conn.createStatement();
            rs=st.executeQuery("Select count(*) from treatment_details");
            rs1=st1.executeQuery("Select count(*) from patient_details");
            rs2=st2.executeQuery("Select count(*) from prescription_details");
            rs3=st3.executeQuery("Select count(*) from appoinment_details");
            
            while(rs.next())
            {
                Dash_T_num.setText(""+rs.getInt(1));
            }
            while(rs1.next())
            {
                Dash_p_num.setText(""+rs1.getInt(1));
            }
            while(rs2.next())
            {
                Dash_pr_num.setText(""+rs2.getInt(1));
            }
            while(rs2.next())
            {
                Dash_ap_num1.setText(""+rs3.getInt(1));
            }
           
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        patient = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        appoinments = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        prescription = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Dash_treatment = new javax.swing.JLabel();
        dash_patient = new javax.swing.JLabel();
        dash_prescription = new javax.swing.JLabel();
        Dash_pr_num = new javax.swing.JLabel();
        Dash_T_num = new javax.swing.JLabel();
        Dash_p_num = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Dash_ap_num1 = new javax.swing.JLabel();
        dash_prescription1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Treatments");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), null, null));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(appoinments)
                            .addComponent(prescription)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(patient)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(121, 121, 121)
                .addComponent(patient)
                .addGap(35, 35, 35)
                .addComponent(prescription)
                .addGap(38, 38, 38)
                .addComponent(appoinments)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(35, 35, 35))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        Dash_treatment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Dash_treatment.setForeground(new java.awt.Color(255, 255, 255));
        Dash_treatment.setText("Treatments");
        Dash_treatment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dash_treatmentMouseClicked(evt);
            }
        });

        dash_patient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dash_patient.setForeground(new java.awt.Color(255, 255, 255));
        dash_patient.setText("Patients");
        dash_patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_patientMouseClicked(evt);
            }
        });

        dash_prescription.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dash_prescription.setForeground(new java.awt.Color(255, 255, 255));
        dash_prescription.setText("Prescription");
        dash_prescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_prescriptionMouseClicked(evt);
            }
        });

        Dash_pr_num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Dash_pr_num.setForeground(new java.awt.Color(255, 255, 255));
        Dash_pr_num.setText("Num");

        Dash_T_num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Dash_T_num.setForeground(new java.awt.Color(255, 255, 255));
        Dash_T_num.setText("Num");

        Dash_p_num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Dash_p_num.setForeground(new java.awt.Color(255, 255, 255));
        Dash_p_num.setText("Num");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dental_clinic_management_system/prescription.jpeg"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dental_clinic_management_system/treatment.png"))); // NOI18N
        jLabel11.setText("jLabel10");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dental_clinic_management_system/patient.jpeg"))); // NOI18N
        jLabel12.setText("jLabel10");

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText(" X");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dental_clinic_management_system/appointment.png"))); // NOI18N
        jLabel14.setText("jLabel10");

        Dash_ap_num1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Dash_ap_num1.setForeground(new java.awt.Color(255, 255, 255));
        Dash_ap_num1.setText("Num");

        dash_prescription1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dash_prescription1.setForeground(new java.awt.Color(255, 255, 255));
        dash_prescription1.setText("Appoinments");
        dash_prescription1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dash_prescription1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Dash_treatment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(dash_patient)
                .addGap(185, 185, 185))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(Dash_T_num)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Dash_p_num)
                .addGap(212, 212, 212))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(dash_prescription))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Dash_pr_num)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dash_prescription1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(Dash_ap_num1)))
                        .addGap(156, 156, 156))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(346, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(140, 140, 140)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dash_treatment)
                    .addComponent(dash_patient))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dash_T_num)
                    .addComponent(Dash_p_num))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dash_prescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dash_pr_num))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dash_prescription1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dash_ap_num1)))
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(349, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void Dash_treatmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dash_treatmentMouseClicked
        TreatmentForm t1=new TreatmentForm();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Dash_treatmentMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         TreatmentForm t1=new TreatmentForm();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void dash_patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_patientMouseClicked
         PatientsForm t1=new PatientsForm();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dash_patientMouseClicked

    private void patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseClicked
         PatientsForm t1=new PatientsForm();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_patientMouseClicked

    private void dash_prescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_prescriptionMouseClicked
         PrescriptionForm p1=new PrescriptionForm();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dash_prescriptionMouseClicked

    private void prescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescriptionMouseClicked
        PrescriptionForm p1=new PrescriptionForm();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prescriptionMouseClicked

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

    private void dash_prescription1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dash_prescription1MouseClicked
        AppointmentsForm a1=new AppointmentsForm();
        a1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dash_prescription1MouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashbord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dash_T_num;
    private javax.swing.JLabel Dash_ap_num1;
    private javax.swing.JLabel Dash_p_num;
    private javax.swing.JLabel Dash_pr_num;
    private javax.swing.JLabel Dash_treatment;
    private javax.swing.JLabel appoinments;
    private javax.swing.JLabel dash_patient;
    private javax.swing.JLabel dash_prescription;
    private javax.swing.JLabel dash_prescription1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel patient;
    private javax.swing.JLabel prescription;
    // End of variables declaration//GEN-END:variables
}


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Newpatientform extends javax.swing.JFrame {

    private String P_id;

    /**
     * Creates new form Newpatientform
     */
    public Newpatientform() {
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

        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new patient.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("ADD NEW PATIENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 191, 66));

        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 194, 60));

        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("<<BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 191, 50));

        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, 191, 70));
        getContentPane().add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 220, 35));
        getContentPane().add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 220, 38));
        getContentPane().add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 220, 40));
        getContentPane().add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 220, 50));
        getContentPane().add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 220, 40));
        getContentPane().add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 450, 70));

        tf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf8ActionPerformed(evt);
            }
        });
        getContentPane().add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 220, 50));

        jLabel1.setText("ENTER PATIENT ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel2.setText("PATIENT NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 108, -1));

        jLabel3.setText("PATIENT AGE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel4.setText("BLOOD GROUP");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, -1, -1));

        jLabel5.setText("FATHER NAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        jLabel6.setText("LOCAL ADDRESS ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("CITY:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        jLabel8.setText("CONTACT NO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));
        getContentPane().add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 220, 50));
        getContentPane().add(tf9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 220, 50));

        jLabel10.setText("APPT _ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel11.setText("DATE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));
        getContentPane().add(tf10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 220, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new patient.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new User().setVisible(true);
this.setVisible(false);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
tf1.setText(null);
        tf3.setText(null);
        tf4.setText(null);
        tf5.setText(null);
        tf2.setText(null);
        tf6.setText(null);
        tf7.setText(null);
        tf8.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
System.exit(0);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
{String Appointment_id,Date,patient_id,Patient_Name,Patient_Age,CNo,Local_Address,City,Father_Name,Blood_Group;
Appointment_id=tf1.getText();
Date=tf2.getText();
patient_id=tf3.getText();
Patient_Name=tf4.getText();
Patient_Age=tf5.getText();
CNo=tf6.getText();
Local_Address=tf7.getText();
City=tf8.getText();
Father_Name=tf9.getText();
Blood_Group=tf10.getText();

if(Appointment_id.isEmpty())
JOptionPane.showMessageDialog(this,"Appointment id not Entered");
else if(Date.isEmpty())
JOptionPane.showMessageDialog(this,"Date not Entered");
else if(patient_id.isEmpty())
JOptionPane.showMessageDialog(this,"Patient id not Entered");
else if(Patient_Name.isEmpty())
JOptionPane.showMessageDialog(this,"Patient Name not Entered");
else if(Patient_Age.isEmpty())
JOptionPane.showMessageDialog(this,"Patient age not Entered");

else if(CNo.isEmpty())
   JOptionPane.showMessageDialog(this,"Contact_No not Entered");

else if(Local_Address.isEmpty())
    JOptionPane.showMessageDialog(this,"Please provide Local_Address not Entered");

else if(City.isEmpty())    
JOptionPane.showMessageDialog(this,"City not Entered");

else if(Father_Name.isEmpty())
    JOptionPane.showMessageDialog(this,"Father_Name not Entered");

else if(Blood_Group.isEmpty())
    JOptionPane.showMessageDialog(this,"Blood_Group not Entered");

else{
     int ans=JOptionPane.showConfirmDialog(this,"Do you surely want to add the record?");
     if(ans==JOptionPane.YES_OPTION){
try{ Appointment_id=tf1.getText();
     Date=tf2.getText();
     patient_id=tf3.getText();
     Patient_Name=tf4.getText();
     Patient_Age=tf5.getText(); 
     CNo=tf6.getText();
     Local_Address=tf7.getText();
     City=tf8.getText();
     Father_Name=tf9.getText();
     Blood_Group=tf10.getText();
     

Class.forName("java.sql.DriverManager");
Connection con=(Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","admin"); 
java.sql.Statement stmt=con.createStatement();
String query="INSERT into bookings(Appointment_id,Date,patient_id,Patient_Name,Patient_Age,CNo,Local_Address,City,Father_Name,Blood_Group)"
        + "Values( '"+Appointment_id+"','"+Date+"','"+patient_id+"','"+Patient_Name+"','"+Patient_Age+"','"+CNo+"','"+Local_Address+"','"+City+"','"+Father_Name+"','"+Blood_Group+"');";
int i=stmt.executeUpdate(query);
JOptionPane.showMessageDialog(this,"Record Successfully Added!");}
catch(Exception e){
    JOptionPane.showMessageDialog(this,e.getMessage());}}}}




    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf8ActionPerformed

   
       
        
        
         
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    // End of variables declaration//GEN-END:variables
}


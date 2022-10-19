/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentmanagementsystem;

import ConnectionProvider.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pramo
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
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

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameStudent = new javax.swing.JTextField();
        rollNo = new javax.swing.JTextField();
        fathersName = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        course = new javax.swing.JComboBox<>();
        branch = new javax.swing.JComboBox<>();
        clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/schoolPic2.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 550));
        setMinimumSize(new java.awt.Dimension(700, 550));
        setPreferredSize(new java.awt.Dimension(700, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel1.setText("Name :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setText("Roll No. :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setText("Gender :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setText("Father's Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setText("Course :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setText("Branch :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        nameStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameStudentActionPerformed(evt);
            }
        });
        getContentPane().add(nameStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 230, 30));
        getContentPane().add(rollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 230, 30));

        fathersName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fathersNameActionPerformed(evt);
            }
        });
        getContentPane().add(fathersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, 30));

        submit.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-submit-document-32.png"))); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 140, 50));

        cancel.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-cancel-24.png"))); // NOI18N
        cancel.setText("Exit");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 110, 40));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 152, 230, 30));

        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTech", "Diploma" }));
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 252, 230, 30));

        branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "Civil", "Electrical", "Mechanical", " " }));
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        clear.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 110, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/schoolPic2.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void nameStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameStudentActionPerformed

    private void fathersNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fathersNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fathersNameActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String name = nameStudent.getText();
        String roll = rollNo.getText();
        String gen = (String)gender.getSelectedItem();
        String father = fathersName.getText();
        String cour = (String)course.getSelectedItem();
        String brch = (String)branch.getSelectedItem();
        
        try{
            
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO student VALUES('" +name+ " ','" + roll + " ','" + gen+ " ','" +father+ " ','" +cour+ " ','" +brch+"')");
            JOptionPane.showMessageDialog(null, "Successfully Added ! ");
            setVisible(false);
            AddStudent frame = new AddStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_submitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        int flag = JOptionPane.showConfirmDialog(null, "Do you want to clear everything ? ", "Clear", JOptionPane.YES_NO_OPTION);
        if(flag==0){
           setVisible(false);
            AddStudent frame = new AddStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null); 
        }
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> branch;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JTextField fathersName;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nameStudent;
    private javax.swing.JTextField rollNo;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
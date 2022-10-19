/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentmanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author pramo
 */
public class AdminHomePage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage() {
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

        addResult = new javax.swing.JButton();
        listStudent = new javax.swing.JButton();
        updateStudent = new javax.swing.JButton();
        ListStudentResult = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        AddStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 550));
        setMinimumSize(new java.awt.Dimension(700, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addResult.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        addResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-grade-24.png"))); // NOI18N
        addResult.setText("Add Result");
        addResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResultActionPerformed(evt);
            }
        });
        getContentPane().add(addResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 240, 60));

        listStudent.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        listStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-checklist-30.png"))); // NOI18N
        listStudent.setText("List Student");
        listStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listStudentActionPerformed(evt);
            }
        });
        getContentPane().add(listStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 240, 60));

        updateStudent.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        updateStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-edit student.png"))); // NOI18N
        updateStudent.setText("Update Student Result");
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });
        getContentPane().add(updateStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 240, 60));

        ListStudentResult.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        ListStudentResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-grade-24.png"))); // NOI18N
        ListStudentResult.setText("List Student Result");
        ListStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentResultActionPerformed(evt);
            }
        });
        getContentPane().add(ListStudentResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 240, 60));

        jButton6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-logout-50.png"))); // NOI18N
        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        AddStudent.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        AddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-student.png"))); // NOI18N
        AddStudent.setText("Add Student");
        AddStudent.setMaximumSize(new java.awt.Dimension(150, 50));
        AddStudent.setMinimumSize(new java.awt.Dimension(150, 50));
        AddStudent.setPreferredSize(new java.awt.Dimension(150, 50));
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });
        getContentPane().add(AddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 240, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/schoolPic2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 650));
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 550));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 650));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int flag = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit ? ","Submit", JOptionPane.YES_NO_OPTION);
        if(flag==0){
            
            setVisible(false);
            Home frame = new Home();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
           
          // System.exit(0);
        
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        // TODO add your handling code here:
        AddStudent frame = new AddStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_AddStudentActionPerformed

    private void addResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResultActionPerformed
        // TODO add your handling code here:
         AddResult frame = new AddResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_addResultActionPerformed

    private void listStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listStudentActionPerformed
        // TODO add your handling code here:
         ListStudents frame = new ListStudents();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_listStudentActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
        // TODO add your handling code here:
         UpdateStudent frame = new UpdateStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_updateStudentActionPerformed

    private void ListStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentResultActionPerformed
        // TODO add your handling code here:
         ListStudentResult frame = new ListStudentResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_ListStudentResultActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudent;
    private javax.swing.JButton ListStudentResult;
    private javax.swing.JButton addResult;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listStudent;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}

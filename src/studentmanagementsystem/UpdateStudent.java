/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentmanagementsystem;

import ConnectionProvider.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author pramo
 */
public class UpdateStudent extends javax.swing.JFrame {

    /**
     * Creates new form UpdateStudent
     */
    public UpdateStudent() {
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

        jLabel1 = new javax.swing.JLabel();
        rn = new javax.swing.JTextField();
        srch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phy = new javax.swing.JTextField();
        math = new javax.swing.JTextField();
        chem = new javax.swing.JTextField();
        ele = new javax.swing.JTextField();
        bio = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 550));
        setMinimumSize(new java.awt.Dimension(700, 550));
        setPreferredSize(new java.awt.Dimension(700, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel1.setText("Roll No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
        getContentPane().add(rn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 210, 30));

        srch.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        srch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-search-30.png"))); // NOI18N
        srch.setText("Search");
        srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchActionPerformed(evt);
            }
        });
        getContentPane().add(srch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 120, 40));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel2.setText("Physics :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel3.setText("Maths :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel4.setText("Chemistry :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel5.setText("Electrical :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        jLabel6.setText("Biology :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));
        getContentPane().add(phy, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 220, 30));
        getContentPane().add(math, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 220, 30));
        getContentPane().add(chem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 220, 30));

        ele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleActionPerformed(evt);
            }
        });
        getContentPane().add(ele, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 220, 30));
        getContentPane().add(bio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 220, 30));

        update.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-edit student.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        cancel.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/icons8-close-30.png"))); // NOI18N
        cancel.setText("Exit");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/schoolPic1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1090, -550, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchActionPerformed
        // TODO add your handling code here:
        String rollNo = rn.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("SELECT * FROM result WHERE rollNo="+rollNo);
 
            if(!rs.first()){
                JOptionPane.showMessageDialog(null,"Entered Roll No is Wrong ! ");
            }
            else{
                phy.setText(rs.getString(2));
                math.setText(rs.getString(3));
                chem.setText(rs.getString(4));
                ele.setText(rs.getString(5));
                bio.setText(rs.getString(6));
                rn.setEditable(false);
            }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
            
        }
    }//GEN-LAST:event_srchActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void eleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eleActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String rollNo = rn.getText();
        int physics = Integer.parseInt(phy.getText());
        int maths = Integer.parseInt(math.getText());
        int chemistry = Integer.parseInt(chem.getText());
        int electrical = Integer.parseInt(ele.getText());
        int biology = Integer.parseInt(bio.getText());
        int result = physics+maths+chemistry+electrical+biology;
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("Update result SET physics="+physics+", maths="+maths+", chemistry="+chemistry+", electrical="+electrical+", biology="+biology+", result="+result+" WHERE rollNo="+rollNo+" ;");
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            setVisible(false);
            UpdateStudent frame = new UpdateStudent();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bio;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField chem;
    private javax.swing.JTextField ele;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField math;
    private javax.swing.JTextField phy;
    private javax.swing.JTextField rn;
    private javax.swing.JButton srch;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
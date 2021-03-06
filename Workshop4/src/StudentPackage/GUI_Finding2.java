/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Normie
 */
public class GUI_Finding2 extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    
    Vector tbHeader = new Vector();
    Vector tbContent = new Vector();
    
    Process_Student ps = new Process_Student(); 
    public GUI_Finding2() {
        initComponents();
        tbHeader.add("Mã sinh viên");
        tbHeader.add("Họ tên");
        tbHeader.add("Lớp");
        tbHeader.add("Giới tính");
        tbHeader.add("Điểm");
        tbHeader.add("Xếp loại");
    }
    private void RefreshTable(){
        String cl = JCB_ClassID.getSelectedItem().toString();
        boolean gd = true;
        if(JRB_Male.isSelected()==true)
            gd = true;
        if(JRB_Female.isSelected()==true)
            gd = false;
        ArrayList<Student> lst = ps.getStudent_byClassGender(cl,gd);
        for (int i = 0; i < lst.size(); i++) {
            Student s = (Student)lst.get(i);
            Vector tbRow = new Vector();
            tbRow.add(s.getID());
            tbRow.add(s.getName());
            tbRow.add(s.getClassID());
            if(s.isGender())
                tbRow.add("Nam");
            else tbRow.add("Nữ");
            tbRow.add(s.getMark());
            tbRow.add(s.rank());
            tbContent.add(tbRow);
        }
        dtm.setDataVector(tbContent, tbHeader);
        JTB_Student.setModel(dtm);
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
        JCB_ClassID = new javax.swing.JComboBox<>();
        JBT_finding = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTB_Student = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        JRB_Male = new javax.swing.JRadioButton();
        JRB_Female = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lớp");

        JCB_ClassID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "61TH1", "61TH2", "61TH3", "61TH4", "61TH5", "61TH6" }));

        JBT_finding.setText("Tìm kiếm");
        JBT_finding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_findingActionPerformed(evt);
            }
        });

        JTB_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTB_Student);

        jLabel2.setText("Giới tính");

        JRB_Male.setText("Nam");
        JRB_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_MaleActionPerformed(evt);
            }
        });

        JRB_Female.setText("Nữ");
        JRB_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_FemaleActionPerformed(evt);
            }
        });

        jLabel3.setText("Danh sách sinh viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JCB_ClassID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBT_finding)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(JRB_Male)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JRB_Female)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JCB_ClassID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBT_finding))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JRB_Male)
                    .addComponent(JRB_Female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBT_findingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_findingActionPerformed
        // TODO add your handling code here:
        String ID = JCB_ClassID.getSelectedItem().toString();
        dtm.setNumRows(0);
        RefreshTable();
    }//GEN-LAST:event_JBT_findingActionPerformed

    private void JRB_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_MaleActionPerformed
        // TODO add your handling code here:
        JRB_Female.setSelected(false);
    }//GEN-LAST:event_JRB_MaleActionPerformed

    private void JRB_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_FemaleActionPerformed
        // TODO add your handling code here:
        JRB_Male.setSelected(false);
    }//GEN-LAST:event_JRB_FemaleActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Finding2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Finding2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Finding2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Finding2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Finding2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_finding;
    private javax.swing.JComboBox<String> JCB_ClassID;
    private javax.swing.JRadioButton JRB_Female;
    private javax.swing.JRadioButton JRB_Male;
    private javax.swing.JTable JTB_Student;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

/**
 *
 * @author Normie
 */
public class GUI_Update extends javax.swing.JFrame {

   Process_Lecture pl = new Process_Lecture();
    public GUI_Update() {
        initComponents();
        jLB_Result.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTF_Name = new javax.swing.JTextField();
        jTF_ID = new javax.swing.JTextField();
        jRB_Male = new javax.swing.JRadioButton();
        jRB_Female = new javax.swing.JRadioButton();
        jCB_Department = new javax.swing.JComboBox<>();
        jBT_Update = new javax.swing.JButton();
        jLB_Result = new javax.swing.JLabel();
        jTF_Salary = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRB_Male.setText("Nam");

        jRB_Female.setText("Nữ");

        jCB_Department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truong phong\t", "Nhan vien" }));

        jBT_Update.setText("Cập nhật");
        jBT_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_UpdateActionPerformed(evt);
            }
        });

        jLB_Result.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLB_Result, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTF_Salary)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jRB_Male)
                        .addGap(18, 18, 18)
                        .addComponent(jRB_Female)
                        .addGap(0, 120, Short.MAX_VALUE))
                    .addComponent(jTF_ID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF_Name, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCB_Department, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jBT_Update)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTF_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBT_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTF_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRB_Male)
                    .addComponent(jRB_Female))
                .addGap(18, 18, 18)
                .addComponent(jCB_Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLB_Result)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBT_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_UpdateActionPerformed
        // TODO add your handling code here:
         String ID = jTF_ID.getText();
        String Name = jTF_Name.getText();
        String Department = jCB_Department.getSelectedItem().toString();
        boolean Gender = true;
        if (jRB_Male.isSelected()) {
            Gender = true;
        }
        if (jRB_Female.isSelected()) {
            Gender = false;
        }
        double Salary = Double.parseDouble(jTF_Salary.getText());
        
        if(pl.updateLecture(ID, Name, Gender, Department, Salary)){
            jLB_Result.setText("Cập nhật thành công");
        
        }
        else{
            jLB_Result.setText("Cập nhật không thành công");
        }
        jLB_Result.setVisible(true);
    }//GEN-LAST:event_jBT_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT_Update;
    private javax.swing.JComboBox<String> jCB_Department;
    private javax.swing.JLabel jLB_Result;
    private javax.swing.JRadioButton jRB_Female;
    private javax.swing.JRadioButton jRB_Male;
    private javax.swing.JTextField jTF_ID;
    private javax.swing.JTextField jTF_Name;
    private javax.swing.JTextField jTF_Salary;
    // End of variables declaration//GEN-END:variables
}


package lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author ADM
 */
public class BT3_CongTruNhanChia extends javax.swing.JFrame {

  
    public BT3_CongTruNhanChia() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        cbopheptinh = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsoa = new javax.swing.JTextField();
        txtsob = new javax.swing.JTextField();
        txtkq = new javax.swing.JTextField();
        btncong = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbopheptinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cộng", "Trừ", "Nhân", "Chia" }));

        jLabel1.setText("First Number:");

        jLabel2.setText("Second Number:");

        jLabel3.setText("Result:");

        txtsoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoaActionPerformed(evt);
            }
        });

        btncong.setText("Thực hiện");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });

        jLabel4.setText("Phép tính");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btncong)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsoa)
                            .addComponent(txtsob)
                            .addComponent(txtkq)
                            .addComponent(cbopheptinh, 0, 153, Short.MAX_VALUE))))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtsoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbopheptinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btncong)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoaActionPerformed

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed
        // TODO add your handling code here:
        if (!validateForm()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập giá trị");
        }else{
            String stsoa = "", stsob = "", stpheptinh = "";
            float soa = 0, sob = 0, kq = 0;

            stsoa = txtsoa.getText();
            stsob = txtsob.getText();
            stpheptinh = cbopheptinh.getSelectedItem().toString();

            soa = Float.parseFloat(stsoa);
            sob = Float.parseFloat(stsob);

            switch(stpheptinh)
            {
                case "Cộng":
                kq = soa + sob;
                break;
                case "Trừ":
                kq = soa - sob;
                break;
                case "Nhân":
                kq = soa * sob;
                break;
                case "Chia":
                kq = soa / sob;
                break;
            }
            txtkq.setText("" + kq);
        }

    }//GEN-LAST:event_btncongActionPerformed
    public boolean validateForm(){
            if(txtsoa.getText().isEmpty() || txtsob.getText().isEmpty()){
                return false;
            }
            return true;
        }
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
            java.util.logging.Logger.getLogger(BT3_CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BT3_CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BT3_CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BT3_CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BT3_CongTruNhanChia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncong;
    private javax.swing.JComboBox cbopheptinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtkq;
    private javax.swing.JTextField txtsoa;
    private javax.swing.JTextField txtsob;
    // End of variables declaration//GEN-END:variables
}

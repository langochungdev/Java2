package Lab6;

public class Bai4 extends javax.swing.JFrame {
    public Bai4() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTram = new javax.swing.JTextField();
        txtChuc = new javax.swing.JTextField();
        txtDonVi = new javax.swing.JTextField();
        btnTram = new javax.swing.JButton();
        btnChuc = new javax.swing.JButton();
        btnDonVi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("XỔ SỐ KIẾN THIẾT");

        jLabel2.setText("Trăm");

        txtTram.setEditable(false);
        txtTram.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTram.setText("0");

        txtChuc.setEditable(false);
        txtChuc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtChuc.setText("0");

        txtDonVi.setEditable(false);
        txtDonVi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDonVi.setText("0");

        btnTram.setText("Start");
        btnTram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTramActionPerformed(evt);
            }
        });

        btnChuc.setText("Start");
        btnChuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChucActionPerformed(evt);
            }
        });

        btnDonVi.setText("Start");
        btnDonVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonViActionPerformed(evt);
            }
        });

        jLabel3.setText("Chục");

        jLabel4.setText("Đơn vị");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTram, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTram, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtChuc, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuc, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDonVi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTram)
                    .addComponent(btnChuc)
                    .addComponent(btnDonVi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTramActionPerformed
        Thread th = new Thread(){
            @Override
            public void run() {
                for(int i=0; i< 10; i++){
                    try {
                        int so = (int) (Math.random()*10);
                        txtTram.setText(String.valueOf(so));
                        Thread.sleep(500);
                    }catch(Exception e){
                        break;
                    }
                }
            }
        };
        th.start();
        btnTram.setEnabled(false);
    }//GEN-LAST:event_btnTramActionPerformed

    private void btnChucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChucActionPerformed
        new Thread(){
            @Override
            public void run() {
                for(int i=0; i< 10; i++){
                    try {
                        int so = (int) (Math.random()*10);
                        txtChuc.setText(String.valueOf(so));
                        Thread.sleep(500);
                    }catch(Exception e){
                        break;
                    }
                }
            }
        }.start();
        btnChuc.setEnabled(false);   
    }//GEN-LAST:event_btnChucActionPerformed

    private void btnDonViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonViActionPerformed
        new Thread(){
            @Override
            public void run() {
                for(int i=0; i< 10; i++){
                    try {
                        int so = (int) (Math.random()*10);
                        txtDonVi.setText(String.valueOf(so));
                        Thread.sleep(500);
                    }catch(Exception e){
                        break;
                    }
                }
            }
        }.start();
        btnDonVi.setEnabled(false);  
    }//GEN-LAST:event_btnDonViActionPerformed

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
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuc;
    private javax.swing.JButton btnDonVi;
    private javax.swing.JButton btnTram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtChuc;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtTram;
    // End of variables declaration//GEN-END:variables
}

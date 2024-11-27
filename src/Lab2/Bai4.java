package Lab2;
import javax.swing.JOptionPane;

public class Bai4 extends javax.swing.JFrame {
    public Bai4() {
        initComponents();
        setLocationRelativeTo(null);
        txtValue.setText(String.valueOf(sldFontSize.getValue()));
        lbFontSize.setFont(new java.awt.Font("Tahoma", 1, sldFontSize.getValue()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jSlider1 = new javax.swing.JSlider();
        sldFontSize = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        btnSetValue = new javax.swing.JButton();
        lbFontSize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sldFontSize.setMajorTickSpacing(5);
        sldFontSize.setMaximum(50);
        sldFontSize.setMinorTickSpacing(1);
        sldFontSize.setPaintLabels(true);
        sldFontSize.setPaintTicks(true);
        sldFontSize.setSnapToTicks(true);
        sldFontSize.setToolTipText("");
        sldFontSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldFontSizeStateChanged(evt);
            }
        });

        jLabel1.setText("Giá trị hiện tại:");

        btnSetValue.setText("Set Value");
        btnSetValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetValueActionPerformed(evt);
            }
        });

        lbFontSize.setText("Font Size");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sldFontSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetValue)
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbFontSize))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(sldFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSetValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(lbFontSize))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldFontSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldFontSizeStateChanged
        // TODO add your handling code here:
        txtValue.setText(String.valueOf(sldFontSize.getValue()));
        lbFontSize.setFont(new java.awt.Font("Tahoma", 1, sldFontSize.getValue()));
    }//GEN-LAST:event_sldFontSizeStateChanged

    private void btnSetValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetValueActionPerformed
        // TODO add your handling code here:
        if(txtValue.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "chua nhap size");
            return;
        }
            try {
                int size = Integer.valueOf(txtValue.getText());
                if(size<0 || size>50){
                    JOptionPane.showMessageDialog(this, "0<Size<50");
                }else{
                    lbFontSize.setFont(new java.awt.Font("Tahoma", 1, size));
                    sldFontSize.setValue(size);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "chi nhap so");
            }
    }//GEN-LAST:event_btnSetValueActionPerformed

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
    private javax.swing.JButton btnSetValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lbFontSize;
    private javax.swing.JSlider sldFontSize;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}
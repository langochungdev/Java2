package ASM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLSV extends javax.swing.JFrame {
    List<Student> dssv = new ArrayList<>();
    String path;
    
    public QLSV() {
        initComponents();
        setLocationRelativeTo(null);
        fillTable();
        display(dssv.get(0));
    }
    
    public void fillTable(){
            dssv = Student.loadDataToDSSV();
            DefaultTableModel tbModel = (DefaultTableModel) tbDanhSach.getModel();
            tbModel.setRowCount(0);
            for(Student s: dssv){
            tbModel.addRow(s.QLSVToRow());
            }
    }
    
    public void display(Student s){
        txtMa.setText(s.getMa());
        txtTen.setText(s.getTen());
        txtEmail.setText(s.getEmail());
        txtSDT.setText(s.getSDT());
        boolean gt = s.isGioiTinh();
        if(gt){
            rdbNam.setSelected(true);
        }else rdbNu.setSelected(true);
        txtDiaChi.setText(s.getDiaChi());
        ImageIcon icon = new ImageIcon(s.getHinh());
        lbPicture.setIcon(icon);
        lbPicture.setText("");
    }
    
    public void them(){ //exec sp_insertQLSV ?,?,?,?,?,?,? - insert into Student (MaSV,HoTen,Email,SDT,GioiTinh,DiaChi,HinhAnh) values(?,?,?,?,?,?,?)
        String sql = "exec sp_insertQLSV ?,?,?,?,?,?,?";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtMa.getText());
            ps.setString(2, txtTen.getText());
            ps.setString(3, txtEmail.getText());
            ps.setString(4, txtSDT.getText());
            ps.setBoolean(5, rdbNam.isSelected());
            ps.setString(6, txtDiaChi.getText());
            ps.setString(7, path);
            ps.executeUpdate();
            fillTable();
            JOptionPane.showMessageDialog(this, "Save successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void capNhat(){//sp_updateQLSV - update student set HoTen= ?, Email= ?, SDT=? , GioiTinh= ?, DiaChi= ?, HinhAnh= ? where MaSV = ?
        String sql = "exec sp_updateQLSV ?,?,?,?,?,?,?";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtTen.getText());
            ps.setString(2, txtEmail.getText());
            ps.setString(3, txtSDT.getText());
            ps.setBoolean(4, rdbNam.isSelected());
            ps.setString(5, txtDiaChi.getText());
            ps.setString(6, path);
            ps.setString(7, txtMa.getText());
            ps.executeUpdate();
            fillTable();
            JOptionPane.showMessageDialog(this, "updated successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void xoa(){//exec sp_xoaQLSV ? - delete from Student where MaSV =?
        String sql = "exec sp_xoaQLSV ?";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtMa.getText());
            ps.executeUpdate();
            fillTable();
            JOptionPane.showMessageDialog(this, "deleted successfully");
        }catch(Exception e){}
    }
    
    public boolean checkNull(){
        if(txtMa.getText().isEmpty() || txtTen.getText().isEmpty() || txtSDT.getText().isEmpty() || txtDiaChi.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "null text!");
            return false;
        } return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        lbPicture = new javax.swing.JLabel();
        txtNew = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        txtSave = new javax.swing.JButton();
        txtUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDanhSach = new javax.swing.JTable();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sinh viên");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Quản Lý Sinh Viên");

        jLabel2.setText("MaSV");

        jLabel3.setText("Họ tên:");

        jLabel4.setText("Email:");

        jLabel5.setText("SDT:");

        jLabel6.setText("Địa chỉ:");

        jLabel7.setText("Giới tính:");

        btgGioiTinh.add(rdbNam);
        rdbNam.setText("Nam");

        btgGioiTinh.add(rdbNu);
        rdbNu.setText("Nữ");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        lbPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPicture.setAlignmentX(10.0F);
        lbPicture.setAlignmentY(0.0F);
        lbPicture.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbPicture.setIconTextGap(20);
        lbPicture.setMaximumSize(new java.awt.Dimension(2, 2));
        lbPicture.setMinimumSize(new java.awt.Dimension(2, 2));
        lbPicture.setPreferredSize(new java.awt.Dimension(2, 2));
        lbPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPictureMouseClicked(evt);
            }
        });

        txtNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/icon/Add.png"))); // NOI18N
        txtNew.setText("New");
        txtNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewActionPerformed(evt);
            }
        });

        txtDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/icon/Delete.png"))); // NOI18N
        txtDelete.setText("Delete");
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });

        txtSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/icon/Save.png"))); // NOI18N
        txtSave.setText("Save");
        txtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveActionPerformed(evt);
            }
        });

        txtUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desktop/icon/Edit.png"))); // NOI18N
        txtUpdate.setText("Update");
        txtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateActionPerformed(evt);
            }
        });

        tbDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MaSV", "Họ tên", "Email", "SDT", "Giới tính", "Địa chỉ", "Hình"
            }
        ));
        tbDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDanhSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDanhSach);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(lbPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rdbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(rdbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(rdbNam)
                    .addComponent(rdbNu))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNew)
                        .addGap(6, 6, 6)
                        .addComponent(txtDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSave)
                        .addGap(6, 6, 6)
                        .addComponent(txtUpdate)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewActionPerformed
        txtMa.setText("");
        txtTen.setText("");
        txtEmail.setText("");
        txtSDT.setText("");
        rdbNam.setSelected(true);
        txtDiaChi.setText("");
        lbPicture.setText("add Picture");
        lbPicture.setIcon(null);
    }//GEN-LAST:event_txtNewActionPerformed

    private void txtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaveActionPerformed
        if(checkNull()) them();
    }//GEN-LAST:event_txtSaveActionPerformed

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteActionPerformed
        if(!txtMa.getText().isEmpty()){
            xoa();
            display(dssv.get(0));
        }
    }//GEN-LAST:event_txtDeleteActionPerformed

    private void txtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdateActionPerformed
        if(checkNull()) capNhat();
    }//GEN-LAST:event_txtUpdateActionPerformed

    private void lbPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPictureMouseClicked
        JFileChooser ch = new JFileChooser();
        if(ch.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            path = ch.getSelectedFile().getPath();
            ImageIcon icon = new ImageIcon(path);
            lbPicture.setIcon(icon);
            lbPicture.setText("");
        }
    }//GEN-LAST:event_lbPictureMouseClicked

    private void tbDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDanhSachMouseClicked
        int vt = tbDanhSach.getSelectedRow();
        display(dssv.get(vt));
    }//GEN-LAST:event_tbDanhSachMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbPicture;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTable tbDanhSach;
    private javax.swing.JButton txtDelete;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMa;
    private javax.swing.JButton txtNew;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JButton txtSave;
    private javax.swing.JTextField txtTen;
    private javax.swing.JButton txtUpdate;
    // End of variables declaration//GEN-END:variables
}

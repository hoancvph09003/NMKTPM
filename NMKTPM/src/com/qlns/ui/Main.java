/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.ui;

import com.qlns.helper.ShareHelper;
import javax.swing.JInternalFrame;

/**
 *
 * @author Hoanf
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
    }

    public void fc(JInternalFrame fc){
        jDesktopPane1.add(fc);
        fc.setVisible(true);
        fc.setLocation((jDesktopPane1.getWidth() - fc.getWidth())/2,(jDesktopPane1.getHeight()-fc.getHeight())/2);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniQLNhanVien = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniQLPhongBan = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniQLTienLuong = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mniLuongNhanVien = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniLuongPhongBan = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniNgayCong = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN SỰ");

        jDesktopPane1.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(270, 40));

        mnuHeThong.setText("HỆ THỐNG");
        mnuHeThong.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniDangXuat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Exit.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);
        mnuHeThong.add(jSeparator4);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Stop.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniKetThuc);

        jMenuBar1.add(mnuHeThong);

        mnuQuanLy.setText("QUẢN LÝ");
        mnuQuanLy.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mniQLNhanVien.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/User group.png"))); // NOI18N
        mniQLNhanVien.setText("Nhân viên");
        mniQLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLNhanVien);
        mnuQuanLy.add(jSeparator1);

        mniQLPhongBan.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniQLPhongBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Clien list.png"))); // NOI18N
        mniQLPhongBan.setText("Phòng ban");
        mniQLPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLPhongBanActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLPhongBan);
        mnuQuanLy.add(jSeparator2);

        mniQLTienLuong.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniQLTienLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Dollar.png"))); // NOI18N
        mniQLTienLuong.setText("Tiền lương");
        mniQLTienLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLTienLuongActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQLTienLuong);

        jMenuBar1.add(mnuQuanLy);

        mnuThongKe.setText("THỐNG KÊ");
        mnuThongKe.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Dollar.png"))); // NOI18N
        jMenu1.setText("Lương");

        mniLuongNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Boy.png"))); // NOI18N
        mniLuongNhanVien.setText("Lương từng nhân viên");
        jMenu1.add(mniLuongNhanVien);
        jMenu1.add(jSeparator3);

        mniLuongPhongBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Box.png"))); // NOI18N
        mniLuongPhongBan.setText("Lương từng phòng ban");
        jMenu1.add(mniLuongPhongBan);

        mnuThongKe.add(jMenu1);
        mnuThongKe.add(jSeparator6);

        mniNgayCong.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniNgayCong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Calendar.png"))); // NOI18N
        mniNgayCong.setText("Ngày công");
        mnuThongKe.add(mniNgayCong);

        jMenuBar1.add(mnuThongKe);

        mnuTroGiup.setText("TRỢ GIÚP");
        mnuTroGiup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mniHuongDan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHuongDan.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Help.png"))); // NOI18N
        mniHuongDan.setText("Hướng dẫn");
        mniHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHuongDanActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniHuongDan);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniKetThucActionPerformed

    private void mniQLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLNhanVienActionPerformed
        // TODO add your handling code here:
        QLNhanVienJInternalFrame nv = new QLNhanVienJInternalFrame();
        fc(nv);
        nv.setVisible(true);
    }//GEN-LAST:event_mniQLNhanVienActionPerformed

    private void mniHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHuongDanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniHuongDanActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniQLPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLPhongBanActionPerformed
        // TODO add your handling code here:
        QLPhongBanJInternalFrame pb = new QLPhongBanJInternalFrame();
        fc(pb);
        pb.setVisible(true);
    }//GEN-LAST:event_mniQLPhongBanActionPerformed

    private void mniQLTienLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLTienLuongActionPerformed
        // TODO add your handling code here:
        QLLuongThuongJInternalFrame lt = new QLLuongThuongJInternalFrame();
        fc(lt);
        lt.setVisible(true);
    }//GEN-LAST:event_mniQLTienLuongActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniLuongNhanVien;
    private javax.swing.JMenuItem mniLuongPhongBan;
    private javax.swing.JMenuItem mniNgayCong;
    private javax.swing.JMenuItem mniQLNhanVien;
    private javax.swing.JMenuItem mniQLPhongBan;
    private javax.swing.JMenuItem mniQLTienLuong;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    // End of variables declaration//GEN-END:variables
}

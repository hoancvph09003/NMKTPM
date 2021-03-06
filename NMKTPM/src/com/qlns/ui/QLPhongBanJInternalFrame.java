/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlns.ui;

import com.qlns.dao.ChucVuDAO;
import com.qlns.dao.PhongBanDAO;
import com.qlns.helper.DialogHelper;
import com.qlns.model.ChucVu;
import com.qlns.model.PhongBan;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hoanf
 */
public class QLPhongBanJInternalFrame extends javax.swing.JInternalFrame {

    int index = 0;
    int indexChucVu=0;
    PhongBanDAO pbDAO = new PhongBanDAO();
    ChucVuDAO cvDAO = new ChucVuDAO();

    /**
     * Creates new form QLPhongBanJInternalFrame
     */
    @SuppressWarnings("unchecked")
    public QLPhongBanJInternalFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Tabs = new javax.swing.JTabbedPane();
        Tab1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhongBan = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        radioTimTheoTen = new javax.swing.JRadioButton();
        radioTimTheoMa = new javax.swing.JRadioButton();
        btnTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenPhongBan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaPhongBan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTenChucVu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaChucVu = new javax.swing.JTextField();
        btnThemCV = new javax.swing.JButton();
        btnXoaCV = new javax.swing.JButton();
        btnLamMoiCv = new javax.swing.JButton();
        btnSuaCV = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblChucVu = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tblPhongBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã phòng ban", "Tên phòng ban", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhongBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhongBan);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(825, 75));

        txtTimKiem.setPreferredSize(new java.awt.Dimension(350, 25));
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        buttonGroup1.add(radioTimTheoTen);
        radioTimTheoTen.setSelected(true);
        radioTimTheoTen.setText("Tìm theo tên");
        radioTimTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTimTheoTenActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioTimTheoMa);
        radioTimTheoMa.setText("Tìm theo mã số");

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(radioTimTheoTen)
                        .addGap(51, 51, 51)
                        .addComponent(radioTimTheoMa)))
                .addGap(69, 69, 69)
                .addComponent(btnTimKiem)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTimTheoTen)
                    .addComponent(radioTimTheoMa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnTimKiem))
                .addContainerGap())
        );

        javax.swing.GroupLayout Tab1Layout = new javax.swing.GroupLayout(Tab1);
        Tab1.setLayout(Tab1Layout);
        Tab1Layout.setHorizontalGroup(
            Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab1Layout.createSequentialGroup()
                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        Tab1Layout.setVerticalGroup(
            Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        Tabs.addTab("DANH SÁCH PHÒNG BAN", Tab1);

        jLabel1.setText("Mã phòng ban:");

        jLabel2.setText("Tên phòng ban:");

        jLabel3.setText("Mô tả:");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane2.setViewportView(txtMoTa);

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(90, 50));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(90, 50));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Refresh.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setPreferredSize(new java.awt.Dimension(90, 50));
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel3)
                            .addComponent(txtMaPhongBan, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtTenPhongBan))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtMaPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addComponent(txtTenPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        Tabs.addTab("CẬP NHẬT PHÒNG BAN", jPanel2);

        jLabel4.setText("Mã chức vụ:");

        jLabel5.setText("Tên chức vụ:");

        btnThemCV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThemCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Add.png"))); // NOI18N
        btnThemCV.setText("Thêm");
        btnThemCV.setPreferredSize(new java.awt.Dimension(90, 50));
        btnThemCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCVActionPerformed(evt);
            }
        });

        btnXoaCV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXoaCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Delete.png"))); // NOI18N
        btnXoaCV.setText("Xóa");
        btnXoaCV.setPreferredSize(new java.awt.Dimension(90, 50));
        btnXoaCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCVActionPerformed(evt);
            }
        });

        btnLamMoiCv.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLamMoiCv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Refresh.png"))); // NOI18N
        btnLamMoiCv.setText("Làm mới");
        btnLamMoiCv.setPreferredSize(new java.awt.Dimension(90, 50));
        btnLamMoiCv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiCvActionPerformed(evt);
            }
        });

        btnSuaCV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSuaCV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlns/icon/Edit.png"))); // NOI18N
        btnSuaCV.setText("Sửa");
        btnSuaCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCVActionPerformed(evt);
            }
        });

        tblChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã chức vụ", "Tên chức vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChucVuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblChucVu);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txtTenChucVu))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnThemCV, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnSuaCV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(btnXoaCV, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(btnLamMoiCv, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(txtMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(25, 25, 25)
                .addComponent(txtTenChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaCV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoiCv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Tabs.addTab("CHỨC VỤ", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTimTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTimTheoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTimTheoTenActionPerformed

    private void btnLamMoiCvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiCvActionPerformed
        // TODO add your handling code here:
        this.clearChucVu();
    }//GEN-LAST:event_btnLamMoiCvActionPerformed

    private void tblPhongBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongBanMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.index = tblPhongBan.rowAtPoint(evt.getPoint());
            if (this.index >= 0) {
                this.edit();
                Tabs.setSelectedIndex(1);
            }
        }
    }//GEN-LAST:event_tblPhongBanMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.add();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (radioTimTheoTen.isSelected()) {
                this.loadByKeyword();
                this.clear();
            }
            if (radioTimTheoMa.isSelected()) {
                this.loadById();
                this.clear();
            }
//        }
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        if (txtTimKiem.getText().length() > 0) {
            if (radioTimTheoTen.isSelected()) {
                this.loadByKeyword();
                this.clear();
            }
            if (radioTimTheoMa.isSelected()) {
                this.loadById();
                this.clear();
            }
        } else {
            this.loadByKeyword();
        }
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        this.loadByKeyword();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCVActionPerformed
        // TODO add your handling code here:
        this.addChucVu();
    }//GEN-LAST:event_btnThemCVActionPerformed

    private void btnSuaCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCVActionPerformed
        // TODO add your handling code here:
        this.updateChucVu();
    }//GEN-LAST:event_btnSuaCVActionPerformed

    private void btnXoaCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCVActionPerformed
        // TODO add your handling code here:
        this.deleteChucVu();
    }//GEN-LAST:event_btnXoaCVActionPerformed

    private void tblChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChucVuMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.indexChucVu = tblChucVu.rowAtPoint(evt.getPoint());
            if (this.indexChucVu >= 0) {
                this.editChucVu();
            }
        }
    }//GEN-LAST:event_tblChucVuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tab1;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLamMoiCv;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaCV;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemCV;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaCV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radioTimTheoMa;
    private javax.swing.JRadioButton radioTimTheoTen;
    private javax.swing.JTable tblChucVu;
    private javax.swing.JTable tblPhongBan;
    private javax.swing.JTextField txtMaChucVu;
    private javax.swing.JTextField txtMaPhongBan;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenChucVu;
    private javax.swing.JTextField txtTenPhongBan;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    void init() {
        this.loadData();
        this.loadDataFormChucVu();
    }

    void loadData() {
        DefaultTableModel model = (DefaultTableModel) tblPhongBan.getModel();
        model.setRowCount(0);
        try {
            List<PhongBan> listPB = pbDAO.getListPhongBan();
            for (PhongBan pb : listPB) {
                model.addRow(new Object[]{
                    pb.getTenPhongBan(), pb.getMoTa()});
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
    void loadByKeyword(){
        DefaultTableModel model = (DefaultTableModel) tblPhongBan.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtTimKiem.getText();
            List<PhongBan> listPB = pbDAO.selectByKeyWord(keyword);
            for (PhongBan pb : listPB) {
                Object[] row = {pb.getMaPhongBan(),
                    pb.getTenPhongBan(), pb.getMoTa()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        
    }
    void loadById(){
        DefaultTableModel model = (DefaultTableModel) tblPhongBan.getModel();
        model.setRowCount(0);
        try {
            String id = txtTimKiem.getText();
            List<PhongBan> listPB = pbDAO.selectById(id);
            for (PhongBan pb : listPB) {
                Object[] row = {pb.getMaPhongBan(),
                    pb.getTenPhongBan(), pb.getMoTa()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        
    }

    void setModel(PhongBan model) {
        txtMaPhongBan.setText(model.getMaPhongBan());
        txtTenPhongBan.setText(model.getTenPhongBan());
        txtMoTa.setText(model.getMoTa());
    }

    PhongBan getModel() {
        PhongBan model = new PhongBan();
        model.setMaPhongBan(txtMaPhongBan.getText());
        model.setTenPhongBan(txtTenPhongBan.getText());
        model.setMoTa(txtMoTa.getText());
        return model;
    }

    void edit() {
        try {
            String mapb = (String) tblPhongBan.getValueAt(this.index, 0);
            PhongBan model = pbDAO.findById(mapb);
            if (model != null) {
                this.setModel(model);
//                this.setStatus(false);
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    void clear() {
        this.setModel(new PhongBan());
    }

    void add() {
        PhongBan model = getModel();
        try {
            pbDAO.addPhongBan(model);
            this.loadData();
            this.clear();
            DialogHelper.alert(this, "Thêm phòng ban thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Thêm phòng ban thất bại");
        }
    }
    void update(){
        PhongBan model = getModel();
        try {
            pbDAO.update(model);
            this.loadData();
            DialogHelper.alert(this, "Sửa phòng ban thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Sửa phòng ban thất bại");
        }
    }
    void delete(){
        PhongBan model = getModel();
        try {
            pbDAO.delete(model);
            this.loadData();
            this.clear();
            DialogHelper.alert(this, "Xóa phòng ban thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Xóa phòng ban thất bại");
        }
    }
    
    
    
    void loadDataFormChucVu() {
        DefaultTableModel model = (DefaultTableModel) tblChucVu.getModel();
        model.setRowCount(0);
        try {
            List<ChucVu> listCV = cvDAO.getListChucVu();
            for (ChucVu cv : listCV) {
                model.addRow(new Object[]{cv.getMaChucVu(),
                    cv.getChucVu()});
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
    
    void setModelCV(ChucVu model) {
        txtMaChucVu.setText(model.getMaChucVu());
        txtTenChucVu.setText(model.getChucVu());
    }

    ChucVu getModelCV() {
        ChucVu model = new ChucVu();
        model.setMaChucVu(txtMaChucVu.getText());
        model.setChucVu(txtTenChucVu.getText());
        return model;
    }

    void editChucVu() {
        try {
            String macv = (String) tblChucVu.getValueAt(this.indexChucVu, 0);
            ChucVu model = cvDAO.findById(macv);
            if (model != null) {
                this.setModelCV(model);
//                this.setStatus(false);
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    void clearChucVu() {
        this.setModelCV(new ChucVu());
    }

    void addChucVu() {
        ChucVu model = getModelCV();
        try {
            cvDAO.addChucVu(model);
            this.loadDataFormChucVu();
            this.clearChucVu();
            DialogHelper.alert(this, "Thêm chức vụ thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Thêm chức vụ thất bại");
        }
    }
    void updateChucVu(){
        ChucVu model = getModelCV();
        try {
            cvDAO.update(model);
            this.loadDataFormChucVu();
            DialogHelper.alert(this, "Sửa chức vụ thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Sửa chức vụ thất bại");
        }
    }
    void deleteChucVu(){
        ChucVu model = getModelCV();
        try {
            cvDAO.delete(model);
            this.loadDataFormChucVu();
            this.clearChucVu();
            DialogHelper.alert(this, "Xóa chức vụ thành công");
        } catch (Exception e) {
            DialogHelper.alert(this, "Xóa chức vụ thất bại");
        }
    }

}

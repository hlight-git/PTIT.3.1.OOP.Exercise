/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IOFile;
import controller.SLEx;
import controller.TrongEx;
import model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class FormSach extends javax.swing.JPanel {

    DefaultTableModel tm;
    private boolean dangThem, dangSua;
    private String fsach;
    private List <Sach> slist;
    
    public void loadData(){
        try{
            File f = new File(fsach);
            if(f.exists()){
                slist = IOFile.readF("src/controller/SACH.DAT");
            }
            else
                f.createNewFile();
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Lỗi file SACH.DAT!");
        }
        if(slist == null)
            slist = new ArrayList<>();
    }
    
    public void loadItems() throws FileNotFoundException{
        File its = new File("src/controller/CN.DAT");
        Scanner sc = new Scanner(its);
        chuyenNganh.removeAllItems();
        while(sc.hasNext()){
            chuyenNganh.addItem(sc.nextLine());
        }
    }
    public FormSach(){
        initComponents();
        try{
            loadItems();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        String[] cols = {"Mã sách", "Tên sách", "Tác giả", "Chuyên ngành", "Số lượng"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        maSach.setEnabled(false);
        dangThem = false;
        dangSua = false;
        buttonState(true);
        updateContentState();
        fsach = "src/controller/SACH.DAT";
        loadData();
    }
    private void buttonState(boolean b){
        them.setEnabled(b);
        sua.setEnabled(b);
        capNhat.setEnabled(!b);
        boQua.setEnabled(!b);
    }
    private void updateContentState(){
        if(dangThem || dangSua){
            tenSach.setEnabled(true);
            tacGia.setEnabled(true);
            chuyenNganh.setEnabled(true);
            soLuong.setEnabled(true);
        }
        else{
            tenSach.setText("");
            tenSach.setEnabled(false);
            tacGia.setText("");
            tacGia.setEnabled(false);
            chuyenNganh.setEnabled(false);
            soLuong.setText("");
            soLuong.setEnabled(false);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        them = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        hienThi = new javax.swing.JButton();
        luuVaoFIile = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        capNhat = new javax.swing.JButton();
        boQua = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        maSach = new javax.swing.JTextField();
        tenSach = new javax.swing.JTextField();
        tacGia = new javax.swing.JTextField();
        soLuong = new javax.swing.JTextField();
        chuyenNganh = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(900, 750));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        hienThi.setText("Cập nhật từ file");
        hienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hienThiActionPerformed(evt);
            }
        });

        luuVaoFIile.setText("Lưu vào file");
        luuVaoFIile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuVaoFIileActionPerformed(evt);
            }
        });

        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        capNhat.setText("Cập nhật");
        capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capNhatActionPerformed(evt);
            }
        });

        boQua.setText("Bỏ qua");
        boQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boQuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boQua, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(luuVaoFIile, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(capNhat)
                            .addComponent(boQua))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hienThi)
                            .addComponent(luuVaoFIile)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sua)
                            .addComponent(them)
                            .addComponent(xoa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel1.setText("Mã sách:");

        jLabel2.setText("Tên sách:");

        jLabel3.setText("Tác giả:");

        jLabel4.setText("Chuyên ngành:");

        jLabel5.setText("Số lượng:");

        maSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maSachActionPerformed(evt);
            }
        });

        tacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tacGiaActionPerformed(evt);
            }
        });

        chuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tacGia)
                    .addComponent(maSach)
                    .addComponent(tenSach, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(soLuong)
                    .addComponent(chuyenNganh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maSachActionPerformed

    private void tacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tacGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tacGiaActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        buttonState(false);
        dangThem = true;
        updateContentState();
        if(slist.size() > 0){
            Sach.setSma(slist.get(slist.size()-1).getMa()+1);
        }
        maSach.setText(Sach.getSma() + "");
        tenSach.requestFocus();
    }//GEN-LAST:event_themActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        buttonState(false);
        dangSua = true;
        updateContentState();
    }//GEN-LAST:event_suaActionPerformed

    private void capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capNhatActionPerformed
        try{
            String ten, tg, solg;
            ten = tenSach.getText();
            tg = tacGia.getText();
            solg = soLuong.getText();
            int type = 0;
            if(solg.isEmpty())
                type = 3;
            if(tg.isEmpty())
                type = 2;
            if(ten.isEmpty())
                type = 1;
            if(type != 0)
                throw new TrongEx(type);
            int sl = Integer.parseInt(solg);
            if(sl < 1)
                throw new SLEx();
            Sach s = new Sach(Integer.parseInt(maSach.getText()), ten, tg, chuyenNganh.getSelectedItem().toString(), sl);
            if(dangThem){
                tm.addRow(s.toObject());
                slist.add(s);
            }
            else{
                int row = jTable1.getSelectedRow();
                tm.removeRow(row);
                tm.insertRow(row, s.toObject());
                slist.set(row, s);
            }
            buttonState(true);
            dangThem = false;
            dangSua = false;
            updateContentState();
        }catch(TrongEx e){
            JOptionPane.showMessageDialog(this, "Không được để trống nhé!");
            if(e.type == 1)
                tenSach.requestFocus();
            else if(e.type == 2)
                tacGia.requestFocus();
            else
                soLuong.requestFocus();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Phải ghi số!");
            soLuong.requestFocus();
        }catch(SLEx e){
            JOptionPane.showMessageDialog(this, "Phải để số dương!");
            soLuong.requestFocus();
        }
    }//GEN-LAST:event_capNhatActionPerformed

    private void boQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boQuaActionPerformed
        buttonState(true);
        dangThem = false;
        dangSua = false;
        updateContentState();
    }//GEN-LAST:event_boQuaActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        int row = jTable1.getSelectedRow();
        if(row < 0 || row > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Chọn hàng để xóa");
        }
        else{
            tm.removeRow(row);
        }
    }//GEN-LAST:event_xoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0 || row > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Chọn hàng");
        }
        else{
            maSach.setText(tm.getValueAt(row, 0).toString());
            tenSach.setText(tm.getValueAt(row, 1).toString());
            tacGia.setText(tm.getValueAt(row, 2).toString());
            for(int i=0; i<chuyenNganh.getItemCount(); i++){
                if(tm.getValueAt(row, 3).toString() == chuyenNganh.getItemAt(i)){
                    chuyenNganh.setSelectedIndex(i);
                    break;
                }
            }
            soLuong.setText(tm.getValueAt(row, 4).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void hienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hienThiActionPerformed
        loadData();
        tm.setRowCount(0);
        for(Sach ele:slist){
            tm.addRow(ele.toObject());
        }
    }//GEN-LAST:event_hienThiActionPerformed

    private void luuVaoFIileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuVaoFIileActionPerformed
        IOFile.writeF(fsach, slist);
    }//GEN-LAST:event_luuVaoFIileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boQua;
    private javax.swing.JButton capNhat;
    private javax.swing.JComboBox<String> chuyenNganh;
    private javax.swing.JButton hienThi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton luuVaoFIile;
    private javax.swing.JTextField maSach;
    private javax.swing.JTextField soLuong;
    private javax.swing.JButton sua;
    private javax.swing.JTextField tacGia;
    private javax.swing.JTextField tenSach;
    private javax.swing.JButton them;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}

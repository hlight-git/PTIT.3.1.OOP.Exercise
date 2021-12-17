/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class FormQuanLy extends javax.swing.JPanel {

    DefaultTableModel tm;
    private boolean dangThem;
    private String fsach, fbanDoc, fquanly;
    private List <BanDoc> bdlist;
    private List <Sach> slist;
    private List <QLMS> qllist;

    public void loadBanDoc(){
        try{
            File f = new File(fbanDoc);
            if(f.exists())
                bdlist = IOFile.readF(fbanDoc);
            else
                f.createNewFile();
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Lỗi file!");
        }
        if(bdlist == null)
            bdlist = new ArrayList<>();
        cacbandoc.removeAllItems();
        cacbandoc.addItem("-------");
        for(BanDoc ele:bdlist)
            cacbandoc.addItem(ele.getMa() + "");
    }
    public void loadSach(){
        try{
            File f = new File(fsach);
            if(f.exists())
                slist = IOFile.readF(fsach);
            else
                f.createNewFile();
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Lỗi file!");
        }
        if(slist == null)
            slist = new ArrayList<>();
        cacmasach.removeAllItems();
        cacmasach.addItem("-------");
        for(Sach ele:slist)
            cacmasach.addItem(ele.getMa() + "");
    }
    public void loadData(){
        loadBanDoc();
        loadSach();
        try{
            File f = new File(fquanly);
            if(f.exists()){
                qllist = IOFile.readF(fquanly);
            }
            else
                f.createNewFile();
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, "Lỗi file!");
        }
        if(qllist == null)
            qllist = new ArrayList<>();
    }
    public boolean trung2Ma(String maBD, String maSach){
        for(QLMS ele:qllist){
            if(Integer.parseInt(maBD) == ele.getBandoc().getMa() && Integer.parseInt(maSach) == ele.getSach().getMa())
                return true;
        }
        return false;
    }
    public int demDauSach(int mabd){
        int cnt = 0;
        for(QLMS ele:qllist){
            if(ele.getBandoc().getMa() == mabd)
                cnt++;
        }
        return cnt;
    }
    public FormQuanLy(){
        initComponents();
        String[] cols = {"Mã bạn đọc", "Tên bạn đọc", "Tên sách", "Số lượng", "Tình trạng"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        dangThem = false;
        buttonState(true);
        updateContentState();
        fsach = "src/controller/SACH.DAT";
        fbanDoc = "src/controller/BANDOC.DAT";
        fquanly = "src/controller/QLMS.DAT";
        loadData();
    }
    private void buttonState(boolean b){
        them.setEnabled(b);
        capNhat.setEnabled(!b);
        boQua.setEnabled(!b);
    }
    private void updateContentState(){
        if(dangThem){
            cacbandoc.setEnabled(true);
            cacmasach.setEnabled(true);
            soLuong.setEnabled(true);
            status.setEnabled(true);
        }
        else{
            cacbandoc.setSelectedIndex(0);
            cacbandoc.setEnabled(false);
            cacmasach.setSelectedIndex(0);
            cacmasach.setEnabled(false);
            soLuong.setText("");
            soLuong.setEnabled(false);
            status.setText("");
            status.setEnabled(false);
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
        hienThi = new javax.swing.JButton();
        luuVaoFIile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        soLuong = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        capNhat = new javax.swing.JButton();
        boQua = new javax.swing.JButton();
        cacbandoc = new javax.swing.JComboBox<>();
        cacmasach = new javax.swing.JComboBox<>();
        loaisapxep = new javax.swing.JComboBox<>();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(hienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(luuVaoFIile, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(them)
                    .addComponent(hienThi)
                    .addComponent(luuVaoFIile))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        JLabel1.setText("Mã bạn đọc:");

        jLabel2.setText("Mã sách:");

        jLabel3.setText("Số lượng:");

        jLabel4.setText("Tình trạng sách:");

        soLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soLuongActionPerformed(evt);
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

        cacbandoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cacmasach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(boQua, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cacmasach, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cacbandoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(soLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(status))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel1)
                    .addComponent(cacbandoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cacmasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capNhat)
                    .addComponent(boQua))
                .addGap(45, 45, 45))
        );

        loaisapxep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Lựa chọn sắp xếp --", "Theo họ tên", "Theo số lượng giảm" }));
        loaisapxep.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                loaisapxepItemStateChanged(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loaisapxep, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loaisapxep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void soLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soLuongActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        buttonState(false);
        dangThem = true;
        updateContentState();
        cacbandoc.requestFocus();
    }//GEN-LAST:event_themActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0 || row > jTable1.getRowCount()-1){
            JOptionPane.showMessageDialog(this, "Chọn hàng");
        }
        else{
            for(int i=0; i<cacbandoc.getItemCount(); i++){
                if(cacbandoc.getItemAt(i).equalsIgnoreCase(tm.getValueAt(row, 0).toString())){
                    cacbandoc.setSelectedIndex(i);
                    break;
                }
            }
            String maSach = null;
            for(Sach ele:slist){
                if(tm.getValueAt(row, 2).toString().equalsIgnoreCase(ele.getTen())){
                    maSach = "" + ele.getMa();
                }
            }
            for(int i=0; i<cacmasach.getItemCount(); i++){
                if(cacmasach.getItemAt(i).equalsIgnoreCase(maSach)){
                    cacmasach.setSelectedIndex(i);
                    break;
                }
            }
            soLuong.setText(tm.getValueAt(row, 3).toString());
            status.setText(tm.getValueAt(row, 4).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void hienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hienThiActionPerformed
        loadData();
        tm.setRowCount(0);
        for(QLMS ele:qllist){
            tm.addRow(ele.toObject());
        }
    }//GEN-LAST:event_hienThiActionPerformed

    private void luuVaoFIileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuVaoFIileActionPerformed
        IOFile.writeF(fquanly, qllist);
        IOFile.writeF(fsach, slist);
        IOFile.writeF(fbanDoc, bdlist);
    }//GEN-LAST:event_luuVaoFIileActionPerformed
    
    public Sach getSachByMa(int ma){
        loadSach();
        for(Sach ele:slist){
            if(ele.getMa() == ma)
                return ele;
        }
        return null;
    }
    public BanDoc getBDByMa(int ma){
        loadBanDoc();
        for(BanDoc ele:bdlist){
            if(ele.getMa() == ma)
                return ele;
        }
        return null;
    }
    private void capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capNhatActionPerformed
        try{
            String maBD, maSach, solg, tinhtrang;
            maBD = cacbandoc.getSelectedItem().toString();
            maSach = cacmasach.getSelectedItem().toString();
            solg = soLuong.getText();
            tinhtrang = status.getText();
            int type = 0;
            if(tinhtrang.isEmpty())
                type = 4;
            if(solg.isEmpty())
                type = 3;
            if(maSach.contains("-"))
                type = 2;
            if(maBD.contains("-"))
                type = 1;
            if(type != 0)
                throw new TrongEx(type);
            int sl = Integer.parseInt(solg);
            if(sl < 1)
                throw new SLEx();
            if(trung2Ma(maBD, maSach)){
                JOptionPane.showMessageDialog(this, "Trùng 2 mã");
                cacbandoc.requestFocus();
                return;
            }
            if(demDauSach(Integer.parseInt(maBD)) > 5){
                JOptionPane.showMessageDialog(this, "Bạn này đã mượn hơn 5 quyển");
                cacbandoc.requestFocus();
                return;                              
            }
            Sach stmp = getSachByMa(Integer.parseInt(maSach));
            if(sl > stmp.getSoLuong()){
                JOptionPane.showMessageDialog(this, "Không đủ sách");
                soLuong.requestFocus();
                return;                
            }
            BanDoc bdtmp = getBDByMa(Integer.parseInt(maBD));
            QLMS ql = new QLMS(bdtmp, stmp, sl, tinhtrang);
            stmp.setSoLuong(stmp.getSoLuong()-sl);
            if(dangThem){
                tm.addRow(ql.toObject());
                qllist.add(ql);
            }
            buttonState(true);
            dangThem = false;
            updateContentState();
        }catch(TrongEx e){
            JOptionPane.showMessageDialog(this, "Không được để trống nhé!");
            if(e.type == 1)
                cacbandoc.requestFocus();
            else if(e.type == 2)
                cacmasach.requestFocus();
            else if(e.type == 3)
                soLuong.requestFocus();
            else
                status.requestFocus();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Phải ghi số!");
            soLuong.requestFocus();
        }catch(SLEx e){
            JOptionPane.showMessageDialog(this, "Phải ghi số dương!");
            soLuong.requestFocus();
        }
    }//GEN-LAST:event_capNhatActionPerformed

    private void boQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boQuaActionPerformed
        buttonState(true);
        dangThem = false;
        updateContentState();
    }//GEN-LAST:event_boQuaActionPerformed

    private void loaisapxepItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_loaisapxepItemStateChanged
        switch(loaisapxep.getSelectedIndex()){
            case 1:
                qllist.sort(new Comparator<QLMS>(){
                    @Override
                    public int compare(QLMS o1, QLMS o2) {
                        String[] lten1 = o1.getBandoc().getTen().split("\\d+");
                        String[] lten2 = o2.getBandoc().getTen().split("\\d+");
                        String ten1 = lten1[lten1.length-1];
                        String ten2 = lten2[lten2.length-1];
                        if(ten1.equalsIgnoreCase(ten2)){
                            return o1.getBandoc().getTen().compareToIgnoreCase(o2.getBandoc().getTen());
                        }
                        return ten1.compareToIgnoreCase(ten2);
                    }
                });
                break;
            case 2:
                qllist.sort(new Comparator<QLMS>(){
                    @Override
                    public int compare(QLMS o1, QLMS o2) {
                        return Integer.compare(o2.getSoluong(), o1.getSoluong());
                    }
                });
                break;
            default:
                break;
        }
        tm.setRowCount(0);
        for(QLMS ele:qllist){
            tm.addRow(ele.toObject());
        }
    }//GEN-LAST:event_loaisapxepItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JButton boQua;
    private javax.swing.JComboBox<String> cacbandoc;
    private javax.swing.JComboBox<String> cacmasach;
    private javax.swing.JButton capNhat;
    private javax.swing.JButton hienThi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> loaisapxep;
    private javax.swing.JButton luuVaoFIile;
    private javax.swing.JTextField soLuong;
    private javax.swing.JTextField status;
    private javax.swing.JButton them;
    // End of variables declaration//GEN-END:variables
}

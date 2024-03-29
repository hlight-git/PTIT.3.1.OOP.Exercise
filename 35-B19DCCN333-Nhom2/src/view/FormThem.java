/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import model.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import neww.model.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class FormThem extends javax.swing.JPanel {

    DefaultTableModel tm;
    private String fquanly;
    private List <QLTB> qllist;
    
    public void loadData(){
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
        show(qllist);
    }
    public FormThem() {
        initComponents();
        String cols[] = {"Mã phòng", "Tên phòng", "Mã thiết bị", "Tên thiết bị", "Số lượng", "Tình trạng"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        fquanly = "src/controller/QLTB.DAT";
        loadData();
    }
    
    public void show(List <QLTB> list){
        tm.setRowCount(0);
        for(QLTB ele:list)
            tm.addRow(ele.toObject());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        hienthi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        timkiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tim = new javax.swing.JButton();
        tinhtoan = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTable1);

        hienthi.setText("Hiển thị");
        hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hienthiActionPerformed(evt);
            }
        });

        jLabel1.setText("Tìm kiếm:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        tim.setText("Tìm");
        tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timActionPerformed(evt);
            }
        });

        tinhtoan.setText("Tính số sách mượn cho từng bạn đọc");
        tinhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhtoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tim))
                            .addComponent(tinhtoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hienthi)
                    .addComponent(jLabel1)
                    .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tim))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(tinhtoan)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hienthiActionPerformed
        loadData();
        show(qllist);
    }//GEN-LAST:event_hienthiActionPerformed

    private void timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timActionPerformed
        String tmp = timkiem.getText().toLowerCase();
        List <QLTB> list = new ArrayList<>();
        loadData();
        for(QLTB ele:qllist){
            if(ele.getP().getTen().toLowerCase().contains(tmp) || ele.getTb().getTen().toLowerCase().contains(tmp))
                list.add(ele);
        }
        qllist = list;
        show(list);
    }//GEN-LAST:event_timActionPerformed

    private void tinhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhtoanActionPerformed
        loadData();
        jTextArea1.setText("");
        Map <String, Integer> o = qllist.stream().collect(Collectors.groupingBy(QLTB::getKey, Collectors.summingInt(QLTB::getSoLuong)));
        jTextArea1.append("Thiết bị\tTỔNG SỐ LƯỢNG đã dùng");
        o.forEach((K, V) -> {
            jTextArea1.append("\n" + K + "\t\t" + V);
        });
        
    }//GEN-LAST:event_tinhtoanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton hienthi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton tim;
    private javax.swing.JTextField timkiem;
    private javax.swing.JButton tinhtoan;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author ADMIN
 */
public class GUIPractice extends JFrame implements ActionListener, DocumentListener{
    private JLabel lbln1, lbln2, lblnkq;
    private JButton bt1, bt2, bt3;
    private JTextField txt1, txt2;
    public GUIPractice(){
        initGUI();
    }
    private void initGUI(){
        setTitle("Testing");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        
        lbln1 = new JLabel("Nhap so a:");
        lbln2 = new JLabel("Nhap so b:");
        lblnkq = new JLabel("Ket qua:");
        lbln1.setBounds(50, 50, 120, 20);
        lbln2.setBounds(50, 100, 120, 20);
        lblnkq.setBounds(80, 150, 200, 20);
        add(lbln1);
        add(lbln2);
        add(lblnkq);
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt1.setBounds(200, 50, 150, 20);
        txt2.setBounds(200, 100, 150, 20);
        add(txt1);
        add(txt2);
        bt1 = new JButton("Reset");
        bt2 = new JButton("Tính");
        bt3 = new JButton("Cancel");
        bt1.setBounds(100, 200, 100, 20);
        bt2.setBounds(300, 200, 100, 20);
        bt3.setBounds(200, 300, 100, 20);
        add(bt1);
        add(bt2);
        add(bt3);
        Font f = new Font("Arial", Font.BOLD, 20);
        lbln1.setFont(f);
        lbln2.setFont(f);
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        txt1.getDocument().addDocumentListener(this);
        txt2.getDocument().addDocumentListener(this);
    }
//    public static void main(String[] args) {
//        GUIPractice window = new GUIPractice();
//        window.setVisible(true);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt1){
            txt1.setText("");
            txt2.setText("");
        }
        else if(e.getSource() == bt2){
            lblnkq.setText("Ket qua: " + (Integer.parseInt(txt1.getText()) + Integer.parseInt(txt2.getText())));
        }
        else if(e.getSource() == bt3){
            if(JOptionPane.showConfirmDialog(this, "Thoat?", "Thoat", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                System.exit(0);
            }
        }
    }
    private void check(){
        String s1 = txt1.getText();
        String s2 = txt2.getText();  
        String reg = "\\d+";
        bt1.setEnabled(!s1.isEmpty() || !s2.isEmpty());
        bt2.setEnabled(!s1.isEmpty() && !s2.isEmpty() && s1.matches(reg) && s2.matches(reg));
    }
    @Override
    public void insertUpdate(DocumentEvent e) {
        check();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        check();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
//        check();
    }
    
}

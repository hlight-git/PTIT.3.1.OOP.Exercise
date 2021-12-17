/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class ThietBi implements Serializable{
    private int ma;
    private String ten, xuatxu, nam;
    private int soluong;
    private static int tbma = 10000;

    public ThietBi(int ma, String ten, String xuatxu, String nam, int soluong) {
        this.ma = ma;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.nam = nam;
        this.soluong = soluong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public static int getTbma() {
        return tbma;
    }

    public static void setTbma(int tbma) {
        ThietBi.tbma = tbma;
    }
    
    public Object[] toObject(){
        return new Object[]{ma, ten, nam, xuatxu, soluong};
    }
}

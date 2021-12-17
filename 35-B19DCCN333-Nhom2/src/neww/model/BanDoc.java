/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neww.model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class BanDoc implements Serializable{
    private int ma;
    private String ten;
    private String diaChi;
    private String sdt;
    private static int bdma = 10000;

    public BanDoc(int ma, String ten, String diaChi, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public static int getBdma() {
        return bdma;
    }

    public static void setBdma(int bdma) {
        BanDoc.bdma = bdma;
    }
    
    public Object[] toObject(){
        return new Object[]{ma, ten, diaChi, sdt};
    }
}

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
public class Phong implements Serializable{
    private int ma;
    private String ten, loai;
    private static int pma = 10000;

    public Phong(int ma, String ten, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getPma() {
        return pma;
    }

    public static void setPma(int pma) {
        Phong.pma = pma;
    }
    
    public Object[] toObject(){
        return new Object[] {ma, ten, loai};
    }
    
}

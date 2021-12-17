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
public class QLTB implements Serializable{
    private ThietBi tb;
    private Phong p;
    private int soLuong;
    private String status;

    public QLTB(ThietBi tb, Phong p, int soLuong, String status) {
        this.tb = tb;
        this.p = p;
        this.soLuong = soLuong;
        this.status = status;
    }

    public ThietBi getTb() {
        return tb;
    }

    public void setTb(ThietBi tb) {
        this.tb = tb;
    }

    public Phong getP() {
        return p;
    }

    public void setP(Phong p) {
        this.p = p;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getKey(){
        return tb.getMa() + " " + tb.getTen();
    }
    public Object[] toObject(){
        return new Object[]{p.getMa(), p.getTen(), tb.getMa(), tb.getTen(), soLuong, status};
    }
}

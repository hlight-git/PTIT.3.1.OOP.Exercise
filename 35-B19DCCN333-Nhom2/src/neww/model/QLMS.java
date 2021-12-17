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
public class QLMS implements Serializable{
    private BanDoc bandoc;
    private Sach sach;
    private int soluong;
    private String status;

    public QLMS(BanDoc bandoc, Sach sach, int soluong, String status) {
        this.bandoc = bandoc;
        this.sach = sach;
        this.soluong = soluong;
        this.status = status;
    }

    public BanDoc getBandoc() {
        return bandoc;
    }

    public void setBandoc(BanDoc bandoc) {
        this.bandoc = bandoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getKey(){
        return bandoc.getMa() + " " + bandoc.getTen();
    }
    public Object[] toObject(){
        return new Object[]{bandoc.getMa(), bandoc.getTen(), sach.getTen(), soluong, status};
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiochogv;

/**
 *
 * @author ADMIN
 */
public class GV {
    private String ma;
    private String ten;
    private MonHoc mon;
    private double gioday;

    public GV(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public MonHoc getMon() {
        return mon;
    }

    public void setMon(MonHoc mon) {
        this.mon = mon;
    }

    public void setGioday(double gioday) {
        this.gioday = gioday;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

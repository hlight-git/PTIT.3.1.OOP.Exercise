/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsmathang;

/**
 *
 * @author ADMIN
 */
public class MatHang {
    private String ma;
    private String ten;
    private String donvi;
    private long giamua;
    private long giaban;

    private String MA(int ma){
        if(ma < 10){
            return "MH00" + ma;
        }
        if(ma < 100){
            return "MH0" + ma;
        }
        return "MH" + ma;
    }
    public MatHang(int ma, String ten, String donvi, long giamua, long giaban) {
        this.ma = MA(ma);
        this.ten = ten;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public long loiNhuan(){
        return giaban - giamua;
    }

    @Override
    public String toString() {
        return ma + " " 
                + ten + " " 
                + donvi + " "
                + giamua + " "
                + giaban + " "
                + loiNhuan();
    }
    
}

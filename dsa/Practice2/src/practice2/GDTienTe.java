/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;

/**
 *
 * @author ADMIN
 */
public class GDTienTe extends GiaoDich implements ITinhTien{
    private String loaiTien;

    public GDTienTe() {
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    @Override
    public double getTien() {
        double tyGia = 1;
        if(loaiTien.equalsIgnoreCase("USD")){
            tyGia = 23;
        }
        else if(loaiTien.equalsIgnoreCase("EURO")){
            tyGia = 26;
        }
        super.setTien(super.getSoLuong()*super.getDonGia()*tyGia);
        return super.getSoLuong()*super.getDonGia()*tyGia;
    }
    @Override
    public String toString() {
        return super.getMa() + "    " 
                + loaiTien +"    "
                + super.getNgayGD() + "   " 
                + super.getDonGia() + "   " 
                + super.getSoLuong() + "  " 
                + this.getTien();
    }
    
    
}

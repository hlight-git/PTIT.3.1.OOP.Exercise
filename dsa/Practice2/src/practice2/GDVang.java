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
public class GDVang extends GiaoDich implements ITinhTien{
    private String loaiVang;

    public GDVang() {
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    
    @Override
    public double getTien() {
        double base = super.getSoLuong()*super.getDonGia();
        if(loaiVang.equalsIgnoreCase("18K")){
            base = base * 8 / 10;
        }
        else if(loaiVang.equalsIgnoreCase("16K")){
            base = base * 6 / 10;
        }
        super.setTien(base);
        return base;
    }
    @Override
    public String toString() {
        return super.getMa() + "    " 
                + loaiVang +"    "
                + super.getNgayGD() + "   " 
                + super.getDonGia() + "   " 
                + super.getSoLuong() + "  " 
                + this.getTien();
    }
    
    
}

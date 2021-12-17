/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class SinhVien2{
    private String ma;
    private String hoten;
    private boolean gioitinh;
    private String nsinh;
    private double diem;

    public SinhVien2(String ma, String hoten, boolean gioitinh, String nsinh, double diem) {
        this.ma = ma;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.nsinh = nsinh;
        this.diem = diem;
    }

    public SinhVien2(String ma, double diem, String hoten) throws SaiMSVException, DiemException, TenException {
        String rg = "A[0-9]{2}";
        if (!ma.matches(rg)){
            throw new SaiMSVException("Sai cau truc MSV.");
        }
        if(hoten.isEmpty()){
            throw new TenException("Ten khong duoc trong.");
        }
        if(diem < 0 || diem > 10){
            throw new DiemException("Sai cau truc diem.");
        }
        this.ma = ma;
        this.diem = diem;
    }

    
    public boolean isGioitinh() {
        return gioitinh;
    }

    public double getDiem() {
        return diem;
    }

    public String getMa() {
        return ma;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNsinh() {
        return nsinh;
    }

    public int getThang() {
        String[] parts = this.nsinh.split("/");
        return Integer.parseInt(parts[1]);
    }
    
}

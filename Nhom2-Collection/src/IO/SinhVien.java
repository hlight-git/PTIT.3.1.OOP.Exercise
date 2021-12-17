/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SinhVien implements Serializable{
    private int STT;
    private String ten;
    private int diem;
    private String DOB;

    public SinhVien() {
    }

    
    public SinhVien(int STT, String ten, int diem, String DOB) {
        this.STT = STT;
        this.ten = ten;
        this.diem = diem;
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return STT + " " + ten + " " + diem + " " + DOB;
    }
    
    
    
}

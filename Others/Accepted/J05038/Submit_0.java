/*
	Run time: 0.17s
	Memory: 28716Kb
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class main {

    public static class NhanVien implements Comparable<NhanVien> {

        private String ma, hoTen;
        private int luongThang, thuong, phuCap, thuNhap;

        public NhanVien(int stt, String hoTen, int luongCoBan, int soNgayCong, String chucVu) {
            this.ma = "NV" + String.format("%02d", stt);
            this.hoTen = hoTen;
            this.luongThang = soNgayCong * luongCoBan;
            this.phuCap = timPhuCap(chucVu);
            this.thuong = timTienThuong(soNgayCong, luongThang);
            this.thuNhap = luongThang + phuCap + thuong;
        }

        public int getThuNhap() {
            return thuNhap;
        }

        public void setThuNhap(int thuNhap) {
            this.thuNhap = thuNhap;
        }

        private static int timPhuCap(String chucVu) {
            if (chucVu.equals("GD")) {
                return 250000;
            } else if (chucVu.equals("PGD")) {
                return 200000;
            } else if (chucVu.equals("TP")) {
                return 180000;
            } else {
                return 150000;
            }
        }

        private static int timTienThuong(int soNgayCong, int luongThang) {
            if (soNgayCong >= 25) {
                return (int) (0.2 * luongThang);
            } else if (soNgayCong >= 22) {
                return (int) (0.1 * luongThang);
            } else {
                return 0;
            }
        }

        public int compareTo(NhanVien n) {
            if (this.thuNhap < n.thuNhap) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return ma + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<NhanVien> listNV = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            listNV.add(new NhanVien(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()), in.nextLine()));
        }
//        Collections.sort(listNV);
        int sum = 0;
        for (NhanVien nhanVien : listNV) {
            System.out.println(nhanVien);
            sum += nhanVien.getThuNhap();
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}

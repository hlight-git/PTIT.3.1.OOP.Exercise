package nguyenduchuong;

import java.util.Scanner;

public class Menu{
    public static void main(String[] args){

        Songuyen  arr = null;
        matranchunhat a = null;
        while(true){
            System.out.println("-------menu-------");
            System.out.println("1:nhap vao 1 day so nguyen");

            System.out.println("2:so nho nhat khong am");
            System.out.println("3: day so nguyen giam dan(tu pt thu 3 den pt truoc cuoi)");
            System.out.println("4: day con co tong bang k");
            System.out.println("5:nhap vao dong van ban");
            System.out.println("6:dua ra so tu");
            System.out.println("7:dua ra so cau");
            System.out.println("8: nhap cao 1 ma tran chu nhat A");
            System.out.println("9:dua ra ma tran chuyen vi A");

            System.out.println("0:thoat");
            System.out.println("nhap tu 0->9");

            Scanner in = new Scanner(System.in);
            int chon;
            chon = Integer.parseInt(in.nextLine());

            switch(chon){
                case 0:System.out.println("Exit!");
                    break;
                case 1:arr.nhapMang();
                    break;
                case 2:
                    break;
                case 8:a.NhapMatran();
                    break;
            } 

        
        }
    }
}
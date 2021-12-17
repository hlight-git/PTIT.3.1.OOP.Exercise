/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testth2;

import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    static PhoneBook pb = new PhoneBook();
    static void showMenu(){
        System.out.println("----------------------------------------------------");
        System.out.println("1. Nhập số điện thoại nội hạt (không trùng số điện thoại, đúng định dạng mã vùng và số điện thoại).");
        System.out.println("2. Nhập số điện thoại quốc tế (không trùng số điện thoại, đúng định dạng mã quốc gia, mã vùng và số điện thoại).");
        System.out.println("3. Viết ra danh sách toàn bộ danh bạ điện thoại – có tính số lượng ở cuối.");
        System.out.println("4. Sửa 1 số điện thoại nội hạt khi nhập vào số điện thoại (ví dụ 024-36407515, thì nhập 36407515 – sửa mã vùng (chỉ 2 hoặc 3 số)).");
        System.out.println("5. Sắp xếp danh bạ điện thoại theo mã vùng.");
        System.out.println("6. Đưa ra danh sách điện thoại có 3 số cuối trùng nhau.");
        System.out.println("7. Đưa ra tổng số điện thoại theo từng tỉnh thành (mã vùng).");
        System.out.println("0. Dừng chương trình.");
        System.out.println("----------------------------------------------------");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            showMenu();
            System.out.println("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 0: //Nothing
                    break;
                case 1: pb.nhapSDTNoiHat();
                    break;
                case 2: pb.nhapSDTQuocTe();
                    break;
                case 3: pb.lietKeSDT();
                    break;
                case 4: pb.suaSDTNoiHat();
                    break;
                case 5: pb.sapXepSDT();
                    break;
                case 6: pb.lietkeSDTCoDuoi();
                    break;
                case 7: pb.tongSDTTheoTinhThanh();
                    break;
                default:
                    System.out.println("Không tồn tại lựa chọn, nhập lại!");
                    break;
            }
            if(choice == 0)
                break;
        }
    }
    
}

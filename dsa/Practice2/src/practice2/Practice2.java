/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Practice2 {
    static QLGD q = new QLGD();
    static void showMenu(){
        System.out.println("----------------------------------------------------");
        System.out.println("1. Nhập giao dịch vàng.");
        System.out.println("2. Nhập giao dịch tiền tệ.");
        System.out.println("3. Viết ra danh sách toàn bộ giao dịch của ngân hàng.");
        System.out.println("4. Sửa 1 giao dịch tiền tệ khi nhập mã .");
        System.out.println("5. Sắp xếp các giao dịch vàng theo tiền.");
        System.out.println("6. Đưa ra tiền giao dịch cao nhất cho từng loại vàng (từ danh sách giao dịch vàng.");
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
                case 1: q.nhapGDVang();
                    break;
                case 2: q.nhapGDTienTe();
                    break;
                case 3: q.lietKeDS();
                    break;
                case 4: q.suaGDTienTe();
                    break;
                case 5: q.sapXepGDVangTheoTien();
                    break;
                case 6: q.TienCaoNhatTungLoaiVang();
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

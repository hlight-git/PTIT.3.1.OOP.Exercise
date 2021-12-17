/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static IntegerHandle ih;
    static StringHandle sh;
    static Matrix m;
    public static void showMenu(){
        System.out.println("1. Nhập vào 1 dãy số nguyên.");
        System.out.println("2. Viết ra số nhỏ nhất không âm.");
        System.out.println("3. Viết ra dãy số sắp xếp giảm dần (từ phần tử thứ 3 đến trước phần tử cuối).");
        System.out.println("4. Viết ra các dãy con có tổng bằng k (k nhập từ bàn phím), viết ra không có (nếu không tìm thấy).");
        System.out.println("5. Nhập vào dòng văn bản.");
        System.out.println("6. Đưa ra số từ.");
        System.out.println("7. Đưa ra số câu.");
        System.out.println("8. Nhập vào 1 ma trận chữ nhật A.");
        System.out.println("9. Đưa ra ma trận chuyển vị của A.");
        System.out.println("0. Dừng chương trình.");
        
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
                case 1:
                    System.out.print("- Nhập số lượng số trong dãy: ");
                    ih = new IntegerHandle(Integer.parseInt(sc.nextLine()));
                    ih.init(sc);
                    break;
                case 2:
                    ih.printMinUnsignValue();
                    break;
                case 3:
                    ih.printRevSortedSubArr();
                    break;
                case 4:
                    System.out.print("- Nhập K: ");
                    int K = Integer.parseInt(sc.nextLine());
                    System.out.println("- Các dãy con có tổng bằng K: ");
                    ih.calSubArrWithSumEqualToK(K, 0, 0, "");
                    if(!ih.isCheck()){
                        System.out.println("Không có.");
                    }
                    break;
                case 5:
                    System.out.println("- Nhập dòng văn bản: ");
                    sc.nextLine();
                    sh = new StringHandle(sc.nextLine());
                    break;
                case 6:
                    System.out.println("- Số từ trong dòng văn bản là: " + sh.numOfWord());
                    break;
                case 7:
                    System.out.println("- Số câu trong dòng văn bản là: " + sh.numOfSentence());
                    break;
                case 8:
                    m = new Matrix();
                    m.init(sc);
                    System.out.println("- Nhập ma trận: ");
                    break;
                case 9:
                    System.out.println("- Ma trận chuyển vị: ");
                    m.transposition().showMatrix();
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Test {

    static double arr[];
    static String str;
    static Matrix m;
    static Matrix n;
    public static void showMenu(){
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. Nhập 2 ma trận vuông.");
        System.out.println("8. Tính tổng 2 ma trận.");
        System.out.println("9. ");
        System.out.println("0. Thoát.");
        System.out.print("Nhập lựa chọn của bạn: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while(true){
//            showMenu();
//            int choice = sc.nextInt();
//            switch(choice){
//                case 1:
//                    Polynomial p = new Polynomial(sc.nextInt());
//                    Polynomial p2 = new Polynomial(sc.nextInt());
//                    p.init(sc);
//                    p2.init(sc);
//                    p.mod(p2).print();
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//                case 5:
//                    break;
//                case 6:
//                    break;
//                case 7:
//                    System.out.print("- Nhập số hàng ma trận: ");
//                    int row = sc.nextInt();
//                    m = new Matrix(row);
//                    n = new Matrix(row);
//                    System.out.println("- Nhập ma trận vuông thứ nhất:");
//                    m.init(sc);
//                    System.out.println("- Nhập ma trận vuông thứ hai:");
//                    n.init(sc);
//                    break;
//                case 8:
//                    System.out.println("- Tổng 2 ma trận: ");
//                    m.sum(n).print();
//                    break;
//                case 9:
//                    break;
//                case 0:
//                    break;
//            }
//            System.out.println();
//            if(choice == 0)
//                break;
//        }
        List l = new ArrayList<SortTest>();
        l.add(new SortTest("tqh"));
        l.add(new SortTest("tqi"));
        l.add(new SortTest("tqk"));
        l.add(new SortTest("tqa"));
        Collections.sort(l);
        System.out.println(l);
    }
    
}

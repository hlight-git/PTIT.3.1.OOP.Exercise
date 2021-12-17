/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsmathang;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DSMatHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soMH = Integer.parseInt(sc.nextLine());
        List <MatHang> list = new ArrayList<>();
        for(int i=1; i<= soMH; i++){
            list.add(new MatHang(
                    i, 
                    sc.nextLine(), 
                    sc.nextLine(), 
                    Long.parseLong(sc.nextLine()), 
                    Long.parseLong(sc.nextLine()))
            );
        }
        list.sort(new Comparator <MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return Long.compare(o2.loiNhuan(), o1.loiNhuan());
            }
            
        });
        for(MatHang ele:list){
            System.out.println(ele);
        }
    }
    
}

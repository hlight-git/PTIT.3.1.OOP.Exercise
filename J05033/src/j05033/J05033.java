/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J05033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N = sc.nextShort();
        ArrayList <Time> list = new ArrayList <Time>();
        for(short i=0; i<N; i++){
            list.add(new Time(sc.nextByte(), sc.nextByte(), sc.nextByte()));
        }
        Collections.sort(list);
        for(Time ele:list){
            System.out.println(ele);
        }
    }
    
}

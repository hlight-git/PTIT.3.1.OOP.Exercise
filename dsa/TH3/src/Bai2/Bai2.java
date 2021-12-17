/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Bai2 {
    public static void main(String[] args) {
        String file="src/Bai2/In.txt";
        List<Integer> kq=new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            while ((line=br.readLine())!=null){
                List<Integer> b=new ArrayList<>();
                int i = 0;
                b.add(9);
                int c = 9;
                int d = 9;
                int a=Integer.parseInt(line);
                while(c%a!=0 && d %a!=0){
                    c=b.get(i)*10;
                    d=b.get(i)*10+9;
                    b.add(c);b.add(d);
                    i++;
                }
                if(c%a==0){
                    kq.add(c);
                }else{
                    if(d%a==0){
                        kq.add(d);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);;
        }
        
        String font="src/Bai2/Out.txt";
        try {
            PrintWriter p= new PrintWriter(font);
            for (Integer i : kq) {
                p.println(i);
            }
        p.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
}

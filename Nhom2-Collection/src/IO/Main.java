/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "src/IO/sv.dat";
        List <SinhVien> list = new ArrayList<>();
//        try{
//            File file = new File(filename);
//            Scanner sc = new Scanner(file);
//            while(sc.hasNextLine()){
//                String tmp[] = sc.nextLine().split(",");
//                int STT = Integer.parseInt(tmp[0]);
//                String ten = tmp[1];
//                int diem = Integer.parseInt(tmp[2]);
//                String DOB = tmp[3];
//                list.add(new SinhVien(STT, ten, diem, DOB));
//            }
//        }catch(FileNotFoundException e){
//            System.out.println(e);
//        }catch(IOException e){
//            System.out.println(e);
//        }
//        for(SinhVien ele:list){
//            System.out.println(ele);
//        }
//        List <SinhVien> list = IOFile.readF(filename);
//        for(SinhVien ele:list){
//            System.out.println((SinhVien)ele);
//        }
            list.add(new SinhVien(1, "t q h", 10, "23/9/2001"));
            list.add(new SinhVien(2, "t q h", 10, "23/9/2001"));
            list.add(new SinhVien(3, "t q h", 10, "23/9/2001"));
            IOFile.writeF("tqh.txt", list);
            IOFile.readF("tqh.txt");
    }
}

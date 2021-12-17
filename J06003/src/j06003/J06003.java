/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j06003;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class J06003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        Group[] groups = new Group[M];
        for(int i=0; i<M; i++){
            groups[i] = new Group();
        }
        for(int i=0; i<N; i++){
            Student stu = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
            groups[Integer.parseInt(sc.nextLine())-1].add(stu);
        }
        for(int i=0; i<M; i++){
            groups[i].setTopic(sc.nextLine());
        }
        int q = sc.nextInt();
        while(q-- >0){
            int index = sc.nextInt();
            System.out.println("DANH SACH NHOM " + index + ":");
            groups[index-1].display();
        }
    }
    
}

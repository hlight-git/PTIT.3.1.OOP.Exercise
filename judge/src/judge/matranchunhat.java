package nguyenduchuong;

import java.util.Scanner;

public class matranchunhat {
    private int m,n;
    private int a[][];
    private Scanner in = new Scanner(System.in);

    public matranchunhat(int m,int n){
        this.m=m;
        this.n=n;
        a = new int[m][n];

    }

    public void NhapMatran(){
        System.out.println("nhap hang: ");
        m =Integer.parseInt(in.nextLine());
        System.out.println("nhap cot: ");
        n =Integer.parseInt(in.nextLine());
        a = new int[m][n];

    }
    public void nhap(){
        for(int i=0;i<m;i++)
            for(int j = 0;j<n;j++)
                System.out.print("m"+i+"n"+j);
    }
}


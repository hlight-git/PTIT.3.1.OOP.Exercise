package nguyenduchuong;
 
import java.util.Scanner;

public class Songuyen {
    private int a[];
    
    public void nhapMang(){
        Scanner  in = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n=in.nextInt();
        a = new int[n];
        for (int i=0; i<a.length;i++)
        {
            System.out.print("Nhap phan tu thu"+(i+1)+": ");
            a[i] = in.nextInt();
        }
    }
}

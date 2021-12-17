package Bai1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai1 {
     public static void main(String[] args) {
        Trai c = new Trai();
        Thread t = new Thread(c);
        phai b = new phai();
        Thread u = new Thread(b);
        t.start();
        u.start();
        Scanner sc = new Scanner(System.in);
        String in = null;
        while (sc.hasNext()&&  !(in=sc.next().toUpperCase()).equalsIgnoreCase("X"))
        {
            if (in.equalsIgnoreCase("L"))
                t.suspend(); 
            else if(in.equalsIgnoreCase("R"))
                u.suspend();
            else if(in.equalsIgnoreCase("T1"))
                t.resume();
            if(in.equalsIgnoreCase("T2"))
                u.resume();  
        }
        t.stop();
        u.stop();
        sc.close();
    }
}

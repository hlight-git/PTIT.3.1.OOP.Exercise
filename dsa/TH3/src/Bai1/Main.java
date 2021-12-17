/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th2.bai1;
import java.util.*;

/**
 *
 * @author An
 */
public class Main {
    public static void main(String[] args) {
        LeftThread l = new LeftThread();
        RightThread r = new RightThread();
        Thread lt = new Thread(l);
        Thread lr = new Thread(r);
        lt.start();
        lr.start();
        Scanner ip = new Scanner(System.in);
        while(true){
            if(ip.nextLine().equalsIgnoreCase("x")){
                lt.stop();
                lr.stop();
            }
            if(ip.nextLine().equalsIgnoreCase("l")){
                lt.suspend();
            }
           if(ip.nextLine().equalsIgnoreCase("r")){
                lr.suspend();
           }
            if(ip.nextLine().equalsIgnoreCase("t1")){
                lt.resume();
            }
            if(ip.nextLine().equalsIgnoreCase("t2")){
                lr.resume();
           }
        }
    }
}

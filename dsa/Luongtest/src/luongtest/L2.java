/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongtest;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class L2 extends Thread{
    private Data d;
    public int grade = 10;
    
    public L2(Data d){
        this.d = d;
    }

    @Override
    public void run() {
        try{
            synchronized(d){
                while(true){
                    d.wait();
                    if(!d.isRunning())
                        break;
                    CauHoi cur = d.get();
                    System.out.println(cur.getNoiDung());
                    Map <String, Boolean> m = cur.getMap();
                    for(String ele:m.keySet()){
                        System.out.println(ele);
                    }
                    Scanner sc = new Scanner(System.in);
                    if(m.get(sc.next())){
                        System.out.println("+1");
                    }
                    else{
                        System.out.println("-1");
                    }
                    d.notify();
                }
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("done2");
    }
    
}

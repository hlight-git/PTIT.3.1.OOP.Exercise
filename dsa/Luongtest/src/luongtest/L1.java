/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongtest;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class L1 extends Thread{
    private Data d;
    
    public L1(Data d) {
        this.d  = d;
    }
    
    public void run(){
        try{
            Scanner sc = new Scanner(new File("data.txt"));
            synchronized(d){
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    String tmp[] = line.split(":");
                    String quest = tmp[0].trim();
                    Map <String, Boolean> m = new HashMap <>();
                    for(String ele:tmp[1].trim().split(";")){
                        String res = ele.split("/")[0].trim();
                        String ans = ele.split("/")[1].trim();
                        m.put(res, ans.equalsIgnoreCase("T"));
                    }
                    d.add(new CauHoi(quest, m));
                    d.notify();
                    d.wait();
//                    sleep(1000);
                }
                d.setRunning(false);
                d.notify();
            }
            sc.close();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("done");
        stop();
    }
}

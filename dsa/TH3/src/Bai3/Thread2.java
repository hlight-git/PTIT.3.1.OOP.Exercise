/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Thread2 extends Thread{
    private Data d;
    
    public Thread2(Data d){
        this.d = d;
    }
    @Override
    public void run() {
        try{
            Scanner sc = new Scanner(new File("src/Bai3/dapan.txt"));
            synchronized(d){
                while(d.isRunning()){
                    while(d.getIndex() != 2){
                        d.wait();
                    }
                    if(sc.hasNextLine()){
                        String line = sc.nextLine();
                        d.setTrueAns(line.trim());
                        d.setIndex(3);
                        d.notifyAll();
                        d.wait();
                    }
                    else{
                        d.setIndex(3);
                        d.notifyAll();
                    }
                }
                sc.close();
                d.wait();
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread 2 stopped.");
        stop();        
    }
    
    
}

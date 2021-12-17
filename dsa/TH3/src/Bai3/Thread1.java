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
public class Thread1 extends Thread{
    private Data d;
    
    public Thread1(Data d){
        this.d = d;
    }
    @Override
    public void run() {
        try{
            Scanner sc = new Scanner(new File("src/Bai3/cauhoi.txt"));
            synchronized(d){
                while(d.isRunning()){
                    while(d.getIndex() != 1){
                        d.wait();
                    }
                    if(sc.hasNextLine()){
                        String line = sc.nextLine();
                        String tmp[] = line.split("/");
                        String question = tmp[0].trim() + "?";
                        String answer = tmp[1].trim() + " " + tmp[2].trim();
                        d.setQuest(question);
                        d.setAns(answer);
                        d.setIndex(2);
                        d.notifyAll();
                    }
                    else{
                        d.setRunning(false);
                        d.setIndex(2);
                        d.notifyAll();
                    }
                }
                sc.close();
                d.wait();
                d.wait();
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread 1 stopped.");
        stop();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Thread3 extends Thread{
    private Data d;
    
    public Thread3(Data d){
        this.d = d;
    }

    @Override
    public void run() {
        try{
            Scanner sc = new Scanner(System.in);
            synchronized(d){
                while(d.isRunning()){
                    while(d.getIndex() != 3){
                        d.wait();
                    }
                    if(!d.isRunning()){
                        break;
                    }
                    System.out.println(d.getQuest());
                    System.out.println(d.getAns());
                    System.out.print("Your answer: ");
                    if(sc.nextLine().equalsIgnoreCase(d.getTrueAns())){
                        d.incGrade();
                    }
                    d.setIndex(1);
                    d.notifyAll();
                }
                System.out.println("Total grade: " + d.getGrade());
                d.notifyAll();
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread 3 stopped.");
        stop();        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author An
 */
public class LeftThread  implements Runnable{
    public boolean running;
    public LeftThread(){
        running = true;
    }
    @Override
    public void run(){
        String line = "HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG - KHOA CNTT1";
        int len = line.length();
        while(running){
            System.out.println(line);
            line = line.substring(1, len) + line.charAt(0);
            try {
                Thread.sleep(300);
                
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public void stop(){
        running = false;
    }
    void suspend() {
        running = true;
    }
    synchronized void resume() {
        running = false;
        notify();
    }
}

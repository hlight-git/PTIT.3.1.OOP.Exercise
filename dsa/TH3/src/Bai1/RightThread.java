/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th2.bai1;

/**
 *
 * @author An
 */
public class RightThread implements Runnable{
    public boolean running;
    public RightThread(){
        running = true;
    }
    @Override
    public void run(){
        String line = "HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG - KHOA CNTT1";
        while(true){
            System.out.println(line);
            line = line.charAt(line.length()-1) + line.substring(0, line.length()-1);
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

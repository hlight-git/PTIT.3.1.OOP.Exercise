/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongtest;

import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class Data {
    private int index;
    private boolean running;
    Vector <CauHoi> tasks;

    public Data() {
        index = 1;
        running = true;
        tasks = new Vector<>();
    }
    
    public void add(CauHoi x){
        tasks.add(x);
    }
    public CauHoi get(){
        return tasks.remove(0);
    }
    public boolean isEmpty(){
        return tasks.isEmpty();
    }
    public int getIndex() {
        return index;
    }
    
    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
    
    
}

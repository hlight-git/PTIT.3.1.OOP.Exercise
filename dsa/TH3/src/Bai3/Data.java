/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author ADMIN
 */
public class Data {
    private boolean running;
    private int index;
    private int grade;
    private String quest;
    private String ans;
    private String trueAns;
    
    public Data(){
        running = true;
        index = 1;
        grade = 0;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getGrade() {
        return grade;
    }

    public void incGrade() {
        this.grade += 1;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getTrueAns() {
        return trueAns;
    }

    public void setTrueAns(String trueAns) {
        this.trueAns = trueAns;
    }
    
}

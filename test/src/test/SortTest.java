/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ADMIN
 */
public class SortTest implements Comparable<SortTest>{
    private String a;
    SortTest(String a){
        this.a = a;
    }

    @Override
    public String toString() {
        return a;
    }
    
    @Override
    public int compareTo(SortTest o) {
        return a.compareToIgnoreCase(o.a);
    }
    
}

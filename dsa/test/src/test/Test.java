/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new ThreadDemo();
        Runable r = new Runable();
        Thread t2 = new Thread(r);
    }
    
}

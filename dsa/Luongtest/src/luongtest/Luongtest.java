/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongtest;

import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Luongtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d = new Data();
        L1 l1 = new L1(d);
        L2 l2 = new L2(d);
        l1.start();
        l2.start();
    }
    
}

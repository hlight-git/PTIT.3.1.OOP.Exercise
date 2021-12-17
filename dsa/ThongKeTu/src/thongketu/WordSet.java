/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thongketu;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class WordSet {
    private Set <String> set;

    public WordSet(Scanner sc) {
        set = new TreeSet<>();
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(String ele:set){
            res += ele + "\n";
        }
        return res;
    }
    
}

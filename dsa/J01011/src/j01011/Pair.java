/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01011;

/**
 *
 * @author ADMIN
 */
public class Pair {
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    
    public int GCD(){
        int fi = first;
        int se = second;
        int tmp;
        while(se != 0){
            tmp = fi % se;
            fi = se;
            se = tmp;
        }
        return fi;
    }
    public long LCM(){
        return (long)(first/GCD())*second;
    }
}

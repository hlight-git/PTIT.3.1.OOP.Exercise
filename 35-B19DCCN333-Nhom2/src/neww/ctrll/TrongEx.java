/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neww.ctrll;

/**
 *
 * @author ADMIN
 */
public class TrongEx extends Exception{
    public int type = 0;
    public TrongEx(int type){
        this.type = type;
    }
}

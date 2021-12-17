/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01005;

/**
 *
 * @author ADMIN
 */
public class Triangle {
    private int base;
    private int height;
    private short numOfPart;
    
    Triangle(int base, short numOfPart, int height){
        this.base = base;
        this.height = height;
        this.numOfPart = numOfPart;
    }
    public int getNumOfPart(){
        return numOfPart;
    }
    public double getHeight(int part){
        return Math.sqrt((double)part/numOfPart)*height;
    }
}

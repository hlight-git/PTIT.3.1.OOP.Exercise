/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Polynomial {
    private int deg;
    private float[] coeff;

    public Polynomial(int deg) {
        this.deg = deg;
        this.coeff = new float[deg+1];
    }
    public Polynomial(Polynomial other){
        this.deg = other.deg;
        this.coeff = new float[other.deg+1];
        for(int i=0; i<=other.deg; i++){
            this.coeff[i] = other.coeff[i];
        }
    }

    public void init(Scanner sc){
        for(int i=0; i<=deg; i++){
            coeff[i] = sc.nextFloat();
        }
    }
    public void print(){
        for(int i=0; i<=deg; i++){
            if(coeff[i] == (int) coeff[i]){
                System.out.print((int)coeff[i] + " ");
            }
            else{
                System.out.print(coeff[i] + " ");
            }
        }
        System.out.println();
    }
    public double valueOf(int x){
        double y = 0;
        double tmp = 1;
        for(int i=0; i<=deg; i++){
            y += tmp * coeff[i];
            tmp *= (double) x;
        }
        return y;
    }
    public Polynomial deriv(){
        Polynomial res = new Polynomial(deg-1);
        for(int i=1; i<=deg; i++){
            res.coeff[i-1] = this.coeff[i]*(float)i;
        }
        return res;
    }
    public Polynomial plus(Polynomial other){
        Polynomial res;
        int minDeg = Math.min(deg, other.deg);
        if(deg > other.deg){
            res = new Polynomial(this);
        }
        else{
            res = new Polynomial(other);
        }
        for(int i=0; i<=res.deg; i++){
            res.coeff[i] = coeff[i] + other.coeff[i];
            if(i == minDeg)
                break;
        }
        return res;
    }
    public Polynomial sub(Polynomial other){
        int maxDeg = Math.max(deg, other.deg);
        Polynomial res = new Polynomial(maxDeg);
        for(int i=0; i<=res.deg; i++){
            if(i <= deg)
                res.coeff[i] = coeff[i];
            if(i <= other.deg)
                res.coeff[i] = res.coeff[i] - other.coeff[i];
        }
        return res;
    }
    private Polynomial up(Polynomial base, int time){
        Polynomial res = new Polynomial(base.deg + time);
        for(int i=time; i<= res.deg; i++){
            res.coeff[i] = base.coeff[i-time];
        }
        return res;
    }
    public Polynomial div (Polynomial other){
        if(this.deg < other.deg){
            return new Polynomial(-1);
        }
        Polynomial res = new Polynomial(this.deg - other.deg);
        Polynomial mod = new Polynomial(this);
        for(int j=res.deg; j>=0; j--){
            mod.print();
            Polynomial tmp = up(other, mod.deg - other.deg);
            res.coeff[j] = mod.coeff[mod.deg]/other.coeff[other.deg]; 
            for(int i=0; i<=tmp.deg; i++){
                tmp.coeff[i] *= res.coeff[j];
            }
            for(int i=0; i<=mod.deg; i++){
                mod.coeff[i] -= tmp.coeff[i];
            }
            mod.deg -= 1;
        }
        return res;
    }
    public Polynomial mod (Polynomial other){
        Polynomial res = new Polynomial(this);
        while(res.deg >= other.deg){
            res.print();
            Polynomial tmp = up(other, res.deg - other.deg);
            float tmpCoeff = res.coeff[res.deg]/other.coeff[other.deg]; 
            for(int i=0; i<=tmp.deg; i++){
                tmp.coeff[i] *= tmpCoeff;
            }
            for(int i=0; i<=res.deg; i++){
                res.coeff[i] -= tmp.coeff[i];
            }
            res.deg -= 1;
        }
        return res;
    }
}

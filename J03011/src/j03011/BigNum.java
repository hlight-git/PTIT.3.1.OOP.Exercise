/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j03011;

/**
 *
 * @author ADMIN
 */
public class BigNum {
    private String num;

    public BigNum() {
    }

    public BigNum(String num) {
        this.num = num;
    }
    public long moduloFor(long n){
        long ans = 0;
        for(char i:num.toCharArray()){
            ans = ans*10 + (i - '0');
            ans %= n;
        }
        return ans;
    }
    public long GCDwith(long n){
        long m = this.moduloFor(n);
        long tmp;
        while(m != 0){
            tmp = n % m;
            n = m;
            m = tmp;
        }
        return n;
    }
}

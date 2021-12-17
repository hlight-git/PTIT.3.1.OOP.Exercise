/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j01013;

/**
 *
 * @author ADMIN
 */
public class PrimeDivisor {
    private long[] dp = new long[2000001];
    public void DP(){
        for(int i=2; i<2000001; i++){
            if(dp[i] == 0){
                for(int j=i; j<2000001; j+=i){
                    int exp = 1;
                    int tmp = j/i;
                    while(tmp % i == 0){
                        ++exp;
                        tmp /= i;
                    }
                    dp[j] += exp * i;
                }
            }
        }
    }
    public PrimeDivisor(){
        DP();
    }

    public long getVal(int num) {
        return dp[num];
    }
    
}

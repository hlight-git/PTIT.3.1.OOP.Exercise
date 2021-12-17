/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lopphanso;

/**
 *
 * @author ADMIN
 */
public class PhanSo {
    private long tuSo;
    private long mauSo;

    public PhanSo(String s){
        String line[] = s.split(" ");
        this.tuSo = Long.parseLong(line[0]);
        this.mauSo = Long.parseLong(line[1]);
    }

    public PhanSo(PhanSo other) {
        this.tuSo = other.tuSo;
        this.mauSo = other.mauSo;
    }
    
    private static long GCD(long x, long y){
        long tmp;
        while(y != 0){
            tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }
    private long LCM(long x, long y){
        return x / GCD(x, y) * y;
    }
    private void rutGon(){
        long gcd = GCD(tuSo, mauSo);
        tuSo /= gcd;
        mauSo /= gcd;
    }
    public PhanSo cong(PhanSo B){
        PhanSo tmp = new PhanSo(this);
        long lcm = LCM(tmp.mauSo, B.mauSo);
        tmp.tuSo *= lcm / tmp.mauSo;
        tmp.tuSo += B.tuSo * (lcm / B.mauSo);
        tmp.mauSo = lcm;
        tmp.rutGon();
        return tmp;
    }
    public PhanSo nhan(PhanSo B){
        PhanSo tmp = new PhanSo(this);
//        tmp.tuSo = A.tuSo / GCD(A.tuSo, B.mauSo) * (B.tuSo / GCD(A.tuSo, B.mauSo));
//        System.out.println(GCD(A.mauSo, B.tuSo));
//        tmp.mauSo = A.mauSo / GCD(A.mauSo, B.tuSo) * B.mauSo;
        tmp.tuSo *= B.tuSo;
        tmp.mauSo *= B.mauSo;
        tmp.rutGon();
        return tmp;
    }
    @Override
    public String toString(){
        return  String.format("" + tuSo + '/' + mauSo);
    }
    
}

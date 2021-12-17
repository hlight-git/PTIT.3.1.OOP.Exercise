/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testth2;

/**
 *
 * @author ADMIN
 */
public class Phone implements IViet{
    private int maVung;
    private String noiVung;
    
//    public Phone(int start, String s) {
//        int i = s.lastIndexOf("-");
//        maVung = Integer.parseInt(s.substring(start, i));
//        noiVung = s.substring(i+1);
//    }
    public Phone(String s) {
        int i = s.lastIndexOf("-");
        maVung = Integer.parseInt(s.substring(0, i));
        noiVung = s.substring(i+1);
    }
    
    public int getMaVung() {
        return maVung;
    }

    public void setMaVung(int maVung) {
        this.maVung = maVung;
    }

    public String getNoiVung() {
        return noiVung;
    }

    public void setNoiVung(String noiVung) {
        this.noiVung = noiVung;
    }

    @Override
    public String toString() {
        return "0" + maVung + "-" + noiVung;
    }

    @Override
    public void out() {
        System.out.println(this);
    }
}

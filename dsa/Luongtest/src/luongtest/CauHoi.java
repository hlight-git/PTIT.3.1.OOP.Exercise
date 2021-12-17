/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luongtest;

import java.util.List;
import java.util.Map;


/**
 *
 * @author ADMIN
 */
public class CauHoi {
    private int ma;
    private String noiDung;
    private Map <String, Boolean> map;

    public CauHoi(String noiDung, Map <String, Boolean> map) {
        this.noiDung = noiDung;
        this.map = map;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Map<String, Boolean> getMap() {
        return map;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private String ma;
    private String ten;
    private String gioiTnh;
    private String ngaySinh;
    private String diaChi;

    private String MA(int ma){
        if(ma < 10){
            return "MH00" + ma;
        }
        if(ma < 100){
            return "MH0" + ma;
        }
        return "MH" + ma;
    }
    private boolean namNhuan(int){
        
    }
    private int it(String cv){
        return Integer.parseInt(cv);
    }
    private boolean hoply(int ngay, int thang, int nam){
        
    }
    private String chuanHoa(String date){
        String tmp[] = date.split("/");
        int dob[] = new int[3];
        for(int i=0; i<3; i++){
            dob[i] = it(tmp[i]);
        }
        if(tmp)
        int thua =  dob[0] - dob[0]%31;
        dob
        
    }
}

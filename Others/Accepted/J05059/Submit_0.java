/*
	Run time: 0.16s
	Memory: 30624Kb
*/
import java.util.Scanner;

public class main {
    public static class ThiSinh {
    //

    private String ma;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemUT;
    private float tongDiem;
    private float diemThat;
    

    //
    public ThiSinh() {

    }

    //
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemUT() {
        return diemUT;
    }

    public void setDiemUT(float diemUT) {
        this.diemUT = diemUT;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(float tongDiem) {
        this.tongDiem = tongDiem;
    }

    public float getDiemThat() {
        return diemThat;
    }

    public void setDiemThat(float diemThat) {
        this.diemThat = diemThat;
    }

    
    
    //
    public void nhap(Scanner in) {
        this.ma = in.nextLine();
        this.hoTen = in.nextLine();
        this.diemToan = Float.parseFloat(in.nextLine());
        this.diemLy = Float.parseFloat(in.nextLine());
        this.diemHoa = Float.parseFloat(in.nextLine());
    }

    public void check(){
        diemUT = this.diemUuTien();
        tongDiem = this.diemHoa + this.diemLy + this.diemToan * 2;
        diemThat = tongDiem + this.diemUuTien();
    }
    
    public void xuat() {
        System.out.print(this.ma + " " + this.hoTen + " ");
        // in diem uu tien
        if (diemUT * 10 == (int) diemUT * 10) {
            System.out.print((int) diemUT + " ");
        } else {
            System.out.printf("%.1f ", diemUT);
        }

        // in tong diem
        if (diemThat * 10 == (int) diemThat * 10) {
            System.out.print((int) diemThat + " ");
        } else {
            System.out.printf("%.1f ", diemThat);
        }

        // in ket qua
        
    }

    //
    public float diemUuTien() {
        String res = this.ma.substring(2, 3);
        if (res.equals("1")) {
            return 0.5f;
        }
        if (res.equals("2")) {
            return 1.0f;
        }
        return 2.5f;
    }

    public float diemXetTuyen() {
        return this.diemHoa + this.diemLy + this.diemToan * 2 + this.diemUuTien();
    }
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ThiSinh arr[] = new ThiSinh[t + 3];
        int k = 0;
        while (t-- > 0) {
            ThiSinh ts = new ThiSinh();
            ts.nhap(in);
            ts.check();
            arr[k++] = ts;
        }
        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (arr[i].getMa().compareTo(arr[j].getMa()) < 0) {
                    ThiSinh x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }

        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (arr[i].diemXetTuyen() < arr[j].diemXetTuyen()) {
                    ThiSinh x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        int p = Integer.parseInt(in.nextLine());
        float max = 0;
        for(int i = 0; i < p; i++)
            max = arr[i].getDiemThat();
        System.out.println(String.format("%.1f", max));
        for (int i = 0; i < k; i++) {
            arr[i].xuat();
            if (arr[i].getDiemThat() >= max) {
            System.out.println("TRUNG TUYEN");
            } else {
            System.out.println("TRUOT");
            }
        }
    }

}
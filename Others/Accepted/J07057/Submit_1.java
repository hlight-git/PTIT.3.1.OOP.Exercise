/*
	Run time: 0.13s
	Memory: 32272Kb
*/
import java.util.*;
import java.io.*;
public class diemtuyensinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("THISINH.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<tuyensinh> ts=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ts.add(new tuyensinh(sc.nextLine(),Double.parseDouble(sc.nextLine()),sc.nextLine(),Integer.parseInt(sc.nextLine()),i));
        }
        Collections.sort(ts);
        for(tuyensinh tmp:ts){
            System.out.println(tmp);
        }
    }
}
class tuyensinh implements Comparable<tuyensinh>{
    private String name,dantoc,id,xh;
    private double diem;
    private int khuvuc;
    public tuyensinh(String name,double diem,String dantoc,int khuvuc,int id){
        this.name=chuanhoa(name);
        this.diem=diem;
        this.dantoc=dantoc;
        this.khuvuc=khuvuc;
        this.id=String.format("TS%02d", id);
        tinhtoan();
        xephang();
    }
    private String chuanhoa(String s){
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String word=st.nextToken();
            sb.append(word.substring(0,1).toUpperCase());
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    private void tinhtoan(){
        if(khuvuc==1) diem+=1.5;
        else if(khuvuc==2) diem+=1;
        if(!dantoc.equals("Kinh")) diem+=1.5; 
    }
    private void xephang(){
        if(diem>=20.5) this.xh="Do";
        else this.xh="Truot";
    }
    @Override
    public int compareTo(tuyensinh o) {
        if(diem==o.diem) return id.compareTo(o.id);
        return diem<o.diem?1:-1;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+diem+" "+xh;
    }
}
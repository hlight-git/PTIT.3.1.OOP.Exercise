/*
	Run time: 0.14s
	Memory: 33260Kb
*/
import java.util.*;
import java.io.*;
public class tinhdiemtrungbbinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("BANGDIEM.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<bangdiem> bd=new ArrayList<>();
        for(int i=1;i<=t;i++){
            bd.add(new bangdiem(sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),i));
        }
        Collections.sort(bd);
        int dem=0,res=1;
        float reskq=bd.get(0).getdiemtrungbinh();
        for(bangdiem tmp:bd){
            dem++;
            if(reskq==tmp.getdiemtrungbinh()){
                System.out.println(tmp+" "+res);
            }
            else{
                res=dem;
                reskq=tmp.getdiemtrungbinh();
                System.out.println(tmp+" "+dem);
            }
        }
    }
}
class bangdiem implements Comparable<bangdiem>{
    private String name,id,xh;
    private float trungbinh;
    public bangdiem(String name,float mon1,float mon2,float mon3,int id){
        this.name=chuanhoa(name);
        this.id=String.format("SV%02d",id);
        this.trungbinh=tinhtoan(mon1,mon2,mon3);
    }
    private float tinhtoan(float mon1,float mon2,float mon3){
        return (mon1*3+mon2*3+mon3*2)/8;
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
    @Override
    public int compareTo(bangdiem o) {
        if(trungbinh==o.trungbinh) return id.compareTo(o.id);
        return trungbinh<o.trungbinh?1:-1;
    }
    public float getdiemtrungbinh(){
        return this.trungbinh;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+String.format("%.2f", trungbinh);
    }
}

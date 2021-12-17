/*
	Run time: 0.15s
	Memory: 33420Kb
*/
import java.io.*;
import java.util.*;
public class xeploai {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("BANGDIEM.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<xh> bd=new ArrayList<>();
        for(int i=1;i<=t;i++){
            bd.add(new xh(sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),i));
        }
        Collections.sort(bd);
        for(xh tmp:bd){
            System.out.println(tmp);
        }
    }
    
}
class xh implements Comparable<xh>{
    private String name,id,xh;
    private float ans;
    public xh(String name,float mon1,float mon2,float mon3,int id){
        this.name=chuanhoa(name);
        this.id=String.format("SV%02d",id);
        this.ans=tinhtoan(mon1,mon2,mon3);
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
    private float tinhtoan(float mon1,float mon2,float mon3){
        return mon1*25/100+mon2*35/100+mon3*40/100;
    }
    private String xephang(){
        if(ans>=8) return "GIOI";
        else if(ans>=6.5)return "KHA";
        else if(ans>=5) return "TRUNG BINH";
        else return "KEM";
    }
    @Override
    public int compareTo(xh o) {
        return ans<o.ans?1:-1;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+String.format("%.2f", ans)+" "+xephang();
    }
}
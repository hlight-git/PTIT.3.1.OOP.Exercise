/*
	Run time: 0.19s
	Memory: 33280Kb
*/
import java.text.*;
import java.util.*;
import java.io.*;
public class danhsachtrungtuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("THISINH.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<thisinh> ts=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ts.add(new thisinh(sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(ts);
        int n=Integer.parseInt(sc.nextLine());
        float res=ts.get(n-1).getans();
        for(thisinh tmp:ts){
            if(res<=tmp.getans()) tmp.setkq("TRUNG TUYEN");
            else tmp.setkq("TRUOT");
        }
        System.out.println(String.format("%.1f",res));
        for(thisinh tmp: ts){
            System.out.println(tmp);
        }
    }
}
class thisinh implements Comparable<thisinh>{
    private String id,name,kq;
    private float toan,ly,hoa,diemuutien,ans;
    private DecimalFormat df=new DecimalFormat("0.#");
    public thisinh(String id,String name,float toan,float ly,float hoa){
        this.id=id;
        this.name=chuanhoa(name);
        this.diemuutien=diemuutien();
        this.ans=tinhtoan(toan,ly,hoa);
    }
    public void setkq(String s){
        this.kq=s;
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
    private float diemuutien(){
        String kv=id.substring(2,3);
        if(kv.equals("1")) return (float) 0.5;
        else if(kv.equals("2")) return (float) 1;
        else return (float) 2.5;
    }
    private float tinhtoan(float toan,float ly,float hoa){
        return toan*2+ly+hoa+diemuutien;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+df.format(diemuutien)+" "+df.format(ans)+" "+kq;
    }
    public float getans(){
        return ans;
    }
    @Override
    public int compareTo(thisinh o) {
        if(ans==o.ans) return id.compareTo(o.id);
        return ans<o.ans?1:-1;
    }
}
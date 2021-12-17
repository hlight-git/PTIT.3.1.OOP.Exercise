/*
	Run time: 0.19s
	Memory: 33172Kb
*/
import java.util.*;
import java.io.*;
public class sapxepmathang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MATHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<hang> h=new ArrayList<>();
        for(int i=1;i<=t;i++){
            h.add(new hang(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),i));
        }
        Collections.sort(h);
        for(hang tmp: h){
            System.out.println(tmp);
        }
    }
}
class hang implements Comparable<hang>{
    private String id,name,ma;
    private double mua,ban;
    public hang(String name,String ma,double mua,double ban,int id){
        this.ma=ma;
        this.name=name;
        this.ban=ban;
        this.mua=mua;
        this.id="MH"+String.format("%02d", id);
        loinhuan();
    }
    private double loinhuan(){
        return ban-mua;
    }
    @Override
    public int compareTo(hang a){
        return loinhuan()<a.loinhuan()?1:-1;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+ma+" "+String.format("%.2f",loinhuan());
    }
}
/*
	Run time: 0.20s
	Memory: 34120Kb
*/
import java.text.*;
import java.io.*;
import java.util.*;
public class tinhtienphong {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc=new Scanner(new File("KHACHHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<khach> ks=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ks.add(new khach(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),i));
        }
        Collections.sort(ks);
        for(khach tmp: ks){
            System.out.println(tmp);
        }
    }
}
class khach implements Comparable<khach>{
    private String name,phong,id,start,end;
    private long phi,thanhtien,songay;
    private SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    public khach(String name,String phong,String start,String end,long phi,int id) throws ParseException{
        this.name=chuanhoa(name);
        this.phong=phong.trim();
        this.start=start;
        this.end=end;
        this.phi=phi;
//        System.out.println(tienphong());
//        System.out.println(phi);
        songay();
        thanhtien();
        tienphong();
        this.id=String.format("KH%02d", id);
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
    private long songay() throws ParseException{
        Date st=sdf.parse(start);
        Date en=sdf.parse(end);
        this.songay=(en.getTime()-st.getTime())/(3600*1000*24)+1;
        return (en.getTime()-st.getTime())/(3600*1000*24)+1;
    }
    private long tienphong(){
        String tang=phong.substring(0,1);
        if(tang.equals("1")) return 25;
        else if(tang.equals("2")) return 34;
        else if(tang.equals("3")) return 50;
        else return 80;
    }
    private long thanhtien() throws ParseException{
        this.thanhtien=songay()*tienphong()+phi;
        return songay()*tienphong()+phi;
    }

    @Override
    public int compareTo(khach o) {
        return thanhtien<o.thanhtien?1:-1;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+phong+" "+songay+" "+thanhtien;
    }
}
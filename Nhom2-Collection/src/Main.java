
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
    public void main(String[] args) {
//        List list=new ArrayList();
//        //add
//        list.add("Ha Anh");
//        list.add("Thu lan");
//        list.add("cam tu");
//        list.add(1,"phuong anh");
//        list.add("Thu lan");
//        list.add("mai kim");
//        list.add("Thu lan");
//        list.add("bich ha");
//        System.out.println(list);
//        System.out.println(list.get(1));
//        list.remove("Thu lan");
//        list.remove(0);
//        System.out.println(list);
//        System.out.println(list.size());
//          System.out.println(list.indexOf("Thu lan"));
//          System.out.println(list.lastIndexOf("Thu lan"));
//          System.out.println(list.indexOf("Thuhhjjjj"));
//          list.set(0,"Tam tam");
//          System.out.println(list);
//          for (int i = 0; i < list.size(); i++) {
//              System.out.println(list.get(i));
//        }
//          list.add(12);
//          list.add(true);
//          list.add(new SinhVien());
//          String xau=(String)list.get(0);
//          SinhVien s=(SinhVien)list.get(list.size()-1);
//          List<String> list=new ArrayList<>(); 
//          list.add("Xau xau");
//          list.add("Lan hoa");
//          list.add("Cam tu");
//          list.add("Ha Anh");
//          list.add("Thu lan");
//          list.add("cam tu");
//          list.add(1,"phuong anh");
//          list.add("Thu lan");
//          String xau=list.get(0);
//          System.out.println("Cach 1");
//          for (int i = 0; i < list.size(); i++) {
//              System.out.println(list.get(i));
//        }
//          System.out.println("--------------");
//          System.out.println("Cach 2");
//          for (String i:list) {
//              System.out.println(i);
//        }
//          System.out.println("--------------");
//          System.out.println("Cach 3");
//          Iterator i=list.iterator();
//          while(i.hasNext())
//              System.out.println(i.next());
//          System.out.println("--------------");
//        System.out.println("Cach 4");
//          list.forEach(k->{
//              System.out.println(k);
//          });
//          System.out.println("--------------");  
//          System.out.println("Cach 5");
//          list.forEach(System.out::println);
//          System.out.println("-----");
//          System.out.println("cach 6");
//          list.stream().forEach(k->{
//              System.out.println(k);
//          });
          Scanner sc = new Scanner(System.in);
         try{
             SinhVien2 sv = new SinhVien2(sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine());
         }
         catch(SaiMSVException e){
             System.out.println(e);
         }
         catch(TenException e){
             System.out.println(e);
         }
         catch(DiemException e){
             System.out.println(e);
         }
    }
}

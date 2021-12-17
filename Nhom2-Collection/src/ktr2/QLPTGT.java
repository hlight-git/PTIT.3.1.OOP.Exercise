/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktr2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLPTGT implements ChucNang{
    private List<PTGT> list;
    private Scanner in=new Scanner(System.in);

    public QLPTGT() {
       list=new ArrayList<>();
       list.add(new Oto("HN876","yaris",2021, 800000, "do", "cho nu", 4));
        list.add(new XeMay("HN321", "Vision",2014, 38000, "bac", 150));
        list.add(new XeMay("HN881", "spacy",2000, 10000, "trang", 200));
        list.add(new Oto("HN111","kia morning",2000, 120000, "do", "cho nu", 7));
        list.add(new Oto("HN999","civic",2012, 900000, "bac", "cho nu", 16));
        list.add(new Oto("HN666","yaris",2006, 30000, "xanh", "cho nu", 7));
        list.add(new Oto("HN119","kia morning",2000, 20000, "do", "cho nu", 7));
        list.add(new Oto("HN100","kia morning",2000, 1120000, "do", "cho nu", 7));
    }
    private int tontai(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    private PTGT nhap(){
        String reg="^HN\\d{3}";
        String ma;
        while(true){
            System.out.print("ma:");
            ma=in.nextLine().toUpperCase();
            if(ma.matches(reg)&& tontai(ma)==-1)
                break;
            System.err.println("nhap lai!!");
        }
        System.out.print("hang:");
        String h =in.nextLine();
        System.out.print("Nam:");
        int nam =Integer.parseInt(in.nextLine());
        System.out.print("gia:");
        double gia =Double.parseDouble(in.nextLine());
        System.out.print("mau:");
        String mau =in.nextLine();
        return new PTGT(ma, h, nam, gia, mau);
    }
    
    
    @Override
    public void nhapOto() {
        PTGT p=nhap();
        System.out.print("kieu:");
        String k =in.nextLine();
        System.out.print("so cho:");
        int sc =Integer.parseInt(in.nextLine());
        list.add(new Oto(p.getMa(),p.getHang(), p.getNam(), 
                p.getGia(),p.getMau(), k, sc));
    }

    @Override
    public void nhapXeMay() {
        PTGT p=nhap();
        System.out.print("Cong suat:");
        double cs =Double.parseDouble(in.nextLine());
        
        list.add(new XeMay(p.getMa(),p.getHang(), p.getNam(), 
                p.getGia(),p.getMau(), cs));
    }

    @Override
    public void vietDS() {
        System.out.println("DS oto");
        for(PTGT i:list)
            if(i instanceof Oto)
                System.out.println(i);
        System.out.println("DS Xe may");
        for(PTGT i:list)
            if(i instanceof XeMay)
                System.out.println(i);
        System.out.println("--------------");
    }

    @Override
    public void xoa() {
        System.out.print("go vao ma can xoa:");
        String ma=in.nextLine();
        int vt=tontai(ma);
        if(vt==-1)
            System.out.println("co dau ma xoa!!!");
        else{
            list.remove(vt);
            System.out.println("xoa thanh cong!!");
        }
    }

    @Override
    public void sua() {
        System.out.print("go vao ma can sua:");
        String ma=in.nextLine();
        int vt=tontai(ma);
        if(vt==-1)
            System.out.println("co dau ma sua!!!");
        else{
            PTGT p=list.get(vt);
            System.out.print("hang:");
        String h =in.nextLine();
        System.out.print("Nam:");
        int nam =Integer.parseInt(in.nextLine());
        System.out.print("gia:");
        double gia =Double.parseDouble(in.nextLine());
        System.out.print("mau:");
        String mau =in.nextLine();
        p.setHang(h);
        p.setNam(nam);
        p.setGia(gia);
        p.setMau(mau);
            System.out.println("sua thanh cong!!");
        }
    }
    //sua oto hoac sua xe may
    
    //chinh xac
    @Override
    public void timTheoMa() {
        System.out.print("go vao ma can tim:");
        String ma=in.nextLine();
        int vt=tontai(ma);
        if(vt==-1)
            System.out.println("khong tim thay!!!");
        else{
            System.out.println(list.get(vt));
        }
    }
    //tim chua
    @Override
    public void timTheoHang() {
        System.out.print("go vao hang can tim:");
        String h=in.nextLine();
        boolean co=false;
        for(PTGT i:list){
            if(i.getHang().toLowerCase().contains(h.toLowerCase())){
                System.out.println(i);
                co=true;
            }
        }
        if(!co)
            System.out.println("khong co PT nao!!!");
    }
    // tu nam.... den nam....
    @Override
    public void timTheoNam() {
        System.out.print("go vao tu nam:");
        int n1=Integer.parseInt(in.nextLine());
        System.out.print("go vao den nam:");
        int n2=Integer.parseInt(in.nextLine());
        boolean co=false;
        for(PTGT i:list){
            if(i.getNam()>=n1 && i.getNam()<=n2){
                System.out.println(i);
                co=true;
            }
        }
        if(!co)
            System.out.println("khong co PT nao!!!");
    }

    @Override
    public void timTheoGiacao() {
        System.out.print("go vao gia de tim PT dat hon:");
        double gia=Double.parseDouble(in.nextLine());
        boolean co=false;
        for(PTGT i:list){
            if(i.getGia()>=gia){
                System.out.println(i);
                co=true;
            }
        }
        if(!co)
            System.out.println("khong co PT nao!!!");
    }

    @Override
    public void timTheoSoCho() {
        List<Oto> l=new ArrayList<>();
        for(PTGT i:list)
            if(i instanceof Oto)
                l.add((Oto)i);
        System.out.print("go vao so cho can tim:");
        int sc=Integer.parseInt(in.nextLine());
        boolean co=false;
        for(Oto i:l){
            if(i.getSocho()==sc){
                System.out.println(i);
                co=true;
            }
        }
        if(!co)
            System.out.println("khong co oto nao!!!");
    }

    @Override
    public void sapxepTheoMa() {
        Collections.sort(list);
    }

    @Override
    public void sapxepTheoSoCho() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoNam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoGiaGiam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoNamvaGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void thongke() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoCongSuat() {
        List<XeMay> l = new ArrayList();
        for(PTGT i:list)
            if(i instanceof XeMay)
                l.add((XeMay)i);
        l.sort(new Comparator<XeMay>(){
            @Override
            public int compare(XeMay o1, XeMay o2) {
                return Double.compare(o2.getCongsuat(), o1.getCongsuat());
            }
            
        });
    }

    @Override
    public void sapxepTheoMauvaGia() {
        list.sort(new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                if(o1.getMau().equalsIgnoreCase(o2.getMau()))
                    return Double.compare(o1.getGia(), o2.getGia());
                return o1.getMau().compareToIgnoreCase(o2.getMau());
            }
            
        });
    }

    
}

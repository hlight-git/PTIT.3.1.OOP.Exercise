/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class QLGD implements IChucNang{
    private List <GiaoDich> list;
    Scanner sc = new Scanner(System.in);

    public QLGD() {
        list = new ArrayList <>();
    }
    private boolean trungMa(String ma){
        for(GiaoDich ele:list){
            if(ele.getMa().equalsIgnoreCase(ma)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void nhapGDVang() {
        GDVang gd = new GDVang();
        System.out.println("Nhập mã: ");
        String ma;
        do{
            ma = sc.nextLine();
            if(trungMa(ma)){
                System.err.println("GD tồn tại, nhập lại!");
            }
        }while(trungMa(ma));
        gd.setMa(ma.toLowerCase());
        System.out.println("Nhập ngày GD: ");
        String rg = "[0-9][1-9]{0,1}/[0-9][0-9]{0,1}/[0-9]{4}";
        String ngay;
        do{
            ngay = sc.nextLine();
            if(!ngay.matches(rg)){
                System.err.println("Format không hợp lệ, nhập lại!");
            }
        }while(!ngay.matches(rg));
        gd.setNgayGD(ngay);
        System.out.println("Nhập đơn giá: ");
        gd.setDonGia(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập số lượng: ");
        gd.setSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập loại vàng: ");
        gd.setLoaiVang(sc.nextLine().toLowerCase());
        System.out.println("Nhập GD thành công!");
        list.add(gd);
    }

    @Override
    public void nhapGDTienTe() {
        GDTienTe gd = new GDTienTe();
        System.out.println("Nhập mã: ");
        String ma;
        do{
            ma = sc.nextLine();
            if(trungMa(ma)){
                System.err.println("GD tồn tại, nhập lại!");
            }
        }while(trungMa(ma));
        gd.setMa(ma.toLowerCase());
        System.out.println("Nhập ngày GD: ");
        String rg = "[0-9][1-9]{0,1}/[0-9][0-9]{0,1}/[0-9]{4}";
        String ngay;
        do{
            ngay = sc.nextLine();
            if(!ngay.matches(rg)){
                System.err.println("Format không hợp lệ, nhập lại!");
            }
        }while(!ngay.matches(rg));
        gd.setNgayGD(ngay);
        System.out.println("Nhập đơn giá: ");
        gd.setDonGia(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập số lượng: ");
        gd.setSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập loại tiền: ");
        gd.setLoaiTien(sc.nextLine().toLowerCase());
        System.out.println("Nhập GD thành công!");
        list.add(gd);
    }

    @Override
    public void lietKeDS() {
        List <GDVang> l1 = new ArrayList<>();
        List <GDTienTe> l2 = new ArrayList<>();
        for(GiaoDich ele:list){
            if(ele instanceof GDVang){
                l1.add((GDVang)ele);
            }
            else{
                l2.add((GDTienTe)ele);
            }
        }
        System.out.println("Danh sách giao dịch: ");
        System.out.println("- Giao dịch vàng: ");
        for(GDVang ele:l1){
            System.out.println(ele);
        }
        System.out.println("- Giao dịch tiền tệ: ");
        for(GDTienTe ele:l2){
            System.out.println(ele);
        }
    }

    @Override
    public void suaGDTienTe() {
        System.out.println("Nhập mã GD tiền cần sửa: ");
        String ma;
        do{
            ma = sc.nextLine();
            if(!trungMa(ma)){
                System.err.println("GD không tồn tại, nhập lại!");
            }
        }while(!trungMa(ma));
        boolean have = false;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma) && list.get(i) instanceof GDTienTe){
                System.out.println("Nhập ngày GD: ");
                String rg = "[0-9][1-9]{0,1}/[0-9][1-9]{0,1}/[0-9]{4}";
                String ngay;
                do{
                    ngay = sc.nextLine();
                    if(!ngay.matches(rg)){
                        System.err.println("Format không hợp lệ, nhập lại!");
                    }
                }while(!ngay.matches(rg));
                list.get(i).setNgayGD(ngay);
                System.out.println("Nhập đơn giá: ");
                list.get(i).setDonGia(Double.parseDouble(sc.nextLine()));
                System.out.println("Nhập số lượng: ");
                list.get(i).setSoLuong(Integer.parseInt(sc.nextLine()));
                System.out.println("Nhập loại tiền: ");
//                list.get(i).setLoaiTien(sc.nextLine().toLowerCase());
                System.out.println("Sửa GD thành công!");
                have = true;
            }
        }
        if(!have){
            System.out.println("Không tồn tại GD để sửa");
        }
    }

    @Override
    public void sapXepGDVangTheoTien() {
        List <GDVang> l1 = new ArrayList<>();
        for(GiaoDich ele:list){
            if(ele instanceof GDVang){
                l1.add((GDVang)ele);
            }
        }
        l1.sort(new Comparator<GDVang>(){
            @Override
            public int compare(GDVang o1, GDVang o2) {
                return Double.compare(o1.getTien(), o2.getTien());
            }
            
        });
        System.out.println(l1);
    }

    @Override
    public void TienCaoNhatTungLoaiVang() {
//        List <GDVang> l1 = new ArrayList<>();
//        for(GiaoDich ele:list){
//            if(ele instanceof GDVang){
//                l1.add((GDVang)ele);
//            }
//        }
//        Map <String, Integer> = l1.stream().collect(Collectors.groupingBy(
//                GDVang::getLoaiVang, Collectors.maxBy(GDVang::getTien)));
    }
    
    
}

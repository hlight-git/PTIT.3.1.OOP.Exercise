/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ADMIN
 */
public class PhoneBook implements IChucNang{
    private List<Phone> list;
    private Scanner sc = new Scanner(System.in);

    public PhoneBook() {
        list = new ArrayList<>();
        list.add(new IntPhone("123-12-12345678"));
        list.add(new Phone("12-12345679"));
        list.add(new IntPhone("123-123-12345678"));
    }
    private boolean tonTai(String s){
        for(Phone ele:list){
            if(("0"+s).equalsIgnoreCase(ele.toString()) || s.equalsIgnoreCase(ele.toString())){
                return true;
            }
        }
        return false;
    }
    @Override
    public void nhapSDTNoiHat() {
        String rg = "[1-9][0-9]{1,2}-[0-9]{8}";
        String sdt;
        do{
            sdt = sc.nextLine();
            if(!sdt.matches(rg)){
                System.err.println("SĐT không hợp lệ, nhập lại!");
            }
            else if(tonTai(sdt)){
                System.err.println("SĐT đã tồn tại, nhập lại!");
            }
        }while(!sdt.matches(rg) || tonTai(sdt));
        System.out.println("Nhập SĐT thành công!");
        list.add(new Phone(sdt));
    }

    @Override
    public void nhapSDTQuocTe() {
        String rg = "[0-9]{2}-[1-9][0-9]{1,2}-[0-9]{8}";
        String sdt;
        do{
            sdt = sc.nextLine();
            if(!sdt.matches(rg)){
                System.err.println("SĐT không hợp lệ, nhập lại!");
            }
            else if(tonTai(sdt)){
                System.err.println("SĐT đã tồn tại, nhập lại!");
            }
        }while(!sdt.matches(rg) || tonTai(sdt));
        System.out.println("Nhập SĐT thành công!");
        list.add(new IntPhone(sdt));
    }

    @Override
    public void lietKeSDT() {
        System.out.println("Danh sách SĐT trong danh bạ: ");
        for(Phone ele:list){
            ele.out();
        }
        System.out.println("Số lượng SĐT có trong danh bạ: " + list.size());
    }

    @Override
    public void suaSDTNoiHat() {
        System.out.println("Nhập SĐT cần sửa: ");
        String tail = sc.nextLine();
        boolean have = false;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getNoiVung().equalsIgnoreCase(tail)){
                have = true;
            }
        }
        if(!have){
            System.out.println("Không tồn tại SĐT cần sửa trong danh bạ!");
            return;
        }
        System.out.println("Nhập mã vùng thay thế: ");
        int change = Integer.parseInt(sc.nextLine());
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getNoiVung().equalsIgnoreCase(tail)){
                list.get(i).setMaVung(change);
            }
        }
    }

    @Override
    public void sapXepSDT() {
        list.sort(new Comparator<Phone>(){
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getMaVung() - o2.getMaVung();
            }
        });
        System.out.println("Sắp xếp danh bạ theo Mã Vùng: ");        
        for(Phone ele:list){
            ele.out();
        }
    }

    @Override
    public void lietkeSDTCoDuoi() {
        System.out.println("3 số đuôi SĐT cần tìm: ");
        String rg = "[0-9]{3}";
        String tail;
        do{
            tail = sc.nextLine();
            if(!tail.matches(rg)){
                System.err.println("Chỉ nhập đuôi 3 số, nhập lại!");
            }
        }while(!tail.matches(rg));
        boolean have = false;
        for(Phone ele:list){
            String tmp = ele.getNoiVung();
            if(tmp.substring(tmp.length()-3).equalsIgnoreCase(tail)){
                ele.out();
                have = true;
            }
        }
        if(!have){
            System.out.println("Không tồn tại SĐT nào có đuôi tương tự trong danh bạ.");
        }
    }

    @Override
    public void tongSDTTheoTinhThanh() {
        System.out.println("Thống kê SĐT theo từng tỉnh thành (mã vùng) trong nước: ");
        List <Phone> tmp = new ArrayList<>();
        for(Phone ele:list){
            if(ele instanceof IntPhone){
                continue;
            }
            tmp.add(ele);
        }
        Map <Integer, Long> cnt = tmp.stream().collect(Collectors.groupingBy(Phone::getMaVung, Collectors.counting()));
        cnt.forEach((K, V)-> System.out.println(K + ": " + V));
    }
}

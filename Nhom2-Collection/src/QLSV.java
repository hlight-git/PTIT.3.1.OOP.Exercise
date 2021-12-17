
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class QLSV implements ChucNang{
    private List <SinhVien2> list;
            
    public QLSV() {
        list = new ArrayList<>();
    }
    public void add(SinhVien2 sv){
        list.add(sv);
    }
    
    @Override
    public void SoLuongNamNu() {
        Map<Boolean, Long> cnt = list.stream().collect(Collectors.groupingBy(SinhVien2::isGioitinh, Collectors.counting()));
        System.out.println(cnt);
    }

//public void diemCaoTheoThang() {
//    Map<Integer, SinhVien> o = list.stream().collect(Collectors.groupingBy(
//        SinhVien::getThang,
//        Collectors.collectingAndThen(
//            Collectors.reducing(
//                (SinhVien s1, SinhVien s2) -> s1.getDiem() > s2.getDiem() ? s1 : s2,
//                Optional::get
//            )
//        )
//    ));
//    o.forEach((K, V) -> System.out.println(K + ":" + V));
//}

    @Override
    public void DiemCaoNhatTheoThang() {
//        Map <Integer, Double> = list.stream().collect(Collectors.groupingBy(SinhVien::getThang, list.stream().collect(Collectors.maxBy(Comparator.comparing(SinhVien::getThang)));
    }
    
    
}

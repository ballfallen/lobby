/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package update;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Minh Nghia
 */
public class QLDichVu {

    private final ArrayList<Decoration> dsTrangTri = new ArrayList<>();
    private final ArrayList<RentingKaraoke> dsKara = new ArrayList<>();
    private final ArrayList<Singer> dsCaSi = new ArrayList<>();
    

    public void themDv(DichVu a){
        
    }
    public void nhapTrangTri() {
        Decoration t = new Decoration();
        t.input();
        this.dsTrangTri.add(t);
    }

    public void themTrangTri(Decoration a) {
        this.dsTrangTri.add(a);
    }

    public void themTrangTri(Decoration... a) {
        this.dsTrangTri.addAll(Arrays.asList(a));
    }

    public void searchTrangTriByName(String kw) {
        List<Decoration> decor = this.dsTrangTri.stream().filter(h -> h.getYeuCau().contains(kw)).collect(Collectors.toList());
        decor.forEach(a -> a.hienThi());
    }

    public void showDecoration() {
        this.dsTrangTri.forEach(t -> t.hienThi());
    }

    public void nhapKara() {
        RentingKaraoke kr = new RentingKaraoke();
        kr.input();
        this.dsKara.add(kr);
    }

    public void themKara(RentingKaraoke a) {
        this.dsKara.add(a);
    }

    public void themKara(RentingKaraoke... a) {
        this.dsKara.addAll(Arrays.asList(a));
    }

    public RentingKaraoke searchKaraByRentingTime(double time) {
        return this.dsKara.stream().filter(h->h.getTimeKaraoke()==time).findFirst().get();
    }

    public void showKara() {
        this.dsKara.forEach(kr -> kr.hienThi());
    }

    public void nhapThueCaSi() {
        Singer a = new Singer();
        a.input();
        this.dsCaSi.add(a);
    }

    public void themCaSi(Singer a) {
        this.dsCaSi.add(a);
    }

    public void themCaSi(Singer... a) {
        this.dsCaSi.addAll(Arrays.asList(a));
    }

    public void xoaCaSi(int id) {
        this.dsCaSi.remove(id);
    }

    public void xoaKaraoke(int id) {
        this.dsKara.remove(id);
    }

    public void xoaTrangTri(int id) {
        this.dsTrangTri.remove(id);
    }

    public void searchSingerByName(String kw) {
        List<Singer> cs = this.dsCaSi.stream().filter(h -> h.getTenCaSi().contains(kw)).collect(Collectors.toList());
        cs.forEach(a -> a.hienThi());
    }

    public void showCaSi() {
        this.dsCaSi.forEach(thue -> thue.hienThi());
    }

    //cap nhat Trang tri
    public Decoration updateTrangTri(Decoration a) {
        Decoration b = new Decoration();
        for (Decoration x : dsTrangTri) {
            if (a == x) {
                b = x;
                System.out.print("Cap nhat yeu cau: ");
                b.setYeuCau(CauHinh.sc.nextLine());
                System.out.print("Cap nhat gia tien: ");
                b.setGiaTien(CauHinh.sc.nextDouble());
            }
        }
        return b;
    }

    public RentingKaraoke updateKaraoke(RentingKaraoke a) {
        RentingKaraoke b = new RentingKaraoke();
        for (RentingKaraoke x : dsKara) {
            if (a == x) {
                b = x;
                System.out.print("Cap nhat thoi gian thue: ");
                b.setTimeKaraoke(CauHinh.sc.nextDouble());
                System.out.print("Cap nhat gia tien: ");
                b.setGiaTien(CauHinh.sc.nextDouble());
                b.tinhTien();
            }
        }
        return b;
    }

    public Singer updateCaSi(Singer a) {
        Singer b = new Singer();
        for (Singer x : dsCaSi) {
            if (x == a){
                b = x;
                System.out.print("Cap nhat ten ca si: ");
                b.setTenCaSi(CauHinh.sc.nextLine());
                System.out.print("Cap nhat so bai hat: ");
                b.setGiaTien(CauHinh.sc.nextInt());
                System.out.print("Cap nhat gia tien (1 bai hat): ");
                b.setGiaTien(CauHinh.sc.nextInt());
                b.tinhTien();
            }
        }
        return b;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package update;

/**
 *
 * @author DELL
 */
public class Decoration {
    private static int dem;
    private String yeuCau;
    private String id;
    private double giaTien;
    
    {
        this.setId(String.format("%s", ++dem));
    }

    public Decoration() {
    }
    
    public void input(){
        System.out.print("Nhap yeu cau: ");
        this.yeuCau = CauHinh.sc.nextLine();
        System.out.print("Nhap gia tien: ");
        this.giaTien = CauHinh.sc.nextDouble();
    }
    
    public Decoration(String yeuCau, double giaTien) {
        this.yeuCau = yeuCau;
        this.giaTien = giaTien;
    }
    
    public double tinhTien(){
        return this.giaTien;
    }
    
    public String toString(){
        return "Trang tri";
    }
    
    public void hienThi(){
        System.out.printf("--%s--\nYeu cau: %s || Gia tien: %.1f",
                toString(), this.getYeuCau(), this.giaTien);
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the yeuCau
     */
    public String getYeuCau() {
        return yeuCau;
    }

    /**
     * @param yeuCau the yeuCau to set
     */
    public void setYeuCau(String yeuCau) {
        this.yeuCau = yeuCau;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the giaTien
     */
    public double getGiaTien() {
        return giaTien;
    }

    /**
     * @param giaTien the giaTien to set
     */
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    
    

    
}

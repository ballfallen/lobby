/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package update;

/**
 *
 * @author Minh Nghia
 */
public class MenuQLSP {

    public void hienThi() {
        Food a = new Food(true, "Rau xao", 10);
        Food b = new Food(false, "Ga quay", 50);
        Drink c = new Drink("Cocacola", 10, "Cocacola");
        Drink d = new Drink("Sting", 15, "PepsiCo");
        QLSanPham qlsp = new QLSanPham();
        qlsp.themFood(a, b);
        qlsp.themDrink(c, d);

        int choice;
        do {
            System.out.println("------------------QUAN LY MON AN---------------------");
            System.out.println("1.Them Thuc An");
            System.out.println("2.Xoa Thuc An");
            System.out.println("3.Cap Nhat Thuc An");
            System.out.println("4.Tim kiem Thuc An");
            System.out.println("5.Hien thi danh sach Thuc An");
            System.out.println("6.Them Do Uong");
            System.out.println("7.Xoa Do Uong");
            System.out.println("8.Cap nhat Uong");
            System.out.println("9.Tim kiem Do Uong");
            System.out.println("10.Hien thi danh sach Do Uong");
            System.out.println("0.Thoat");
            System.out.println("-----------------------------------------------------");
            System.out.println("Hay chon mot thao tac tu 0-10: ");
            choice = CauHinh.sc.nextInt();
            CauHinh.sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Them mon an vao danh sach");
                    qlsp.nhapFood();
                }
                case 3 -> {
                    System.out.println("Nhap mon can cap nhat(1,2...): ");
                    qlsp.showFood();
                    int chon = CauHinh.sc.nextInt();
                    CauHinh.sc.nextLine();
                    qlsp.updateFood(chon);
                }
                case 2 -> {
                    System.out.println("Xoa Thuc An");
                    qlsp.showFood();
                    System.out.println("\nHay nhap id cua thuc an can xoa: ");
                    int idFood;
                    idFood = CauHinh.sc.nextInt();
                    CauHinh.sc.nextLine();
                    qlsp.xoaFood(idFood);
                }
                case 4 -> {
                    System.out.println("Hay nhap ten mon an muon tim kiem");
                    String tenMonAn;
                    tenMonAn = CauHinh.sc.nextLine();
                    qlsp.timKiemFood(tenMonAn);
                    System.out.println("");
                }
                case 5 -> {
                    System.out.println("Hien thi danh sach Thuc An ");
                    qlsp.showFood();
                }
                case 6 -> {
                    System.out.println("Them Do Uong vao danh sach");
                    qlsp.themDrink();
                }
                case 7 -> {
                    System.out.println("Xoa Do Uong");
                    qlsp.showDrink();
                    System.out.println("\nHay nhap id cua Do Uong can xoa: ");
                    int idx;
                    idx = CauHinh.sc.nextInt();
                    qlsp.xoaDrink(idx);
                }
                case 8 -> {
                    System.out.print("Nhap do uong can cap nhat(1,2...): ");
                    int idDrink;
                    idDrink = CauHinh.sc.nextInt();
                    CauHinh.sc.nextLine();
                    qlsp.updateDrink(idDrink);
                }
                case 9 -> {
                    System.out.println("Hay nhap ten do uong muon tim kiem");
                    String tim;
                    tim = CauHinh.sc.nextLine();
                    qlsp.timKiemFood(tim);
                    System.out.println("");
                }
                case 10 -> {
                    System.out.println("Hien thi danh sach do uong ");
                    qlsp.showDrink();
                }
            }
        } while (choice != 0);
    }
    
}

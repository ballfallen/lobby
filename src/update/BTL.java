/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package update;

/**
 *
 * @author Minh Nghia
 */
public class BTL {

    public static void main(String[] args) {
       int choice=0;
       MenuQLSP qlsp = new MenuQLSP();
       MenuSanh qlLobby=new MenuSanh();
       do{
           System.out.println("---------------THAO TAC---------------");
           System.out.println("1.Quan ly sanh");
           System.out.println("2.Quan ly thuc an nuoc uong");
           System.out.println("3.Quan ly dich vu");
           System.out.println("--------------------------------------");
           System.out.println("Hay chon mot hanh dong");
           choice=CauHinh.sc.nextInt();
           CauHinh.sc.nextLine();
           switch(choice){
            case 1: qlLobby.hienthi();
            break;
            case 2: qlsp.hienThi();
            break;
                
           }
                   
       }while(choice!=0);
    }

   
}

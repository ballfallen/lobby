package update;

import update.QLSANH;

public class MenuSanh {
	public MenuSanh() {
	}
public void hienthi() {
	QLSANH qlsanh= new QLSANH();

	
	int choice =0;
	do{
		System.out.println("-------------QUAN LY SANH-------------");
		System.out.println("1. Them sanh ");
		System.out.println("2. Xoa sanh");
		System.out.println("3. Cap nhat sanh");
		System.out.println("4. Tim kiem sanh theo ten");
		System.out.println("5. Tim kiem sanh theo tang");
		System.out.println("6. Tim kiem sanh theo suc chua");
		System.out.println("0. Thoat chuong trinh");
		System.out.println("--------------------------------------");
		System.out.println("Hay chon 1 hanh dong: ");
		choice=CauHinh.sc.nextInt();
		CauHinh.sc.nextLine();
		switch(choice)
		{
		case 1:
			
			System.out.println("Nhap ten sanh: ");
			String name=CauHinh.sc.nextLine();
			System.out.println("Nhap suc chua sanh: ");
			int sucChua=CauHinh.sc.nextInt();
			CauHinh.sc.nextLine();
			System.out.println("Nhap vi tri sanh: ");
			int vt=CauHinh.sc.nextInt();
			CauHinh.sc.nextLine();
			System.out.println("Nhap gia tien sanh: ");
			double gia=CauHinh.sc.nextDouble();
			CauHinh.sc.nextLine();
			Lobby lb=new Lobby(name,sucChua,vt,gia);
			qlsanh.addSanh(lb);
			qlsanh.displayLobbyList();
			break;
		case 2:
			int id;
			qlsanh.displayLobbyList();
			System.out.println("Nhap id cua sanh muon xoa");
			id=CauHinh.sc.nextInt();
			System.out.println();
			qlsanh.xoaSanh(id-1);
			qlsanh.displayLobbyList();
			break;
		case 3: 
			qlsanh.displayLobbyList();
			System.out.println("Hay nhap id cua sanh muon thay doi(S---): ");
			String idSanh;
			idSanh=CauHinh.sc.nextLine();
			qlsanh.updateLobby(idSanh);
			break;
		case 4:
			System.out.println("Hay nhap ten sanh muon tim: ");
			String tenSanh=CauHinh.sc.nextLine();
			qlsanh.searchByName(tenSanh);
			break;
		case 5:
			System.out.println("Hay nhap suc chua sanh muon tim: ");
			int capa=CauHinh.sc.nextInt();
			qlsanh.searchByCapacity(capa);
			break;
		case 6:
			System.out.println("Hay nhap suc chua sanh muon tim: ");
			int loca=CauHinh.sc.nextInt();
			qlsanh.searchByLocation(loca);
			break;
		}
	}while(choice!=0);
	
}
}

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang {
    public void trangChuKhachHang(Scanner scanner, ArrayList<Sach> listBook){
        int choice;
        do{
            System.out.println("\tTRANG CHU KHACH HANG");
            System.out.println("1. Tim kiem sach");
            System.out.println("2. Xem danh sach sách");
            System.out.println("3. Thoat");
            System.out.print("Nhap chuc nang: ");
            choice = Integer.parseInt(scanner.nextLine());
            TrangChu trangChu = new TrangChu();
            switch ((choice)) {
                case 1:
                    Sach sach = new Sach(); 
                    sach.timKiemSach(scanner, listBook);
                    break;
                case 2:
                    Sach.danhSach(listBook);
                    break;
                case 3:
                    XoaManHinh.clrscr();
                    trangChu.trangChuHieuSach(listBook);
                    return;
                default:
                    System.out.println("Nhap sai chuc nang! Moi nhap lai!");
                    break;
            }
        }while (true);
    }
}

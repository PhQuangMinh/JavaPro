import java.util.ArrayList;
import java.util.Scanner;

public class TrangChu {
    public void trangChuHieuSach(ArrayList<Sach> listBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tTRANG CHU");
        System.out.println("1. Chu");
        System.out.println("2. Khach hang");
        System.out.println("3. Thoat");
        QuanLy quanLy = new QuanLy();
        KhachHang khachHang = new KhachHang();
        int choice;
        do {
            System.out.print("Nhap chuc nang cua ban: ");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice != 1 && choice != 2 && choice != 3)
                System.out.println("Nhap sai! Moi nhap lai!");
        } while (choice != 1 && choice != 2 && choice != 3);
        switch (choice) {
            case 1:
                XoaManHinh.clrscr();
                quanLy.nhapMatKhau(scanner, listBook);
                break;
            case 2:
                XoaManHinh.clrscr();
                khachHang.trangChuKhachHang(scanner, listBook);
                break;
            case 3:
                System.out.println("Tam biet!");
            default:
                break;
        }
    }

    public static void main(String[] args) {
        ArrayList<Sach> listBook = new ArrayList<>();
        TrangChu trangChu = new TrangChu();
        trangChu.trangChuHieuSach(listBook);
        System.out.println("Thoat chuong trinh thanh cong!");
    }

}

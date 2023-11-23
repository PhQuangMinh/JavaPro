import java.util.ArrayList;
import java.util.Scanner;

public class TrangChu {
    public void trangChuHieuSach(ArrayList<SanPham> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tTRANG CHU");
        System.out.println("1. Chu");
        System.out.println("2. Khach hang");
        System.out.println("3. Thoat");

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
                QuanLy quanLy = new QuanLy();
                quanLy.nhapMatKhau(scanner, list);
                break;
            case 2:
                XoaManHinh.clrscr();
                KhachHang khachHang = new KhachHang();
                khachHang.trangChuKhachHang(scanner, list);
                break;
            case 3:
                System.out.println("Tam biet!");
            default:
                break;
        }
    }

    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        TrangChu trangChu = new TrangChu();
        trangChu.trangChuHieuSach(list);
    }

}

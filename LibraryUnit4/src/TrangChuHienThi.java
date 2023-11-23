import java.util.ArrayList;
import java.util.Scanner;

public class TrangChuHienThi {

    public void hienThiSanPham(Scanner scanner, ArrayList<SanPham> list) {
        System.out.println("\t HIEN THI SAN PHAM");
        System.out.println("1. Hien thi theo bang");
        System.out.println("2. Hien thi theo danh sach");
        System.out.println("3. Thoat");
        do{
            System.out.print("Nhap chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Hien thi theo bang");
                    HienThiTheoBang hienThiTheoBang = new HienThiTheoBang();
                    hienThiTheoBang.hienThi(list);
                    break;
                case 2:
                    System.out.println("2. Hien thi theo danh sach");
                    HienThiDanhSach hienThiDanhSach = new HienThiDanhSach();
                    hienThiDanhSach.hienThi(list);
                    break;
                case 3:
                    XoaManHinh.clrscr();
                    KhachHang khachHang = new KhachHang();
                    khachHang.trangChuKhachHang(scanner, list);
                    break;
                default:
                    System.out.println("Nhap sai chuc nang! Moi nhap lai!");
                    break;
            }
        } while (true);
    }
}

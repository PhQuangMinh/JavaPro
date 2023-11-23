import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang {
    public void trangChuKhachHang(Scanner scanner, ArrayList<SanPham> list) {
        int choice;
        do {
            System.out.println("\tTRANG CHU KHACH HANG");
            System.out.println("1. Tim kiem san pham");
            System.out.println("2. Xem danh sach san pham");
            System.out.println("3. Thoat");
            System.out.print("Nhap chuc nang: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch ((choice)) {
                case 1:
                    SanPham sanPham = new SanPham();
                    ArrayList<SanPham> listSanPham = new ArrayList<>();
                    XoaManHinh.clrscr();
                    sanPham.hienThiTimKiem(scanner, list, listSanPham);
                    break;
                case 2:
                    TrangChuHienThi trangChuHienThi = new TrangChuHienThi();
                    XoaManHinh.clrscr();
                    trangChuHienThi.hienThiSanPham(scanner, list);
                    break;
                case 3:
                    TrangChu trangChu = new TrangChu();
                    XoaManHinh.clrscr();
                    trangChu.trangChuHieuSach(list);
                    return;
                default:
                    System.out.println("Nhap sai chuc nang! Moi nhap lai!");
                    break;
            }
        } while (true);
    }
}

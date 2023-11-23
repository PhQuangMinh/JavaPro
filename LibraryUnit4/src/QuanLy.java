import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    public void nhapMatKhau(Scanner scanner, ArrayList<SanPham> list) {
        System.out.println("\tDANG NHAP");
        System.out.println("1. Nhap mat khau");
        System.out.println("2. Thoat");
        int choice;
        TrangChu trangChu = new TrangChu();
        do {
            System.out.print("Nhap chuc nang cua ban: ");
            choice = Integer.parseInt(scanner.nextLine());
            if ((choice != 1) && (choice != 2)) {
                System.out.println("Nhap sai! Moi nhap lai!");
                continue;
            }
            if (choice == 1) {
                System.out.print("Mat khau: ");
                String Password = scanner.nextLine();
                if (Password.equals("admin")) {
                    XoaManHinh.clrscr();
                    QuanLy quanLy = new QuanLy();
                    quanLy.trangChuSanPham(scanner, list);
                    return;
                } else
                    System.out.println("Nhap sai mat khau!");
            } else {
                XoaManHinh.clrscr();
                trangChu.trangChuHieuSach(list);
                return;
            }
        } while (true);
    }

    public void trangChuSanPham(Scanner scanner, ArrayList<SanPham> list) {
        int choice;
        do {
            System.out.println("\tTRANG CHU SAN PHAM");
            System.out.println("1. Them san pham moi");
            System.out.println("2. Xoa san pham");
            System.out.println("3. Sua san pham");
            System.out.println("4. Tim kiem san pham");
            System.out.println("5. Xem danh sach san pham");
            System.out.println("6. Thoat");
            System.out.print("Nhap chuc nang: ");
            choice = Integer.parseInt(scanner.nextLine());
            SanPham sanPham = new SanPham();
            switch ((choice)) {
                case 1:
                    System.out.println("1. Them san pham moi");
                    XoaManHinh.clrscr();
                    themSanPham(scanner, list);
                    break;
                case 2:
                    System.out.println("2. Xoa san pham");
                    sanPham.xoaSanPham(scanner, list);
                    break;
                case 3:
                    System.out.println("3. Sua san pham");
                    sanPham.suaSanPham(scanner, list);
                    break;
                case 4:
                    System.out.println("4. Tim kiem san pham");
                    ArrayList<SanPham> listSanPham = new ArrayList<>();
                    sanPham.hienThiTimKiem(scanner, list, listSanPham);
                    break;
                case 5:
                    System.out.println("5. Xem danh sach san pham");
                    HienThiDanhSach hienThiDanhSach = new HienThiDanhSach();
                    hienThiDanhSach.hienThi(list);
                    break;
                case 6:
                    XoaManHinh.clrscr();
                    TrangChu trangChu = new TrangChu();
                    trangChu.trangChuHieuSach(list);
                    return;
                default:
                    System.out.println("Nhap sai chuc nang! Moi nhap lai!");
                    break;
            }
        } while (true);
    }

    public void themSanPham(Scanner scanner, ArrayList<SanPham> list) {
        System.out.println("\tTHEM SAN PHAM");
        System.out.println("1. Them vo ghi");
        System.out.println("2. Them but chi");
        System.out.println("3. Them but muc");
        System.out.println("4. Them sach");
        System.out.println("5. Thoat");
        do {
            System.out.print("Nhap chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Them vo ghi");
                    VoGhi voGhi = new VoGhi();
                    voGhi.themVoGhi(scanner, list);
                    break;
                case 2:
                    System.out.println("2. Them but chi");
                    ButChi butChi = new ButChi();
                    butChi.themButChi(scanner, list);
                    break;
                case 3:
                    System.out.println("3. Them but muc");
                    ButMuc butMuc = new ButMuc();
                    butMuc.themButMuc(scanner, list);
                    break;
                case 4:
                    System.out.println("4. Them sach");
                    Sach sach = new Sach();
                    sach.themSach(scanner, list);
                    break;
                case 5:
                    QuanLy quanLy = new QuanLy();
                    XoaManHinh.clrscr();
                    quanLy.trangChuSanPham(scanner, list);
                    System.out.println("5. Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Nhap sai chuc nang! Moi nhap lai!");
                    break;
            }
        } while (true);
    }
}

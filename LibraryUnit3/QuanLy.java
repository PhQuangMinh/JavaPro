import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    public void nhapMatKhau(Scanner scanner, ArrayList<Sach> listBook) {
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
                    trangChuQuanLy(scanner, listBook);
                    return;
                } else
                    System.out.println("Nhap sai mat khau!");
            } else {
                XoaManHinh.clrscr();
                trangChu.trangChuHieuSach(listBook);
                return;
            }
        } while (true);
    }

    public void trangChuQuanLy(Scanner scanner, ArrayList<Sach> listBook) {
        int choice;
        do {
            // XoaManHinh.clrscr();
            System.out.println("\tTRANG CHU QUAN LY");
            System.out.println("1. Them sach moi");
            System.out.println("2. Xoa sach");
            System.out.println("3. Sua sach");
            System.out.println("4. Tim kiem sach");
            System.out.println("5. Xem danh sach sach");
            System.out.println("6. Thoat");
            System.out.print("Nhap chuc nang: ");
            choice = Integer.parseInt(scanner.nextLine());
            TrangChu trangChu = new TrangChu();
            switch ((choice)) {
                case 1:
                    System.out.println("1. Them sach moi");
                    System.out.println("Nhap thong tin sach:");
                    System.out.print("Nhap tieu de: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhap tac gia: ");
                    String tacGia = scanner.nextLine();
                    System.out.print("Nhap the loai: ");
                    String theLoai = scanner.nextLine();
                    System.out.print("Nhap ngay xuan ban: ");
                    String xuatBan = scanner.nextLine();
                    Sach sach = new Sach(tieuDe, tacGia, theLoai, xuatBan);
                    listBook.add(sach);
                    break;
                case 2:
                    System.out.println("2. Xoa sach");
                    Sach.xoaSach(scanner, listBook);
                    break;
                case 3:
                    System.out.println("3. Sua sach");
                    Sach.suaSach(scanner, listBook);
                    break;
                case 4:
                    System.out.println("4. Tim kiem sach");
                    Sach sach1 = new Sach();
                    int id = sach1.timKiemSach(scanner, listBook);
                    listBook.get(id).inThongTin();
                    break;
                case 5:
                    System.out.println("5. Xem danh sach sach");
                    Sach.danhSach(listBook);
                    break;
                case 6:
                    XoaManHinh.clrscr();
                    trangChu.trangChuHieuSach(listBook);
                    return;
                default:
                    System.out.println("Nhap sai chuc nang! Moi nhap lai!");
                    break;
            }
        } while (true);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Sach {
    private String tieuDe;
    private String tacGia;
    private String theLoai;
    private String xuatBan;

    public Sach() {
    }

    public static void danhSach(ArrayList<Sach> listBook) {
        if (listBook.isEmpty()) {
            System.out.println("Trong cua hang khong co sach");
            return;
        }
        for (int i = 0; i < listBook.size(); i++)
            listBook.get(i).inThongTin();
    }

    public void inThongTin() {
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("The loai: " + theLoai);
        System.out.println("Ngay xuat ban: " + xuatBan);
        System.out.println("-----------------------------------");
    }

    public Sach(String tieuDe, String tacGia, String theLoai, String xuatBan) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.xuatBan = xuatBan;
    }
    private boolean kiemTra(Sach sach, String thongTin){
        if (sach.tacGia.contains(thongTin) || sach.tieuDe.contains(thongTin)
                    || sach.theLoai.contains(thongTin) || sach.xuatBan.contains(thongTin)) return  true;
        return false;
    }
    public int timKiemSach(Scanner scanner, ArrayList<Sach> listBook) {
        if (listBook.size() == 0) {
            System.out.println("Trong cua hang het sach!");
            return -1;
        }
        System.out.print("Nhap thong tin sach can tim kiem: ");
        String thongTin = scanner.nextLine();
        ArrayList<Sach> list = new ArrayList<>();
        for (int i = 0; i < listBook.size(); i++) {
            Sach sach = listBook.get(i);
            if (kiemTra(sach, thongTin)) {
                list.add(sach);
            }
        }
        if (list.isEmpty()) {
            System.out.println("Khong co sach co thong tin nhu yeu cau");
            return -1;
        }
        System.out.println("Thong tin sach tim kiem yeu cau: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Thong tin sach thu " + i + 1 + ":");
            Sach sach = list.get(i);
            sach.inThongTin();
        }
        System.out.print("Nhap thu tu sach ban muon thuc hien chuc nang: ");
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice > list.size() || choice < 1) {
                System.out.println("Nhap sai thu tu sach! Moi nhap lai!");
                continue;
            } else
                break;
        } while (true);
        return listBook.indexOf(list.get(choice - 1));
    }

    public static void xoaSach(Scanner scanner, ArrayList<Sach> listBook) {
        Sach sach = new Sach();
        int id = sach.timKiemSach(scanner, listBook);
        if (id != -1)
            listBook.remove(id);
    }

    public static void suaSach(Scanner scanner, ArrayList<Sach> listBook) {
        Sach sach = new Sach();
        int id = sach.timKiemSach(scanner, listBook);
        if (id != -1) {
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
            Sach doiSach = new Sach(tieuDe, tacGia, theLoai, xuatBan);
            listBook.add(id, doiSach);
            listBook.remove(id + 1);
        }
    }
}

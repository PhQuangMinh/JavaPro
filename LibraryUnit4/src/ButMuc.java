import java.util.ArrayList;
import java.util.Scanner;

public class ButMuc extends SanPham {
    private String mauSac;
    private String chatLieu;
    private String loaiMuc;
    private String doMin;

    ButMuc() {
    }

    ButMuc(String tenSanPham, String giaBan, String thuongHieu, String mauSac, String chatLieu, String loaiMuc,
           String doMin) {
        super(tenSanPham, giaBan, thuongHieu);
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.loaiMuc = loaiMuc;
        this.doMin = doMin;
    }
    public void inDanhSach() {
        inThongTin();
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Chat lieu: " + chatLieu);
        System.out.println("Loai muc: " + loaiMuc);
        System.out.println("Do min: " + doMin);
        System.out.println("-----------------------------------");
    }

    public  void inBang(){
        super.inBang();
        System.out.print(String.format("%-23s|", "- Mau sac: " + mauSac));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Chat lieu: " + chatLieu));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Loai muc" + loaiMuc));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Do min" + doMin));
    }
    public boolean kiemTra(String thongTin) {
        if (super.kiemTra(thongTin) || mauSac.contains(thongTin) || chatLieu.contains(thongTin)
                || loaiMuc.contains(thongTin) || doMin.contains(thongTin))
            return true;
        return false;
    }

    public SanPham nhap(Scanner scanner) {
        System.out.println("Nhap thong tin but muc:");
        System.out.print("Nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        System.out.print("Nhap gia ban: ");
        String giaBan = scanner.nextLine();
        System.out.print("Nhap thuong hieu: ");
        String thuongHieu = scanner.nextLine();
        System.out.print("Nhap mau sac: ");
        String mauSac = scanner.nextLine();
        System.out.print("Nhap chat lieu: ");
        String chatLieu = scanner.nextLine();
        System.out.print("Nhap loai muc: ");
        String loaiMuc = scanner.nextLine();
        System.out.print("Nhap do min: ");
        String doMin = scanner.nextLine();
        System.out.println("---------------------------------");
        SanPham sanPham = new ButMuc(tenSanPham, giaBan, thuongHieu, mauSac, chatLieu, loaiMuc, doMin);
        return sanPham;
    }

    public void themButMuc(Scanner scanner, ArrayList<SanPham> list) {
        list.add(nhap(scanner));
    }
}

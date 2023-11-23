import java.util.ArrayList;
import java.util.Scanner;

public class ButChi extends SanPham {
    private String mauSac;
    private String chatLieu;
    private String doCung;

    ButChi() {
    }

    ButChi(String tenSanPham, String giaBan, String thuongHieu, String mauSac, String chatLieu, String doCung) {
        super(tenSanPham, giaBan, thuongHieu);
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.doCung = doCung;
    }

    public void inDanhSach() {
        inThongTin();
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Chat lieu: " + chatLieu);
        System.out.println("Do cung: " + doCung);
        System.out.println("-----------------------------------");
    }

    public  void inBang(){
        super.inBang();
        System.out.print(String.format("%-23s|", "- Mau sac: " + mauSac));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Chat lieu: " + chatLieu));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Do cung" + doCung));
    }
    public boolean kiemTra(String thongTin) {
        if (super.kiemTra(thongTin) || mauSac.contains(thongTin) || chatLieu.contains(thongTin)
                || doCung.contains(thongTin))
            return true;
        return false;
    }

    public SanPham nhap(Scanner scanner) {
        System.out.println("Nhap thong tin but chi:");
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
        System.out.print("Nhap do cung: ");
        String doCung = scanner.nextLine();
        System.out.println("---------------------------------");
        SanPham sanPham = new ButChi(tenSanPham, giaBan, thuongHieu, mauSac, chatLieu, doCung);
        return sanPham;
    }

    public void themButChi(Scanner scanner, ArrayList<SanPham> list) {

        list.add(nhap(scanner));
    }
}

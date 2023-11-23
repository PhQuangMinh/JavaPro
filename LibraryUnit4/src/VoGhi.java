import java.util.ArrayList;
import java.util.Scanner;

public class VoGhi extends SanPham {
    private String soTrang;
    private String loaiVo;
    private String mauSacBia;
    private String chatLieuGiay;
    private String kichThuoc;

    VoGhi() {
    }

    VoGhi(String tenSanPham, String giaBan, String thuongHieu, String soTrang, String loaiVo, String mauSac,
          String chatLieu,
          String kichThuoc) {
        super(tenSanPham, giaBan, thuongHieu);
        this.soTrang = soTrang;
        this.loaiVo = loaiVo;
        this.mauSacBia = mauSac;
        this.chatLieuGiay = chatLieu;
        this.kichThuoc = kichThuoc;
    }

    public boolean kiemTra(String thongTin) {
        if (super.kiemTra(thongTin) || soTrang.contains(thongTin) || loaiVo.contains(thongTin) || mauSacBia.contains(thongTin))
            return true;
        return false;
    }

    public void inDanhSach() {
        inThongTin();
        System.out.println("So trang: " + soTrang);
        System.out.println("Loai vo: " + loaiVo);
        System.out.println("Mau sac bia: " + mauSacBia);
        System.out.println("Chat lieu giay: " + chatLieuGiay);
        System.out.println("Kich thuoc: " + kichThuoc);
        System.out.println("-----------------------------------");
    }

    public  void inBang(){
        super.inBang();
        System.out.print(String.format("%-23s|\n", "- So trang: " + soTrang));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Loai vo: " + loaiVo));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Mau sac bia" + mauSacBia));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Chat lieu giay: " + chatLieuGiay));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Kich thuoc: " + kichThuoc));
    }

    public SanPham nhap(Scanner scanner) {
        System.out.println("Nhap thong tin vo ghi:");
        System.out.print("Nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        System.out.print("Nhap gia ban: ");
        String giaBan = scanner.nextLine();
        System.out.print("Nhap thuong hieu: ");
        String thuongHieu = scanner.nextLine();
        System.out.print("Nhap so trang: ");
        String soTrang = scanner.nextLine();
        System.out.print("Nhap loai vo: ");
        String loaiVo = scanner.nextLine();
        System.out.print("Nhap mau sac: ");
        String mauSac = scanner.nextLine();
        System.out.print("Nhap chat lieu: ");
        String chatLieu = scanner.nextLine();
        System.out.print("Nhap kich thuoc: ");
        String kichThuoc = scanner.nextLine();
        System.out.println("---------------------------------");
        SanPham sanPham = new VoGhi(tenSanPham, giaBan, thuongHieu, soTrang, loaiVo, mauSac, chatLieu, kichThuoc);
        return sanPham;
    }

    public void themVoGhi(Scanner scanner, ArrayList<SanPham> list) {
        list.add(nhap(scanner));
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Sach extends SanPham {
    private String theLoai;
    private String tacGia;
    private String nhaXuatBan;
    private String namXuatBan;
    private String ngonNgu;

    Sach() {
    }

    Sach(String tenSanPham, String giaBan, String thuongHieu, String theLoai, String tacGia, String nhaXuatBan,
         String namXuatBan, String ngonNgu) {
        super(tenSanPham, giaBan, thuongHieu);
        this.theLoai = theLoai;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.ngonNgu = ngonNgu;
    }
    public SanPham nhap(Scanner scanner) {
        System.out.println("Nhap thong tin sach:");
        System.out.print("Nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        System.out.print("Nhap gia ban: ");
        String giaBan = scanner.nextLine();
        System.out.print("Nhap the loai: ");
        String theLoai = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = scanner.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        String nhaXuatBan = scanner.nextLine();
        System.out.print("Nhap nam xuan ban: ");
        String namXuatBan = scanner.nextLine();
        System.out.print("Nhap ngon ngu: ");
        String ngonNgu = scanner.nextLine();
        System.out.println("---------------------------------");
        SanPham sanPham = new Sach(tenSanPham, giaBan, nhaXuatBan, theLoai, tacGia, nhaXuatBan, namXuatBan, ngonNgu);
        return sanPham;
    }

    public void themSach(Scanner scanner, ArrayList<SanPham> list) {
        list.add(nhap(scanner));
    }

    public void inDanhSach() {
        inThongTin();
        System.out.println("The loai: " + theLoai);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Ngon ngu: " + ngonNgu);
        System.out.println("-----------------------------------");
    }

    public  void inBang(){
        super.inBang();
        System.out.print(String.format("%-23s|\n", "- The loai: " + theLoai));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Tac gia: " + tacGia));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Nha xuat ban" + nhaXuatBan));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Nam xuat ban: " + namXuatBan));
        System.out.print(String.format("|%-22s|%-17s|%-21s|%-23s|\n", "", "", "", "- Ngon ngu: " + ngonNgu));
    }
    public boolean kiemTra(String thongTin) {
        if (super.kiemTra(thongTin) || theLoai.contains(thongTin) || tacGia.contains(thongTin)
                || nhaXuatBan.contains(thongTin) || namXuatBan.contains(thongTin) || ngonNgu.contains(thongTin))
            return true;
        return false;
    }

}

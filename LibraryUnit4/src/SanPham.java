import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
    protected String tenSanPham;
    protected String giaBan;
    protected String thuongHieu;

    SanPham() {
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void themDuLieu(ArrayList<String> listSanPham) {
        listSanPham.add(getTenSanPham());
        listSanPham.add(getGiaBan());
        listSanPham.add(getThuongHieu());
    }

    SanPham(String tenSanPham, String giaBan, String thuongHieu) {
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.thuongHieu = thuongHieu;
    }

    public void inDanhSach(){
    }

    public void inThongTin() {
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Gia ban: " + giaBan);
        System.out.println("Thuong hieu: " + thuongHieu);
    }

    public  void inBang(){}
    public boolean kiemTra(String thongTin) {
        if (tenSanPham.contains(thongTin) || giaBan.contains(thongTin) || thuongHieu.contains(thongTin))
            return true;
        return false;
    }

    public int hienThiTimKiem(Scanner scanner, ArrayList<SanPham> list, ArrayList<SanPham> listSanPham) {
        if (list.isEmpty()) {
            System.out.println("Trong cua hang het san pham!");
            return -1;
        }
        System.out.print("Nhap thong tin san pham can tim kiem: ");
        String thongTin = scanner.nextLine();
        for (var sanPham : list) {
            if (sanPham.kiemTra(thongTin)) {
                listSanPham.add(sanPham);
            }
        }
        if (listSanPham.isEmpty()) {
            System.out.println("Khong co san pham co thong tin nhu yeu cau");
            return -1;
        }
        HienThiDanhSach hienThiDanhSach = new HienThiDanhSach();
        hienThiDanhSach.hienThi(listSanPham);
        return 0;
    }

    public int timKiemSanPham(Scanner scanner, ArrayList<SanPham> list) {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        int check = hienThiTimKiem(scanner, list, listSanPham);
        if (check==-1){
            return -1;
        }
        System.out.print("Nhap thu tu sach ban muon thuc hien chuc nang: ");
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice > listSanPham.size() || choice < 1) {
                System.out.println("Nhap sai thu tu sach! Moi nhap lai!");
            } else
                break;
        } while (true);
        return list.indexOf(listSanPham.get(choice - 1));
    }

    public void xoaSanPham(Scanner scanner, ArrayList<SanPham> list) {
        int id = timKiemSanPham(scanner, list);
        if (id==-1) return;
        list.remove(list.get(id));
        System.out.println("Xoa san pham thanh cong!");
    }

    public void suaSanPham(Scanner scanner, ArrayList<SanPham> list) {
        int id = timKiemSanPham(scanner, list);
        if (id==-1) return;
        SanPham sanPham;
        if (list.get(id) instanceof Sach){
            Sach sach = new Sach();
            sanPham = sach.nhap(scanner);
        }
        else if (list.get(id) instanceof VoGhi){
            VoGhi voGhi = new VoGhi();
            sanPham = voGhi.nhap(scanner);
        }
        else if (list.get(id) instanceof ButChi){
            ButChi butChi = new ButChi();
            sanPham = butChi.nhap(scanner);
        }
        else{
            ButMuc butMuc = new ButMuc();
            sanPham = butMuc.nhap(scanner);
        }
        list.remove(id);
        list.add(id, sanPham);
    }
}

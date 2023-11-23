import java.util.ArrayList;

public class HienThiDanhSach {
    public void hienThi(ArrayList<SanPham> list) {
        for (var sanPham : list) {
            sanPham.inDanhSach();
        }
    }

}

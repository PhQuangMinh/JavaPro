import java.util.ArrayList;

public class HienThiTheoBang {
    public void inTieuDe() {
        String tieuDe1 = "Ten san pham";
        String tieuDe2 = "Gia ban";
        String tieuDe3 = "Thuong hieu";
        String tieuDe4 = "Thong tin khac";
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.print(String.format("|%5s%s%5s|%5s%s%5s|%5s%s%5s|%5s%s%-4s|\n", "", tieuDe1, "", "", tieuDe2, "", "",
                tieuDe3, "", "", tieuDe4, ""));
    }

    public void hienThi(ArrayList<SanPham> list) {
        if (list.isEmpty()){
            System.out.println("Trong cua hang khong co san pham nao!");
            return;
        }
        inTieuDe();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(String.format("|%-22s|%-17s|%-21s|", list.get(i).tenSanPham,
                    list.get(i).giaBan, list.get(i).thuongHieu));
            SanPham sanPham = list.get(i);
            sanPham.inBang();
            System.out.println("-----------------------------------------------------------------------------------------------------");
        }
    }
}

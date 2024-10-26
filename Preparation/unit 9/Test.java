import java.util.Scanner;
public class Test {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        while (true) {
            try {
                System.out.println("nhap toa do x: ");
                x = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhap sai!");
            }
        }
        while (true) {
            try {
                System.out.println("nhap toa do y: ");
                y = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhap sai!");
            }
        }
        System.out.println("Toa do: " + x + " " + y);
    }
}
/*
 - Một câu lạp bộ A tổ chức sinh nhật lần thứ 10, vì vậy CLB A đã mời n CLB. Các clb đã được
 đánh dấu từ 1 đến n, mỗi clb sẽ tham gia một số lượng nhất đinh
 - Tùy nhiên, theo quan sát thì một số
 */
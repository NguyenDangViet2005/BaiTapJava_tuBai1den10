import java.util.Scanner;
import Class.QuanLy;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLy ql_249 = new QuanLy();

        ql_249.nhapDanhSach(sc);

        System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
        ql_249.timKiem(8000000);

        sc.close();
    }
}
import java.util.Scanner;
import Class.QuanLy;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLy ql_249 = new QuanLy();

        ql_249.nhapDanhSach(sc);

        System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
        ql_249.hienThiDanhSachTraCuoiThang();

        sc.close();
    }
}
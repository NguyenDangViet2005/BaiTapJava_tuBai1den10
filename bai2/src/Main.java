import java.util.Scanner;
import Class.QLCB;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLCB qlcb_249 = new QLCB();

        qlcb_249.nhapDanhSach(sc);

        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name = sc.nextLine();

        qlcb_249.timKiemCanBo(name);

        // huy sc
        sc.close();
    }
}
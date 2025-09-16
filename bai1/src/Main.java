import java.util.Scanner;
import Class.PhanSo;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PhanSo ps1_249=new PhanSo();
        PhanSo ps2_249=new PhanSo();
        PhanSo psTong_249 =new PhanSo();

        // nhap phan so
        System.out.println("Nhap vao phan so thu nhat:");
        ps1_249.nhapPS(sc);
        System.out.println("Nhap vao phan so thu hai:");
        ps2_249.nhapPS(sc);

        // tinh tong 2 phan so
        psTong_249=ps1_249.congPS(ps2_249);

        // hien thi phan so
        System.out.println("\nPhan so thu nhat la:");
        ps1_249.hienThiPS();
        System.out.println("\nPhan so thu hai la:");
        ps2_249.hienThiPS();
        System.out.println("\nPhan so tong la:");
        psTong_249.hienThiPS();

        sc.close();
    }
}
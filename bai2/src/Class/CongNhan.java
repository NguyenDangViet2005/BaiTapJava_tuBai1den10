package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
	// thuoc tinh
	private String bac_249;

	// phuong thuc
	// ham khoi tao khong doi so
	public CongNhan() {

	}

	// ham khoi tao co doi so
	public CongNhan(String hoten, String ngaySinh, String gioiTinh, String diaChi, String bac) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.bac_249 = bac;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap bac: ");
		bac_249 = sc.nextLine();
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac_249);
	}
}

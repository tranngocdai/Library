package Class;

import java.util.Scanner;

public class SinhVien {
    protected String hoTen;
    protected String maSV;
    protected String ngaySinh;
    protected String lop;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("\tNhap ma sinh vien: ");
        this.maSV = sc.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("\tNhap lop: ");
        this.lop = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + this.hoTen);
        System.out.println("\tNgay sinh: " + this.ngaySinh);
        System.out.println("\tMa sinh vien: " + this.maSV);
        System.out.println("\tLop: " + this.lop);
    }
}

package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon;
    private Date ngayMuon;
    private Date hanTra;
    private String soHieu;

    public TheMuon() {
    }

    public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
        this.soMuon = soMuon;
        this.ngayMuon = ngayMuon;
        this.soHieu = soHieu;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap so muon: ");
        this.soMuon = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap ngay muon: ");
        String strNgayMuon = sc.nextLine();
        this.ngayMuon = this.strToDate(strNgayMuon);
        String strNgayTra = "31-12-2020";
        this.hanTra = this.strToDate(strNgayTra);
        System.out.println("\tNhap so hieu: ");
        this.soHieu = sc.nextLine();
    }

    private Date strToDate(String strNgayMuon) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = sdf.parse(strNgayMuon);
        } catch (ParseException var5) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phieu muon: " + this.soMuon);
        System.out.println("\tNgay muon: " + this.ngayMuon);
        System.out.println("\tHan tra: " + this.hanTra);
        System.out.println("\tSo hieu: " + this.soHieu);
    }

    public Date getHanTra() {
        return this.hanTra;
    }
}
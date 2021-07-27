import java.util.Date;
import java.util.Scanner;

public class KhachSan extends Nguoi {
    private String soNgayTro;
    private String loaiPhongTro;
    private String giaPhong;

    public KhachSan ()
    {

    }
    public KhachSan(String hoTen, Date ngaySinh, String queQuan, String soNgayTro, String loaiPhongTro, String giaPhong)
    {
        super( hoTen, ngaySinh, cmnd);
        this.soNgayTro=soNgayTro;
        this.loaiPhongTro=loaiPhongTro;
        this.giaPhong=giaPhong
    }

    public void nhapThongTin()
    {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so ngay tro: ");
        this.soNgayTro=sc.nextLine();
        System.out.print("Nhap loai phong tro: ");
        this.loaiPhongTro=sc.nextLine();
        System.out.print("Nhap gia phong: ");
        this.giaPhong=sc.nextLine();
    }
    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("So Ngay Tro: "+this.soNgayTro);
        System.out.println("Loai Phong Tro: "+this.loaiPhongTro);
        System.out.println("Gia Phong: "+this.giaPhong);
    }

    public String getsoNgayTro()
    {
        return this.soNgayTro;
    }
    public String getloaiPhongTro()
    {
        return this.loaiPhongTro;
    }
    public String getgiaPhong()
    {
        return this.giaPhong;
    }
}

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private String cmnd;

    public Nguoi()
    {
        this.ngaySinh=new Date();
    }
    public Nguoi(String hoTen,Date ngaySinh,String queQuan)
    {
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.cmnd=cmnd;
    }

    public void nhapThongTin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen=sc.nextLine();
        System.out.print("Nhap ngay sinh (dd-mm-yyyy): ");
        String ns=sc.nextLine();
        this.ngaySinh=chuyenStringDate(ns);
        System.out.print("Nhap Chung Minh Nhan Dan: ");
        this.cmnd=sc.nextLine();
    }
    public void hienThongTin()
    {
        System.out.println("Ho va ten: "+this.hoTen);
        System.out.println("Ngay Sinh: "+this.ngaySinh);
        System.out.println("Chung Minh Nhan Dan: "+this.cmnd);
    }
    public Date chuyenStringDate(String str)
    {
        Date ns=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try
        {
            ns=sdf.parse(str);
        }catch(Exception e)
        {
            System.out.println("Loi dinh dang ngay thang.!");
        }
        return ns;
    }
    public String getChungMinhNhanDan()
    {
        return this.cmnd;
    }
    public Date getNgaySinh()
    {
        return this.ngaySinh;
    }


}

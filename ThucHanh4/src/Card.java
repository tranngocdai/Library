import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Card {
    private int soPhieu;
    private Date ngayMuon;
    private Date hanTra;
    private String soHieu;
    private SinhVien sinhVien;

    public Card(){
        super();
    }
    public Card(String name, String id, int birthDate, String nameClass, int soPhieu, Date ngayMuon, Date hanTra, String soHieu) {
        super();
        this.soPhieu = soPhieu;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieu = soHieu;
    }
    public void inputCard(){
        Scanner sc = new Scanner(System.in);
        sinhVien.inputInfo();
        System.out.println("Nhập số phiếu mượn:");
        soPhieu = sc.nextInt();
        System.out.println("Nhập ngày mượn:");
        ngayMuon = new Date(sc.nextInt());
        System.out.print("Nhap ngay tra:(dd--mm--yy): ");
        String ngt=sc.nextLine();

        System.out.println("Nhập số hiệu sách:");
    }
    public void displayCard(){
        sinhVien.displayInfo();
        System.out.println("Số phiếu mượn:"+soPhieu);
        System.out.println("Ngày mượn:"+ngayMuon);
        System.out.println("Hạn trả:"+hanTra);
        System.out.println("Số hiệu sách:"+soHieu);
    }
}

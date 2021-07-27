package Model;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerLibrary manager = new ManagerLibrary();
        Scanner sc = new Scanner(System.in);
        int number =1;
        while (number !=0){
            System.out.println("Nhấn 0 để thoát!");
            System.out.println("Nhấn 1 để nhập thông tin sinh viên ");
            System.out.println("Nhấn 2 để hiển thị danh sách sinh viên ");
            System.out.println("Nhấn 3 để xem danh sách sinh viên,tên sách cần trả vào cuối tháng");
            int numbers = sc.nextInt();
            switch (numbers){
                case 1:
                    System.out.println("Nhập tên SV");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Nhập mã SV");
                    String code = sc.nextLine();
                    System.out.println("Nhập lớp của SV");
                    String lop = sc.nextLine();
                    System.out.println("Nhập số phiếu mượn");
                    int soPhieuMuon = sc.nextInt();
//                    System.out.println("Nhập ngày mượn");
                    LocalDate dayMuon = LocalDate.now();
                    System.out.println("Nhập hạn trả");
                    LocalDate hanTra = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    System.out.println("Nhập số hiệu sách");
                    sc.nextLine();
                    String soHieu = sc.nextLine();
                    manager.add(new TheMuon(name,code,lop,soPhieuMuon,dayMuon,hanTra,soHieu));
                    break;
                case 2:
                    manager.showAll();
                    break;
                case 3:
                    manager.showTheMuons();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("?????");
            }
        }
    }

}

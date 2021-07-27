import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
    private String name;
    private String id;
    private int birthDate;
    private String nameClass;


    public SinhVien() {
        super();
    }

    public SinhVien(String name, String id, int birthDate, String nameClass ) {
        super();
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
        this.nameClass = nameClass;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }



    public void inputInfo() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập tên:");
        name = sc.nextLine();
        System.out.println("Nhập mã sinh viên:");
        id = sc.nextLine();
        System.out.println("Nhập năm sinh:");
        birthDate = sc.nextInt();
        System.out.println("Nhập tên lớp:");
        nameClass = sc.nextLine();
        System.out.println("Nhập ");

    }

    public void displayInfo() {
        System.out.println("Tên:" + name);
        System.out.println("Mã sinh viên:" + id);
        System.out.println("Năm sinh:" + birthDate);
        System.out.println("Tên lớp" + nameClass);
    }

}

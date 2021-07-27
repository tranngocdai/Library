import java.util.Scanner;

public class People {
    private String name;
    private int birthday;
    private String soCMND;

    public People() {
    }

    public People(String name, int birthday, String soCMND) {
        this.name = name;
        this.birthday = birthday;
        this.soCMND = soCMND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public void addPeople() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên: ");
        name = sc.nextLine();
        System.out.println("Năm sinh: ");
        birthday = sc.nextInt();
        System.out.println("CMND: ");
        soCMND = sc.nextLine();
    }

    public void displayPeople() {
        System.out.println("Họ tên: " + name);
        System.out.println("Năm sinh: " + birthday);
        System.out.println("CMND: " + soCMND);
    }
}

import java.util.Scanner;

public class KhachHang {
    private String name;
    private int soNha;
    private String id;

    public KhachHang() {
    }

    public KhachHang(String name, int soNha, String id) {
        this.name = name;
        this.soNha = soNha;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void inputInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên chủ hộ: ");
        name = sc.nextLine();
        System.out.println("Số nhà:");
        soNha = sc.nextInt();
        System.out.println("Mã công tơ:");
        id = sc.nextLine();
    }

    public void displayInformation() {
        System.out.println("Tên chủ hộ: " + name);
        System.out.println("Số nhà:" + soNha);
        System.out.println("Mã công tơ:" + id);
    }

}

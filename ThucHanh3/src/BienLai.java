import java.util.Scanner;

public class BienLai extends KhachHang {
    private int oldNumber;
    private int newNumber;
    private double payMoney;

    public BienLai() {
    }

    public BienLai(String name, int soNha, String id, int oldNumber, int newNumber, double payMoney) {
        super(name, soNha, id);
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.payMoney = payMoney;
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    public double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(double payMoney) {
        this.payMoney = payMoney;
    }

    public void inputBienLai() {

        Scanner sc = new Scanner(System.in);

        do {
            sc.nextLine();
            System.out.println("Chỉ số cũ: ");
            oldNumber = sc.nextInt();
            System.out.println("Chỉ số mới:");
            newNumber = sc.nextInt();
            break;
        }

        while (oldNumber < newNumber);
        payMoney = (newNumber - oldNumber) * 750;
    }

    public void displayBienLai() {
        displayInformation();
        System.out.println("Chỉ số cũ: " + oldNumber);
        System.out.println("Chỉ số mới:" + newNumber);
        System.out.println("Tiền điện:" + payMoney);
    }
}

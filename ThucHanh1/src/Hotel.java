import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel extends People {
    private int dayRest;
    private String typeRoom;
    private double priceRoom;

    public Hotel() {
    }

    public Hotel(String name, int birthday, String soCMND, int dayRest, String typeRoom, double priceRoom) {
        super(name, birthday, soCMND);
        this.dayRest = dayRest;
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
    }

    public int getDayRest() {
        return dayRest;
    }

    public void setDayRest(int dayRest) {
        this.dayRest = dayRest;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }

    public void inputInformation() {
        Scanner sc = new Scanner(System.in);
        addPeople();
        sc.nextLine();
        System.out.println("Số ngày ở: ");
        dayRest = Integer.parseInt(sc.nextLine());
        System.out.println("Loại phòng: ");
        typeRoom = sc.nextLine();
        System.out.println("Giá phòng ");
        priceRoom = sc.nextDouble();
    }

    public void showInformation() {
        displayPeople();
        System.out.println("Số ngày ở: " + dayRest);
        System.out.println("Loại phòng: " + typeRoom);
        System.out.println("Giá phòng: " + priceRoom);
    }

    public double payMoney() {
        return dayRest * priceRoom;
    }
}

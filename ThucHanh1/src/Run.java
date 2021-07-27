import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Hotel> arr = new ArrayList<>();

        System.out.println("Số lượng khách: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            Hotel hotel = new Hotel();
            System.out.println("Nhập thông tin khách hàng số " + (i+1) + ":");
            hotel.inputInformation();
            arr.add(hotel);
        }

        for (int i = 0; i < arr.size(); i++){
            System.out.println("Thông tin khách hàng số " + (i+1) + ":");
            arr.get(i).showInformation();
        }

        System.out.println("Nhập số CMND để trả phòng : ");
        String findCMND = sc.nextLine();
        sc.nextLine();
        for (int i = 0; i<arr.size(); i++){
            if(arr.get(i).getSoCMND().equalsIgnoreCase(findCMND)){
                //Phương thức equalsIgnoreCase() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi không phân biệt chữ hoa và chữ thường.
                // Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
                System.out.println("Số tiền phòng = " + arr.get(i).payMoney());
            }
        }
    }
}

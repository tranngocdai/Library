import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        ArrayList<BienLai> arrayList = new ArrayList<>();
        System.out.println("Số lượng hộ dân:");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            BienLai bienLai = new BienLai();
            System.out.println("Hộ dân thứ " + (i + 1) + ":");
            bienLai.inputInformation();
            bienLai.inputBienLai();
            arrayList.add(bienLai);
        }

        System.out.println("Thông tin biên lai:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Biên lại hộ dân thứ " + (i + 1) + ":");
            arrayList.get(i).displayBienLai();
        }
    }
}

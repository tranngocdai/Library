import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        ArrayList<Card> newCardList = new ArrayList<>();
        System.out.println("Nhập:");
        n=scanner.nextInt();
        Card card = new Card();
        for (int i = 0; i < n; i++) {
            System.out.println("Phiếu mượn " + (i + 1) + ":");

            card.inputCard();
            newCardList.add(card);

        }

        System.out.println("Thông tin phiếu mượn:");
        for (int i = 0; i < newCardList.size(); i++) {
            System.out.println("Sinh viên thứ: " + (i + 1) + ":");
            newCardList.get(i).displayCard();
        }
    }
}

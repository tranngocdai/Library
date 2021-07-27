import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("CCCCCAC");
        System.out.println("LOZZZZZ");
        Scanner sc =new Scanner(System.in);

        System.out.println("A");
        double a =sc.nextDouble();
        System.out.println("B");
        double b =sc.nextDouble();

        if(a!=0){
            double solution =-b/a;
            System.out.println(solution);
        }else{
            if(b==0){
                System.out.println("all");
            }else{
                System.out.println("out");
            }
        }
    }
}

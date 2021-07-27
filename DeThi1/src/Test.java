import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception
    {
        ArrayList ds;
        int n;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.print("Nhap so luong khach hang: ");
            n=sc.nextInt();
            sc.nextLine();
        }catch(Exception e)
        {
            n=1;
        }
        String tl=null;
        ds=new ArrayList(n);
        KhachSan b=new KhachSan();
        while(true)
        {
            b.nhapThongTin();
            ds.add(b);
            System.out.print("Ban co muon nhap nua khong (c/k): ");
            tl=sc.nextLine();
            if(tl.equalsIgnoreCase("k"))
                break;
        }
        for(int i=0;i < n;i++)
        {
            System.out.println("--------------------");
            ds.get(i).hienThongTin();
            System.out.println("--------------------");
        }

        System.out.println("Nhung khach hang dang o trong khach san: ");
        for(int i=0;i < n;i++)
            ds.get(i).hienThongTin();

    }
}

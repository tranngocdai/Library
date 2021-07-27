package Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TheMuon> ds = new ArrayList(10);

    public QuanLy() {
    }

    public void themTheMuon(TheMuon theMuon) {
        this.ds.add(theMuon);
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap vao so luong the muon: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao danh sach:");

        for(int i = 0; i < n; ++i) {
            System.out.println("The muon thu " + (i + 1) + " la:");
            TheMuon theMuon = new TheMuon();
            theMuon.nhapThongTin(sc);
            this.themTheMuon(theMuon);
        }

    }

    public void hienThiDanhSachTraCuoiThang() {
        Iterator var2 = this.ds.iterator();

        while(true) {
            TheMuon the;
            do {
                if (!var2.hasNext()) {
                    return;
                }

                the = (TheMuon)var2.next();
            } while(the.getHanTra().getDate() != 31 && the.getHanTra().getDate() != 30);

            the.hienThiThongTin();
        }
    }
}

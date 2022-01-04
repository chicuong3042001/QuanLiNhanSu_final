

import NhanSu.DanhSachCoder;
import NhanSu.DanhSachTester;
import NhanSu.DanhSachSeller;
import java.util.Scanner;

public class PhieuLuong {

    private DanhSachCoder listCoder = new DanhSachCoder();
    private DanhSachTester listTester = new DanhSachTester();
    private DanhSachSeller listSeller = new DanhSachSeller();
    Scanner sc = new Scanner(System.in);

    public void ThongKeLuong() {
        listCoder.DocFileJava();
        listTester.DocFileJava();
        listSeller.DocFileJava();
        int select = 0;
        do {
            System.out.println("||============ Thong ke phieu luong ============||");
            System.out.println("||1. Xem phieu luong nhan vien coder            ||");
            System.out.println("||2. Xem phieu luong nhan vien tester           ||");
            System.out.println("||3. Xem phieu luong nhan vien seller           ||");
            System.out.println("||0. Quay lai                                   ||");
            System.out.println("||==============================================||");
            System.out.print("Chon thao tac: ");
            select = sc.nextInt();;

            switch (select) {
                case 1: {
                    listCoder.InPhieuLuong();

                    break;
                }
                case 2: {
                    listTester.InPhieuLuong();

                    break;
                }
                case 3: {
                    listSeller.InPhieuLuong();
                    break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Nhap sai thao tac, xin nhap lai !!!");
            }
        } while (select != 0);

    }
}

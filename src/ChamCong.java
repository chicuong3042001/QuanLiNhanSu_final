

import NhanSu.DanhSachCoder;
import NhanSu.DanhSachTester;
import NhanSu.DanhSachSeller;
import java.util.Scanner;

public class ChamCong {

    
    private DanhSachCoder listCoder = new DanhSachCoder();
    private DanhSachTester listTester = new DanhSachTester();
    private DanhSachSeller listSeller = new DanhSachSeller();
    Scanner sc = new Scanner(System.in);

    public void XuatMenu() {

        int select = 0;
        do {
            System.out.println("||================= Bang cham cong ================||");
            System.out.println("||1. Cham cong nhan vien coder                     ||");
            System.out.println("||2. Cham cong nhan vien tester                    ||");
            System.out.println("||3. Cham cong nhan vien seller                    ||");
            System.out.println("||0. Quay lai                                      ||");
            System.out.println("||=================================================||");
            System.out.print("Nhap thao tac: ");
            select = sc.nextInt();
            switch (select) {
                case 1: {
                    listCoder.DocFileJava();
                    listCoder.ThemChamCong();
                    break;
                }

                case 2: {
                    listTester.DocFileJava();
                    listTester.ThemChamCong();
                    break;
                }

                case 3: {
                    listSeller.DocFileJava();
                    listSeller.ThemChamCong();
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

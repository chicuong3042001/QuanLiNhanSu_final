

import NhanSu.DanhSachCoder;
import NhanSu.DanhSachTester;
import NhanSu.DanhSachSeller;


import java.util.Scanner;

public class NghiPhep {

    private DanhSachCoder listCoder = new DanhSachCoder();
    private DanhSachTester listTester = new DanhSachTester();
    private DanhSachSeller listSeller = new DanhSachSeller();
    Scanner sc = new Scanner(System.in);

    public void XuatMenu() {

        int select = 0;

        do {
            System.out.println("||================= Nghi phep =================||");
            System.out.println("||1. Them nghi phep nhan vien coder            ||");
            System.out.println("||2. Them nghi phep nhan vien tester           ||");
            System.out.println("||3. Them nghi phep nhan vien seller           ||");
            System.out.println("||0. Quay lai                                  ||");
            System.out.println("||=============================================||");
            System.out.print("Chon thao tac: ");
            select = sc.nextInt();
            switch (select) {

                case 1: {
                    listCoder.DocFileJava();
                    listCoder.ThemNghiPhep();
                    break;
                }
                case 2: {
                    listTester.DocFileJava();
                    listTester.ThemNghiPhep();
                    break;
                }
                case 3: {
                    listSeller.DocFileJava();
                    listSeller.ThemNghiPhep();
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

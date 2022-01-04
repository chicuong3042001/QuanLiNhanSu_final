
import NhanSu.DanhSachCoder;
import NhanSu.DanhSachSeller;
import NhanSu.DanhSachTester;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        DanhSachCoder listCoder = new DanhSachCoder();
        DanhSachTester listTester = new DanhSachTester();
        DanhSachSeller listSeller = new DanhSachSeller();
        Scanner sc = new Scanner(System.in);
        PhieuLuong pl = new PhieuLuong();
        NghiPhep np = new NghiPhep();
        ChamCong cc = new ChamCong();
        int select = 0;
        do {
            System.out.println("||================== Menu chinh ===================||");
            System.out.println("||1. Chon cac thao tac nhan vien coder             ||");
            System.out.println("||2. Chon cac thao tac nhan vien tester            ||");
            System.out.println("||3. Chon cac thao tac nhan vien seller            ||");
            System.out.println("||4. Chon cac thao tac nhan vien nghi phep         ||");
            System.out.println("||5. Cham cong nhan vien                           ||");
            System.out.println("||6. Thong ke luong cac loai nhan vien             ||");
            System.out.println("||0. Thoat chuong trinh                            ||");
            System.out.println("||=================================================||");
            System.out.print("Nhap lua chon: ");
            select = sc.nextInt();
            switch (select) {
                case 1: {
                    listCoder.XuatMenu();
                    break;
                }
                case 2: {
                    listTester.XuatMenu();
                    break;
                }
                case 3: {
                    listSeller.XuatMenu();
                    break;
                }
                case 4: {
                    np.XuatMenu();
                    break;
                }
                case 5:
                    cc.XuatMenu();
                    break;
                case 6:
                    pl.ThongKeLuong();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Nhap sai lua chon, xin nhap lai !!!");

            }
        } while (select != 0);

    }

}

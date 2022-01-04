package NhanSu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DanhSachTester implements ThaoTac {

    private int size = 0;
    public Tester[] tester = new Tester[100];
    Scanner sc = new Scanner(System.in);

    public DanhSachTester() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Tester[] getTester() {
        return tester;
    }

    public void setTester(Tester[] tester) {
        this.tester = tester;
    }

    //Them nhan vien Tester
    @Override
    public void Them() {
        sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien can them: ");
        int slnv = sc.nextInt();
        for (int i = size; i < size + slnv; i++) {
            tester[i] = new Tester();
            System.out.println("Nhap thong tin nhan vien: ");
            tester[i].Nhap();
            System.out.println("Them nhan vien thanh cong");
        }
        size += slnv;
        GhiFileJava();
    }

    //Xuat nhan vien Tester ra man hinh
    @Override
    public void Xuat() {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            tester[i].Xuat();
            flag = true;
        }
        if (flag == false) {
            System.out.println("Khong co nhan vien de xuat");
        }
    }

    //Xoa nhan vien Tester
    @Override
    public void Xoa() {
        sc = new Scanner(System.in);
        System.out.println("||============ Xoa nhan vien ===============||");

        System.out.print("Nhap ID tester can xoa : ");
        String ID = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (ID.equals(tester[i].getID())) {
                for (int j = i; j < size; j++) {
                    tester[j] = tester[j + 1];
                    flag = true;
                }
                size--;
                GhiFileJava();
                System.out.println("Da xoa thanh cong!");
            }
        }

        if (flag == false) {
            System.out.println("Khong co nhan vien de xoa");
        }

    }

    //Sua nhan vien Tester
    @Override
    public void Sua() {
        System.out.println("||============ Chon muc ban muon sua ===============||");
        System.out.println("||1. Sua ho va ten nhan vien                        ||");
        System.out.println("||2. Sua he so luong cua nhan vien                  ||");
        System.out.println("||3. Sua chuc vu cua nhan vien                      ||");
        System.out.println("||0. Quay lai                                       ||");
        System.out.println("||==================================================||");
        System.out.print("Nhap thao tac : ");
        int select = sc.nextInt();
        switch (select) {
            case 1: {
                sc = new Scanner(System.in);
                System.out.print("Nhap ID nhan vien can sua: ");
                String ID = sc.nextLine();
                System.out.print("Nhap ho va ten nhan vien moi : ");
                String newFullName = sc.nextLine();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    if (ID.equals(tester[i].getID())) {
                        tester[i].setFullName(newFullName);
                        System.out.println("Da sua thanh cong!");
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Khong co nhan vien de sua");
                }
                GhiFileJava();
                break;

            }
            case 2: {
                sc = new Scanner(System.in);
                System.out.print("Nhap ID nhan vien can sua: ");
                String ID = sc.nextLine();
                System.out.print("Nhap he so luong moi cua nhan vien : ");
                double newHeSoLuong = sc.nextDouble();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    if (ID.equals(tester[i].getID())) {
                        tester[i].setHeSoLuong(newHeSoLuong);
                        System.out.println("Da sua thanh cong!");
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Khong co nhan vien de sua");
                }
                GhiFileJava();
                break;
            }
            case 3: {
                sc = new Scanner(System.in);
                System.out.print("Nhap ID nhan vien can sua: ");
                String ID = sc.nextLine();
                System.out.print("Nhap chuc vu moi cua nhan vien : ");
                String newChucVu = sc.nextLine();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    if (ID.equals(tester[i].getID())) {
                        tester[i].setChucVu(newChucVu);
                        System.out.println("Da sua thanh cong!");
                        flag = true;
                    }
                }

                if (flag == false) {
                    System.out.println("Khong co nhan vien de sua");
                }
                GhiFileJava();
                break;
            }
            case 0:
                break;
            default:
                System.out.println("Nhap sai thao tac, xin nhap lai !!!");

        }

    }

    //Tim kiem Coder bang ma nhan vien
    @Override
    public void TimKiem() {
        System.out.println("||============ Chon thao tac tim kiem ===============||");
        System.out.println("||1. Tim nhan vien theo ID                           ||");
        System.out.println("||2. Tim nhan vien theo ten                          ||");
        System.out.println("||0. Quay lai                                        ||");
        System.out.println("||===================================================||");
        System.out.print("Nhap thao tac : ");
        int select = sc.nextInt();
        switch (select) {
            case 1: {
                sc = new Scanner(System.in);
                System.out.print("Nhap ID nhan vien can tim: ");
                String ID = sc.nextLine();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    if (ID.equals(tester[i].getID())) {
                        tester[i].Xuat();
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Khong tim thay nhan vien");
                }
                break;
            }
            case 2: {
                sc = new Scanner(System.in);
                System.out.print("Nhap ho va ten nhan vien can tim: ");
                String fullName = sc.nextLine();
                String toLowerCase = fullName.toLowerCase();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    if ((tester[i].getFullName().toLowerCase().contains(toLowerCase))) {
                        tester[i].Xuat();
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Khong tim thay nhan vien");
                }
            }
            case 0:
                break;
            default:
                System.out.println("Nhap sai thao tac, xin nhap lai !!!");

        }
    }

    //Xuat menu ra man hinh
    @Override
    public void XuatMenu() {
        int select = 0;
        DocFileJava();
        do {
            System.out.println("||============ Chon thao tac ===============||");
            System.out.println("||1. Them nhan vien moi                     ||");
            System.out.println("||2. Xuat danh sach nhan vien               ||");
            System.out.println("||3. Xoa nhan vien                          ||");
            System.out.println("||4. Sua nhan vien                          ||");
            System.out.println("||5. Tim nhan vien                          ||");
            System.out.println("||0. Quay lai                               ||");
            System.out.println("||==========================================||");
            System.out.print("Nhap thao tac: ");
            select = sc.nextInt();
            switch (select) {
                case 1: {
                    Them();
                    break;
                }

                case 2:
                    Xuat();
                    break;
                case 3:
                    Xoa();
                    break;
                case 4:
                    Sua();
                    break;
                case 5:
                    TimKiem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhap sai thao tac, xin nhap lai !!!");

            }

        } while (select != 0);
    }

    //Doc file
    @Override
    public void DocFileJava() {
        int i = 0;
        try {
            FileReader fr = new FileReader("NhanVienTester.txt");
            BufferedReader br = new BufferedReader(fr);
            try {
                String line = " ";
                while (true) {
                    line = br.readLine();
                    if (line == null) {
                        break;
                    }
                    String txt[] = line.split("\\|");
                    String ID = txt[0];
                    String fullName = txt[1];
                    String gender = txt[2];
                    int age = Integer.parseInt(txt[3]);
                    String phongBan = "Phong Dev";
                    double luongcoban = 1500000;
                    double heSoLuong = Double.parseDouble(txt[4]);
                    String chucVu = "Tester";
                    int soBug = Integer.parseInt(txt[5]);
                    tester[i] = new Tester(ID, fullName, gender, age, phongBan, chucVu, luongcoban, heSoLuong, soBug);
                    i++;
                }
            } finally {
                size = i;
                br.close();
            }

        } catch (Exception e) {
        }

    }

    //Ghi file
    @Override
    public void GhiFileJava() {
        try {
            FileWriter fw = new FileWriter("NhanVienTester.txt", false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < size; i++) {
                pw.println(tester[i].getID() + "|"
                        + tester[i].getFullName() + "|"
                        + tester[i].getGender() + "|"
                        + tester[i].getAge() + "|"
                        + tester[i].getHeSoLuong() + "|"
                        + tester[i].getSoBug());
            }

            bw.close();
        } catch (IOException e) {
        }
    }

    //In phieu luong
    @Override
    public void InPhieuLuong() {
        for (int i = 0; i < size; i++) {
            tester[i].phieuLuong();
        }
    }

    //Cham cong nhan vien
    @Override
    public void ThemChamCong() {
    sc = new Scanner(System.in);
        System.out.print("Nhap ID tester can cham cong: ");
        String ID = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (ID.equals(tester[i].getID())) {
                tester[i].ChamCong();
                tester[i].ghiFileChamCong();
                flag = true;
                System.out.println("Cham cong thanh cong");
            }
        }
        if (flag == false) {
            System.out.println("Khong tim thay nhan vien");
        }
    }
    
    //Them nhan vien nghi phep
    @Override
    public void ThemNghiPhep() {
        sc = new Scanner(System.in);
        System.out.print("Nhap ID tester can nghi phep: ");
        String ID = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (ID.equals(tester[i].getID())) {
                tester[i].NhapThoiGian();
                tester[i].ghiFileNghiPhep();
                flag = true;
                System.out.println("Da them vao danh sach nghi phep");
            }
        }
        if (flag == false) {
            System.out.println("Khong tim thay nhan vien");
        }
    }

}

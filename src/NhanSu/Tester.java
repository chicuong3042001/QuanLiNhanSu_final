package NhanSu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tester extends NhanVien {

    private static int STTtester = 100;
    private int soBug;
    Scanner sc = new Scanner(System.in);

    public Tester() {
        super();
        this.ID = "TEST" + ++STTtester;
        this.soBug = 0;
    }

    public Tester(String ID, String fullName, String gender, int age, String phongBan, String chucVu, double luongcoban, double heSoLuong, int soBug) {
        super(ID, fullName, gender, age, chucVu, phongBan, luongcoban, heSoLuong);
        this.soBug = soBug;
    }

    public static int getSTTtester() {
        return STTtester;
    }
    
    public int getSoBug() {
        return soBug;
    }

    public void setSoBug(int soBug) {
        this.soBug = soBug;
    }

    public double luongBug() {
        return this.soBug * 50000;
    }

    @Override
    public void Nhap() {

        System.out.print("+ Nhap ten: ");
        fullName = sc.nextLine();
        System.out.print("+ Nhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.print("+ Nhap tuoi: ");
        age = sc.nextInt();
        phongBan = "Phong Dev";
        chucVu = "Tester";
        luongcoban = 1500000;
        System.out.print("+ Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
        System.out.print("+ Nhap so bug tim duoc: ");
        soBug = sc.nextInt();

    }

    @Override
    public void Xuat() {
        System.out.println("ID: " + ID + " || " + "Ten: " + fullName + " || " + "Gioi tinh: " + gender + " || " + "Tuoi: " + age + " || "
                + "Phong ban: " + phongBan + " || " + "Chuc vu: " + chucVu + " || " + "He so luong: " + heSoLuong);
    }

    @Override
    public double TinhLuong() {
        return this.luongcoban * heSoLuong + this.luongBug();
    }

    @Override
    public void phieuLuong() {
        System.out.println("ID: " + ID + " || " + "Ten: " + fullName + " || " + "Chuc vu: " + chucVu + " || " + "Luong: " + TinhLuong());
    }

    @Override
    public void ghiFileNghiPhep() {
        try (FileWriter fw = new FileWriter("NhanVienNghiPhep.txt", true);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)) {
            pw.println(ID + "|" + fullName + "|" + phongBan + "|" + chucVu + "|" + StartDay.toString() + "|" + EndDay.toString());
            pw.close();
            bf.close();
            fw.close();
        } catch (IOException e) {
        }
    }

    @Override
    public void NhapThoiGian() {
        System.out.println("Nhap thoi gian bat dau nghi: ");
        StartDay.setTime();
        System.out.println("Nhap thoi gian ket thuc nghi: ");
        EndDay.setTime();
    }

    @Override
    public void ChamCong() {
        System.out.println("Nhap thoi gian vao lam: ");
        StartDay.setFullDay();
        System.out.println("Nhap thoi gian ra ve: ");
        EndDay.setFullDay();
    }

    @Override
    public void ghiFileChamCong() {
        try (FileWriter fw = new FileWriter("ChamCong.txt", true);
                BufferedWriter bf = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bf)) {
            pw.println(ID + "|" + fullName + "|" + phongBan + "|" + chucVu + "|" + StartDay.XuatNgay() + "|" + EndDay.XuatNgay());
            pw.close();
            bf.close();
            fw.close();
        } catch (IOException e) {
        }
    }
}

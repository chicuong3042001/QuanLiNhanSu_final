package NhanSu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Seller extends NhanVien {

    private static int STTseller = 100;
    private double soTienBanDuoc;
    Scanner sc = new Scanner(System.in);

    public Seller() {
        super();
        this.ID = "SL" + ++STTseller;
        this.soTienBanDuoc = 0;
    }

    public Seller(String ID, String fullName, String gender, int age, String phongBan, String chucVu, double luongcoban, double heSoLuong, double soTienBanDuoc) {
        super(ID, fullName, gender, age, chucVu, phongBan, luongcoban, heSoLuong);
        this.soTienBanDuoc = soTienBanDuoc;
    }

    public static int getSTTseller() {
        return STTseller;
    }
    
    public double getSoTienBanDuoc() {
        return soTienBanDuoc;
    }

    public void setSoTienBanDuoc(double soTienBanDuoc) {
        this.soTienBanDuoc = soTienBanDuoc;
    }

    public double tinhTienHoaHong() {
        return 0.2 * this.soTienBanDuoc;
    }

    @Override
    public void Nhap() {

        System.out.print("+ Nhap ten: ");
        fullName = sc.nextLine();
        System.out.print("+ Nhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.print("+ Nhap tuoi: ");
        age = sc.nextInt();
        phongBan = "Phong Marketing";
        chucVu = "Seller";
        luongcoban = 1500000;
        System.out.print("+ Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
        System.out.print("+ Nhap so tien ban duoc: ");
        soTienBanDuoc = sc.nextInt();

    }

    @Override
    public void Xuat() {
        System.out.println("ID: " + ID + " || " + "Ten: " + fullName + " || " + "Gioi tinh: " + gender + " || " + "Tuoi: " + age + " || "
                + "Phong ban: " + phongBan + " || " + "Chuc vu: " + chucVu + " || " + "He so luong: " + heSoLuong);
    }

    @Override
    public double TinhLuong() {
        return this.luongcoban * this.heSoLuong + tinhTienHoaHong();
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

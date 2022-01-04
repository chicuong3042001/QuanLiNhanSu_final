package NhanSu;

public abstract class NhanVien {

    protected String ID, fullName, gender, chucVu, phongBan;
    protected double luongcoban, heSoLuong;
    protected int age = 0;
    protected Date StartDay = new Date();
    protected Date EndDay = new Date();

    public NhanVien() {
        ID = "";
        fullName = "";
        gender = "";
        age = 0;
        chucVu = "";
        phongBan = "";
        luongcoban = 0;
        heSoLuong = 0;
    }

    public NhanVien(String ID, String fullName, String gender, int age, String chucVu, String phongBan, double luongcoban, double heSoLuong) {
        this.ID = ID;
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.chucVu = chucVu;
        this.phongBan = phongBan;
        this.luongcoban = luongcoban;
        this.heSoLuong = heSoLuong;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Date getStartDay() {
        return StartDay;
    }

    public void setStartDay(Date StartDay) {
        this.StartDay = StartDay;
    }

    public Date getEndDay() {
        return EndDay;
    }

    public void setEndDay(Date EndDay) {
        this.EndDay = EndDay;
    }

    public abstract void Nhap();
    public abstract void Xuat();
    public abstract double TinhLuong();
    public abstract void phieuLuong();
    public abstract void ghiFileNghiPhep();
    public abstract void NhapThoiGian();
    public abstract void ChamCong();
    public abstract void ghiFileChamCong();
}

package NhanSu;

import java.util.Scanner;

public class Date {

    private int day;
    private int month;
    private int year;
    private boolean namNhuan = false;
    private int hour;
    private int minute;
    private int second;

    Scanner sc = new Scanner(System.in);

    public Date() {
        day = 0;
        month = 0;
        year = 0;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        namNhuan = checkYear(year);
    }

    public Date(int day, int month, int year, int hour, int minute, int second) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }

        return false;
    }

    public boolean checkDay(int day) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day >= 1 && day <= 31) {
                return true;
            } else {
                return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day >= 1 && day <= 30) {
                return true;
            } else {
                return false;
            }

        } else {
            if (namNhuan) {
                if (day >= 1 && day <= 29) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (day >= 1 && day <= 28) {
                    return true;
                } else {
                    return false;
                }
            }
        }

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setYear() {
        while (true) {
            try {
                System.out.print("+ Nam: ");
                year = Integer.parseInt(sc.nextLine());
                namNhuan = checkYear(year);
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! ");
            }
        }
    }

    public void setDay() {
        while (true) {
            try {
                while (true) {
                    System.out.print("+ Ngay: ");
                    day = Integer.parseInt(sc.nextLine());
                    if (checkDay(day)) {
                        break;
                    }
                }
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! ");
            }
        }
    }

    public void setMonth() {
        while (true) {
            try {
                do {
                    System.out.print("+ Thang: ");
                    month = Integer.parseInt(sc.nextLine());
                } while (month > 12 || month < 1);
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! ");
            }
        }
    }

    public void setHour() {
        while (true) {
            try {
                do {
                    System.out.print("+ Gio: ");
                    hour = Integer.parseInt(sc.nextLine());
                } while (hour > 23 || hour < 0);
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! ");
            }
        }
    }

    public void setMinute() {
        while (true) {
            try {
                do {
                    System.out.print("+ Phut: ");
                    minute = Integer.parseInt(sc.nextLine());
                } while (minute > 60 || minute < 0);
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! ");
            }
        }
    }

    public void setSecond() {
        while (true) {
            try {
                do {
                    System.out.print("+ Giay: ");
                    second = Integer.parseInt(sc.nextLine());
                } while (second > 60 || second < 0);
                break;
            } catch (Exception ex) {
                System.out.println("Cu phap ko chinh xac moi ban nhap lai !!! ");
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime() {
        setYear();
        setMonth();
        setDay();
    }

    public void setFullDay() {
        setTime();
        setHour();
        setMinute();
        setSecond();
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public String XuatNgay() {
        return day + "/" + month + "/" + year + "-" + hour + ":" + minute + ":" + second;
    }
}

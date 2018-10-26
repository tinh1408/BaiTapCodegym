package PhuongThuc.Buoi1;

import java.util.Scanner;

public class DemSoNgay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int namBatDau, namKetThuc;
        do {
            System.out.print("Năm bắt đầu: ");
            namBatDau = sc.nextInt();
            System.out.print("Năm kết thúc: ");
            namKetThuc = sc.nextInt();
            if (namBatDau > 0 && namKetThuc > 0) {
                break;
            } else System.out.println("LỖI");
        } while (true);
        int tongSoNgay = 0;
        for (int i = namBatDau; i <= namKetThuc; i++) {
            if (kiemTraNamNhuan(i)) {
                tongSoNgay += 366;
            } else tongSoNgay += 365;
        }
        System.out.println(tongSoNgay);
    }

    public static boolean kiemTraNamNhuan(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else return false;
    }
}
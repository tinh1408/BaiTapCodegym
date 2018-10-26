package PhuongThuc.Buoi2.BaiTapThem;

import java.util.Scanner;

public class B4 {
    static final int MIN1 = 3;
    static final int MIN2_10 = 1;
    static final int MIN11 = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền: n = ");
        int n = sc.nextInt();
        System.out.println(tinhThoiGian(n));
    }

    public static int tinhThoiGian(int tien) {
        int time = 0;
        if (tien < MIN1) {
            return 0;
        } else if (tien >= MIN1) {
            time = time + 1;
            tien = tien - MIN1;
            if (tien <= MIN2_10 * 9) {
                time = time + tien;
            } else {
                tien = tien - MIN2_10 * 9;
                time = time + MIN2_10 * 9 + tien / MIN11;
            }
        }
        return time;
    }
}
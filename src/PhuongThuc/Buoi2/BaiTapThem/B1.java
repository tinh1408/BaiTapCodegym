package PhuongThuc.Buoi2.BaiTapThem;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumSn(n));
    }

    public static float sumSn(int n) {
        if (n == 1) {
            return 1;
        } else return sumSn(n - 1) + ((float)1) / n;
    }

}
package PhuongThuc.Buoi2.BaiTapThem;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumTn(n));
    }

    public static int sumTn(int n) {
        if (n == 1) {
            return 1;
        } else return sumTn(n - 1) + n*n;
    }

}
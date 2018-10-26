package PhuongThuc.Buoi1;

import java.util.Scanner;

public class HienThiSoPentagonal {
    public static void main(String[] args) {
        int n = nhap();
        for (int i=1; i<=n; i++){
            System.out.print(getPentagonalNumber(i)+"\t");
        }
    }

    public static int nhap() {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print("Nhập số lượng muốn hiển thị: n = ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid value");
            } else {
                return n;
            }
        } while (check);
        return 0;
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
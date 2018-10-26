package PhuongThuc.Buoi2.BaiTapThem;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int digitSumUp = tinhTong(n);
        System.out.println("tổng các chữ số: " + digitSumUp);

    }

    public static int tinhTong(int n) {
        int gio = n / 60;
        int phut = n % 60;
        String h = String.valueOf(gio);
        String m = String.valueOf(phut);
        if (h.length() == 1) {
            h = "0" + h;
        }
        if (m.length() == 1) {
            m = "0" + m;
        }
        System.out.println("Current time: " + h + " : " + m);
        int digitSumUp = Integer.parseInt(h.substring(0,1)) + Integer.parseInt(h.substring(1,2)) + Integer.parseInt(m.substring(0,1)) + Integer.parseInt(m.substring(1,2));
        return digitSumUp;
    }
}
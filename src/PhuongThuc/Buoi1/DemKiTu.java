package PhuongThuc.Buoi1;

import java.util.Scanner;

public class DemKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String chuoi = sc.nextLine();
        System.out.println(demKiTu(chuoi));
    }

    public static int demKiTu(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                count++;
            }
        }
        return s.length() - count;
    }
}
package Mang.BaiTapThem;

import java.util.Scanner;

public class Basic_bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kichThuoc;
        do {
            System.out.print("nhập kích thước mảng : ");
            kichThuoc = sc.nextInt();
            if (kichThuoc > 0) {
                break;
            } else System.out.println("LỖI");
        } while (true);
        int[] mang = nhapMang(kichThuoc);
        timMaxMin(mang);
    }

    public static int[] nhapMang(int kichThuuoc) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[kichThuuoc];
        for (int i = 0; i < kichThuuoc; i++) {
            System.out.print("Phần tử thứ " + i + " ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void timMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int bien : arr) {
            if (min > bien) {
                min = bien;
            }
            if (max < bien) {
                max = bien;
            }
        }
        System.out.println("MIN = " + min + ", MAX = " + max);
    }
}
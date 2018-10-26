package PhuongThuc.Buoi1.BaiTapThem;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n chẵn: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr = taoMang(arr);
        timSoDoiDien(arr);
    }

    public static void timSoDoiDien(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần tìm: ");
        int soCanTim = sc.nextInt();
        int mid = arr.length/2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == soCanTim) {
                System.out.println(arr[mid+i]);
                return;
            }
        }
    }

    public static int[] taoMang(int[] arr) {
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = k;
            k++;
        }
        return arr;
    }
}
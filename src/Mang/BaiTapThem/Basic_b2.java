package Mang.BaiTapThem;

import java.util.Arrays;
import java.util.Scanner;

public class Basic_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kichThuoc;
        do {
            System.out.print("Nhập kích thước mảng: ");
            kichThuoc = sc.nextInt();
            if (kichThuoc > 0) {
                break;
            } else System.out.println("Lỗi!!!");
        } while (true);
        int[] arr = new int[kichThuoc];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử thứ "+(i+1)+"\t");
            arr[i] = sc.nextInt();
        }
        int[] arrSaoChep = saoChepMang(arr);
        System.out.println(Arrays.toString(arrSaoChep));
    }

    public static int[] saoChepMang(int[] arr) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = arr[i];
        }
        return arrNew;
    }
}
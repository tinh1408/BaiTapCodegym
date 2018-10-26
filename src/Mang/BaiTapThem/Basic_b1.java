package Mang.BaiTapThem;

import java.util.Arrays;
import java.util.Scanner;

public class Basic_b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = taoMangRandom();
        System.out.print("Nhập số cần tìm: ");
        int soCanTim = sc.nextInt();
        int index = check(soCanTim,arr);
        if (index == -1){
            System.out.println("Không tìm thấy");
        }else {
            System.out.println("index = "+ index);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] taoMangRandom() {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int check(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i + 1;
            }
        }
        return -1;
    }
}
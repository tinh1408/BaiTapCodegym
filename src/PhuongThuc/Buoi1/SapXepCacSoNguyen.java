package PhuongThuc.Buoi1;


import java.util.Arrays;
import java.util.Scanner;

public class SapXepCacSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = nhap();
        menu();
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(Arrays.toString(sortTangDan(arr)));
                break;
            case 2:
                System.out.println(Arrays.toString(sortGiamDan(arr)));
                break;
                default:
                    System.out.println("Lỗi");
                    break;
        }
    }

    public static void menu() {
        System.out.println("MENU:");
        System.out.println("\t1.Sắp xếp tăng dần");
        System.out.println("\t2.Sắp xếp giảm dần");
        System.out.println("Nhập lựa chọn của bạn");
    }

    public static int[] nhap() {
        int quantity;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.print("Nhập số lượng muốn sắp xếp: ");
            quantity = sc.nextInt();
            if (quantity > 0) {
                break;
            } else System.out.println("Lỗi");
        } while (true);
        int[] arr = new int[quantity];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("số thứ " + (i + 1) + " ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] sortTangDan(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] sortGiamDan(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
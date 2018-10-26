package Mang.BaiTapThem;
import java.util.Scanner;
public class Advance_bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tổng số phần tử: ");
        int soPtu = sc.nextInt();
        int[] arr = new int[soPtu];
        System.out.println("Nhập các phần tử ");
        for (int i=0; i<soPtu; i++){
            arr[i] = sc.nextInt();
        }
        int tich = arr[0]*arr[1];
        for (int i=1; i<arr.length-1; i++){
            if ((arr[i]*arr[i+1])>tich){
                tich = arr[i]*arr[i+1];
            }
        }
        System.out.println(tich);
    }
}
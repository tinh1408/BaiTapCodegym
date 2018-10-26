package Mang.BaiTapThem;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Advance_bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bức tượng: ");
        int soBucTuong = sc.nextInt();
        int[] arr = new int[soBucTuong];
        System.out.println("Nhập size của các bức tượng ");
        for (int i=0; i<soBucTuong; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0],min = arr[0];
        for (int bien:arr) {
            if (max < bien){
                max = bien;
            }
        }
        for (int bien:arr) {
            if (min > bien){
                min = bien;
            }
        }
        System.out.println("Nhập độ chênh lệch giữa các size");
        int doChenhLech = sc.nextInt();
        if ((max - min)%doChenhLech!= 0){
            System.out.println("LỖI. KIỂM TRA LẠI");
        }else {
            int tongSoPtu = ((max - min) / doChenhLech) + 1;
            int count = tongSoPtu - soBucTuong;
            System.out.println("Thiếu "+ count+" bức tượng");
        }
    }
}

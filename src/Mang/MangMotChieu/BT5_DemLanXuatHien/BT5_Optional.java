package Mang.MangMotChieu.BT5_DemLanXuatHien;
import java.util.Scanner;
public class BT5_Optional {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        char[] array = str.toCharArray();
        String input;
        boolean kiemTra;
        do {
            System.out.print("Nhập kí tự cần kiểm tra: ");
            input = sc.next();
            if (input.length()!=1){
                System.out.println("Vui lòng nhập 1 kí tự");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        char x = input.charAt(0);

        int count =0;
        for (int i=0; i<array.length; i++){
            if (x == array[i]){
                count++;
            }
        }
        System.out.print("Kí tự xuất hiện "+count+" lần");
    }
}
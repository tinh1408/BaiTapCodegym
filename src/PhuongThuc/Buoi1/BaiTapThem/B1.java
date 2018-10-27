package PhuongThuc.Buoi1.BaiTapThem;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.next();
        String strNguoc = daoNguoc(str);
        if (str.equals(strNguoc)){
            System.out.println(str + " là chuỗi đối xứng");
        }else  System.out.println(str + " ko phải chuỗi đối xứng");
    }
    public static String daoNguoc(String x){
        String strNguoc = "";
        char[] arr = x.toCharArray();
        for (int i = arr.length - 1; i>=0; i--){
            strNguoc += arr[i];
        }
        return strNguoc;
    }
      /* Thuật toán của em đúng nhưng cần chỉnh sửa 1 tí để có thuật toán tối ưu hơn
    bằng cách không cần khởi tạo 1 mảng mới, việc khởi tạo sẽ chiếm bộ nhớ*/

    public static  boolean kiemTra(){
        for(int i = 0; i<str.length();i++){
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    isPa = false;
                    break;
                }else{
                    isPa = true;
                }
            }
         return isPa;
    }
}

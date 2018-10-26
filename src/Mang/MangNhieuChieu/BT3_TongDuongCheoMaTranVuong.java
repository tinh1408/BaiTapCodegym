package Mang.MangNhieuChieu;
import java.util.Scanner;
public class BT3_TongDuongCheoMaTranVuong {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int kichThuoc;
        boolean kiemTra;
        do {
            System.out.print("Ma trận vuông có kích thước NxN với n = ");
            kichThuoc = sc.nextInt();
            if (kichThuoc<=0){
                System.out.println("LỖI");
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        int[][] array = new int[kichThuoc][kichThuoc];
        //Nhập các phần tử của mảng 2 chiều
        for (int i=0; i<array.length; i++){
            System.out.print("Nhập các phần tử ở hàng thứ "+(i+1)+ " : ");
            for (int j=0; j<array[i].length; j++){
                array[i][j] = sc.nextInt();
            }
        }
        //Tính tổng đường chéo
        int tong = 0;
        for (int i=0; i<kichThuoc; i++){
            tong += array[i][i];
        }
        System.out.println("Tổng đường chéo chính là: "+tong);
    }
}
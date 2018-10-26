package Mang.MangNhieuChieu;
import java.util.Scanner;
public class BT4_Mang2Chieu_Cong2MaTran {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int hang, cot;
        boolean kiemTra;
        //Nhập kích thước 2 ma trận
        do {
            System.out.print("2 ma trận có kích thước NxM với N,M lần lượt là: ");
            hang = sc.nextInt();
            cot = sc.nextInt();
            if (hang<=0 || cot<=0){
                kiemTra = true;
            }else kiemTra = false;
        }while (kiemTra);
        //Nhập ma trận 1
        System.out.println("Nhập ma trận 1");
        int[][] maTran1 = new int[hang][cot];
        nhapMaTran(maTran1,hang,cot);
        System.out.println("Nhập ma trận 2");
        int[][] maTran2 = new int[hang][cot];
        nhapMaTran(maTran2,hang,cot);
        //Cộng 2 ma trận và in ra
        int[][] maTran3 = new int[hang][cot];
        System.out.println("Tổng của 2 ma trận là: ");
        for (int i=0; i<hang; i++){
            for (int j=0; j<cot; j++){
                maTran3[i][j] = maTran1[i][j] + maTran2[i][j];
                System.out.print(maTran3[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void nhapMaTran(int[][] maTran, int hang, int cot){
        for (int i=0; i<hang; i++){
            System.out.print("Các phần tử ở hàng "+(i+1)+" là: ");
            for (int j=0; j<cot; j++){
                maTran[i][j] = sc.nextInt();
            }
        }
    }
}
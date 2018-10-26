package BienKieudulieu.Baitap1;
import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        float bankinh, chuvi, dientich;
        boolean TorF;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Bán kính:  ");
            bankinh = sc.nextFloat();
            if (bankinh <= 0) {
                System.out.println("Ko hợp lệ!!!");
                TorF = true;
            } else {
                chuvi = (float) (2 * Math.PI * bankinh);
                dientich = (float) (Math.PI * bankinh * bankinh);
                System.out.println("Chu vi: " + chuvi + ", Dien tich: " + dientich);
                TorF = false;
            }
        }while (TorF);
    }
}
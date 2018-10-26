package BienKieudulieu.Baitap1;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        float C, F;
        String Tieptuc;
        boolean TorF;
        do {
            System.out.println("Nhiệt độ theo độ C là: ");
            Scanner sc = new Scanner(System.in);
            C = sc.nextFloat();
            F = (9 * C) / 5 + 32;
            System.out.println("Nhiệt độ theo thang độ F là: " + F);
            System.out.println("Ấn yes để nhập lại!!!");
            Tieptuc = sc.next();
            if (Tieptuc.equals("yes")){
                TorF = true;
            }
            else TorF = false;
        }while (TorF);
    }
}
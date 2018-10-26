package BienKieudulieu.Baitap1;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        String tieptuc;
        float ly, hoa, sinh;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("diem ly: ");
            ly = input.nextFloat();
            System.out.println("diem hoa: ");
            hoa = input.nextFloat();
            System.out.println("diem sinh: ");
            sinh = input.nextFloat();
            if ((ly>=0 && ly<=10) && (hoa>=0 && hoa<=10) && (sinh>=0 && sinh<=10)){
                float tong = ly+sinh+hoa;
                float trungbinh = tong/3;
                System.out.println("tong= "+tong + ", trung binh = "+trungbinh);
            }else
            {
                System.out.println("Vui lòng nhập lại điểm!!!");
            }
            System.out.println("Nhấn yes để tiếp tục");
            tieptuc = input.next();
        }while (tieptuc.equals("yes"));
    }
}
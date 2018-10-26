package CauLenhDK.BT2_PTbac2;
import java.util.Scanner;
public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GIAI PHUONG TRINH BAC 2: a*x*x + b*x + c = 0");
        System.out.println("Nhap he so a: ");
        float a = sc.nextInt();
        System.out.println("Nhap he so b: ");
        float b = sc.nextInt();
        System.out.println("Nhap he so c: ");
        float c = sc.nextInt();
        if (a == 0){
            float x = -c/b;
            System.out.println("x = " + x);
        }else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Vo nghiem");
            } else if (delta == 0) {
                float x = (-b) / (2 * a);
                System.out.println("Nghiem kep: x = " + x);
            } else {
                float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
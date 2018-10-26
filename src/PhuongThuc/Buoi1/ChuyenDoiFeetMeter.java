package PhuongThuc.Buoi1;

import java.util.Scanner;

public class ChuyenDoiFeetMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = nhap();
        System.out.println("Nhấn 1 để chuyển từ feet -> meters");
        System.out.println("Nhấn 2 để chuyển từ meters -> feet");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(n + " feet = " + convertToMeter(n) + " meters");
                break;
            case 2:
                System.out.println(n + " meters = " + convertToFeet(n) + " feet");
                break;
            default:
                System.out.println("Không hợp lệ");
                break;
        }
    }

    public static double nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        double n = sc.nextDouble();
        return n;
    }

    public static double convertToMeter(double a) {
        double meter = 0.305 * a;
        return meter;
    }

    public static double convertToFeet(double a) {
        double feet = 3.279 * a;
        return feet;
    }
}
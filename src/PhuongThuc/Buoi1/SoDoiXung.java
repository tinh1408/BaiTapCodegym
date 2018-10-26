package PhuongThuc.Buoi1;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoDoiXung {
    public static void main(String[] args) {
        String n = nhap();
        String nDaoNguoc = dao(n);
        if (compare(n, nDaoNguoc) == true) {
            System.out.println(n + " là số đối xứng");
        } else System.out.println(n + " ko phải là số đối xứng");
    }

    public static String nhap() {
        Scanner sc = new Scanner(System.in);
        String a;
        do {
            System.out.print("Nhập n = ");
            a = sc.next();
            Pattern pt = Pattern.compile("\\d+");
            Matcher mt = pt.matcher(a);
            if (mt.matches()) {
                return a;
            } else System.out.println("LỖI");
        } while (true);
    }

    public static String dao(String n) {
        String dao = "";
        for (int i = n.length(); i >= 1; i--) {
            dao += n.substring(i - 1, i);
        }
        return dao;
    }

    public static boolean compare(String a, String b) {
        if (a.equals(b)) return true;
        else return false;
    }
}
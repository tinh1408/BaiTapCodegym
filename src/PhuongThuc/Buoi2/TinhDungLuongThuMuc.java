package PhuongThuc.Buoi2;

import java.io.File;
import java.util.Scanner;

public class TinhDungLuongThuMuc {
    static long kichThuoc = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        kichThuoc = layKichThuoc(path);
        if (kichThuoc != -1) {
            System.out.println(kichThuoc + " bytes");
        }

    }

    public static long layKichThuoc(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("ko tồn tại");
            return -1;
        } else {
            if (dir.isDirectory()) {
                File[] list = dir.listFiles();
                if (list != null) {
                    for (File bien : list) {
                        String a = bien.getPath();
                        System.out.println(a);
                        layKichThuoc(a);
                    }
                }
            } else {
                kichThuoc += dir.length();
            }
        }
        return kichThuoc;
    }
}
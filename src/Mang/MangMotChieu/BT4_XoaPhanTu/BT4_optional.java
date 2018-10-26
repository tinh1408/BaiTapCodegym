package Mang.MangMotChieu.BT4_XoaPhanTu;
import java.util.Scanner;
public class BT4_optional {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int kichThuoc;
        boolean kiemTra;
        //Nhập mảng
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            kichThuoc = sc.nextInt();
            if (kichThuoc <= 0) {
                kiemTra = true;
            } else kiemTra = false;
        } while (kiemTra);
        int[] array = new int[kichThuoc];
        System.out.println("Nhap lan luot cac phan tu trong mang: ");
        nhapMang(array);
        //Nhập giá trị cần xóa và kiểm tra có bao nhiêu giá trị đó trong mảng
        int soCanXoa, count=0;
        boolean ktSoCanXoa = true;
        do {
            System.out.print("Nhập giá trị cần xóa ");
            soCanXoa = sc.nextInt();
            for (int i = 0; i < array.length; i++) {
                if (soCanXoa == array[i]) {
                    ktSoCanXoa = false;
                    count++;
                }
            }
            if (ktSoCanXoa == true) {
                System.out.println("Không tồn tại số " + soCanXoa + " trong mảng. Vui lòng nhập lại");
            }
        } while (ktSoCanXoa);
        //Tiến hành xóa
        int doDaiMoi = array.length-count;
        int[] arrayMoi = new int[doDaiMoi];
        int j=0;
        for(int xetMangMoi=0; xetMangMoi<arrayMoi.length; xetMangMoi++){
            if (soCanXoa != array[j]){
                arrayMoi[xetMangMoi]=array[j];
            }else {
                j++;
                arrayMoi[xetMangMoi] = array[j];
            }
            j++;
        }
        //In ra mảng sau khi xóa
        System.out.println("Mảng sau khi xóa là:");
        for (int scan : arrayMoi) {
            System.out.print(scan + " ");
        }
    }
    public static void nhapMang(int[] mang){
        for (int i=0; i<mang.length; i++){
            mang[i] = sc.nextInt();
        }
    }
}
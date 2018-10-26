package CauLenhDK.BT1_UngDungXoSo;
import java.util.Random;
import java.util.Scanner;
public class BT1 {
    public static void main(String[] args) {
        byte guessDigit1, guessDigit2;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int lottery = rd.nextInt(99);
        int soThuNhat = lottery/10;
        int soThuHai = lottery%10;
        Nhap:
        while (true){
            System.out.println("Nhap so dau tien cua so du doan: ");
            guessDigit1 = sc.nextByte();
            System.out.println("Nhap so thu hai cua so du doan: ");
            guessDigit2 = sc.nextByte();
            if ((guessDigit1>=0 && guessDigit1<10) && (guessDigit2>=0 && guessDigit2<10)){
                break Nhap;
            }else {
                System.out.println("Invalid number! Try again!");
                continue Nhap;
            }
        }
        int soDocDac = guessDigit1*10 + guessDigit2;
        int soNhi = guessDigit2*10 + guessDigit1;
        if (soDocDac == lottery){
            System.out.println("Ban da trung doc da voi phan thuong $10000");
        }else if (soNhi == lottery){
            System.out.println("Ban da trung giai nhi voi phan thuong $3000");
        }else if (guessDigit1==soThuNhat || guessDigit1 ==soThuHai || guessDigit2==soThuNhat || guessDigit2 == soThuHai){
            System.out.println("Ban da trung giai ba voi phan thuong $1000");
        }else System.out.println("Chuc ban may man lan sau");
        System.out.println("Giai doc dac la: "+ soThuNhat+soThuHai);
    }
}
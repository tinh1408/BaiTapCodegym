package CauLenhLap.BT1_HienThiSoNguyenTo;
public class BT1 {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to tu 1-100 la: ");
        for (int i = 2; i<=100; i++){
            test(i);
        }
    }
    public static void test(int x){
        int count = 0;
        for (int j=2; j<=Math.sqrt(x); j++){
            if (x%j==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println(x);
        }
    }
}
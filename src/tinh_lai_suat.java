import java.util.Scanner;

public class tinh_lai_suat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap so tien gui");
        int money = in.nextInt();
        System.out.println("nhap so thang gui");
        int month = in.nextInt();
        System.out.println("nhap so lai suat");
        double laisuat = in.nextDouble();
        System.out.println("tong lai suat");
        double tonglai = money * (laisuat/100)/12 * month;
        System.out.println(tonglai);
    }
}

import java.util.Scanner;

public class Main {

    public static  void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Aracınız kilometrede kaç kuruş yakıyor ? ( Örn; 0,32) : ");
        double kurus = scanner.nextDouble();

        System.out.print("Aracınızla kac km gittiniz ? : ");
        int km = scanner.nextInt();

        System.out.println("Toplam ödemeniz tutar: " + ( kurus*km) + " tl dir..");
    }
}

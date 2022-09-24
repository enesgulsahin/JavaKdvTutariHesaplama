import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double AnaPara, KdvOrani= 0.18;

        System.out.print("Ana Para:");
        AnaPara = input.nextDouble();

        System.out.println("Kdv Oranı:"+ KdvOrani);

        System.out.print("KDV Tutarı :");
        System.out.println(AnaPara * KdvOrani);
        double KdvTutar = AnaPara * KdvOrani;

        System.out.print("Toplam Tutar:");
        System.out.print(AnaPara + KdvTutar);

















    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // İlk adım: Değişkenleri oluşturma -> Kenar uzunlukları = a, b, c
        int a, b;
        double c, alan, cevre, u;  // u -> Üçgenin çevresi

        // Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ilk kenarı giriniz: ");
        a = input.nextInt();

        System.out.print("Lütfen ikinci kenarı giriniz: ");
        b = input.nextInt();

        System.out.print("Lütfen üçüncü kenarı giriniz: ");
        c = input.nextInt();

        /* Formül:
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */

        u = ((a+b+c) / 2);
        cevre = (2*u);
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("\nÜçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);

    }
}
package p20_12_2022;
/*
(ZA VEZBANJE) Napisati program koji izvlaci cifre iz visecifrenog broja. Broj koji se unosi je proizvoljan. Napomena: Unosite vrednosti maksimalno do 10 cifara, zbog ogranicenja int tipa.
Primer izvrsenja:
Unesite broj: 2109349
9, 4, 3, 0, 9, 1, 2
 */
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int br = sc.nextInt();
        int obr = 0;

        while (br != 0) {

            obr = br % 10;
            br = br / 10;
            System.out.print(obr);
        }
    }
}

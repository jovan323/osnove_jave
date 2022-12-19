package p19_12_2022;
/*
(Za vezbanje) Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
Primer izvrsenja:
Unesite broj: 19452
2, 5, 4, 9, 1
 */
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int br = sc.nextInt();
        int niz = 0;

        for (int i = 0; i < 5; i++) {

            niz = br % 10;
            br = br / 10;
            System.out.print(niz + ", ");
        }

    }
}

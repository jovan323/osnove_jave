package p14_12_2022;

import java.util.Scanner;

/*Napisati program koji ucitava broj a i ispisuje poruke:
Ukoliko je broj a do 10 stampamo da je jednocifren broj
Ukoliko je broj a do 100 stampamo da je dvocifren broj
Ukoliko je broj a veci od 100 stampamo da je trocifren.
*/
public class Zadatak8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Unesite a: ");
        int a = sc.nextInt();

        if (a < 10) {
            System.out.println("A je jednocifren");
        } else if (a < 100) {
            System.out.println("A je dvocifren");
        } else if (a > 100 && a < 1000) {
            System.out.println("A je trocifren");
        } else {
            System.out.println("Aj ne zezaj");
        }
    }
}

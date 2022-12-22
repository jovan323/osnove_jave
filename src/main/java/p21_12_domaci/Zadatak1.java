package p21_12_domaci;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
Napisati program koji u sebi ima definisan niz od 10 broja
(brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K.
K i novu vrednost unosi korisnik.
Primer:
Unesite pozicjiu od 0 do 9: 3
Unesite novu vrednost: 11
Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
 */
public class Zadatak1 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> niz = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int x = r.nextInt(100);
            niz.add(x);
        }
        System.out.println(niz);

        System.out.print("Unesite poziciju od 0 do 9: ");
        int k = sc.nextInt() - 1;
        niz.set(k, 11);

        System.out.println(niz);
    }
}

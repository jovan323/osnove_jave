package p21_12_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
i koji prikazuje element na poziciji K.
K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
Primer:
Unesite pozicjiu: 2
Na poziciji 2 je vrednost 7.
 */
public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(100);
            niz.add(x);
        }
        System.out.println(niz);
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite poziciju: ");
        int k = sc.nextInt();
        System.out.println("Na poziciji " + k + " je vrednost " + niz.get(k));
    }
}

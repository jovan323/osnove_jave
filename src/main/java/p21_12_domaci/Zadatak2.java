package p21_12_domaci;

import java.util.ArrayList;
import java.util.Scanner;

/*
Napisati program koji ucitava N brojeva i smesta ih u niz.
Zatim, iz niza, broji koliko je parnih brojeva uneto.
Brojeve unosi korisnik.
 */
public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int br = sc.nextInt();
            if (br % 2 == 0){
                count++;
            }
            niz.add(br);
        }
        System.out.println(niz);
        System.out.println("U nizu ima " + count + " parna broja.");

    }
}

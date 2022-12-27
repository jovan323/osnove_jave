package p21_12_domaci;

import java.util.ArrayList;
import java.util.Scanner;

/*
Napisati program koji ucitava niz A duzine N,
i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
 */
public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> aNiz = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int br = sc.nextInt();
            aNiz.add(br);
        }

        System.out.println(aNiz);
        System.out.print("Brojevi u nizu A veći od nule su: ");

        for (int i = 0; i < aNiz.size(); i++) {
            if (aNiz.get(i) > 0)
            System.out.print(aNiz.get(i) + ", ");
        }
    }
}

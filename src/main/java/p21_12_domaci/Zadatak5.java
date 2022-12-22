package p21_12_domaci;

import java.util.ArrayList;
import java.util.Scanner;

/*
(Za vezbanje) Napisati program koji ucitava niz A duzine N.
Nakon unosa niza A, formira se niz b tako sto se prva 3 elementa niza A
kopiraju u niz B, a ostale elemente niza B ispuniti jedinicama.
(niz b je iste duzine kao i niz a)
 */
public class Zadatak5 {
    public static void main(String[] args) {
        ArrayList<Integer> nizA = new ArrayList<>();
        ArrayList<Integer> nizB = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int br = sc.nextInt();
            nizA.add(br);
        }

        for (int i = 0; i < n; i++) {
            if (i < 3) {
                nizB.add(nizA.get(i));
            } else {
                nizB.add(1);
            }
        }
        System.out.print("Niz A: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nizA.get(i) + ", ");
        }
        System.out.print("\nNiz B: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nizB.get(i) + ", ");
        }

    }
}

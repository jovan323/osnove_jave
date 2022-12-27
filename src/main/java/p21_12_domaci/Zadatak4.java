package p21_12_domaci;

import java.util.ArrayList;
import java.util.Scanner;

/*
Napisati program koji ucitava niz A duzine N i broj X.
Nakon unosa treba ispisati indekse onih clanova niza
koji su jednaki broju X.
 */
public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int br = sc.nextInt();
            niz.add(br);
        }
        //System.out.println(niz);

        System.out.print("Unesite X: ");
        int x = sc.nextInt();

        System.out.print("Rezultat: Elementi niza A koji su jednaki X: ");
        for (int i = 0; i < niz.size(); i++) {
            if (niz.get(i) == x) {
                System.out.print(i + ", ");
            }
        }
    }
}

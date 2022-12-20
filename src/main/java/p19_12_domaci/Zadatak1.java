package p19_12_domaci;

import java.util.Scanner;

/*
Napisati program koji od korisnika ucitava N brojeva
i sabira samo parne brojeve.
Na kraju programa prikazati sumu.
Primer izvrsenja:
Unesite N: 5
Unesite broj: 1
Unesite broj: 2
Unesite broj: 9
Unesite broj: 6
Unesite broj: 8
Suma parnih brojeva je 16
Objasnjenje: 2 + 6 + 8 = 16
 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj upisa: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int br = sc.nextInt();
            if (br % 2 == 0) {
                sum = sum + br;
            }
        }
        System.out.println("Suma parnih brojeva: " + sum);
    }
}

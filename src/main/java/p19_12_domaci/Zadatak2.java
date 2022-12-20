package p19_12_domaci;

import java.util.Scanner;

/*
Napisati program koji ucitava N brojeva od korisnika
i sabira samo trocifrene brojeve.
Unesite N: 5
Unesite broj: 1
Unesite broj: 32
Unesite broj: 121
Unesite broj: 1333
Unesite broj: 144
Suma je: 265
 */
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj upisa: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int br = sc.nextInt();
            if (br > 99 && br < 1000) {
                sum = sum + br;
            }
        }
        System.out.println("Suma brojeva: " + sum);
    }
}

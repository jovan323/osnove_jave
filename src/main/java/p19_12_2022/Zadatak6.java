package p19_12_2022;

import java.util.Scanner;

/*
(ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
Unesite N: 5
Unesite broj: 1
Unesite broj: 2
Unesite broj: 0
Unesite broj: 4
Unesite broj: 1
Rezultujuci broj je 12041
 */
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj učitavanja: ");
        int n = sc.nextInt();
        int rez = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite jednocifreni broj: ");
            int br = sc.nextInt();
            rez = (rez * 10) + br;
            //System.out.print(br);
        }
        System.out.print(rez);

    }
}

package p19_12_2022;

import java.util.Scanner;

/*
Napisati program koji pronalazi K-ti stepen broja N. Koristeci FOR petlju
K i N unosi korisnik.
Primer izvrsenja:
Unesite K: 7
Unesite N: 2
Rezultat 128
 */
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = sc.nextInt();
        System.out.println("Unesite k: ");
        int k = sc.nextInt();
        int st = 1;

        for (int i = 0; i < k ; i++) {
            st = st * n;
        }
        System.out.println(st);
    }
}

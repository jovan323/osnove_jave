package p16_12_2022;

import java.util.Scanner;

/*
Napisati porogram koji od korisnika ucitava dva broja M i N i stampa sve brojeve izmedju M i N. Smatrajte da je M manje od N.
Primer izvrsenja:
Unesite M: 10
Unesite N: 15
10, 11, 12, 13, 14, 15,
Print da vam bude u jednom redu i sa zarezima!
*/
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite M: ");
        int m = sc.nextInt();

        System.out.print("Unesite N: ");
        int n = sc.nextInt();

        if (m < n) {
            for (int i=m; i<=n; i++) {
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("Ajde ne zezaj");
        }
    }
}

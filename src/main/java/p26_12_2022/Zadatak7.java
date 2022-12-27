package p26_12_2022;

import java.util.Scanner;

/*
Napisati main program koji koristi metodu definisanu u 6.zad
tako da stampa sledecu sliku za M. M unosi korisnik.
Primer izvrsenja:
Unesite M: 6
*
* *
* * *
* * * *
* * * * *
* * * * * *
 */
public class Zadatak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite M: ");
        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            Zadatak6.zvez(i);
        }
    }
}

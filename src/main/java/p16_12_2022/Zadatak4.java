package p16_12_2022;

import java.util.Scanner;

/*
Napisati program koji od korisnika ucitava jacinu zvuka (od 0 do 10) i stampa slikicu za zvuk sa brojem crtica koje je korisnik uneo.
Primer izvrsenja;
Unesite jacinu zvuka: 8
< | | | | | | | |
 */
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite jačinu zvuka: ");
        int v = sc.nextInt();
        System.out.print("< ");

        if (v > 0) {
            for (int i = 1; i <= v; i++) {
                System.out.print("| ");
            }
        } else if (v == 0) {
            System.out.println("/");
        } else {
            System.out.println("Pogrešan unos!");
        }

    }
}

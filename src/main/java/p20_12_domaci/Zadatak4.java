package p20_12_domaci;

import java.util.Scanner;

/*
Napisati program koji proverava uparenost zagrada.
Korisnik unosi matematicku formulu sve dok ne unese znak =.
Korisnik unosi svaki karakter jednacine posebno
i na kraju programa se ispisuje da li su sve zagrade uparene.
	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
 */
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String form = "";
        int count1 = 0;
        int count2 = 0;

        while (!form.equals("=")) {
            System.out.print("Unesite karakter: ");
            form = sc.next();

            if (form.equals("(")) {
                count1++;
            } else if (form.equals(")")) {
                count2++;
            }
        }
        if (count1 == count2) {
            System.out.println("Zagrade su uparene");
        } else {
            System.out.println("Zagrade nisu uparene");
        }
    }
}

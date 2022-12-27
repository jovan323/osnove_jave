package p26_12_domaci;

import java.util.Scanner;

/*
Napisati funkciju koja za dva jednocifrena broja
koja su ulazni parametri funkcije vraca novu vrednost
koja se formira kao na primeru. METODA NISTA NE STAMPA.
ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
 */
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int x = sc.nextInt();
        System.out.print("Unesite drugi broj: ");
        int y = sc.nextInt();

        System.out.println(spoj(x, y));
    }

    public static String spoj (int x, int y) {
        return "Broj je " + x + y;
    }
}

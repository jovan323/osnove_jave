package p26_12_domaci;

import java.util.Scanner;

/*
Metoda prima dva parametra N i karakter za stampu.
etoda stampa N karaktera.
Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/)
stampa se / / / / /
Napomena: Metoda nista ne vraca.
 */
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();
        System.out.print("Unesite karakter: ");
        String str = sc.next();

        stampa(n, str);

    }
    public static void stampa (int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}

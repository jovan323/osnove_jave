package p26_12_domaci;

import java.util.Scanner;

/*
Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare
prema dole navedenoj konverziji.
Metoda od parametara prima vrednost u eurima
kao i valutu u kojoj je potrebno izvrsiti konverziju (RSD/USD/RUB)
a vraca konvertovanu vrednost.
U glavnom programu pozvati funkciju za neki od primera.
 */
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite iznos: ");
        int eur = sc.nextInt();
        System.out.print("Unesite valutu: ");
        String valuta = sc.next();

        System.out.println(
                eur + " je " + konverter(eur, valuta));
    }
    public static String konverter (int eur, String valuta) {
        if (valuta.equals("RSD")) {
            return eur * 117.5 + " RSD";
        } else if (valuta.equals("USD")) {
            return eur * 1.1 + " USD";
        } else if (valuta.equals("RUB")) {
            return eur * 62.98 + " RUB";
        } else {
            return "Nepoznata valuta";
        }
    }
}

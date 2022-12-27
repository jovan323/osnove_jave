package p26_12_domaci;

import java.util.Scanner;

/*
Napisati metodu stampajVrednostZa10Vecu
u kojoj se stampa prosledjena vrednost za 10 veca.
Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = sc.nextInt();

        stampajVrednostZa10Vecu(n);

    }

    public static void stampajVrednostZa10Vecu(int n) {
        System.out.println("10 puta veća vrednost je: " + (n*10));
    }
}

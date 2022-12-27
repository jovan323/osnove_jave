package p26_12_2022;

import java.util.Scanner;

/*
Napisati funkciju koja stampa zbir, razliku,
proizvod i kolicnik za dva prosledjena broja.
Brojevi su ulazni parametri funkcije.
U gravnom programu pozvati nekoliko puta funkciju
sa razlicitim prosledjenim vrednostima.
 */
public class Zadatak4 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Unesite broj a: ");
//        int a = sc.nextInt();
//        System.out.print("Unesite broj b: ");
//        int b = sc.nextInt();

        digitron(10, 15);
        digitron(54, 12);
        digitron(17, 5);

    }

    public static void digitron(int a, int b) {
        System.out.println("Sabiranje: " + (a + b));
        System.out.println("Oduzimanje: " + (a - b));
        System.out.println("Množenje: " + (a * b));
        System.out.println("Deljenje: " + (a / b));
        System.out.println("--------------------");

    }
}

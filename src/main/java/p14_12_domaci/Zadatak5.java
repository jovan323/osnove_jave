package p14_12_domaci;

import java.util.Scanner;

/*
Napisati program koji u zavisnosti od operatora
koji unosi korisnik sa tastature
(operator je string i moze imati vrednosti +, - , *, /)
racuna  i ispisuje na ekranu odgovarajuci zbir, razliku,
proizvod ili kolicnik za dva broja a i b uneta sa tastature.

 */
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj a: ");
        int a = sc.nextInt();
        System.out.print("Unesite broj b: ");
        int b = sc.nextInt();
        System.out.print("Unesite operator: ");
        String op = sc.next();
        double rezultat = 0;

        if (op.equals("+")) {
            rezultat = a + b;
        } else if (op.equals("-")) {
            rezultat = a - b;
        } else if (op.equals("*")) {
            rezultat = a * b;
        } else if (op.equals("/")) {
            rezultat = a / b;
        }
        System.out.println("Rezultat: " + rezultat);

    }

}

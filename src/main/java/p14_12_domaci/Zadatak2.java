package p14_12_domaci;

import java.util.Scanner;

/*
Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
b=1, vrednost promenljive a se uvecava za 10
b=2, vrednost promenljive a se smanjuje za 20
Na kraju zadatka odstampati novu vrednost promenljive a.
*/
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = sc.nextInt();
        System.out.print("Unesite b: ");
        int b = sc.nextInt();

        if (b == 1) {
            a += 10;
        } else if (b == 2) {
            a -= 20;
        }
        System.out.println("Vrednost A je: " + a);
    }
}

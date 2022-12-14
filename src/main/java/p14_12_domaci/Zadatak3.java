package p14_12_domaci;

import java.util.Scanner;

/*
Napisati program koji proverava da li je kliknuto
u okviru login forme za web stranicu.
Korisnik unosi x i y koordinate za T1, T2 i M.
Ispisati odgovarajuce poruke.
*/
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite X1: ");
        int x1 = sc.nextInt();
        System.out.print("Unesite Y1: ");
        int y1 = sc.nextInt();
        System.out.print("Unesite X2: ");
        int x2 = sc.nextInt();
        System.out.print("Unesite Y2: ");
        int y2 = sc.nextInt();
        System.out.print("Unesite X3: ");
        int x3 = sc.nextInt();
        System.out.print("Unesite Y3: ");
        int y3 = sc.nextInt();

        if (x1 < x3 && y1 > y3 && x3 < x2 && y3 > y2) {
            System.out.println("kliknuto je unutar forme!");
        } else {
            System.out.println("Nije kliknuto unutar forme!");
        }

    }
}

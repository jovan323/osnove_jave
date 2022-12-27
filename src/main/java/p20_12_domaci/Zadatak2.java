package p20_12_domaci;

import java.util.Scanner;

/*
Napisati program koji ucitava RIMSKE brojeva od korisnika
i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
 */
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rBr = "";
        int aBr = 0;

        while (!rBr.equals("KRAJ")) {
            System.out.print("Unesite rimski broj: ");
            rBr = sc.next();

            if (rBr.equals("I")) {
                aBr = 1;
                System.out.println("Arapski: " + aBr);
            } else if (rBr.equals("V")) {
                aBr = 5;
                System.out.println("Arapski: " + aBr);
            } else if (rBr.equals("X")) {
                aBr = 10;
                System.out.println("Arapski: " + aBr);
            } else if (rBr.equals("L")) {
                aBr = 50;
                System.out.println("Arapski: " + aBr);
            } else if (rBr.equals("C")) {
                aBr = 100;
                System.out.println("Arapski: " + aBr);
            } else if (rBr.equals("D")) {
                aBr = 500;
                System.out.println("Arapski: " + aBr);
            } else if (rBr.equals("M")) {
                aBr = 1000;
                System.out.println("Arapski: " + aBr);
            }
        }
        System.out.println("Kraj programa!");
    }
}

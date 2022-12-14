package p14_12_2022;

import java.util.Scanner;
/*
Napisati program koji sa tastature ucitava tri broja a, b i c
i ispisuje srednju vrednost za ta tri broja.
Sve promenljive u programu su po tipu double
 */

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite a: ");
        double a = sc.nextDouble();
        System.out.print("Unesite b: ");
        double b = sc.nextDouble();
        System.out.print("Unesite c: ");
        double c = sc.nextDouble();

        double srednjaVr = (a+b+c) / 3;

        System.out.println("Srednja vrednost je: " + srednjaVr);
    }
}

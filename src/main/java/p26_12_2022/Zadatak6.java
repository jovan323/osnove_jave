package p26_12_2022;

import java.util.Scanner;

/*
Napisati metodu koja stampa N zvezdica u istom redu.
Broj zvezdica je odredjen parametrom N.
Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
N=5, print je=> * * * * *

Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
N=9, print je=> * * * * * * * * *

 */
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = sc.nextInt();

        zvez(n);

    }

//    public static void zvez(int n) {
//        int i = 0;
//        while (i < n) {
//            System.out.print("*");
//        i++;
//        }
//        System.out.println();
//    }
    public static void zvez(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

package p14_12_2022;

import java.util.Scanner;
/*
Napisati program koji ucitava stranice trougla a, b i c
i ispisuje da li je trougao pravougli.
 */
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = sc.nextInt();
        System.out.print("Unesite b: ");
        int b = sc.nextInt();
        System.out.print("Unesite c: ");
        int c = sc.nextInt();

        if (a*a + b*b == c*c) {
            System.out.println("Trougao je pravougli");
        }
        else  {
            System.out.println("Trougao nije pravougli");
        }
    }
}

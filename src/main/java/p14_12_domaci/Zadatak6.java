package p14_12_domaci;

import java.util.Scanner;

/*
Napisati program koji ucitava 4 broja (a,b,c,d)
i formira string p (p ima startni deo #)
tako sto negativne brojeve lepi sa leve strane
a pozitivne i nulu sa desne. Konkatanacija stringova u javi
 */
public class Zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = "#";
        System.out.print("Unesite a: ");
        int a = sc.nextInt();

        if (a < 0) {
            p = a + " " + "#";
        } else {
            p = "#" + " " + a;
        }

        System.out.print("Unesite b: ");
        int b = sc.nextInt();

        if (b < 0) {
            p = b + " " + p;
        } else {
            p = p + " " + b;
        }

        System.out.print("Unesite c: ");
        int c = sc.nextInt();

        if (c < 0) {
            p = c + " " + p;
        } else {
            p = p + " " + c;
        }

        System.out.print("Unesite d: ");
        int d = sc.nextInt();

        if (d < 0) {
            p = d + " " + p;
        } else {
            p = p + " " + d;
        }
        System.out.println("String p ima vrednos = " + p);
    }
}

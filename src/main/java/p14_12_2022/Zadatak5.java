package p14_12_2022;

import java.util.Scanner;
/*
Napisati program koji ucitava brojeve a, b i c sa tastature
i proverava da li je broj a u opsegu od b do c.
 */
public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = sc.nextInt();
        System.out.print("Unesite b: ");
        int b = sc.nextInt();
        System.out.print("Unesite c: ");
        int c = sc.nextInt();

        if (a >= b && a <= c) {
            System.out.println("Broj a je između " + b + c);
        }
        else {
            System.out.println("Broj a nije u opsegu između " + b + c);
        }
    }
}

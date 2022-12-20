package p20_12_2022;

import java.util.Scanner;

/*
Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
Unesite vrednost: 20
Unesite vrednost: 50
Unesite vrednost: 50
Prekoracenje! Kraj programa. Sracunata suma je 70.
 */
public class Zadatak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int br = 0;

        while (sum + br < 100) {
            sum = sum + br;
            System.out.print("Unesite broj: ");
            br = sc.nextInt();

        }
        System.out.println("Prekoračenje! Kraj programa. Sračunata suma je " + sum);
    }
}

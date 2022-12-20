package p20_12_2022;

import java.util.Scanner;

/*
Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
Primer:
Unesite broj:1
Unesite broj:2
Unesite broj:0
Unesite broj:1
Unesite broj:0
Kraj programa jer je uneto 2 nule.
 */
public class Zadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int br = -1;
        int count = 0;

        while (count < 2) {
            System.out.print("Unesite broj: ");
            br = sc.nextInt();
            if (br == 0) {
                count++;
            }
        }
        System.out.println("Kraj programa jer su unete 2 nule");

    }
}

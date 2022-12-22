package p20_12_domaci;

import java.util.Scanner;

/*
Napisati program koji od korisnika ucitava brojeve
sve dok ne unesu bar dve dvojke ili tri jedinice.
 */
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int br = 0;
        int count1 = 0;
        int count2 = 0;

        while (count1 < 3 && count2 < 2) {
            System.out.print("Unesite broj: ");
            br = sc.nextInt();
            if (br == 1) {
                count1++;
            } else if (br == 2) {
                count2++;
            }
        }
        if (count1 == 3) {
            System.out.println("Kraj programa jer su unete tri jedinice");
        } else if (count2 == 2) {
            System.out.println("Kraj programa jer su unete dve dvojke");
        }
    }
}

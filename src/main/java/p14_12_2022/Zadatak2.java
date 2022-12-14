package p14_12_2022;

import java.util.Scanner;
/*
Napisati program koji sa tastature ucitava tri cela broja:
dan
mesec
godina
	I formira datum u ispisu u formatu dan-mesec-godina
 */

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite dan: ");
        int dan = sc.nextInt();
        System.out.print("Unesite mesec: ");
        int mesec = sc.nextInt();
        System.out.print("Unesite godinu: ");
        int godina = sc.nextInt();

        System.out.println(dan + "-" + mesec + "-" + godina);
    }
}

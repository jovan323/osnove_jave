package p16_12_2022;
/*
Napisati program koji stampa 20 pozicija.
Za aktivnu poziciju stampa *
Za neaktivnu pozciju stampa _
	Korisnik unosi granice za nekativni opseg, unoseci A i B.
 */
import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj A:");
        int a = sc.nextInt();
        System.out.print("Unesite broj B:");
        int b = sc.nextInt();

        for (int i = 0; i <= 20; i++) {

            if (i >= a && i <= b) {
                System.out.print("_");

            } else {
                System.out.print("*");
            }
        }
    }
}
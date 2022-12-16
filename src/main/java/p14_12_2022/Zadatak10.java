package p14_12_2022;

import java.util.Scanner;

/*Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 i deljiv sa 3.
Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.
*/
public class Zadatak10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Unesite broj: ");
        int broj = sc.nextInt();

        if (broj % 2 == 0 && broj % 3 == 0) {
            System.out.println("Broj je deljiv sa dva i sa tri");
        } else if (broj % 2 == 0) {
            System.out.println("Broj je deljiv sa dva");
        } else if (broj % 3 == 0) {
            System.out.println("Broj je deljiv sa tri");
        } else {
            System.out.println("Broj nije deljiv ni sa dva ni sa tri");
        }
    }
}

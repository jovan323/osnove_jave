package p16_12_domaci;

import java.util.Scanner;

/*Napisati program koji za uneti broj x
(smatrajte da korisnik unosi jednocifreni broj)
ispisuje tablicu mnozenja za taj broj.
 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite X: ");
        int x = sc.nextInt();

        for (int i = 1; i < 10 ; i++) {
            System.out.println(x + " x " + i + " = " + (x*i));
        }

    }
}

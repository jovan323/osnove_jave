package p14_12_2022;

import java.util.Scanner;

/*
Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
znak karte koja je na stolu
broj karte koja je na stolu
znak karte koju igrac zeli da odigra
broj karte koju igrac zeli da odigra
	i nakon toga se na ekranu ispisuje da li je potez ispravan.
	Potez je ispravan ukoliko se karta na stolu i odigrana karta
	poklapaju po znaku ili broju.
 */
public class Zadatak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite znak karte na stolu: ");
        String znakNaStolu = sc.nextLine();
        System.out.print("Unesite broj karte na stolu: ");
        String brojNaStolu = sc.nextLine();
        System.out.print("Unesite željeni znak: ");
        String znak = sc.nextLine();
        System.out.print("Unesite željeni broj: ");
        String broj = sc.nextLine();

        if (znakNaStolu.equals(znak)  || brojNaStolu.equals(broj) ) {
            System.out.println("Potez je validan");
        } else {
            System.out.println("Potez nije validan");
        }
    }
}

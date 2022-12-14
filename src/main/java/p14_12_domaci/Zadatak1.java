package p14_12_domaci;

import java.util.Scanner;

/*
Napisati program koji ima informacije koje ucitava informacije sa tastature:
        Ime
        Prezime
        godinu rodjenja
        I stampa informaicije u formatu:
        [ime] [prezime] - [startost] god
*/
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = sc.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = sc.nextLine();
        System.out.print("Unesite godinu rođenja: ");
        int godinaRodjenja = sc.nextInt();
        int godina = 2022;

        System.out.println(ime + " " + prezime + " - " + (godina - godinaRodjenja) + " god");
    }
}

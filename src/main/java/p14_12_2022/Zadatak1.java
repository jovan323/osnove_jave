package p14_12_2022;

import java.util.Scanner;

/*
Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
[Ime] [Prezime] - [JMBG]
Broj Tel: [Broj telefona],
Email: [Email],
 */

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = sc.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = sc.nextLine();
        System.out.print("Unesite JMBG: ");
        String jmbg = sc.nextLine();
        System.out.print("Unesite broj: ");
        String brojTelefona = sc.nextLine();
        System.out.print("Unesite email: ");
        String email = sc.nextLine();

        System.out.println(ime + " " + prezime + " - " + jmbg);
        System.out.println("Broj tel: " + brojTelefona);
        System.out.println("Email: " + email);

    }
}

package p27_12_2022;

import java.util.Scanner;

/*
Kreirati klasu Racun koja ima broj racuna (npr: 840-23932-323)
ime i prezime vlasnika i stanje na racunu
U mainu kreirati minimum dva racuna sa pratecim podacima
i ostampati podatke za svaki objekat.
Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun.
Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
*/
public class Z1 {
    public static void main(String[] args) {

        Z1Racun racun1 = new Z1Racun();
        racun1.brojRacuna = "840-23932-323";
        racun1.ime = "Radojica";
        racun1.prezime = "Little";
        racun1.stanje = 10000;

        System.out.println(racun1.brojRacuna + "\n" + "Ime: "
                + racun1.ime + " " + racun1.prezime
                + "\n" + "Stanje: " + racun1.stanje);
        System.out.println();

        Z1Racun racun2 = new Z1Racun();
        racun2.brojRacuna = "265-102030-5060";
        racun2.ime = "Vujadin";
        racun2.prezime = "Senior";
        racun2.stanje = 5000;

        System.out.println(racun2.brojRacuna + "\n" + "Ime: "
                + racun2.ime + " " + racun2.prezime
                + "\n" + "Stanje: " + racun2.stanje);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite sumu za transakciju: ");
        int suma = sc.nextInt();
        System.out.print("Unesite broj računa primaoca: ");
        String brRacuna = sc.next();


        if (brRacuna.equals("racun1")){
            racun2.stanje = racun2.stanje - suma;
            racun1.stanje = racun1.stanje + suma;
            System.out.print(
                    "Pošiljalac: " + racun1.ime + " " + racun1.prezime
                    + ", " + racun1.brojRacuna + ", stanje: "
                    + racun1.stanje);
            System.out.print(
                    "Primalac: " + racun2.ime + " " + racun2.prezime
                    + ", " + racun2.brojRacuna + ", stanje: "
                    + racun2.stanje);

        } else if (brRacuna.equals("racun2")) {
            racun1.stanje = racun1.stanje - suma;
            racun2.stanje = racun2.stanje + suma;
            System.out.print(
                    "Pošiljalac: " + racun2.ime + " " + racun2.prezime
                            + ", " + racun2.brojRacuna + ", stanje: "
                            + racun2.stanje);
            System.out.println(
                    "Primalac: " + racun1.ime + " " + racun1.prezime
                            + ", " + racun1.brojRacuna + ", stanje: "
                            + racun1.stanje);
        }
    }
}

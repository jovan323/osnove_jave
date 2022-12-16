package p16_12_2022;
/*
Napisati program koji simulira stampanje ocitane licne karte
u vise primeraka. Korisnik unosi podatke :
ime
prezime
jmbg
broj primeraka za stampu
 */
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = sc.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = sc.nextLine();
        System.out.print("Unesite JMBG: ");
        String jmbg = sc.nextLine();
        System.out.print("Unesite broj primeraka: ");
        int brPr = sc.nextInt();

        for (int i = 1; i <= brPr; i++) {
            System.out.println("Primerak: " + i);
            System.out.println("**********************************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG: " +jmbg);
            System.out.println("**********************************");
        }
    }
}

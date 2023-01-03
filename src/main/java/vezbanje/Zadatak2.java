package vezbanje;

import java.util.Scanner;

/*
Napisati program koji validira unos lozinke sve dok korisnik ne unese
validnu. Lozinka je validna ukoliko ima minimum 8 karaktera i sadrzi
bar jedan od dva specijalna karaktera a specijalni karakteri su @ i #
Primer izvrsenja:
Unesite lozinku: ITBootcamp
Lozinka nije validna.
Unesite lozinku: ITBootcamp12
Lozinka nije validna.
Unesite lozinku: ITBoo@
Lozinka nije validna.
Unesite lozinku: ITBootcamp@
Lozinka je validna.
 */
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        while (valid == false) {
            System.out.print("Unesite lozinku: ");
            String lozinka = sc.next();
            if (lozinka.length()>= 8 &&
                    (lozinka.contains("@")) || lozinka.contains("#")) {

                valid = true;
            } else {
                System.out.println("Lozinka nije validna");
            }

        }
        System.out.println("Lozinka je validna.");
    }

}

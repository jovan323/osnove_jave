package p13_12_2022;

import java.util.Scanner;

/*
Sifra [SIFRA PROIZVODA]
[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
[BOJA], [VELICINA]
*/
public class Zadatak2 {
    public static void main(String[] args) {
        String sifraProizvoda = "x932k20";
        String nazivProizvoda = "Nike Patike";
        //String cena = "$90";
        //String popust = "13.5%";
        String boja = "Crna";
        double velicina = 46.5;

        double  popust,
                cenaSaPopustom,
                cena, x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite cenu: $");

        cena = sc.nextDouble();

        System.out.println("Unesite popust u procentima: ");

        popust = sc.nextDouble();

        x = 100-popust;

        cenaSaPopustom = (x * cena)/100;

        System.out.println("Šifra " + sifraProizvoda);
        System.out.println(nazivProizvoda + " - " +
                           "Cena sa popustom: $" + cenaSaPopustom);
        System.out.println(boja + ", " + velicina);

    }
}

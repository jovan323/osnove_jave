package p19_12_domaci;

import java.util.Scanner;

/*
Napisati program koji simulira ponasanje speak loud programa.
Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
ako se ne sadrzi, program dostampa na kraju
	Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima).
	Svaka uneta rec sa ! utice na agresivnost.

	Primer izvrsenja:
	Unesite N: 5
	Unesite tekst: Cao!
	Cao!
	Unesite tekst: Hello
	Hello!
	Unesite tekst: Hi!
	Hi!
	Unesite tekst: Cuti
	Cuti!
	Unesite tekst: Ajde!
	Ajde!
	Nivo agresivnosti 60.
	(Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)
 */
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj učitavanja: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite reč:");
            String rec = sc.next();
            System.out.println(rec);
            if (rec.contains("!")) {
                count++;
            }
        }
        double agr = count * 100 / n;
        System.out.println("Nivo agresivnosti je " + agr + "%");
    }
}

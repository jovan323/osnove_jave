package p19_12_domaci;

import java.util.Scanner;

/*
Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
Korisnik unosi N rekacija zatim se prikazuje evidencija:
Program podrzava sledece reakcije:
like
smile
heart

	Primer izvrsenja:
Unesite N: 7
	Reaguj: like
	Reaguj: heart
	Reaguj: smile
	Reaguj: lol
	Reaguj: smile
	Reaguj: like
	Reaguj: like
Summary: like 3 | smile 2 | heart 1

Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.

POMOC: Svaka promenljiva nosi jednu informaciju,
to znaci evidenciju za like cuva promelniva sa imenom npr likeCounter,
evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter
 */
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj učitavanja: ");
        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite reč:");
            String rec = sc.next();
            System.out.println("Reaguj: " + rec);
            if (rec.equals("like")) {
                count1++;
            }
            if (rec.equals("smile")) {
                count2++;
            }
            if (rec.equals("heart")) {
                count3++;
            }
        }
        System.out.println("Summary: like " + count1 +
                " | smile " + count2 + " | heart " + count3);
    }
}

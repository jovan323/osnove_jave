package p16_12_2022;

import java.util.Scanner;

/*
Napisati program koji iscrtava timeline na youtube videu.
Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu,
a program iscrtava timeline tako sto deo koji je pogledan
iscrtava zvezdicama a ostatak crticama.
Timeline je kontrola koja ima tacno 100 karaktera.
Primer izvrsenja:
Unesite duzinu videa (s): 203
Unesite trenutno vreme videa (s): 20
*********-------------------------------------------------------------------------------------------

(Objasnjenje:Ako video ima 203s a mi smo na 20s,
to znaci da je pogledano 9.85% videa, zaokruzicemo
to na 9zvezdica ostatak do 100 su crtice)

	(DOPUNA TAKODJE ZA VEZBANJE)
	Pretvorite vremena u minute i sekunde
	i stavite ih ispod prikaza:
	Primer izvrsenja:
Unesite duzinu videa (s): 203
Unesite trenutno vreme videa (s): 20
*********-------------------------------------------------------------------------------------------
 0:20 / 3:23


 */
public class Zadatak9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite dužinu videa: ");
        int duzVid = sc.nextInt();
        System.out.print("Unesite trenutno vreme: ");
        int trVid = sc.nextInt();
        int trPr = trVid * 100 / duzVid ;

        for (int i = 1; i <= 100; i++) {
            if (i <= trPr) {
                System.out.print("*");
            } else {
                System.out.print("_");
            }
        }
    }
}

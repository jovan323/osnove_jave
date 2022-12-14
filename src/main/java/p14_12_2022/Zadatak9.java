package p14_12_2022;

import java.util.Scanner;

/*Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.. Kada se ucita video difoltna jacina zvuka je 75.
Korisnik unosi akciju sa tastature. Jednu od sledecih:
pojacaj - pojacava zvuka za 10
smanji - smanjuje zvuk za 10.
mute - postavlja zvuk na 0.
*/
public class Zadatak9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Unesite komandu: ");
        String a = sc.nextLine();

        if (a.equals("pojacaj")) {
            System.out.println("Nova jačina zvuka je 85.");
        } else if (a.equals("smanji")) {
            System.out.println("Nova jačina zvuka je 75.");
        } else if (a.equals("mute")) {
            System.out.println("Nova jačina zvuka je 0");
        }
    }
}

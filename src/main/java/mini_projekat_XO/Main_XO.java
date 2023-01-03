package mini_projekat_XO;

import java.util.Scanner;

public class Main_XO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        XOTabla tabla = new XOTabla();
        System.out.print("Unesite ime igrača X: ");
        tabla.setImeX(sc.next());
        System.out.print("Unesite ime igrača O: ");
        tabla.setImeO(sc.next());
        tabla.pokreniIgru();
        tabla.stampaj();

        while ((!tabla.pobednikX() && !tabla.pobednikO()) && !tabla.popunjenaTabla()) {
            if(tabla.isNaPotezu()) {
                System.out.println("Na potezu igrač X: " +tabla.getImeX());
            } else {
                System.out.println("Na potezu igrač O: " +tabla.getImeO());
            }
            System.out.print("Odigraj potez (1-9): ");
            int potez = sc.nextInt();
            if (tabla.poljePrazno(potez)) {
                tabla.odigrajPotez(potez);
                tabla.zameniIgraca();
            } else {
                System.out.print("Nedozvoljen potez - polje je zauzeto");
            }
            tabla.stampaj();
        }
        if (tabla.popunjenaTabla()) {
            System.out.println("Tabla je popunjena - nerešeno!");
        } else if (tabla.pobednikX()) {
            System.out.println("Pobednik je igrač X");
            System.out.println("Bravo, " + tabla.getImeX());
        } else if (tabla.pobednikO()) {
            System.out.println("Pobednik je igrač O");
            System.out.println("Bravo, " + tabla.getImeO());
        }

    }
}

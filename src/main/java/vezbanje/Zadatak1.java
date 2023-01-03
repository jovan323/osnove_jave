package vezbanje;

import java.util.ArrayList;
import java.util.Scanner;

/*
Napisati program koji simulira sumiranje vrednosti
po koloni u eksel tabeli. Program ima niz brojeva duzine 25,
koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
tj. ne unosi ih korisnik. Program stampa tabelu na ekranu
a zatim od korisnika trazi da unese kolonu po kojoj bi zeleo
da sumira vrednosti i na kraju programa ispisuje sumu
za trazenu kolonu. POGLEDAJ SLIKU
Primer izvrsenja:
3,1,8,0,1,
1,5,7,9,6,
3,1,6,5,1,
4,5,8,1,7,
1,3,2,8,0,
Unesite kolonu za sumiranje: 2
Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)
 */
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<>();
        niz.add(3);
        niz.add(1);
        niz.add(8);
        niz.add(0);
        niz.add(1);
        niz.add(1);
        niz.add(5);
        niz.add(7);
        niz.add(9);
        niz.add(6);
        niz.add(3);
        niz.add(1);
        niz.add(6);
        niz.add(5);
        niz.add(1);
        niz.add(4);
        niz.add(5);
        niz.add(8);
        niz.add(1);
        niz.add(7);
        niz.add(1);
        niz.add(3);
        niz.add(2);
        niz.add(8);
        niz.add(0);

        System.out.println(niz);

        for (int i = 0; i < 25; i++) {
            if (i == 4 || i == 9 || i == 14 || i == 19){
                System.out.println(niz.get(i));
            } else {
                System.out.print(niz.get(i));
            }
        }
        System.out.println();
        System.out.print("Unesite kolonu za sumiranje: ");
        int kol = sc.nextInt() -1;
        int sum = 0;
        for (int i = kol; i < 25; i = i+ 5) {
            sum = sum + niz.get(i);
        }

        System.out.println("Suma je: " + sum);


    }
}

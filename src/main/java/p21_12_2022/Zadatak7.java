package p21_12_2022;
/*(Za vezbanje) Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva.
        Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
        primer jedne zamene:
        Ako je niz
        1,2,3,4,5,6,7,8,9,10
        i prvi random indeks je 4 a drugi random indeks je 6
        1,2,3,4,7,6,5,8,9,10
*/
import java.util.ArrayList;
import java.util.Random;

public class Zadatak7 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(100);
            niz.add(x);
        }
        System.out.println(niz);

        for (int i = 0; i < 8; i++) {
            Random random = new Random();
            int x = random.nextInt(niz.size());
            int y = random.nextInt(niz.size());
            int sw = niz.get(x);
            niz.set(x, niz.get(y));
            niz.set(y, sw);
            System.out.println(niz);
        }
        System.out.println(niz);


    }
}

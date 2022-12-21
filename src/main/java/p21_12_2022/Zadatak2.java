package p21_12_2022;
/*
Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
 */
import java.util.ArrayList;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer> br = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(10);
            br.add(x);
        }

        System.out.println(br);
        int mn = br.get(2) * 10;
        br.set(2, mn);              //// može i br.set(2, br.get(2) * 10);


        System.out.println(br);
    }
}

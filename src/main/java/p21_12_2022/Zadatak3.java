package p21_12_2022;

import java.util.ArrayList;
import java.util.Random;

/*
Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
 */
public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> br = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(100);
            br.add(x);
        }
        System.out.println(br);
        int sw = br.get(0);
        br.set(0, br.get(br.size()-1));
        br.set((br.size()-1), sw);
        System.out.println(br);

    }
}

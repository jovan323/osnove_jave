package p21_12_2022;
/*
Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni)
i prikazuje sumu nultog i zadnjeg elementa tog niza.
 */
import java.util.ArrayList;
import java.util.Random;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> br = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(10);
            br.add(x);
        }

        System.out.println(br);
        int sum = br.get(0) + br.get(br.size()-1);

        System.out.print("Suma nultog i poslednjeg elementa je " + sum);
    }
}

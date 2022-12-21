package p21_12_2022;

import java.util.ArrayList;
import java.util.Random;

/*
Napisati progam koji stampa niz u obrnutom redosledu
tj. od zadnjeg elementa do nultog.
Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
 */
public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(100);
            lista.add(x);
        }
        System.out.println(lista);

        for (int i = lista.size()-1; i >= 0 ; i--) {
            System.out.print(lista.get(i) + ", ");
        }
    }
}

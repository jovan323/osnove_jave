package p21_12_2022;

import java.util.ArrayList;
import java.util.Random;

/*

 */
public class Zadatak5 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int x = random.nextInt(100);
            lista.add(x);
        }
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            sum = sum + lista.get(i);
        }
        System.out.println("Suma " + sum);
    }
}

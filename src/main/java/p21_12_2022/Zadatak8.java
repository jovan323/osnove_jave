package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int br = sc.nextInt();
            niz.add(br);
        }
        //System.out.println(niz);

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
        }
    }
}

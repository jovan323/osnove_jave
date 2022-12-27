package p21_12_domaci;

import java.util.ArrayList;
import java.util.Scanner;

/*
(Za vezbanje) Napisati program koji ucitava niz stringova duzine N,
tako da ucitavanje elemenata u niz a bude obrnuto.
 */
public class Zadatak6 {
    public static void main(String[] args) {
        ArrayList<String> niz = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite N: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite string: ");
            String str = sc.next();
            niz.add(0, str);
        }
        System.out.print("Niz A: ");
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
        }
    }
}

package p19_12_2022;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj učitavanja: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int br = sc.nextInt();
            sum = sum + br;
        }
        double avg = sum / n;

        System.out.println("Srednja vrednost je: " + avg);
    }
}

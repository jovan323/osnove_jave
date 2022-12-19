package p19_12_2022;

import java.util.Scanner;

public class StringoviPrimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite tekst: ");
        String x = sc.next();

        System.out.println(x.length());

        String demo = "Neki demo tekst";
        String trazeniString = "tekst";

        if (demo.contains("Neki")) {
            System.out.println("Sadrži.");
        } else {
            System.out.println("Ne sadrži.");
        }
    }
}

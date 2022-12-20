package p20_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int br = sc.nextInt();

        while (br < 10 || br > 50) {
            System.out.println("Greška! Broj nije u opsegu");
            System.out.print("Unesite broj: ");
            br = sc.nextInt();
        }
        System.out.println("Broj je validan - kraj programa");
    }
}

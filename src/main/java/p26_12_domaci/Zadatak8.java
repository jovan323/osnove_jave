package p26_12_domaci;

import java.util.Scanner;

/*
Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
 */
public class Zadatak8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int x = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int y = sc.nextInt();
        System.out.println("Unesite treći broj: ");
        int z = sc.nextInt();

        System.out.println(najmanji(x,y,z));
    }
    public static int najmanji (int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else {
            return z;
        }
    }

}

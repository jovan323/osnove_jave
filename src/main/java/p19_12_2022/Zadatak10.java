package p19_12_2022;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int br = sc.nextInt();

        int obrt = 1;

        for (int i = 0; i < 5; i++) {
            obrt = br % 10;
            obrt = obrt * 10 + obrt;
            br = br/10;
            System.out.print(obrt);
        }

    }
}
// REZULTAT JE DUPLIRAN ???
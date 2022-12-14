package p14_12_2022;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Unesite komandu: ");
        String a = sc.nextLine();
        int vol = 75;


        if (a.equals("pojacaj")) {
            vol += 10;
            if (vol > 100) {
                vol = 100;
            }
        } else if (a.equals("smanji")) {
            vol = vol - 10;
            if (vol < 0) {
                vol = 0;
            }
        } else if (a.equals("mute")) {
            vol = 0;
        }
        System.out.println("Jačina zvuka je: " + vol);

    }
}

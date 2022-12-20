package p20_12_2022;

import java.util.Scanner;

/*
Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
Primer:
Unesite broj:1
Unesite broj:2
Unesite broj:2
Unesite broj:3
Unesite broj:0
Unesite broj:5
Unesite broj:3
Unesite broj:4
Kraj programa

Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.
 */
public class Zadatak3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int br = -1;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;


        while (count1 < 1 || count2 < 1 || count3 < 1 || count4 < 1) {
            System.out.print("Unesite broj: ");
            br = sc.nextInt();
            if(br == 1) {
                count1 = count1 + 1;
            }
            if(br == 2) {
                count2 = count2 + 1;
            }
            if(br == 3) {
                count3 = count3 + 1;
            }
            if(br == 4) {
                count4 = count4 + 1;
            }

        }
        System.out.println("Kraj programa!");

    }
}

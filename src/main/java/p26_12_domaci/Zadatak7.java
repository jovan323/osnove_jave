package p26_12_domaci;

import java.util.Scanner;

/*
Napisati funkciju koja za pronalazi koliko ima celih brojeva
izmedju brojeva M i N.
 */
public class Zadatak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj m: ");
        int m = sc.nextInt();
        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();

        System.out.println(izbroji(m,n));
    }
//    public static int izbroji (int m, int n) {
//        if (n > m) {
//            return 1 + izbroji(m + 1, n);
//        } else {
//            return 0;
//        }
//    }

    public static int izbroji(int m, int n){
        return Math.abs(m-n) - 1;
    }

}

package p19_12_2022;
/*
Napisati program koji sakriva uneti password..
Primer izvrsenja:
Unestite password: OvoJePassword123
Skriverni password: ****************
 */
import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite password: ");
        String pass = sc.nextLine();
        int zv = pass.length();

        for (int i = 0; i < zv; i++) {      // i < pass.length()
            System.out.print("*");

        }
    }
}

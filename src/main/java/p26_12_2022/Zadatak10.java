package p26_12_2022;

import java.util.Scanner;

/*
Napisati metodu koja vrsi konverziju rimske(string)
u arapske brojeve(int).
1 - I
2 - II
3 - III
4 - IV
5 - V
Kao parametar se unosi vrednost rimkog broja(string)
a vraca se arapski (int).
Ako se unese V vraca se 5. Ako se unese vrednost koja nije
podrzana vracamo nulu.
 */
public class Zadatak10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite rimski broj: ");
        String rBr = sc.nextLine();

        System.out.println(rimski(rBr));
    }
    public static int rimski (String x) {
        if (x.equals("I")) {
            return 1;
        }else if (x.equals("II")) {
            return 2;
        }else if (x.equals("III")) {
            return 3;
        }else if (x.equals("IV")) {
            return 4;
        }else if (x.equals("V")) {
            return 5;
        } else {
            return 0;
        }
    }
}

package p26_12_2022;

/*
Napisati metodu stampajApsolutnuVrednost,
koja stampa apsolutnu vrednost prosledjene vrednosti.
 */

public class Zadatak5 {
    public static void main(String[] args) {
        aps(-5);
    }
    public static void aps(int x) {
        //if(x<0) --> sout (-x)
        System.out.println("Apsolutna vrednost: " + Math.abs(x));
    }
}

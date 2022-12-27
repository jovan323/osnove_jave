package p26_12_2022;
/*
Napisati metodu koja proverava da li je trougao pravougli.
Metoda prima stranice trougla i hipotenuzu trougla.
Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
Trougao je pravougli ukoliko je a*a+b*b=c*c
 */
public class Zadatak9 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 6;

        if (pravougli(a,b,c)== true) {
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }
    }
    public static boolean pravougli(int a, int b, int c) {
        if (a*a + b*b == c*c ) {
            return true;
        } else {
            return false;
        }
    }
}

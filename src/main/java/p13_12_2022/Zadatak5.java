package p13_12_2022;
/*
Napisati program koji racuna prosecnu vrednost za tri decimalna broja a, b i c. Vrednosti za a, b i c su proizvoljne.
Primer izvrsenja:
a: 10.0
b: 5.0
c: 6.0
Srednja vrednost je 7.0
*/
public class Zadatak5 {
    public static void main(String[] args) {

        double a, b, c, srednja;

        a = 10;
        b = 5;
        c = 6;
        srednja = (a + b + c) / 3;

        System.out.println("Srednja vrednost je " + srednja);
    }
}

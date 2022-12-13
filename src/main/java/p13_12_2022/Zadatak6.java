package p13_12_2022;
/*
Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
Primer izvrsenja:
a: 5
Povrsina kvadrata je 25
r: 3
Povrsina kruga je 28.26
 */
public class Zadatak6 {
           // static final double PI = 3.14;
    public static void main(String[] args) {


        double a, r, povrsinaKvadrata, povrsinaKruga;
        double pi = 3.14;
        a = 5;
        r = 3;
        povrsinaKvadrata = a * a;
        povrsinaKruga = r * r * pi;

        System.out.println("Površina kvadrata je " + povrsinaKvadrata);
        System.out.println("Površina kruga je " + povrsinaKruga);
    }
}

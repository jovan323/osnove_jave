package p19_12_2022;
/*
Napisati program koji sumira brojeve od 1 do 10 i na kraju programa ispisuje sumu.
suma = 1 + 2 + 3 + … + 10 (ovo je objasnjenje)
Primer izvrsenja:
Suma brojeva od 1 do 10 je 55
 */
public class Zadatak1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10 ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

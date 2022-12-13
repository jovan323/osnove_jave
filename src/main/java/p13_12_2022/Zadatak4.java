package p13_12_2022;
/*
Naci zbir, razliku, kolicnik i proizvod brojeva a i b i rezultate smestati u odgovarajuce     promenljive.Na kraju programa odstampati rezultate
Primer izvrsenja:
a: 10
b: 2
Zbir je 12
Razlika je 8
Proizvod je 20
Kolicnik je 5
*/
public class Zadatak4 {
    public static void main(String[] args) {
        int a, b, zbir, razlika, proizvod;
        double kolicnik;

        a = 10;
        b = 2;
        zbir = a + b;
        razlika = a - b;
        proizvod = a * b;
        kolicnik = a / b;

        System.out.println("Zbir a i b: " + zbir);
        System.out.println("Razlika a i b: " + razlika);
        System.out.println("Proizvod a i b: " + proizvod);
        System.out.println("Kolicnik a i b: " + kolicnik);

    }
}

package p13_12_domaci;
/*
Napisati program koji stampa verziju softvera. Verzija softvera se sastoji od major, minor i patch brojeva. Koristan link za verzionisanje softvera. Odstampati na ekranu verziju softvera u formatu:
[MAJOR].[MINOR].[PATCH]
 */
public class Zadatak1 {
    public static void main(String[] args) {
        int major, minor, patch;

        major = 5;
        minor = 12;
        patch = 23;

        System.out.println("Software version: " +
                major + "." + minor + "." + patch);

    }
}

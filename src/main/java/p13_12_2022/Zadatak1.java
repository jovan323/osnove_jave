package p13_12_2022;
/* Napisati program koji na ekranu stampa podatke u formatu:
[IME I PREZIME]
[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
*/
public class Zadatak1 {
    public static void main(String[] args) {
        String imeIPrezime = "Fred Krueger";
        String brojTelefona = "069/555-456";
        String ulicaIbroj = "Ulica Brestova 42";
        String grad = "Mejn";
        String email = "fredie123@email.com";

        System.out.println("Ime i prezime: " + imeIPrezime);
        System.out.println("Broj telefona: " + brojTelefona);
        System.out.println("Adresa: " + ulicaIbroj + ", " + grad);
        System.out.println("Email: " + email);
    }
}

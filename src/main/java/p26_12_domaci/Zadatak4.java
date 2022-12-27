package p26_12_domaci;
/*
Napisati metodu koja stampa podatke o korisniku u formatu:
JMBG: [jmbg]
Ime: [ime]
Prezime: [prezime]
God. rodjenja: [god]
Aktivan: [true/false]
Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan
kao parametre metode.Metoda nista ne vraca.
 */
public class Zadatak4 {
    public static void main(String[] args) {
        String jmbg = "1234567890";
        String ime = "Huan";
        String prezime = "Delgado";
        String godRodj = "1991";
        boolean aktivan = true;

        korisnik(jmbg,ime,prezime,godRodj,aktivan);
    }
    public static void korisnik (String jmbg, String ime, String prezime,
    String godRodj, boolean aktivan) {
        System.out.println(
                "JMBG: " + jmbg + "\n" +
                "Ime: " + ime + "\n" +
                "Prezime: " + prezime + "\n" +
                "God. rođenja: " + godRodj + "\n" +
                "Aktivan: " + aktivan);
    }
}

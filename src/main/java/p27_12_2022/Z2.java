package p27_12_2022;
/*
Krairti klasu SlackMessage koja ima:
tekst poruke
ime i prezime osobe koja je stavila poruku
datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima
i ostampati obe poruke u formatu:
[ime i prezime osobe] - [kad je poslata]
[Tekst poruke]

Dopuna:
Dopunite klasu SlackMessage metodom za stampu
koja stampa podatke u formatu koji je naveden iznad
i u mainu pozovite metode nad objektima koje ste kreirali.
 */
public class Z2 {
    public static void main(String[] args) {

        Z2SlackMessage poruka1 = new Z2SlackMessage();
        poruka1.tekstPoruke = "Dođi sutra";
        poruka1.imeIPrezime = "Jablan Forest";
        poruka1.datumIVreme = "26.08.2021 18:55";

        poruka1.stampaj();
        System.out.println("---------------");

        Z2SlackMessage poruka2 = new Z2SlackMessage();
        poruka2.tekstPoruke = "Gde bre da dođem?!";
        poruka2.imeIPrezime = "Goran Wood";
        poruka2.datumIVreme = "26.08.2021 18:59";

        poruka2.stampaj();
    }
}

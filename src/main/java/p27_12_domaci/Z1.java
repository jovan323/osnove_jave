package p27_12_domaci;
/*
Napisati klasu Proizvod koja ima atribute
naziv proizvoda (String)
cenu proizvoda (double)
težinu proizvoda u gramima. (double)
	i metode:
stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode
 */
public class Z1 {
    public static void main(String[] args) {

        Z1Proizvod proizvod1 = new Z1Proizvod();
        proizvod1.naziv = "Čokolada";
        proizvod1.cena = 150;
        proizvod1.tezinaGr = 400;

        proizvod1.stampaj();
        System.out.println("Težina je: " + proizvod1.konvertuj("kg"));

        Z1Proizvod proizvod2 = new Z1Proizvod();
        proizvod2.naziv = "Meso";
        proizvod2.cena = 1200;
        proizvod2.tezinaGr = 4000;

        proizvod2.stampaj();
        System.out.println("Težina je: " + proizvod2.konvertuj("t"));


    }
}

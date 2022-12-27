package p27_12_2022;
/*
Kreirati klasu Auto koja ima:
ime i prezime vozaca
marku automobila
broj vrata
potrosnju na 100km (npr: 10)
trenutnu brzinu kojom se auto krece
metodu za stampu koja stampa podatke u formatu:
[Vozac]
	[Marka] - [br vrata]-ro vrata
	Sa potrosnjom od [potrosnja] l na 100km
	[Trenutna brzina auta] km/h je trenutna brzina.
	(Dopuna)
U okviru klase Auto, implementirati jos 2 metode:
metoda koja vraca informaciju da li je vozac prekoracio brzinu.
Kao parametar metode se prima ogranicenje (kao broj)
a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
metoda koja vraca visinu novcane kazne za prekoracenje,
za svaku jedinicu prekoracenja placa se 1000din.
Metoda od parametara prima ogranicenje brzine
(Dopuna 2)
Dopuniti klasu Auto tako da ima:
atribut godinu proizvodnje
atribut mesec do kad je registrovan auto (int)
atribut kubikaza auta (npr: 1600 - 5000)
metodu koja vraca da li je auto oldtimer,
svaki auto proizveden pre 1950 je oldtimer.
metodu koja vraca da li je istekla registracije.
Metoda kao parametar prima trenutni mesec i na osnovu
toga vraca true ili false.
metodu koja racuna i vraca cenu registracije za auto.
Za automobile do 2000 kubika cena registracije kubikaza * 100din,
za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
 */
public class Z3 {
    public static void main(String[] args) {

        Z3Auto auto = new Z3Auto();
        auto.imeIPrezime = "Žika Flojd";
        auto.marka = "BMW";
        auto.brojVrata = 5;
        auto.potrosnja = 7;
        auto.trenBrz = 120;
        auto.godProiz = 2000;
        auto.kubikaza = 1399;

        auto.stampa();

        if (auto.prekoracenje(100) == true){
            System.out.println("Prekoračena je brzina.");
        } else {
            System.out.println("Nije prekoračena brzina");
        }

        System.out.println("Novčana kazna iznosi: "
                            + auto.kazna(100));

        if(auto.isOldTimer()) {
            System.out.println("Auto nije oldtajmer.");
        } else {
            System.out.println("Auto je oldtajmer.");
        }

        System.out.println("Registracija je "
                + auto.cenaReg() + " dinara.");
    }
}

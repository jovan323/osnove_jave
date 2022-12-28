package p27_12_domaci;

public class Z1Proizvod {
    public String naziv;
    public double cena;
    public double tezinaGr;

    public void stampaj() {
        System.out.println(this.naziv + ", "
                        + this.cena + ", " + this.tezinaGr);
    }

    public double konvertuj(String unit) {
        if (unit.equals("kg")) {
            return this.tezinaGr / 1000;
        } else if (unit.equals("t")) {
            return this.tezinaGr / 1000000;
        } else {
            return 0;
        }
    }
}

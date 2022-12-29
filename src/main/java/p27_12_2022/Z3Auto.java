package p27_12_2022;

public class Z3Auto {
    public String imeIPrezime;
    public String marka;
    public int brojVrata;
    public int potrosnja;
    public int trenBrz;
    public int godProiz;
    public int mesecReg;
    public int kubikaza;
    public boolean otvorenGepek;
    public String brReg;
    public boolean ukljucenaKlima;
    public int maxBrz;
    public int kapacitet;
    public int trenGor;



    public void stampa() {
        System.out.println(imeIPrezime+ "\n" + marka + " - "
                        + brojVrata + "-oro vrata\n"
                        + "Sa potrošnjom od " + potrosnja + "l na 100km");
        System.out.println(trenBrz + " km/h je trenutna brzina.");
    }

    public boolean prekoracenje(int ogranicenje) {
        boolean prek = true;
        prek = this.trenBrz > ogranicenje;
        return prek;
    }
    public int kazna (int ogranicenje) {
        return Math.abs(this.trenBrz - ogranicenje) * 1000;
    }
    public boolean isOldTimer () {
        return this.godProiz >= 1950;
    }
    public boolean isteklaReg(int trenMes) {
        return this.mesecReg < trenMes;
    }
    public int cenaReg () {
        int cenaReg;
        if (this.kubikaza < 2000) {
            return cenaReg = this.kubikaza * 100;
        } else {
            return cenaReg = this.kubikaza * 130;
        }
    }
    public void otvoriGepek() {
        this.otvorenGepek = true;
        // PREKIDAČ
        //this.otvorenGepek = !this.otvorenGepek;
    }
    public void ukljucenaKlima() {
        this.ukljucenaKlima= true;
        // PREKIDAČ
//        if (ukljucenaKlima == false) {
//            this.ukljucenaKlima= true;
//        } else {
//            this.ukljucenaKlima = false;
//        }
        // BOLJE REŠENJE
        // this.ukljucenaKlima = !this.ukljucena klima;
    }
    public void dodajGas() {
        this.trenBrz= this.trenBrz + 10;
        if(this.trenBrz > this.maxBrz) {
            this.trenBrz = this.maxBrz;
        }
    }
    public void oduzmiGas() {
        this.trenBrz = this.trenBrz - 10;
        if(this.trenBrz < 0) {
            this.trenBrz = 0;
        }
    }
    public double trenPotrosnja() {
        if (ukljucenaKlima) {
            return (this.trenBrz / 100.0 * this.potrosnja) * 1.2;
        } else  {
            return (this.trenBrz / 100.0 * this.potrosnja);
        }

//        double faktor = 1.0;
//        if (this.ukljucenaKlima) {
//            faktor = 1.2;
//        }
//        return return (this.trenBrz / 100.0 * this.potrosnja) * faktor;
    }

    public void tahimetar() {
        int m =(this.trenBrz * 100) / maxBrz;
        for (int i = 0; i < m; i++) {
            System.out.print("|");
        }
        int n = 100 - m;
        for (int i = 0; i < n; i++) {
            System.out.print(".");
        }
        System.out.println(" " + trenBrz+ "/" + maxBrz);
        /*
        int brzinauprocentima = (this.trenBrz * 100) / maxBrz;
        for (int i = 0; i < 100; i++) {
            if (i <= brzinauprocentima) {
               sout ("|")
            } else {
                sout (".")
            }
        }
         */

    }
    public int natociGor(int litara) {
        int cenaL = 210;
        if (trenGor + litara > kapacitet) {
            return (kapacitet - trenGor) * cenaL;
        } else {
            return litara * cenaL;
        }

        /*
        public void natoci(int litraza) {
            int razlika = this.kapacitet - this.trenGor;
            if (razlika >= litara) {
                this.trenGor = litara;
            } else {
                this.trenGor = this.kapacitet;
            }

        }
         */
    }
}

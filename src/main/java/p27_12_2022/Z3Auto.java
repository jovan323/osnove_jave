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


    public void stampa() {
        System.out.println(imeIPrezime+ "\n" + marka + " - "
                        + brojVrata + "-oro vrata\n"
                        + "Sa potrošnjom od " + potrosnja + "l na 100km");
        System.out.println(trenBrz + " km/h je trenutna brzina.");
    }

    public boolean prekoracenje(int ogranicenje) {
        boolean prek = true;
        if (this.trenBrz > ogranicenje) {
            prek = true;
        } else {
            prek = false;
        }
        return prek;
    }
    public int kazna (int ogranicenje) {
        return Math.abs(this.trenBrz - ogranicenje) * 1000;
    }
    public boolean isOldTimer () {
        if(this.godProiz >= 1950) {
            return true;
        } else {
            return false;
        }
    }
    public int cenaReg () {
        int cenaReg;
        if (this.kubikaza < 2000) {
            return cenaReg = this.kubikaza * 100;
        } else {
            return cenaReg = this.kubikaza * 130;
        }
    }
}

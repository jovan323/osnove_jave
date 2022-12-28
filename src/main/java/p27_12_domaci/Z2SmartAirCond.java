package p27_12_domaci;

public class Z2SmartAirCond {
    public String marka;
    public double temp;
    public String mod;

    public void stampaj() {
        System.out.println(this.marka + ", "
                + this.temp + ", " + this.mod);
    }
    public String vecaManja (double temp) {
        if (temp > this.temp) {
            return "Napolju je temperatura veća";
        } else {
            return "Napolju je temperatura manja";
        }
    }
}

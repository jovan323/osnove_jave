package p27_12_domaci;

public class Z2 {
    public static void main(String[] args) {

        Z2SmartAirCond klima1 = new Z2SmartAirCond();
        klima1.marka = "Ćomi";
        klima1.temp = 23.5;
        klima1.mod = "Hladi";

        klima1.stampaj();
        System.out.println(klima1.vecaManja(25));

        Z2SmartAirCond klima2 = new Z2SmartAirCond();
        klima1.marka = "Fuego Espana";
        klima1.temp = 20;
        klima1.mod = "Greje";

        klima1.stampaj();
        System.out.println(klima1.vecaManja(15));


    }
}

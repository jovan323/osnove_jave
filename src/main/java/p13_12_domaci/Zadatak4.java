package p13_12_domaci;

public class Zadatak4 {
    public static void main(String[] args) {
        int stranica = 5;
        double  korenBroja3 = 1.73,
                povrsina = stranica * stranica * korenBroja3 / 4,
                obim = stranica * 3;

        System.out.println("Povrsina trougla je " + povrsina);
        System.out.println("Obim trougla je " + obim);
    }
}

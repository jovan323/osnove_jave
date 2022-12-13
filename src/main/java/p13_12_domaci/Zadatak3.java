package p13_12_domaci;
/*
Napisati program koj racuna Z prema formuli: (X - Y) NA KVADRAT.
X i Y su celi brojevi.
*/
public class Zadatak3 {
    public static void main(String[] args) {
        int x, y, z;
        x = 5;
        y = 7;
        z = (x - y) * (x - y);

        System.out.println("Z je: " + z);
    }
}

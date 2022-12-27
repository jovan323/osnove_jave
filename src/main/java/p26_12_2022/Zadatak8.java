package p26_12_2022;
/*
Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
Metoda prima broj N i vraca ga sa negativnom vrednoscu.
Primer: Ako se metoda pozove za N=10, vraca -10
	Ako se metoda pozove za N=-11, vraca 11
 */
public class Zadatak8 {
    public static void main(String[] args) {

        System.out.println(kontra(-56));
    }

    public static int kontra(int x) {
        int a = x;
        return -a;
    }
}

package p16_12_domaci;
/*
Napisati program koji stampa 25 _ (donjih crta),
pritom na svaku 5. iteraciju odstampa i novi red.
Zadatak resiti pomocu FOR petlje.
 */
public class Zadatak2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("-");
            }
            System.out.println("\n");
        }
    }
}

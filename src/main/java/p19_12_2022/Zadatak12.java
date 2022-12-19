package p19_12_2022;
/*
Napisati program prikazuje koliko je svaki od unetih passworda jak. Korisnik unosi N passworda i za svaki se ispisuje jacina.
Svaki uslov koji password ispunjava dodaje po 1 poen:
duzina veca od 8
sadrzi @ specijalan karakter

		Primer izvrsenja:
		Unesite N: 3
		Unesite password: passwdr
		Password ima 0 poena.
Unesite password: password123
		Password ima 1 poena.
		Unesite password: password@123
		Password ima 2 poena.
 */
import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj učitavanja: ");
        int n = sc.nextInt();
        //int pts = 0;

        for (int i = 1; i <= n; i++) {
            int pts = 0; // reset za broj poena - bolje rešenje
            System.out.print("Unesite password: ");
            String pass = sc.next();

            if (pass.length() > 8 && pass.contains("@") ) {
                System.out.println("Password ima 2 poena.");
            } else if (pass.length() > 8 || pass.contains("@")) {
                System.out.println("Password ima 1 poena.");
            } else {
                System.out.println("Password ima 0 poena.");
            }

//            if(pass.length() > 8) {
//                pts = pts + 1;
//            }
//            if (pass.contains("@")) {
//                pts = pts + 1;
//            }
//            System.out.println("Password ima " + pts + " poena.");
            // pts = 0; // da bi se vratilo na 0 za sledeći pass- nije najbolje rešenje
    }
}
}

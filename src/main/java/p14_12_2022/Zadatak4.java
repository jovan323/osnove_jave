package p14_12_2022;
/*
Napisati program koji ispisuje da li je broj b manji od broja a.
A i B unosimo sa tastature.

 */
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite a: ");
        int a = sc.nextInt();
        System.out.print("Unesite b: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Broj A je veci od broja B");
        }
        else if (a == b) {
                System.out.println("Broj A je jednak broju B");
        }
        else {
            System.out.println("Broj A je manji od broja B");
        }
    }
}

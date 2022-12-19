package p19_12_2022;

import java.util.Scanner;

public class UnosSaTastUPetlji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("unesite broj:");
            int broj = sc.nextInt();

            System.out.println("Uneli ste " + broj);
        }
    }
}

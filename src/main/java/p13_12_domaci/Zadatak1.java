package p13_12_domaci;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int major, minor, patch;

        major = 5;
        minor = 12;
        patch = 23;

        System.out.println("Software version: " +
                major + "." + minor + "." + patch);

    }
}

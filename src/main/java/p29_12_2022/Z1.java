package p29_12_2022;

public class Z1 {
    public static void main(String[] args) {
        Z1Student student = new Z1Student();
        student.setIme("Milan");
        student.setPrezime("Jovanovic");
        student.setIndex(1564);
        student.setBudzet(false);

        System.out.println("IME: " + student.getIme());
        System.out.println("PREZIME: " + student.getPrezime());
        System.out.println("Br. Indeksa : " + student.getIndex());
        System.out.println("Budžet: ");

    }
}

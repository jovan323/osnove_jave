package p27_12_2022;

public class Z2SlackMessage {
    public String tekstPoruke;
    public String imeIPrezime;
    public String datumIVreme;

    public void stampaj(){
        System.out.println(this.imeIPrezime + " - " + this.datumIVreme
                            + "\n" + this.tekstPoruke);
    }
}

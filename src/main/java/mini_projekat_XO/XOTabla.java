package mini_projekat_XO;

import java.util.ArrayList;

public class XOTabla {
    private ArrayList<String> polja = new ArrayList<>();
    private String imeX;
    private String imeO;
    private boolean naPotezu = true;

    public String getImeX(){
        return imeX;
    }
    public String getImeO(){
        return imeO;
    }
    public boolean isNaPotezu() {
        return naPotezu;
    }
    public void setImeX(String imeX) {
        this.imeX = imeX;
    }
    public void setImeO(String ime0) {
        this.imeO = ime0;
    }
    public void pokreniIgru(){
        for (int i = 0; i < 9; i++) {
            this.polja.add("  ");
        }
    }
    public void stampaj() {
        System.out.println("-------------");

        for (int i = 0; i < 9; i++) {
            System.out.print("| " + this.polja.get(i));
            if(i == 2 || i == 5) {
                System.out.println("|");
            }
        }
        System.out.println("|");
        System.out.println("-------------");
    }
    public boolean poljePrazno(int indexPolja) {
        if(this.polja.get(indexPolja-1).equals("  ")) {
            return true;
        } else {
            return false;
        }
    }
    public void zameniIgraca () {
        this.naPotezu = !this.naPotezu;
    }
    public void odigrajPotez (int indexPolja) {
        if (this.naPotezu) {
            this.polja.set(indexPolja-1, "x ");
        } else {
            this.polja.set(indexPolja-1, "o ");
        }
    }
    public boolean popunjenaTabla () {
        for (int i = 0; i < 9; i++) {
            if (this.polja.get(i).equals("  ")){
                return false;
            }
        }
       return true;
    }
    public boolean pobednikX () {
        if (this.polja.get(0).equals("x ") && this.polja.get(1).equals("x ") && this.polja.get(2).equals("x ")){
            return true;
        } else if (this.polja.get(3).equals("x ") && this.polja.get(4).equals("x ") && this.polja.get(5).equals("x ")){
            return true;
        } else if (this.polja.get(6).equals("x ") && this.polja.get(7).equals("x ") && this.polja.get(8).equals("x ")){
            return true;
        } else if (this.polja.get(0).equals("x ") && this.polja.get(3).equals("x ") && this.polja.get(6).equals("x ")) {
            return true;
        } else if (this.polja.get(1).equals("x ") && this.polja.get(4).equals("x ") && this.polja.get(7).equals("x ")){
            return true;
        } else if (this.polja.get(2).equals("x ") && this.polja.get(5).equals("x ") && this.polja.get(8).equals("x ")){
            return true;
        } else if (this.polja.get(0).equals("x ") && this.polja.get(4).equals("x ") && this.polja.get(8).equals("x ")){
            return true;
        } else if (this.polja.get(2).equals("x ") && this.polja.get(4).equals("x ") && this.polja.get(6).equals("x ")){
            return true;
        } else {
            return false;
        }
    }
    public boolean pobednikO () {
        if (this.polja.get(0).equals("o ") && this.polja.get(1).equals("o ") && this.polja.get(2).equals("o ")){
            return true;
        } else if (this.polja.get(3).equals("o ") && this.polja.get(4).equals("o ") && this.polja.get(5).equals("o ")){
            return true;
        } else if (this.polja.get(6).equals("o ") && this.polja.get(7).equals("o ") && this.polja.get(8).equals("o ")){
            return true;
        } else if (this.polja.get(0).equals("o ") && this.polja.get(3).equals("o ") && this.polja.get(6).equals("o ")) {
            return true;
        } else if (this.polja.get(1).equals("o ") && this.polja.get(4).equals("o ") && this.polja.get(7).equals("o ")){
            return true;
        } else if (this.polja.get(2).equals("o ") && this.polja.get(5).equals("o ") && this.polja.get(8).equals("o ")){
            return true;
        } else if (this.polja.get(0).equals("o ") && this.polja.get(4).equals("o ") && this.polja.get(8).equals("o ")){
            return true;
        } else if (this.polja.get(2).equals("o ") && this.polja.get(4).equals("o ") && this.polja.get(6).equals("o ")){
            return true;
        } else {
            return false;
        }
    }
}

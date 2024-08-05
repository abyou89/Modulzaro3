
package main;


public class Vonal {
    
    private static final int HOSSZ = 1;

    public enum Szinek {
        PIROS, KEK, ZOLD};

    public enum Stilusok {
        DUPLA, SZIMPLA, PONT};

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private int eltolas;
    private Szinek szin;
    private Stilusok stilus;
    private String szinKod;

    public Vonal(int eltolas) throws Exception {

        this(eltolas, Szinek.PIROS, Stilusok.DUPLA);

    }

    public Vonal(Szinek szin, Stilusok stilus) throws Exception {
        
        this(0, szin, stilus);

    }

    public Vonal(int eltolas, Szinek szin, Stilusok stilus) throws Exception {

        if (eltolas < 0) {
            throw new Exception("Egy vonal nem jött létre, mert nem megfelelo a hossz");
        }

        this.eltolas = eltolas;
        this.szin = szin;
        this.stilus = stilus;

        switch (szin) {
            case PIROS:
                this.szinKod = ANSI_RED;
                break;
            case KEK:
                this.szinKod = ANSI_BLUE;
                break;
            case ZOLD:
                this.szinKod = ANSI_GREEN;
                break;
            default:
                this.szin = Szinek.PIROS;
                break;
        }

    }
    
    public void setEltolas(int eltolas) throws Exception {
        if (eltolas < 1) {
            throw new Exception("Hiba, eltolas sikertlen, csak pozitiv ertek lehet");
        }
        this.eltolas = eltolas;

    }

    public void setSzin(Szinek szin) {
        this.szin = szin;
    }

    public void setStilus(Stilusok stilus) {
        this.stilus = stilus;
    }

    public int getEltolas() {

        return eltolas;
    }

    public Szinek getSzin() {

        return szin;
    }

    public Stilusok getStilus() {

        return stilus;
    }

    public String info() {
        
        return "hossz: " + HOSSZ + " eltolas: " + eltolas + " Szin: " + szin + " stilus: " + stilus;
    }
    
}

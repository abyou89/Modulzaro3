package modell;

import java.util.Arrays;

public class MindentTudoGep {
    
    public enum Zenek{SZOMORU, VIDAM, BANATOS};

    public static final int LOTTO_DB = 5;
    public static final int TOTO_DB = 14;

    private int[] lotto;
    private String[] totoEredmeny;
    private int[] totoMerkozes;
    private String[] kimenetel = {"1", "2", "X"};
    private Zenek zene;

    public MindentTudoGep() {

        lotto = new int[LOTTO_DB];
        totoEredmeny = new String[TOTO_DB];
        totoMerkozes = new int[TOTO_DB - 1];
        
    }

    public void setLotto() {
        for (int i = 0; i < LOTTO_DB; i++) {
            lotto[i] = (int) (Math.random() * 90) + 1;
        }
        Arrays.sort(lotto);

    }

    public void kiirLotto() {

        for (int i = 0; i < LOTTO_DB; i++) {
            System.out.print(lotto[i] + ", ");
        }
        System.out.println("");
    }

    public void setTotoMerkozes() {
        for (int i = 0; i < TOTO_DB - 1; i++) {
            totoMerkozes[i] = i + 1;
        }
    }

    public void kiirTotoMerkozes() {
        for (int i = 0; i < TOTO_DB - 1; i++) {
            System.out.printf("%3d", totoMerkozes[i]);
        }
        System.out.println(" 13+1");
    }

    public void setToto() {
        for (int i = 0; i < TOTO_DB; i++) {
            totoEredmeny[i] = kimenetel[(int) (Math.random() * 3)];
        }
    }

    public void kiirToto() {
        for (int i = 0; i < TOTO_DB; i++) {
            System.out.printf("%3s", totoEredmeny[i]);
        }
        System.out.println("");
    }
    
    public void setZene(Zenek zene){
        this.zene = zene;
    }
    
    public String zeneValasztas(){
        
        return "valasztott zene: " + zene;
    }

}

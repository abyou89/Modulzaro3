package modell;

import java.util.Arrays;

public class MindentTudoGep {

    public static final int LOTTO_DB = 5;
    public static final int TOTO_DB = 14;

    private int[] lotto;
    private String[] totoEredmeny;
    private int[] totoMerkozes;
    //private String[] totoMerkozes = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "13+1"};
    private String[] kimenetel = {"1", "2", "X"};

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

    public void getLotto() {

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

    public void getTotoMerkozes() {
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

    public void getToto() {
        for (int i = 0; i < TOTO_DB; i++) {
            System.out.printf("%3s", totoEredmeny[i]);
        }
    }

}

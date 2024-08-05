
package main;

import modell.MindentTudoGep;

public class MindentTudoGepProgram {
    
    public static void main(String[] args) {
        lottoSzelveny();
        totoSzelveny();
        zeneGep();

    }

    private static void lottoSzelveny() {
        MindentTudoGep lotto = new MindentTudoGep();
        lotto.setLotto();
        lotto.kiirLotto();
    
    }

    private static void totoSzelveny() {
       MindentTudoGep toto = new MindentTudoGep();
        toto.setTotoMerkozes();
        toto.kiirTotoMerkozes();
        toto.setToto();
        toto.kiirToto();
    }

    private static void zeneGep() {
        MindentTudoGep zene = new MindentTudoGep();
        zene.setZene(MindentTudoGep.Zenek.VIDAM);
        System.out.println(zene.zeneValasztas());
        zene.setZene(MindentTudoGep.Zenek.SZOMORU);
        System.out.println(zene.zeneValasztas());
        zene.setZene(MindentTudoGep.Zenek.BANATOS);
        System.out.println(zene.zeneValasztas());
    }
}

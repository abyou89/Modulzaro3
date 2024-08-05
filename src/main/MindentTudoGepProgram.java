
package main;

import modell.MindentTudoGep;

public class MindentTudoGepProgram {
    
    public static void main(String[] args) {
        
        MindentTudoGep gep = new MindentTudoGep();
        gep.setLotto();
        gep.getLotto();
        gep.setTotoMerkozes();
        gep.getTotoMerkozes();
        gep.setToto();
        gep.getToto();
    }
}

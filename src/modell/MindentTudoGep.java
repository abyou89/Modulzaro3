
package modell;

import java.util.Arrays;

public class MindentTudoGep {
    
    public static final int DB = 5;
    private int[] lotto;
    
    
    public MindentTudoGep(){
        
        lotto = new int[DB];
        
    }
    
    public void setLotto(){
        for (int i = 0; i < DB; i++) {
            lotto[i] = (int)(Math.random()*90)+1;
        }
        Arrays.sort(lotto);
        
    }
    
    public void getLotto(){
        
        for (int i = 0; i < DB; i++) {
            System.out.print(lotto[i] + ", ");
        }
    }
    
    
}

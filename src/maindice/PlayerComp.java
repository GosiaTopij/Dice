
package maindice;
import java.util.Random;
/**
 *
 * @author gosia
 */
public class PlayerComp extends Player {
     private Random rand = new Random();

    public PlayerComp() {
        //System.err.println("PlayerComp()");
    }

    public PlayerComp(String name) {
        setName(name);
        //System.err.println("PlayerComp()");
    }

    public int guess() {
        return rand.nextInt(6) + 1;
    }
    
}

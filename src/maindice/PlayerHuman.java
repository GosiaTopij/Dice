
package maindice;
import java.util.Scanner;
/**
 *
 * @author gosia
 */
public class PlayerHuman extends Player {
       private Scanner sc = new Scanner(System.in);

    public PlayerHuman() {
        //System.err.println("PlayerHuman()");
    }

    public PlayerHuman(String name) {
        setName(name);
        //System.err.println("PlayerHuman()");
    }

    public int guess() {
        System.out.print("Podaj liczbe [1-6]: ");
        return sc.nextInt();
    }
    
}

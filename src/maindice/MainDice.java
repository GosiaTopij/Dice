
package maindice;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author gosia
 */
public class MainDice {

    public static void main(String[] args) {
       
        /*List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("--------------");

        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        System.out.println("--------------");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------");

        Iterator<String> iter = list.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        while(iter.hasNext())
            System.out.println(iter.next());*/

        Player player = new PlayerComp();
        Game game = new Game();

        game.addPlayer(player);
        game.addPlayer(new PlayerComp("Ziutek"));
        game.addPlayer(new PlayerComp("Ziutek"));
        game.addPlayer(new PlayerComp("Marta"));
        game.addPlayer(new PlayerComp("Marta"));
        game.addPlayer(new PlayerComp("Ziutek"));


        try {
            for(int i = 0; i < 100; i++)
                game.play();
            game.printStats();
        } catch (InvalidParameterException e) {
            System.err.println("No player specified!");
        }

    }
    
}

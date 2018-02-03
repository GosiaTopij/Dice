
package maindice;
import java.util.*;
/**
 *
 * @author gosia
 */
public class Game {
        private Random rand = new Random();
    private List<Player> players = new ArrayList<>();

    private Map<String, Integer> stats = new HashMap<>();

    public void addPlayer(Player player) {
        if (player != null) {

            String name = player.getName();

            if (isNameUnique(player.getName())) {
                players.add(player);
                stats.put(player.getName(), 0);
            } else {
                name += "x";
                player.setName(name);
                addPlayer(player);
            }
        } else {
            throw new IllegalArgumentException("Null Player");
        }
    }

    public void printStats() {
//        for(Player p : players) {
//            int score = stats.get(p.getName());
//
//            System.out.println("Player " + p.getName() + " scored: " + score + " points");
        //}
        /*for(Map.Entry<String, Integer> item : stats.entrySet())
            System.out.println(item.getKey() + " | " + item.getValue());*/

        stats.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    private boolean isNameUnique(String name) {
        for (Player p : players) {
            if (p.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public void play() {
        if (players == null)
            throw new IllegalArgumentException("No Player");

        int a, b;
        boolean cont = true;

        do {
            a = rand.nextInt(6) + 1;
            System.out.println("Komputer wylosował: " + a);

            for (Player p : players) {
                b = p.guess();
                System.out.println("Strzał gracza " + p.getName() + ": " + b);

                if (a == b) {
                    System.out.println("Wygrałeś");
                    //stats.put(p.getName(), Integer.valueOf(stats.get(p.getName()) + 1));

                    int score = stats.get(p.getName());
                    stats.put(p.getName(), score + 1);


                    cont = false;
                } else
                    System.out.println("Źle");
            }

            System.out.println("----------------------------------------");

        } while (cont);

        /*int a, b;

        while (!players.isEmpty()) {

            a = rand.nextInt(6) + 1;
            System.out.println("Komputer wylosował: " + a);

            for (Player p : players) {
                b = p.guess();
                System.out.println("Strzał gracza " + p.getName() + ": " + b);

                if (a == b) {
                    System.out.println("Gracz " + p.getName() + ": wygrał");
                    players.remove(p);
                }
            }

            System.out.println("----------------------------------------");


            System.out.println("Koniec");
        }*/
    }
    
}

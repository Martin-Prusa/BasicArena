package cz.educanet.arena;

import cz.educanet.arena.data.GladiatorDatabase;
import cz.educanet.arena.logic.Arena;
import cz.educanet.arena.logic.Gladiator;

/**
 * This is just a playground class... You can create new gladiators and persist them ect.
 */
public class Playground {

    public static void main(String[] args) {
        Gladiator gladiator = new Gladiator();
        gladiator.setName("Jan");
        gladiator.setMaxLives(100);
        gladiator.setMinDamage(20);
        gladiator.setMaxDamage(35);

        GladiatorDatabase.saveGladiator("jan.txt", gladiator);
    }

}

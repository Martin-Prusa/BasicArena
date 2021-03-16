package cz.educanet.arena.logic;

/**
 * Represents the arena.
 */
public class Arena {

    private Gladiator gladiator1;
    private Gladiator gladiator2;
    /**
     * Represents the current round. This property is incremented each round.
     */
    private int round = 1;

    /**
     * Makes the gladiators fight one round.
     */
    public int[] fight() {
        // TODO:
        // Gladiator 1 should deal (random) damage to Gladiator 2
        // Gladiator 2 should deal (random) damage to Gladiator 1
        int[] fight = new int[]{gladiator1.getLives(), gladiator2.getLives()};

        gladiator1.dealDamage(gladiator2);
        fight[1]-=gladiator2.getLives();
        if(!gladiator2.isDead()) {
            gladiator2.dealDamage(gladiator1);
            fight[0]-=gladiator1.getLives();
        } else {
            fight[0] = -1;
        }
        round++;
        return fight;
    }

    /**
     * @return the winner, null if none.
     */
    public Gladiator getWinner() {
        if(gladiator2.isDead()) return gladiator1;
        else if(gladiator1.isDead()) return gladiator2;
        return null;
    }

    public Gladiator getGladiator1() {
        return gladiator1;
    }

    public Gladiator getGladiator2() {
        return gladiator2;
    }

    public int getRound() {
        return round;
    }

    public void setGladiator1(Gladiator gladiator1) {
        this.gladiator1 = gladiator1;
    }

    public void setGladiator2(Gladiator gladiator2) {
        this.gladiator2 = gladiator2;
    }
}

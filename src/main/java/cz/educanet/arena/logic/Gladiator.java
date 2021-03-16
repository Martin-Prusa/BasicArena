package cz.educanet.arena.logic;

public class Gladiator {
    /**
     * Name of the gladiator
     */
    private String name;

    private int lives;

    private int maxLives;

    private int maxDamage;

    private int minDamage;

    // TODO: Add the rest of the properties
    // TODO: Generate/create getters and setters for these properties

    /**
     * @return true if hp is <= 0, else false
     */
    public boolean isDead() {
        // TODO:
        return lives <= 0;
    }

    /**
     * Generates a random value between min. damage and max. damage and deals it to the enemy.
     * @param enemy Enemy gladiator
     */
    public void dealDamage(Gladiator enemy) {
        // TODO:
        // Generate the random value, that the gladiator will deal.
        int randomDamage =  (int) ((Math.random() * (maxDamage - minDamage)) + minDamage);
        enemy.setLives(enemy.getLives()-randomDamage);

    }

//    public Gladiator(String nameC, int livesC, int maxLivesC, int maxDamageC, int minDamageC) {
//        name = nameC;
//        lives = livesC;
//        maxLives = maxLivesC;
//        minDamage = minDamageC;
//        maxDamage = maxDamageC;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getMaxLives() {
        return maxLives;
    }

    public void setMaxLives(int maxLives) {
        this.maxLives = maxLives;
        this.lives = maxLives;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }
}

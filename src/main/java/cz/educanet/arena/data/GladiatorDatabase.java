package cz.educanet.arena.data;

import cz.educanet.arena.logic.Gladiator;

import java.io.*;

/**
 * Utils class that saves and loads gladiators.
 */
public class GladiatorDatabase {

    /**
     * @param filename path to the gladiator file.
     * @return loaded Gladiator
     */
    public static Gladiator loadGladiator(String filename) {
        // TODO:
        Gladiator gladiator = new Gladiator();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            gladiator.setName(br.readLine().split(":")[1]);
            gladiator.setMaxLives(Integer.parseInt(br.readLine().split(":")[1]));
            gladiator.setMaxDamage(Integer.parseInt(br.readLine().split(":")[1]));
            gladiator.setMinDamage(Integer.parseInt(br.readLine().split(":")[1]));

            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return gladiator;
    }

    /**
     * Saves the gladiator.
     * @param filename path to save too.
     * @param gladiator Gladiator to save.
     */
    public static void saveGladiator(String filename, Gladiator gladiator) {
        // TODO:
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("name:"+gladiator.getName());
            bw.newLine();
            bw.write("maxLives:"+gladiator.getMaxLives());
            bw.newLine();
            bw.write("maxDamage:"+gladiator.getMaxDamage());
            bw.newLine();
            bw.write("minDamage:"+gladiator.getMinDamage());
            bw.newLine();

            bw.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }

}

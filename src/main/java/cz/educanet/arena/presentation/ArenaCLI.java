package cz.educanet.arena.presentation;

import cz.educanet.arena.data.GladiatorDatabase;
import cz.educanet.arena.logic.Arena;
import cz.educanet.arena.logic.Gladiator;

import java.util.Scanner;

public class ArenaCLI {

    private Arena logic;
    private Scanner sc;

    /**
     * Initialize all variables that are needed.
     */
    public void init() {
        logic = new Arena();
        sc = new Scanner(System.in);
    }

    public void renderLandingPage() {
        init();
        System.out.println("     /\\                         \n" +
                "    /  \\   _ __ ___ _ __   __ _ \n" +
                "   / /\\ \\ | '__/ _ \\ '_ \\ / _` |\n" +
                "  / ____ \\| | |  __/ | | | (_| |\n" +
                " /_/    \\_\\_|  \\___|_| |_|\\__,_|");
        System.out.println("---------------------------------");
    }

    public void renderGladiatorPicker() {
        System.out.println("Pick your fighter #1 (enter the path of the saved file):");
        String gladiator1File = sc.nextLine();
        System.out.println("Pick your fighter #2 (enter the path of the saved file):");
        String gladiator2File = sc.nextLine();

        Gladiator gladiator1 = GladiatorDatabase.loadGladiator(gladiator1File);
        Gladiator gladiator2 = GladiatorDatabase.loadGladiator(gladiator2File);
        logic.setGladiator1(gladiator1);
        logic.setGladiator2(gladiator2);
    }

    /**
     * Fight until one gladiator dies, or surrenders.
     */
    public void renderEntireFight() {
        // TODO:
        // while(...) {logic.fight.... sout...}
        while(logic.getWinner() == null) {
            Gladiator gl1 = logic.getGladiator1();
            Gladiator gl2 = logic.getGladiator2();
            int round = logic.getRound();
            System.out.println();
            System.out.println();
            System.out.println("------------------------"+round+". kolo -------------");
            System.out.println();

            System.out.println("Zdraví bojovníků: ");
            System.out.println(gl1.getName()+ ": "+ gl1.getLives()+ "/"+ gl1.getMaxLives());
            System.out.println(gl2.getName()+ ": "+ gl2.getLives()+ "/"+ gl2.getMaxLives());
            System.out.println();
            int[] a = logic.fight();
            System.out.println(gl1.getName()+" útočí s úderem "+gl1.getMaxDamage()+" hp");
            System.out.println(gl2.getName()+" utrpěl poškození "+a[1]+" hp");
            if(a[0] != -1) {
                System.out.println();
                System.out.println(gl2.getName()+" útočí s úderem "+gl2.getMaxDamage()+" hp");
                System.out.println(gl1.getName()+" utrpěl poškození "+a[0]+" hp");
            }
        }
        Gladiator winner = logic.getWinner();
        System.out.println("---------------------------");
        System.out.println(winner.getName()+" vyhrává");

    }

}

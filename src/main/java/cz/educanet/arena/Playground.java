package cz.educanet.arena;

import cz.educanet.arena.data.GladiatorDatabase;
import cz.educanet.arena.logic.Arena;
import cz.educanet.arena.logic.Gladiator;

import java.util.Scanner;

/**
 * This is just a playground class... You can create new gladiators and persist them ect.
 */
public class Playground {

    public static void main(String[] args) {
//        Gladiator gladiator = new Gladiator();
//        gladiator.setName("Jan");
//        gladiator.setMaxLives(100);
//        gladiator.setMinDamage(20);
//        gladiator.setMaxDamage(35);
//
//        GladiatorDatabase.saveGladiator("jan.txt", gladiator);
        Scanner sc = new Scanner(System.in);
        Gladiator gladiator = new Gladiator();
        System.out.println("Zadej jméno gladiátora: ");
        gladiator.setName(sc.nextLine());
        System.out.println("Zadej počet životů gladiátory: ");
        gladiator.setMaxLives(newNumber());
        System.out.println("Zadej minimální poškození: ");
        gladiator.setMinDamage(newNumber());
        System.out.println("Zadej maximální poškození: ");
        gladiator.setMaxDamage(newNumber());

        GladiatorDatabase.saveGladiator(gladiator.getName()+".txt", gladiator);
    }

    public static int newNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int cislo = Integer.parseInt(sc.nextLine());
                return cislo;
            } catch (Exception e) {
                System.out.println("Toto není číslo");
            }
        }
    }

}

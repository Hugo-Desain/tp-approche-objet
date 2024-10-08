package fr.diginamic.jdr;
import java.util.Scanner;

public class Jeu {
    private Personnage personnage;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.demarrerJeu();
    }

    public void demarrerJeu() {
        afficherMenu();
    }

    private void afficherMenu() {
        System.out.println("Menu du jeu :");
        System.out.println("1. Créer un personnage");
        System.out.println("2. Combattre une créature");
        System.out.println("3. Afficher le score");
        System.out.println("4. Sortir");

        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                creerPersonnage();
                break;
            case 2:
                combattre();
                break;
            case 3:
                afficherScore();
                break;
            case 4:
                sortir();
                return;
            default:
                System.out.println("Choix invalide.");
        }
        afficherMenu();
    }

    private void creerPersonnage() {
        personnage = new Personnage();
        System.out.println("Personnage créé avec " + personnage.getForce() + " de force et " +
                personnage.getPv() + " points de vie.");
    }

    private void combattre() {
        if (personnage == null) {
            System.out.println("Veuillez créer un personnage avant de combattre.");
            return;
        }

        if (personnage.getPv() <= 0) {
            System.out.println("Votre personnage est décédé. Score final : " + personnage.getScore());
            return;
        }

        System.out.println("Choisissez une créature à combattre :");
        System.out.println("1. Loup");
        System.out.println("2. Gobelin");
        System.out.println("3. Troll");
        int choixCreature = scanner.nextInt();
        Creature creature = null;
        if (choixCreature == 1) {
            creature = new Loup();
        } else if (choixCreature == 2) {
            creature = new Gobelin();
        } else if (choixCreature == 3) {
            creature = new Troll();
        } else {
            System.out.println("Choix de créature invalide.");
            return;
        }

        Combat combat = new Combat(personnage, creature);
        combat.lancerCombat();
    }

    private void afficherScore() {
        if (personnage != null) {
            System.out.println("Score actuel : " + personnage.getScore());
        } else {
            System.out.println("Aucun personnage n'a été créé.");
        }
    }

    private void sortir() {
        System.out.println("Merci d'avoir joué !");
        scanner.close();
    }
}

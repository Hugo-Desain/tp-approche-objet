package fr.diginamic.jdr;

import java.util.Random;

public class Combat {
    private Personnage personnage;
    private Creature creature;

    public Combat(Personnage personnage, Creature creature) {
        this.personnage = personnage;
        this.creature = creature;
    }

    public void lancerCombat() {
        Random random = new Random();

        int attaquePerso = personnage.getForce() + random.nextInt(10) + 1;
        int attaqueCreature = creature.getForce() + random.nextInt(10) + 1;

        if (attaquePerso > attaqueCreature) {
            int degats = attaquePerso - attaqueCreature;
            creature.setPv(creature.getPv() - degats);
            System.out.println("Vous avez infligé " + degats + " points de dégât à la créature.");
        } else if (attaqueCreature > attaquePerso) {
            int degats = attaqueCreature - attaquePerso;
            personnage.setPv(personnage.getPv() - degats);
            System.out.println("La créature vous a infligé " + degats + " points de dégât.");
        }

        if (personnage.getPv() > 0 && creature.getPv() > 0) {
            lancerCombat();
        } else {
            if (personnage.getPv() > 0) {
                System.out.println("Vous avez gagné le combat !");
                if (creature instanceof Loup) {
                    personnage.setScore(personnage.getScore() + 1);
                } else if (creature instanceof Gobelin) {
                    personnage.setScore(personnage.getScore() + 2);
                } else if (creature instanceof Troll) {
                    personnage.setScore(personnage.getScore() + 5);
                }
            } else {
                System.out.println("Vous êtes mort... Votre score final est : " + personnage.getScore());
            }
        }
    }
}

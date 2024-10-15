package listes;

import fr.diginamic.testenumeration.Continent;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {
    public static void main(String[] args) {

        ArrayList<Ville> listeVilles = new ArrayList<Ville>();
        listeVilles.add(new Ville("Nice", 343000, Continent.EUROPE));
        listeVilles.add(new Ville("Carcassonne,", 47800, Continent.EUROPE));
        listeVilles.add(new Ville("Narbonne,", 53400, Continent.EUROPE));
        listeVilles.add(new Ville("Lyon,", 484000, Continent.EUROPE));
        listeVilles.add(new Ville("Foix,", 9700, Continent.EUROPE));
        listeVilles.add(new Ville("Pau,", 77200, Continent.EUROPE));
        listeVilles.add(new Ville("Marseille,", 850700, Continent.EUROPE));
        listeVilles.add(new Ville("Tarbes,", 40600, Continent.EUROPE));


        Collections.sort(listeVilles);

        for (Ville ville : listeVilles) {
            System.out.println(ville);
        }


        Ville villeMax = listeVilles.get(0);
        for (Ville item: listeVilles) {
            if (item.getHabitants() > villeMax.getHabitants()) {
                villeMax = item;
            }
        }
        System.out.println(villeMax);

        Ville villeMin = listeVilles.get(0);
        for (Ville item: listeVilles) {
            if (item.getHabitants() < villeMin.getHabitants()) {
                villeMin = item;
            }
        }
        listeVilles.remove(villeMin);

        for (Ville item: listeVilles) {
            if (item.getHabitants() > 100000) {
                item.setNom(item.getNom().toUpperCase());
            }
        }

//        System.out.println(listeVilles.toString());
    }

}

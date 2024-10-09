package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestVilles {
    public static void main(String[] args) {

        ArrayList<Ville> listeVilles = new ArrayList<Ville>();
        listeVilles.add(new Ville("Nice", 343000));
        listeVilles.add(new Ville("Carcassonne,", 47800));
        listeVilles.add(new Ville("Narbonne,", 53400));
        listeVilles.add(new Ville("Lyon,", 484000));
        listeVilles.add(new Ville("Foix,", 9700));
        listeVilles.add(new Ville("Pau,", 77200));
        listeVilles.add(new Ville("Marseille,", 850700));
        listeVilles.add(new Ville("Tarbes,", 40600));

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

        System.out.println(listeVilles.toString());
    }

}

package map;

import java.util.HashMap;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> mapVilles = new HashMap<>();

        mapVilles.put("Paris", new Ville("Paris", 2148000, Continent.EUROPE));
        mapVilles.put("Lyon", new Ville("Lyon", 513275, Continent.EUROPE));
        mapVilles.put("Marseille", new Ville("Marseille", 861635, Continent.EUROPE));
        mapVilles.put("Toulouse", new Ville("Toulouse", 479709, Continent.EUROPE));
        mapVilles.put("Nice", new Ville("Nice", 343629, Continent.EUROPE));

        String villeMoinsHabitants = null;
        int minHabitants = Integer.MAX_VALUE;

        for (Ville ville : mapVilles.values()) {
            if (ville.getHabitants() < minHabitants) {
                minHabitants = ville.getHabitants();
                villeMoinsHabitants = ville.getNom();
            }
        }

            mapVilles.remove(villeMoinsHabitants);

        for (Ville ville : mapVilles.values()) {
            System.out.println(ville.getNom() + " - " + ville.getHabitants() + " habitants");
        }
    }
}


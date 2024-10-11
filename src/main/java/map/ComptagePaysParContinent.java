package map;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {
    public static void main(String[] args) {
        ArrayList<Pays> paysList = new ArrayList<>();
        paysList.add(new Pays("France", 65_000_000, "Europe"));
        paysList.add(new Pays("Allemagne", 80_000_000, "Europe"));
        paysList.add(new Pays("Belgique", 10_000_000, "Europe"));
        paysList.add(new Pays("Russie", 150_000_000, "Asie"));
        paysList.add(new Pays("Chine", 1_400_000_000, "Asie"));
        paysList.add(new Pays("Indonésie", 220_000_000, "Océanie"));
        paysList.add(new Pays("Australie", 20_000_000, "Océanie"));

        HashMap<String, Integer> continentCount = new HashMap<>();

        for (Pays pays : paysList) {
            String continent = pays.getContinent();

            if (continentCount.containsKey(continent)) {
                int count = continentCount.get(continent);
                continentCount.put(continent, count + 1);
            } else {
                continentCount.put(continent, 1);
            }
        }

        for (String continent : continentCount.keySet()) {
            System.out.println(continent + " : " + continentCount.get(continent));
        }
    }
}



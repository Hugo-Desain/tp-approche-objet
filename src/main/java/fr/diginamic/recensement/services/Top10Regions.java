package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Region;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class Top10Regions extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Region> mapRegions = new HashMap<>();

        for (Ville ville : recensement.getVilles()) {
            String codeRegion = ville.getCodeRegion();
            String nomRegion = ville.getNomRegion();
            int populationVille = ville.getPopulationTotale();

            if (mapRegions.containsKey(codeRegion)) {
                mapRegions.get(codeRegion).ajouterPopulation(populationVille);
            } else {
                mapRegions.put(codeRegion, new Region(codeRegion, nomRegion, populationVille));
            }
        }

        List<Region> regions = new ArrayList<>(mapRegions.values());
        Collections.sort(regions);

        System.out.println("Les 10 régions les plus peuplées :");
        for (int i = 0; i < 10 && i < regions.size(); i++) {
            Region region = regions.get(i);
            System.out.println((i + 1) + ". " + region.getNomRegion() + " - Population : " + region.getPopulationTotale());
        }
    }
}

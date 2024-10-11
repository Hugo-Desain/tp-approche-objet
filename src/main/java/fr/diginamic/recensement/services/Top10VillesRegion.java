package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class Top10VillesRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("\nVeuillez entrer le nom de la région :");
        String nomRegion = scanner.nextLine();

        List<Ville> villes = new ArrayList<>();

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                villes.add(ville);
            }
        }

        villes.sort((ville1, ville2) -> Integer.compare(ville2.getPopulationTotale(), ville1.getPopulationTotale()));

        System.out.println("\nLes 10 villes les plus peuplées de la région " + nomRegion + " :");
        for (int i = 0; i < 10 && i < villes.size(); i++) {
            Ville ville = villes.get(i);
            System.out.println((i + 1) + ". " + ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());
        }
    }
}

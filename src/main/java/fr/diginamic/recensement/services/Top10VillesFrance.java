package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class Top10VillesFrance extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Ville> villes = new ArrayList<>(recensement.getVilles());

        villes.sort((ville1, ville2) -> Integer.compare(ville2.getPopulationTotale(), ville1.getPopulationTotale()));

        System.out.println("\nLes 10 villes les plus peuplées de France :");
        for (int i = 0; i < 10 && i < villes.size(); i++) {
            Ville ville = villes.get(i);
            System.out.println((i + 1) + ". " + ville.getNomCommune() + " - Population : " + ville.getPopulationTotale());
        }
    }
}

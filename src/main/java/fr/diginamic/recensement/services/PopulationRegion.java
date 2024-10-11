package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

public class PopulationRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("\nVeuillez entrer le nom de la région :");
        String nomRegion = scanner.nextLine();

        int populationTotale = 0;
        boolean found = false;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                populationTotale += ville.getPopulationTotale();
                found = true;
            }
        }

        if (found) {
            System.out.println("\nPopulation totale de la région " + nomRegion + " : " + populationTotale);
        } else {
            System.out.println("Région " + nomRegion + " non trouvée.");
        }
    }
}

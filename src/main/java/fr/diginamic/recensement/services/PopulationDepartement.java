package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

public class PopulationDepartement extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("\nVeuillez entrer le code du département :");
        String codeDepartement = scanner.nextLine();

        int populationTotale = 0;
        boolean found = false;

        for (Ville ville : recensement.getVilles()) {
            if (ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
                populationTotale += ville.getPopulationTotale();
                found = true;
            }
        }

        if (found) {
            System.out.println("\nPopulation totale du département " + codeDepartement + " : " + populationTotale);
        } else {
            System.out.println("Département " + codeDepartement + " non trouvé.");
        }
    }
}

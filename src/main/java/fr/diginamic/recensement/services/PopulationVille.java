package fr.diginamic.recensement.services;

import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Scanner;

public class PopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("\nVeuillez entrer le nom de la ville :");
        String nomVille = scanner.nextLine();

        for (Ville ville : recensement.getVilles()) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
                System.out.println("\nPopulation de " + nomVille + " : " + ville.getPopulationTotale());
                return;
            }
        }

        System.out.println("Ville " + nomVille + " non trouvée.");
    }
}

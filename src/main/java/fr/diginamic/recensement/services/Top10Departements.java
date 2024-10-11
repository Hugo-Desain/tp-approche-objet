package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Departement;
import fr.diginamic.recensement.MenuService;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class Top10Departements extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Departement> mapDepartements = new HashMap<>();

        for (Ville ville : recensement.getVilles()) {
            String codeDepartement = ville.getCodeDepartement();
            int populationVille = ville.getPopulationTotale();

            if (mapDepartements.containsKey(codeDepartement)) {
                mapDepartements.get(codeDepartement).ajouterPopulation(populationVille);
            } else {
                mapDepartements.put(codeDepartement, new Departement(codeDepartement, populationVille));
            }
        }

        List<Departement> departements = new ArrayList<>(mapDepartements.values());
        Collections.sort(departements);

        System.out.println("Les 10 départements les plus peuplés :");
        for (int i = 0; i < 10 && i < departements.size(); i++) {
            Departement departement = departements.get(i);
            System.out.println((i + 1) + ". Département " + departement.getCodeDepartement() + " - Population : " + departement.getPopulationTotale());
        }
    }
}

package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {

        ArrayList<Ville> listVille = new ArrayList<>();

        Path pathOrigin = Paths.get("/home/hugod/Java/tp-approche-objet/src/main/resources/recensement.csv");
        List<String> listOrigin = Files.readAllLines(pathOrigin);

        // Exercice : Exercice LireFichierAvecInstanciation
        for (String ligne : listOrigin) {
            String[] tokens = ligne.split(";");
            String nom = tokens[6];
            String codeDepartement = tokens[2];
            String nomRegion = tokens[1];
            String population = tokens[9];

            Ville ville = new Ville(nom, codeDepartement, nomRegion, population);
            listVille.add(ville);
        }

        for (Ville ville : listVille) {
            System.out.println(ville.toString());
        }
        //Break

        //Exercice : GenererFichier
        Path pathCible = Paths.get("/home/hugod/Java/tp-approche-objet/src/main/resources/fichierCible25000.csv");
        List<Ville> listSortie = new ArrayList<>();
        String entete = listOrigin.get(0);

        for (String ligne : listOrigin.subList(1, listOrigin.size())) {
            String[] tokens = ligne.split(";");

            String nom = tokens[6];
            String codeDepartement = tokens[2];
            String nomRegion = tokens[1];
            int populationTotale = Integer.parseInt(tokens[9].replaceAll(" ", ""));

            if (populationTotale > 25000) {
                Ville ville = new Ville(nom, codeDepartement, nomRegion, Integer.toString(populationTotale));
                listSortie.add(ville);
            }

        }
        List<String> lignesSortie = new ArrayList<>();
        lignesSortie.add(entete);

        for (Ville ville : listSortie) {
            String ligne = ville.getNom() + ";" + ville.getCodeDepartement() + ";" +
                    ville.getNomRegion() + ";" + ville.getPopulation();
            lignesSortie.add(ligne);
        }
        Files.write(pathCible, lignesSortie);
    }
}

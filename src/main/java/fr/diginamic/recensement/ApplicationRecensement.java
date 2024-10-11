package fr.diginamic.recensement;

import fr.diginamic.recensement.services.*;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ApplicationRecensement {

    public static void main(String[] args) throws IOException {
        Recensement recensement = new Recensement();
        chargerDonneesRecensement("/home/hugod/Java/tp-approche-objet/src/main/resources/recensement.csv", recensement);

        Scanner scanner = new Scanner(System.in);
        int choix = 0;

        while (choix != 9) {
            afficherMenu();
            choix = scanner.nextInt();

            scanner.nextLine();

            switch (choix) {
                case 1:
                    PopulationVille populationVille = new PopulationVille();
                    populationVille.traiter(recensement, scanner);
                    break;
                case 2:
                    PopulationDepartement populationDepartement = new PopulationDepartement();
                    populationDepartement.traiter(recensement, scanner);
                    break;
                case 3:
                    PopulationRegion populationRegion = new PopulationRegion();
                    populationRegion.traiter(recensement, scanner);
                    break;
                case 4:
                    Top10Regions top10Regions = new Top10Regions();
                    top10Regions.traiter(recensement, scanner);
                    break;
                case 5:
                    Top10Departements top10Departements = new Top10Departements();
                    top10Departements.traiter(recensement, scanner);
                    break;
                case 6:
                    Top10VillesDepartement top10VillesDepartement = new Top10VillesDepartement();
                    top10VillesDepartement.traiter(recensement, scanner);
                    break;
                case 7:
                    Top10VillesRegion top10VillesRegion = new Top10VillesRegion();
                    top10VillesRegion.traiter(recensement, scanner);
                    break;
                case 8:
                    Top10VillesFrance top10VillesFrance = new Top10VillesFrance();
                    top10VillesFrance.traiter(recensement, scanner);
                    break;
                case 9:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }

    public static void afficherMenu() {
        System.out.println("\nMenu :");
        System.out.println("1. Population d'une ville donnée");
        System.out.println("2. Population d'un département donné");
        System.out.println("3. Population d'une région donnée");
        System.out.println("4. Afficher les 10 régions les plus peuplées");
        System.out.println("5. Afficher les 10 départements les plus peuplés");
        System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
        System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
        System.out.println("8. Afficher les 10 villes les plus peuplées de France");
        System.out.println("9. Sortir");
    }

    public static void chargerDonneesRecensement(String cheminFichier, Recensement recensement) throws IOException {
        List<String> lignes = Files.readAllLines(Paths.get(cheminFichier));

        for (String ligne : lignes.subList(1, lignes.size())) {
            String[] tokens = ligne.split(";");
            if (tokens.length >= 9) {
                String codeRegion = tokens[0];
                String nomRegion = tokens[1];
                String codeDepartement = tokens[2];
                String codeCommune = tokens[5];
                String nomCommune = tokens[6];
                int populationTotale = Integer.parseInt(tokens[9].replaceAll(" ", ""));

                Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
                recensement.ajouterVille(ville);
            }
        }
    }

}

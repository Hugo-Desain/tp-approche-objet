package fr.diginamic.essais;
import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) {

        Maison maison = new Maison();

        maison.ajouterPiece(new Chambre(
                15, 0));
        maison.ajouterPiece(new Salon(30, 0));
        maison.ajouterPiece(new SalleDeBain(5, 1));
        maison.ajouterPiece(new Cuisine(12, 0));
        maison.ajouterPiece(new WC(3, 1));
        maison.ajouterPiece(new Chambre(20, 1));

        maison.ajouterPiece(null);

        try {
            maison.ajouterPiece(new Chambre(-10, -1));
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("Superficie totale de la maison: " + maison.superficieCalc() + " m²");

        System.out.println("Superficie de l'étage 0: " + maison.getSuperfcieEtage(0) + " m²");

        System.out.println("Superficie de l'étage 1: " + maison.getSuperfcieEtage(1) + " m²");

    }
}
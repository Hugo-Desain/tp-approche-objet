package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

    protected Piece[] piecesMaison;

    public Maison() {
        this.piecesMaison = new Piece[0];
    }

    public void ajouterPiece(Piece piece) {
        if (piece != null) {
        piecesMaison = Arrays.copyOf(piecesMaison, piecesMaison.length + 1);
        piecesMaison[piecesMaison.length - 1] = piece;
        } else {
            System.out.println("Erreur : pièce null non ajoutée.");
        }
    }

    public int superficieCalc() {
        int superficieTotale = 0;
        for (int i = 0 ; i < piecesMaison.length ; i++) {
            superficieTotale += piecesMaison[i].getSuperficie();
        }
        return superficieTotale;
    }


    public int getSuperfcieEtage(int etage) {
        int superficieEtage = 0;
        for (int i = 0 ; i < piecesMaison.length ; i++) {
            if (piecesMaison[i].getEtage() == etage) {
                superficieEtage += piecesMaison[i].getSuperficie();
            }        }
        return superficieEtage;
    }

}

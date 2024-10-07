package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double taux;

    public CompteTaux(int numCompte, double soldeCompte, double taux) {
        super(numCompte, soldeCompte);

        this.taux = taux;
    }

    @Override
    public String toString() {
        return "Numéro de compte = " + numCompte + " ; Solde du compte = " + soldeCompte + " ; Taux de rémunération = " + taux;
    }
}

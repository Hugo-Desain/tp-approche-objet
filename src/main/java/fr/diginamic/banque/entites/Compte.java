package fr.diginamic.banque.entites;

public class Compte {

    protected int numCompte;
    protected double soldeCompte;

    public Compte(int numCompte, double soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Numéro de compte = " + numCompte + " ; Solde du compte = " + soldeCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}

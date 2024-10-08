package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

    protected double salaireJournalier;
    protected int joursTravail;

    public Pigiste(String nom, String prenom, double salaireJournalier, int joursTravail) {
        super(nom, prenom);
        this.salaireJournalier = salaireJournalier;
    }
    @Override
    public double getSalaire() {
        return salaireJournalier;
    }
}

package fr.diginamic.salaire;

public abstract class Intervenant {
    protected String nom;
    protected String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double getSalaire();

    public void afficherDonnees(){
        System.out.println(getNom());
        System.out.println(getPrenom());
        System.out.println(getSalaire());
        System.out.println(getClass().getSimpleName());

    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}

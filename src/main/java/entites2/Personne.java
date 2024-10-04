package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adressePostale;

    public Personne (String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne (String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    public void printName() {
        System.out.println(nom.toUpperCase());
        System.out.println(prenom.toUpperCase());
    }

    public void setNom(String nvNom) {
        this.nom = nvNom;
    }

    public void setPrenom(String nvPrenom) {
        this.prenom = nvPrenom;
    }

    public void setAdresse(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.adressePostale = new AdressePostale(numeroRue, libelleRue, codePostal, ville);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adressePostale;
    }

}

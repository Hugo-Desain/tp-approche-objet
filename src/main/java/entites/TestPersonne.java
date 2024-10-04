package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {

        Personne pers1 = new Personne();
        pers1.nom = "Jackson";
        pers1.prenom = "Mickael";
        pers1.adressePostale = new AdressePostale();
        pers1.adressePostale.numeroRue = 2;
        pers1.adressePostale.libelleRue = "de la rue";
        pers1.adressePostale.codePostal = 12345;
        pers1.adressePostale.ville = "Marseille";

    }
}

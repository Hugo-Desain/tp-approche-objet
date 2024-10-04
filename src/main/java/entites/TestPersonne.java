package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {


        AdressePostale adressePostale = new AdressePostale(2, "de la rue", 12345, "Marseille");


        Personne pers1 = new Personne("Jackson", "Michael");
        Personne pers2 = new Personne("Jackson", "Michael", adressePostale);

    }
}

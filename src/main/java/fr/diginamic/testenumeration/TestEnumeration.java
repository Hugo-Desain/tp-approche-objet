package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {

        for (Saison saison : Saison.values()) {
            System.out.println( saison.getLibelle() + " - Ordre : " + saison.getOrdre());
        }

        String nom = "ETE";
        Saison ete = Saison.valueOf(nom);
        System.out.println(ete.getLibelle());

        String hiver = "Hiver";
        Saison searchSaison = Saison.getByLibelle(hiver);
        System.out.println(searchSaison);

    }
}

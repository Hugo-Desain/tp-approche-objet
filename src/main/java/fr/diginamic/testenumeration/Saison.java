package fr.diginamic.testenumeration;

public enum Saison {

    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private String libelle;
    private int ordre;

    Saison(String libelle, int ordre) {
        this.libelle = libelle;
        this.ordre = ordre;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getOrdre() {
        return ordre;
    }

    public static Saison getByLibelle(String libelle) {
        for (Saison saison : Saison.values()) {
            if (saison.getLibelle().equalsIgnoreCase(libelle)) {
                return saison;
            }
        }
        return null;
    }

}

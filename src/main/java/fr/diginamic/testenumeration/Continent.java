package fr.diginamic.testenumeration;

public enum Continent {

    EUROPE("Europe"),
    ASIE("Asie"),
    AMERIQUE("Amérique"),
    AFRIQUE("Afrique"),
    OCEANIE("Oceanie");

    protected String libelle;

    Continent(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}

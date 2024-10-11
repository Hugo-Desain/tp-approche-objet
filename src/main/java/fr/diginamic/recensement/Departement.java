package fr.diginamic.recensement;

public class Departement implements Comparable<Departement> {
    private String codeDepartement;
    private int populationTotale;

    public Departement(String codeDepartement, int populationTotale) {
        this.codeDepartement = codeDepartement;
        this.populationTotale = populationTotale;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void ajouterPopulation(int population) {
        this.populationTotale += population;
    }

    @Override
    public int compareTo(Departement autre) {
        return Integer.compare(autre.getPopulationTotale(), this.populationTotale);
    }
}

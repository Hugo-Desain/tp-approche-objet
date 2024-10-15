package listes;
import fr.diginamic.testenumeration.Continent;


public class Ville implements Comparable<Ville>{
    protected String nom;
    protected Integer habitants;
    protected Continent continent;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHabitants() {
        return habitants;
    }

    public void setHabitants(int habitants) {
        this.habitants = habitants;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Ville(String nom, int habitants, Continent continent) {
        this.nom = nom;
        this.habitants = habitants;
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Ville : " + nom + " " + habitants + " hab. " + " Continent : " + continent.getLibelle() + "\n";
    }

    @Override
    public int compareTo(Ville autre) {
        return this.habitants.compareTo(autre.getHabitants());

    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ville)) {
            return false;
        }
        Ville other = (Ville) object;
        return this.nom.equals(other.getNom()) && habitants == getHabitants();
    }

}

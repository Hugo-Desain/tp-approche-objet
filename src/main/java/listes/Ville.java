package listes;

public class Ville implements Comparable<Ville>{
    protected String nom;
    protected Integer habitants;

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

    public Ville(String nom, int habitants) {
        this.nom = nom;
        this.habitants = habitants;
    }

    @Override
    public String toString() {
        return "Ville : " + nom + " " + habitants + " hab. '\n'";
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

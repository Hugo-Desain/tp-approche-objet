package listes;

public class Ville {
    protected String nom;
    protected int habitants;

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
}

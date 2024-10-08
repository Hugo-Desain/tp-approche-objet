package entites;

public class Theatre {

    protected String nom;
    protected int max;
    protected int total;
    protected double recette;


    public Theatre(String nom, int max, int total, double recette) {
        this.nom = nom;
        this.max = max;
        this.total = total;
        this.recette = recette;
    }

    public void inscrire(int nbClients, double prix) {
        if (total < max) {
            total += nbClients;
            recette += nbClients * prix;
            System.out.println("Total des clients : " + total + "/" + max);
            System.out.println("Recette totale : " + recette);
        } else {
            System.out.println("Capacité max atteinte");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getRecette() {
        return recette;
    }

    public void setRecette(double recette) {
        this.recette = recette;
    }
}

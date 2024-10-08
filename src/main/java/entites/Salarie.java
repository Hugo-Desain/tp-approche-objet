package entites;

public class Salarie {
    String nom;
    String prenom;
    double salaire;

    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + " ; Prenom : " + prenom + " ; Salaire : " + salaire;
    }

    public static void main(String[] args) {

        String salaire1 = "2 523.5";

        String salaire1Update = salaire1.replaceAll("\\s+","");

        double salaire1Double = Double.parseDouble(salaire1Update);

        Salarie salarie1 = new Salarie("Durand", "Marcel",salaire1Double);
        System.out.println(salarie1.toString());

    }




}

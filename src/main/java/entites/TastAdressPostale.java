package entites;

public class TastAdressPostale {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale();
        adr1.numeroRue = 2;
        adr1.libelleRue = "de la rue";
        adr1.codePostal = 12345;
        adr1.ville = "Marseille";

        AdressePostale adr2 = new AdressePostale();
        adr2.numeroRue = 4;
        adr2.libelleRue = "de la l'avenue";
        adr2.codePostal = 54321;
        adr2.ville = "Lyon";

    }
}

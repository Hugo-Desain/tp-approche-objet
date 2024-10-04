package entites;

public class TastAdressPostale {
    public static void main(String[] args) {

        AdressePostale adr1 = new AdressePostale(2, "de la rue", 12345, "Marseille");

        AdressePostale adr2 = new AdressePostale(4, "de l'avenue", 54321, "Lyon");

        System.out.println(adr1);
        System.out.println(adr2);

    }
}

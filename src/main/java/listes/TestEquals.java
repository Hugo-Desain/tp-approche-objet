package listes;

public class TestEquals {
    public static void main(String[] args) {

        Ville ville1 = new Ville("Montpellier,", 150000);
        Ville ville2 = new Ville("Montpellier,", 150000);
        Ville ville3 = new Ville("Nice", 343000);

        boolean result1 = ville1.equals(ville2);
        System.out.println("Mêmes attributs avec equals() : " + result1);

        boolean result2 = ville2.equals(ville3);
        System.out.println("Attributs différents avec equals() : " + result2);

        boolean result3 = ville1 == ville2;
        System.out.println("Mêmes attributs avec == : " + result3);

        boolean result4 = ville2 == ville3;
        System.out.println("Attributs différents avec == : " + result4);

        ville2 = ville1;
        boolean result5 = ville1 == ville2;
        System.out.println("Retourne true avec == : " + result5);

    }
}

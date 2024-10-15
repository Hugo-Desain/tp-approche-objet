package fr.diginamic.testenumeration;
import listes.Ville;
import java.util.ArrayList;

public class TestContinentAvecEnum {

    public static void main(String[] args) {

        ArrayList<Ville> listeVilles = new ArrayList<>();
        listeVilles.add(new Ville("New York", 8419600, Continent.AMERIQUE));
        listeVilles.add(new Ville("Paris", 2148000, Continent.EUROPE));
        listeVilles.add(new Ville("Pékin", 21540000, Continent.ASIE));
        listeVilles.add(new Ville("Moscou", 11920000, Continent.EUROPE));
        listeVilles.add(new Ville("Berlin", 3645000, Continent.EUROPE));
        listeVilles.add(new Ville("Sydney", 5230000, Continent.OCEANIE));
        listeVilles.add(new Ville("Sao Paulo", 12300000, Continent.AMERIQUE));
        listeVilles.add(new Ville("Dakar", 1038400, Continent.AFRIQUE));

        for (Ville ville : listeVilles) {
            System.out.println(ville);
        }
    }

}

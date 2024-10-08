package fr.diginamic.chaines;


import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        int longueurChaine= chaine.length();
        System.out.println("Longueur de la chaine: " + longueurChaine);

        int firstSeparator = chaine.indexOf(';');
        System.out.println("index du premier séparateur: " + firstSeparator);

        String nom = chaine.substring(0, chaine.indexOf(';'));
        System.out.println(nom.toUpperCase());
        System.out.println(nom.toLowerCase());

        String[] morceaux = chaine.split(";");
        System.out.println(Arrays.toString((morceaux)));


    }
}

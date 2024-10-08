package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

    public static void main(String[] args) {
        double resultat1 = Operations.calcul(10, 5, '+');
        System.out.println("10 + 5 = " + resultat1);

        double resultat2 = Operations.calcul(10, 5, '-');
        System.out.println("10 - 5 = " + resultat2);

        double resultat3 = Operations.calcul(10, 5, '*');
        System.out.println("10 * 5 = " + resultat3);

        double resultat4 = Operations.calcul(10, 5, '/');
        System.out.println("10 / 5 = " + resultat4);

        double resultat5 = Operations.calcul(10, 0, '/');
        System.out.println("10 / 0 = " + resultat5);

        double resultat6 = Operations.calcul(10, 5, '%');
        System.out.println("Opérateur non valide : " + resultat6);
    }
}

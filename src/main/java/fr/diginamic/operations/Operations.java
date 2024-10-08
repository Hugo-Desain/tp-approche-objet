package fr.diginamic.operations;

import fr.diginamic.banque.entites.Operation;

public class Operations {

    public static double calcul(double a, double b, char operateur) {

        if (operateur == '+') {
            return a + b;
        } else if (operateur == '-') {
            return a - b;
        } else if (operateur == '*') {
            return a * b;
        } else if (operateur == '/') {
            return a / b;
        } else {
            System.out.println("Opérateur non valide.");
            return 0;
        }
    }
}



package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {
        CalculMoyenne calc1 = new CalculMoyenne();
        calc1.ajout(15);
        calc1.ajout(9);
        calc1.ajout(13);
        calc1.ajout(19);
        System.out.println("Moyenne calc1 : " + calc1.calcul());

        CalculMoyenne calc2 = new CalculMoyenne();
        calc1.ajout(50);
        calc2.ajout(100);
        calc2.ajout(75);
        calc2.ajout(25);
        calc2.ajout(125);
        calc2.ajout(150);
        System.out.println("Moyenne calc2 : " + calc2.calcul());
    }
}


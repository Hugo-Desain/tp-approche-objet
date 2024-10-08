package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {

        Salarie salarie1 = new Salarie( "Neymar",  "Jean", 1500);
        Pigiste pigiste1 = new Pigiste("Terieur", "Alain", 80, 22);

        salarie1.afficherDonnees();
        pigiste1.afficherDonnees();

    }
}

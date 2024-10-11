package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
    protected List<Ville> villes;

    public Recensement() {
        this.villes = new ArrayList<>();
    }

    public List<Ville> getVilles() {
        return villes;
    }

    public void ajouterVille(Ville ville) {
        villes.add(ville);
    }
}

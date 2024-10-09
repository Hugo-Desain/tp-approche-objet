package sets;

import java.util.HashSet;

public class Pays {
    protected String nom;
    protected double habs;
    protected double pibHab;
    protected double pibPays;

    @Override
    public String toString() {
        return "Pays : " + nom + " - " + habs + " hab. " + " - " + "PIB/hab. : " + pibHab + " - " + "PIB total : " + pibPays + '\n';
    }

    public Pays(String nom, double habs, double pibHab) {
        this.nom = nom;
        this.habs = habs;
        this.pibHab = pibHab;
        this.pibPays = this.pibHab * this.habs;;
    }

    public double getPibPays() {
        return this.pibPays;
    }

    public double setPibPays() {
        return pibPays;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getHabs() {
        return habs;
    }

    public void setHabs(double habs) {
        this.habs = habs;
    }

    public double getPibHab() {
        return pibHab;
    }

    public void setPibHab(double pibHab) {
        this.pibHab = pibHab;
    }



}

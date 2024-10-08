package fr.diginamic.jdr;
import java.util.Random;


public abstract class Creature {
    protected int force;
    protected int pv;

    public Creature(int minForce, int maxForce, int minPv, int maxPv) {
        Random random = new Random();
        this.force = minForce + random.nextInt(maxForce - minForce + 1);
        this.pv = minPv + random.nextInt(maxPv - minPv + 1);
    }

    public int getForce() {
        return force;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pointsDeVie) {
        this.pv = pointsDeVie;
    }
}
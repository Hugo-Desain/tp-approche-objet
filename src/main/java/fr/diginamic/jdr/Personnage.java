package fr.diginamic.jdr;
import java.util.Random;


public class Personnage {
    protected int force;
    protected int pv;
    protected int score;

    @Override
    public String toString() {
        return "Personnage{" +
                "force=" + force +
                ", pv=" + pv +
                ", score=" + score +
                '}';
    }

    public Personnage() {
        Random random = new Random();

        this.force = 12 + random.nextInt(7);
        this.pv = 20 + random.nextInt(31);
        this.score = 0;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

package fr.diginamic.maison;

public abstract class Piece extends Maison{
    protected int superficie;
    protected  int etage;

    public Piece(int superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }


}

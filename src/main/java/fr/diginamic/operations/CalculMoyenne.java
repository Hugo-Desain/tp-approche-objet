package fr.diginamic.operations;

public class CalculMoyenne {

    private double[] datas;
    private int length;

    public CalculMoyenne() {
        this.datas = new double[5];
        this.length = 0;
    }

    public void ajout(double data) {
        if (length == datas.length) {
            double[] nouveauTableau = new double[datas.length * 2];
            for (int i = 0; i < datas.length; i++) {
                nouveauTableau[i] = datas[i];
            }
            datas = nouveauTableau;
        }
        datas[length] = data;
        length++;
    }

    public double calcul() {
        if (length == 0) {
            return 0;
        }

        double somme = 0;
        for (int i = 0; i < length; i++) {
            somme += datas[i];
        }

        return somme / length;
    }
}

package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {

        Compte compte1 = new Compte(1122334455, 2500.00);
        CompteTaux compte2 = new CompteTaux(123456789, 10000.00, 0.20);

        Compte[] comptes = {compte1, compte2};

        int i;
        for (i = 0; i < comptes.length ; i++) {
            System.out.println(comptes[i].toString());
        }

    }
}

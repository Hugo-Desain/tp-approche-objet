package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {

        Credit opc1 = new Credit("01/01/2024", 100);
        Credit opc2 = new Credit("02/02/2024", 200);
        Debit opd1 = new Debit("03/03/2024", 50);
        Debit opd2 = new Debit("04/04/2024", 150);

        Operation[] opTab = {opc1, opc2, opd1, opd2};
        //Operation[] operations = {new Credit("01/01/2024", 100), new Credit("02/02/2024", 200), new Debit("03/03/2024", 50), new Debit("04/04/2024", 150)};

        int somme = 0;
        int i;
        for (i = 0; i < opTab.length ; i++) {
            if (opTab[i].getType().equals("CREDIT")) {
                somme += opTab[i].montant;
            } else {
                somme -= opTab[i].montant;
            }

            System.out.println(opTab[i].getType() + " " + opTab[i]);

            System.out.println(somme);
        }
    }
}

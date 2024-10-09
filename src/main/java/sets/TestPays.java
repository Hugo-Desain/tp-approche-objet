package sets;

import listes.Ville;

import java.util.HashSet;

public class TestPays {
    public static void main(String[] args) {

        HashSet<Pays> setPays = new HashSet<>();
        setPays.add(new Pays ("USA", 332_000_000, 79.766));
        setPays.add(new Pays ("France", 67_000_000, 45.171));
        setPays.add(new Pays ("Allemagne", 84_000_000, 56.832));
        setPays.add(new Pays ("UK", 84_000_000, 51.331));
        setPays.add(new Pays ("Italie", 59_000_000, 37.301));
        setPays.add(new Pays ("Japon", 124_000_000, 41.351));
        setPays.add(new Pays ("Chine", 1_400_000_000, 12.598));
        setPays.add(new Pays ("Russie", 143_000_000, 15.481));
        setPays.add(new Pays ("Inde", 1_400_000_000, 2.642));

        Pays PaysTest = new Pays("", 0.0, 0.0);
        for (Pays pays : setPays) {
            if (pays.getPibHab() > PaysTest.getPibHab()) {
                PaysTest = pays;
            }
        }
        double PibHabMax = PaysTest.getPibHab();
        System.out.println(PibHabMax);


        for (Pays pays : setPays) {
            if (pays.getPibPays() > PaysTest.getPibPays()) {
                PaysTest = pays;
            }
        }
        double PibPaysMax = PaysTest.getPibPays();
        System.out.println(PibPaysMax);


        for (Pays pays : setPays) {
            if (pays.getPibPays() < PaysTest.getPibPays()) {
                PaysTest = pays;
            }
        }

        PaysTest.setNom(PaysTest.getNom().toUpperCase());

        setPays.remove(PaysTest);

        System.out.println(setPays.toString());


    }
}

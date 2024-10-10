package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CrerFichier {

    public static void main(String[] args) throws IOException {

        Path pathOrigin = Paths.get("/home/hugod/Java/tp-approche-objet/src/main/resources/recensement.csv");
        List<String> listOrigin = Files.readAllLines(pathOrigin);
        List<String> listSortie = new ArrayList<>();


        for (int i = 1; i <= 100 ; i++) {
            listSortie.add(listOrigin.get(i));
        }

        System.out.println(listSortie);

        Path pathCible = Paths.get("/home/hugod/Java/tp-approche-objet/src/main/resources/fichierCible.csv");
        Files.write(pathCible, listSortie);

        System.out.println(listSortie.size());

    }
}

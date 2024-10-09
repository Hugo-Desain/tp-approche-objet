package listes;

import java.util.*;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> listeString = new ArrayList<String>();
        Collections.addAll(listeString, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        String stringMax = Collections.max(listeString, Comparator.comparing(String::length));
        System.out.println(stringMax);

        listeString.replaceAll(e -> e.toUpperCase());
        System.out.println(listeString);

        Iterator<String> iter = listeString.iterator();
        while (iter.hasNext()) {
            String item = iter.next();
            if (item.startsWith("N")) {
                iter.remove();
            }
        }
        System.out.println(listeString);



    }

}

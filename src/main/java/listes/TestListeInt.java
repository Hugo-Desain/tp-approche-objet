package listes;

import java.util.*;

public class TestListeInt {

    public static void main(String[] args) {

        ArrayList<Integer> listeInt = new ArrayList<Integer>();
        Collections.addAll(listeInt, -1, 5, 7, 3, -2, 4, 8, 5);

        System.out.println(listeInt);
        System.out.println(listeInt.size());
        System.out.println(Collections.max(listeInt));

        listeInt.remove(Collections.min(listeInt));
        System.out.println(listeInt);

        for (Integer item: listeInt) {
            if (item < 0) {
                int newItem = Math.abs(item);
                listeInt.set(listeInt.indexOf(item), newItem);
            }
        }
        System.out.println(listeInt);




    }
}

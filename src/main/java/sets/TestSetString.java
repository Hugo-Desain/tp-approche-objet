package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");

        String max = "";
        for (String item : set) {
            if (item.length() > max.length()) {
                max = item;
            }
        }
        set.remove(max);
        System.out.println(set);
    }
}

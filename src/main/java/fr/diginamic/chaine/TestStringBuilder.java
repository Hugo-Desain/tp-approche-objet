package fr.diginamic.chaine;

public class TestStringBuilder {

    public static void main(String[] args) {

        long debutStringBuilder = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100000; i++) {
            sb.append(i);
        }

        long finStringBuilder = System.currentTimeMillis();
        System.out.println((finStringBuilder - debutStringBuilder));

        long debutString = System.currentTimeMillis();

        String str = "";

        for (int i = 1; i <= 100000; i++) {
            str += i;
        }

        long finString = System.currentTimeMillis();
        System.out.println((finString - debutString));
    }
}

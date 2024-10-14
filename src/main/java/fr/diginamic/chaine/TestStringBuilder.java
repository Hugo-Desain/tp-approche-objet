package fr.diginamic.chaine;

public class TestStringBuilder {

    public static void main(String[] args) {

        long debutString = System.currentTimeMillis();

        String string = "";

        for (int i = 1; i <= 100_000; i++) {
            string += i;
        }

        long finString = System.currentTimeMillis();
        System.out.println((finString - debutString));


        long debutStringBuilder = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= 100000; i++) {
            builder.append(i);
        }

        long finStringBuilder = System.currentTimeMillis();
        System.out.println((finStringBuilder - debutStringBuilder));
    }
}

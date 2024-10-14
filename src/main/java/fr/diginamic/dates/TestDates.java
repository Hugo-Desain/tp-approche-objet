package fr.diginamic.dates;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyy");
        Date date1 = new Date (124, 9, 14);
        String chaine1 = formateur.format(date1);
        System.out.println(chaine1);

        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date date2 = new Date(116, 18, 5, 23, 59, 30);
        String chaine2 = formateur2.format(date2);
        System.out.println(chaine2);

        Date date3 = new Date();
        String chaine3 = formateur2.format(date3);
        System.out.println(chaine3);
    }





}

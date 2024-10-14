package fr.diginamic.chaine;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2016);
        cal1.set(Calendar.MONTH, 4);
        cal1.set(Calendar.DAY_OF_MONTH, 19);
        cal1.set(Calendar.HOUR_OF_DAY, 23);
        cal1.set(Calendar.MINUTE, 59);
        cal1.set(Calendar.SECOND, 30);

        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyy");
        Date date1 = cal1.getTime();
        String chaine1 = formateur.format(date1);
        System.out.println(chaine1);

        Calendar cal2 = Calendar.getInstance();
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        Date date2 = cal2.getTime();
        String chaine2 = formateur2.format(date2);
        System.out.println(chaine2);

        SimpleDateFormat formateur2France = new SimpleDateFormat("EEEE dd MMMM yyy HH:mm:ss", Locale.FRANCE);
        Calendar cal2France = Calendar.getInstance();
        Date date2France = cal2France.getTime();
        String chaine2France = formateur2France.format(date2France);
        System.out.println(chaine2France);

        SimpleDateFormat formateur2Chine = new SimpleDateFormat("EEEE dd MMMM yyy HH:mm:ss", Locale.CHINA);
        Calendar cal2Chine = Calendar.getInstance();
        Date date2Chine = cal2Chine.getTime();
        String chaine2Chine = formateur2Chine.format(date2Chine);
        System.out.println(chaine2Chine);

        SimpleDateFormat formateur2Allemagne = new SimpleDateFormat("EEEE dd MMMM yyy HH:mm:ss", Locale.GERMANY);
        Calendar cal2Allemagne = Calendar.getInstance();
        Date date2Allemagne = cal2Allemagne.getTime();
        String chaine2Allemagne = formateur2Allemagne.format(date2Allemagne);
        System.out.println(chaine2Allemagne);

        Locale ru = new Locale("ru");
        SimpleDateFormat formateur2Russie = new SimpleDateFormat("EEEE dd MMMM yyy HH:mm:ss", ru);
        Calendar cal2Russie = Calendar.getInstance();
        Date date2Russie = cal2Russie.getTime();
        String chaine2Russie = formateur2Russie.format(date2Russie);
        System.out.println(chaine2Russie);

    }
}

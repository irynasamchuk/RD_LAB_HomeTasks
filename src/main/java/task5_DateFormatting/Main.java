package task5_DateFormatting;

import org.joda.time.DateTime;

import static task5_DateFormatting.DateFormatting.*;

public class Main {
    public static void main(String[] args) {
        String dateInString = "10/10/1996";
        DateTime date1 = new DateTime();
        DateTime date2 = new DateTime(2012, 12, 07, 0, 0);

        System.out.println(dateConverting(dateInString));
        System.out.println(getStartOfTheDay());
        System.out.println(getEndOfTheDay());
        convertDateToString("dd/MM/yyyy", 1569269522000l);
        compareDates(date1, date2);
        System.out.println(getTextDayOfWeek(1569269522000l));
    }
}

package task5_DateFormatting;

import org.joda.time.DateTime;

import static task5_DateFormatting.DateFormatting.*;

public class Main {
    public static void main(String[] args) {
        DateFormatting dateFormatting = new DateFormatting();
        String dateInString = "10/10/1996";
        DateTime date1 = new DateTime();
        DateTime date2 = new DateTime(2012, 12, 07, 0, 0);

        System.out.println(dateFormatting.dateConverting(dateInString, "MM/dd/yyyy"));
        System.out.println(dateFormatting.getStartOfTheDay());
        System.out.println(dateFormatting.getEndOfTheDay());
        dateFormatting.convertDateToString("dd/MM/yyyy", 1569269522000l);
        dateFormatting.compareDates(date1, date2);
        System.out.println(dateFormatting.getTextDayOfWeek(1569269522000l));
    }
}

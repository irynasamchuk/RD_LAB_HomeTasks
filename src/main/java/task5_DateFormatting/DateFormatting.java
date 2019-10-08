package task5_DateFormatting;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Locale;

public class DateFormatting {

    public String dateConverting(String date, String pattern) {
        DateTimeFormatter dateTimeParser = DateTimeFormat.forPattern(pattern);
        LocalDate dateParsed = dateTimeParser.parseLocalDate(date);
        String formattedDate = dateParsed.toString(DateTimeFormat.forPattern(pattern));
        return formattedDate;
    }

    public long getStartOfTheDay() {
        DateTime date = new DateTime().withTimeAtStartOfDay();
        long dateStart = date.getMillis();
        return dateStart;
    }

    public long getEndOfTheDay() {
        DateTime date = new DateTime().withTimeAtStartOfDay();
        long endDayDate = date.plusHours(23).plusMinutes(59).plusSeconds(59).getMillis();
        return endDayDate;
    }

    public void convertDateToString(String pattern, long date) {
        DateTime dateTime = new DateTime().withMillis(date);
        System.out.println(dateTime.toString(pattern));
    }

    public void compareDates(DateTime date1, DateTime date2) {
        long date1Converted = date1.getMillis();
        long date2Converted = date2.getMillis();
        if (date1Converted > date2Converted)
            System.out.println("Date1 is after Date2");
        else if (date1Converted < date2Converted)
            System.out.println("Date1 is before Date2");
        else System.out.println("Date1 is equal to Date2");
    }

    public String getTextDayOfWeek(long date) {
        DateTime dateTime = new DateTime().withMillis(date);
        DateTime.Property dayOfWeekProperty = dateTime.dayOfWeek();
        String dayOfWeek = dayOfWeekProperty.getAsText(Locale.getDefault());
        return dayOfWeek;
    }
}

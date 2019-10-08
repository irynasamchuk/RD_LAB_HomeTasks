package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) throws ParseException {
        DateFormat.DateFormat();
        ConvertStringInDate();
    }

    public static void DateFormat() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String str = dateFormat.format(date);
        System.out.println(str);
    }

    public static void ConvertStringInDate() throws ParseException {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try{
            date = dateFormat.parse("31/05/2015");
            System.out.println("Date is: " + date);
        } catch (ParseException e){
            e.printStackTrace();
        }

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        int month = localDate.getMonthValue();
        int day   = localDate.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateTest = format.parse("2016-05-15");
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        String yearTest = df.format(dateTest);
        System.out.println("out year "  +yearTest);
    }
}

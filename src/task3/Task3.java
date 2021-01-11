package task3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task3 {
    static GregorianCalendar timeFromDate (GregorianCalendar gc){
        GregorianCalendar result = new GregorianCalendar();
        result.setTimeInMillis(new GregorianCalendar().getTimeInMillis() - gc.getTimeInMillis());
        return result;
    }

    public static void main(String[] args) {
        GregorianCalendar birthday = new GregorianCalendar(1992, Calendar.JULY, 13);
        GregorianCalendar finalCalendar = timeFromDate(birthday);
        System.out.println("Вам исполнилось " + (finalCalendar.get(Calendar.YEAR) - 1970) + " лет, "
                + (finalCalendar.get(Calendar.MONTH) ) + " месяца, "
                + (finalCalendar.get(Calendar.DAY_OF_MONTH)) + " дней, "
                + finalCalendar.get(Calendar.HOUR_OF_DAY) + " часа, "
                + finalCalendar.get(Calendar.MINUTE) + " минут и "
                + finalCalendar.get(Calendar.SECOND) + " секунд.");
    }
}

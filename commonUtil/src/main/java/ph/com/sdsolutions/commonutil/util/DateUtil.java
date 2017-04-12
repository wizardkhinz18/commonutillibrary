package ph.com.sdsolutions.commonutil.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * -
 * Created by :
 * -
 * Jovet Alabastro
 * Android  Developer @ SD Solution Inc.
 * Email : jovet@sdsolution.com.ph
 * -
 * Date Created : 4/5/2017 @ 3:56 PM
 * -
 */

public class DateUtil {

    public static Calendar getCalendar(String dateString){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        try {
            cal.setTime(sdf.parse(dateString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return cal;
    }

    public static Calendar getCalendar(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    public static String getDateString(Date date){
        String dateString;
        SimpleDateFormat  sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        dateString = sdf.format(date);
        return dateString;
    }

    public static String getDateString(Date date, String format){
        String dateString;
        SimpleDateFormat  sdf = new SimpleDateFormat(format, Locale.ENGLISH);
        dateString = sdf.format(date);
        return dateString;
    }

    public static String getDateString(long ms){
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(ms);
        SimpleDateFormat  sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        return sdf.format(cal.getTime());
    }

    public static Date getDate(String dateString){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}

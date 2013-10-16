import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class p19 {

    public static void main(String[] args) throws ParseException {
        
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();

        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

        Date date = sdf.parse("01011901");
        cal1.setTime(date);
        date = sdf.parse("31122000");
        cal2.setTime(date);
        
        int days = daysBetween(cal1.getTime(),cal2.getTime());

        System.out.println((days / 7));

    }

    public static int daysBetween(Date d1, Date d2){
            return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }

}

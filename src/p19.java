import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class p19 extends EulerProblem {
    
    public int[] daysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws ParseException {
        
        EulerProblem e = new p19();
        e.computeResult();
        e.showResult();

    }

    @Override
    public void computeResult() {

        int sum = 0;
        int actualDate = 0; // monday
        
        for (int year = 1900; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                
                if (actualDate == 6 && year >= 1901) {
                    sum++;
                }
                
                actualDate = (actualDate + daysInMonth(month, year)) % 7;
                
            }
        }
        
        this.result = sum + "";
        
    }
    
    public int daysInYear(int year) {
        
        int sum = 0;
        
        for (int i = 1; i <= 12; i++) {
            sum += daysInMonth(i, year);
        }
        
        return sum;
        
    }
    
    public int daysInMonth(int month, int year) {
        
        if (month != 2) {
            return daysInMonth[month - 1];
        } else {
            
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
            
        }
        
    }
    
    public boolean isLeapYear(int year) {
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
        
    }

}

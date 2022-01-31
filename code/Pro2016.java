import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Pro2016 {

    public static String pro2016(int month, int day){
        String answer = "";
        Calendar cal = Calendar.getInstance();
        cal.set(2016, month-1, day);
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);

        answer = sdf.format(date).toUpperCase();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(pro2016(5,24));
    }
}

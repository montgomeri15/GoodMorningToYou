import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class GetTime {

    public void Time(){

        Locale locale = new Locale("ru");

        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        System.out.println();
        int hour = Integer.parseInt(dateFormat.format(date));

        System.out.println(hour);


    }
}

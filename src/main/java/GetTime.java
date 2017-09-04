import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class GetTime {

    public void Time(){

        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        int hour = Integer.valueOf(dateFormat.format(date));

        NeededMsg neededMsg = new NeededMsg("русский", hour);
        System.out.println(neededMsg.day());

    }
}

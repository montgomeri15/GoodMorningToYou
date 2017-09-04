import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {

    public void Time(){

        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        int hour = Integer.valueOf(dateFormat.format(date));

        NeededMsg neededMsg = new NeededMsg("русский", hour);

        if (hour>=6 && hour<=9) {
            System.out.println(neededMsg.morning());
        } else if (hour>=9 && hour<=19){
            System.out.println(neededMsg.day());
        } else if (hour>=19 && hour<=23){
            System.out.println(neededMsg.evening());
        } else if (hour>=23 && hour<=6){
            System.out.println(neededMsg.night());
        } else {
            System.out.println("Ошибка");
        }

    }
}

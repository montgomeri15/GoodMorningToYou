import com.GetLanguage;
import tom.NeededMsg;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class NeededMsgTest {

    GetLanguage getLanguage = new GetLanguage();
    ResourceBundle selected_language = getLanguage.Language();

    DateFormat dateFormat = new SimpleDateFormat("HH");
    Date date = new Date();
    int hour = Integer.valueOf(dateFormat.format(date));

    public NeededMsgTest() throws IOException {
    }

    @org.junit.Test
    public void morning() throws Exception {

        NeededMsg neededMsg = new NeededMsg(selected_language, hour);
        if (hour >= 6 && hour < 9){
            assertEquals(selected_language.getString("Morning"), neededMsg.morning());
        }
    }

    @org.junit.Test
    public void day() throws Exception {

        NeededMsg neededMsg = new NeededMsg(selected_language, hour);
        if (hour >= 9 && hour < 19){
            assertEquals(selected_language.getString("Day"), neededMsg.day());
        }
    }

    @org.junit.Test
    public void evening() throws Exception {

        NeededMsg neededMsg = new NeededMsg(selected_language, hour);
        if (hour >= 19 && hour < 23){
            assertEquals(selected_language.getString("Evening"), neededMsg.evening());
        }
    }

    @org.junit.Test
    public void night() throws Exception {

        NeededMsg neededMsg = new NeededMsg(selected_language, hour);
        if (hour >= 23 || hour < 6){
            assertEquals(selected_language.getString("Night"), neededMsg.night());
        }
    }
}
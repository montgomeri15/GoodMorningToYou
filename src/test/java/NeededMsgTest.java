import tom.NeededMsg;

import static org.junit.Assert.*;

import java.awt.im.InputContext;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NeededMsgTest {

    private static final String morning_en = "Good morning, World!";
    private static final String morning_ru = "Доброе утро, мир!";
    private static final String day_en = "Good day, World!";
    private static final String day_ru = "Добрый день, мир!";
    private static final String evening_en = "Good evening, World!";
    private static final String evening_ru = "Добрый вечер, мир!";
    private static final String night_en = "Good night, World!";
    private static final String night_ru = "Доброй ночи, мир!";

    String s = InputContext.getInstance().getLocale().getDisplayLanguage();

    DateFormat dateFormat = new SimpleDateFormat("HH");
    Date date = new Date();
    int hour = Integer.valueOf(dateFormat.format(date));

    public NeededMsgTest() throws IOException {
    }

    @org.junit.Test
    public void morning() throws Exception {

        NeededMsg neededMsg = new NeededMsg(s, hour);

        if (hour >= 6 && hour < 9){

            if (s.equalsIgnoreCase("en")){
                assertEquals(morning_en, neededMsg.morning());
            } else if (s.equalsIgnoreCase("ru")) {
                assertEquals(morning_ru, neededMsg.morning());
            }
        }
    }

    @org.junit.Test
    public void day() throws Exception {

        NeededMsg neededMsg = new NeededMsg(s, hour);

        if (hour >= 9 && hour < 19){

            if (s.equalsIgnoreCase("en")){
                assertEquals(day_en, neededMsg.day());
            } else if (s.equalsIgnoreCase("ru")) {
                assertEquals(day_ru, neededMsg.day());
            }
        }
    }

    @org.junit.Test
    public void evening() throws Exception {

        NeededMsg neededMsg = new NeededMsg(s, hour);

        if (hour >= 19 && hour < 23){

            if (s.equalsIgnoreCase("en")){
                assertEquals(evening_en, neededMsg.evening());
            } else if (s.equalsIgnoreCase("ru")) {
                assertEquals(evening_ru, neededMsg.evening());
            }
        }
    }

    @org.junit.Test
    public void night() throws Exception {

        NeededMsg neededMsg = new NeededMsg(s, hour);

        if (hour >= 23 || hour < 6){

            if (s.equalsIgnoreCase("en")){
                assertEquals(night_en, neededMsg.night());
            } else if (s.equalsIgnoreCase("ru")) {
                assertEquals(night_ru, neededMsg.night());
            }
        }
    }
}
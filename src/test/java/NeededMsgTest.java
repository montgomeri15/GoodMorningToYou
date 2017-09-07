import com.GetLanguage;
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

    GetLanguage getLanguage = new GetLanguage();
    String selected_language = getLanguage.Language();

    DateFormat dateFormat = new SimpleDateFormat("HH");
    Date date = new Date();
    int hour = Integer.valueOf(dateFormat.format(date));

    public NeededMsgTest() throws IOException {
    }

    @org.junit.Test
    public void morning() throws Exception {

        NeededMsg neededMsg = new NeededMsg(selected_language, hour);

        if (hour >= 6 && hour < 9){

            if (selected_language.equalsIgnoreCase("english")){
                assertEquals(morning_en, neededMsg.morning());
            } else if (selected_language.equalsIgnoreCase("русский")) {
                assertEquals(morning_ru, neededMsg.morning());
            }
        }
    }

    @org.junit.Test
    public void day() throws Exception {

        NeededMsg neededMsg = new NeededMsg(selected_language, hour);

        if (hour >= 9 && hour < 19){

            if (selected_language.equalsIgnoreCase("english")){
                assertEquals(day_en, neededMsg.day());
            } else if (selected_language.equalsIgnoreCase("русский")) {
                assertEquals(day_ru, neededMsg.day());
            }
        }
    }

    @org.junit.Test
    public void evening() throws Exception {

        NeededMsg neededMsg = new NeededMsg(selected_language, hour);

        if (hour >= 19 && hour < 23){

            if (selected_language.equalsIgnoreCase("english")){
                assertEquals(evening_en, neededMsg.evening());
            } else if (selected_language.equalsIgnoreCase("русский")) {
                assertEquals(evening_ru, neededMsg.evening());
            }
        }
    }

    @org.junit.Test
    public void night() throws Exception {

        NeededMsg neededMsg = new NeededMsg(selected_language, hour);

        if (hour >= 23 || hour < 6){

            if (selected_language.equalsIgnoreCase("english")){
                assertEquals(night_en, neededMsg.night());
            } else if (selected_language.equalsIgnoreCase("русский")) {
                assertEquals(night_ru, neededMsg.night());
            }
        }
    }
}
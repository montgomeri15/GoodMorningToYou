import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.im.InputContext;

public class NeededMsgTest {

    private static final String morning_en = "Good morning, World!";
    private static final String morning_ru = "Доброе утро, мир!";
    private static final String day_en = "Good day, World!";
    private static final String day_ru = "Добрый день, мир!";
    private static final String evening_en = "Good evening, World!";
    private static final String evening_ru = "Добрый вечер, мир!";
    private static final String night_en = "Good night, World!";
    private static final String night_ru = "Доброй ночи, мир!";

    String s = InputContext.getInstance().getLocale().getLanguage();

    NeededMsgTest neededMsgTest = new NeededMsgTest();

    @Test
    public void morning() throws Exception {

        int h = 6;


        while (h<=9){

            if (s.equalsIgnoreCase("en")){
            }

        }
    }

    @Test
    public void day() throws Exception {
    }

    @Test
    public void evening() throws Exception {
    }

    @Test
    public void night() throws Exception {
    }

}
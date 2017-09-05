import java.awt.*;
import java.awt.im.InputContext;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class GetTime {

    public void Time() throws IOException {

        DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        int hour = Integer.valueOf(dateFormat.format(date));

        GetLanguage getLanguage = new GetLanguage();
        NeededMsg neededMsg = new NeededMsg(getLanguage.Language(), hour);

        Logger logger = Logger.getLogger("MyLog");
        logger.setUseParentHandlers(false);

        try {
            logger.info("Getting Time");
        } catch (SecurityException e) {
            e.printStackTrace();
        }

        if (hour >= 6 && hour < 9) {
            System.out.println(neededMsg.morning());
            logger.info("Morning: all is OK!");
        } else if (hour >= 9 && hour < 19) {
            System.out.println(neededMsg.day());
            logger.info("Day: all is OK!");
        } else if (hour >= 19 && hour < 23) {
            System.out.println(neededMsg.evening());
            logger.info("Evening: all is OK!");
        } else if (hour >= 23 || hour < 6) {
            System.out.println(neededMsg.night());
            logger.info("Night: all is OK!");
        } else {
            System.out.println("Ошибка");
            logger.warning("ERROR message: please check the code");
        }
    }
}

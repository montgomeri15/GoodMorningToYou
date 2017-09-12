package com;
import tom.NeededMsg;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

public class GetTime {

    public static RightTime Time(Date ourDate) throws IOException {

        /** Получение точного времени (часа) */
        Calendar cal = new GregorianCalendar();
        cal.setTime(ourDate);
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        RightTime result = null;  //Объявление и инициализация простого перечисления enum

        NeededMsg neededMsg = new NeededMsg();
        System.out.println("Time: " + hour);  //Вывод времени в консоль (для удобства)

        Logger logger = Logger.getLogger("MyLog");
        logger.setUseParentHandlers(false);

        try {
            logger.info("Getting Time");
        } catch (SecurityException e) {
            e.printStackTrace();
        }

        if (hour >= 6 && hour < 9) {

            result = RightTime.Morning;
            System.out.println(neededMsg.morning());
            logger.info("Morning: all is OK!");

        } else if (hour >= 9 && hour < 19) {

            result = RightTime.Day;
            System.out.println(neededMsg.day());
            logger.info("Day: all is OK!");

        } else if (hour >= 19 && hour < 23) {

            result = RightTime.Evening;
            System.out.println(neededMsg.evening());
            logger.info("Evening: all is OK!");

        } else if (hour >= 23 || hour < 6) {

            result = RightTime.Night;
            System.out.println(neededMsg.night());
            logger.info("Night: all is OK!");

        } else {
            System.out.println("Ошибка");
            logger.warning("ERROR message: please check the code");
        }
        return result;  //Возвращаем результат перечисления
    }

    public enum RightTime {  //Простое перечисление enum для проверки в юнит-тестах
        Morning, Day, Evening, Night
    }
}

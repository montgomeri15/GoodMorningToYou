package com;
import tom.NeededMsg;

import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GetTime {

    private static Logger logger = Logger.getLogger(GetTime.class);

    public static RightTime Time(Date ourDate) throws IOException {

        /** Получение точного времени (часа) */
        Calendar cal = new GregorianCalendar();
        cal.setTime(ourDate);
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        RightTime result = null;  //Объявление и инициализация простого перечисления enum

        NeededMsg neededMsg = new NeededMsg();
        neededMsg.MsgLog();

        try {
            logger.info("Getting Time");
        } catch (SecurityException e) {
            e.printStackTrace();
            logger.error("ERROR! The attempt failed.");
        }

        if (hour >= 6 && hour < 9) {

            result = RightTime.Morning;
            logger.info("Morning: all is OK!");
            System.out.println("\nTime: " + hour);
            System.out.println(neededMsg.morning());

        } else if (hour >= 9 && hour < 19) {

            result = RightTime.Day;
            logger.info("Day: all is OK!");
            System.out.println("\nTime: " + hour);
            System.out.println(neededMsg.day());

        } else if (hour >= 19 && hour < 23) {

            result = RightTime.Evening;
            logger.info("Evening: all is OK!");
            System.out.println("\nTime: " + hour);
            System.out.println(neededMsg.evening());

        } else if (hour >= 23 || hour < 6) {

            result = RightTime.Night;
            logger.info("Night: all is OK!");
            System.out.println("\nTime: " + hour);
            System.out.println(neededMsg.night());

        } else {
            System.out.println("Ошибка\n");
            logger.error("ERROR message: please check the code");
        }
        return result;  //Возвращаем результат перечисления
    }

    public enum RightTime {  //Простое перечисление enum для проверки в юнит-тестах
        Morning, Day, Evening, Night
    }
}

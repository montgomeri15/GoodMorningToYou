package com;

import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.Date;

public class Main {

    private static String LOG_PROPERTIES_FILE = "./src/main/resources/log4j.properties";
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        Config config = new Config(LOG_PROPERTIES_FILE);
        config.init();

        logger.info("Starting the program...");
        logger.info("start in the next line...", new Exception());
        Date date = new Date();
        GetTime getTime = new GetTime();
        getTime.Time(date);
    }
}

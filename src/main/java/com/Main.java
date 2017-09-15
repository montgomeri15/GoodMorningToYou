package com;

import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.Date;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        logger.info("Starting the program...");
        logger.info("start in the next line...", new Exception());
        GetTime.Time(new Date());
    }
}

package com;

import org.apache.log4j.Logger;
import java.util.ResourceBundle;

public class GetLanguage {

    private static Logger logger = Logger.getLogger(GetLanguage.class);

    public ResourceBundle Language() {

        logger.info("Define the language.");
        ResourceBundle res = ResourceBundle.getBundle("Lang");
        return res;
    }
}
package com;

import java.util.Locale;
import java.util.ResourceBundle;

public class GetLanguage {

    public ResourceBundle Language() {

        System.out.println("Locale: " + Locale.getDefault());
        ResourceBundle res = ResourceBundle.getBundle("Lang");
        return res;
    }
}


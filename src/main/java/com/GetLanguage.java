package com;

import java.util.ResourceBundle;

public class GetLanguage {

    public ResourceBundle Language() {

        ResourceBundle res = ResourceBundle.getBundle("Lang");
        return res;
    }
}


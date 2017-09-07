package tom;

import java.util.Locale;
import java.util.ResourceBundle;

public class AllMsg {

    ResourceBundle language;
    int hour;

    public AllMsg(ResourceBundle language, int hour){

        this.language = language;
        this.hour = hour;

        System.out.println("Locale: " + Locale.getDefault());
    }

    public AllMsg() {
    }
}

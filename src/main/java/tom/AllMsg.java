package tom;

import java.util.ResourceBundle;

public class AllMsg {

    String language;
    int hour;

    public AllMsg(ResourceBundle language, int hour){
    }

    public AllMsg(String language, int hour) {
        this.language = language;
        this.hour = hour;

        System.out.println(language + ", " + hour);
    }
}

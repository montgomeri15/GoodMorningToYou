package tom;

import com.GetLanguage;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class NeededMsg extends AllMsg implements TimesOfDay {

    GetLanguage getLanguage = new GetLanguage();
    ResourceBundle selected_language = getLanguage.Language();

    public NeededMsg(ResourceBundle language, int hour) throws IOException {
        super(language, hour);

        Logger logger = Logger.getLogger("MyLog");
        logger.setUseParentHandlers(false);

        try {
            logger.info("Let's see what time is now.");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public String morning() {
        return selected_language.getString("Morning");
    }

    public String day() {
        return selected_language.getString("Day");
    }

    public String evening() {
        return selected_language.getString("Evening");
    }

    public String night() {
        return selected_language.getString("Night");
    }


}

package tom;

import com.GetLanguage;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.ResourceBundle;

public class NeededMsg implements TimesOfDay {

    private static Logger logger = Logger.getLogger(NeededMsg.class);

    GetLanguage getLanguage = new GetLanguage();
    ResourceBundle selected_language = getLanguage.Language();

    public void MsgLog() throws IOException {

        try {
            logger.info("Let's see what time is now.");
        } catch (SecurityException e) {
            e.printStackTrace();
            logger.error("ERROR! The attempt failed.");
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

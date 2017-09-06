package tom;

import com.GetLanguage;
import tom.AllMsg;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;

public class NeededMsg extends AllMsg implements TimesOfDay {

    List<String> file = Files.readAllLines(Paths.get("C:/Users/Admin/Desktop/GoodMorningToYou/src/translator.txt"));
    String array[] = file.toArray(new String[file.size()]);

    GetLanguage getLanguage = new GetLanguage();
    String selected_language = getLanguage.Language();

    public NeededMsg(String language, int hour) throws IOException {
        super(language, hour);

        Logger logger = Logger.getLogger("MyLog");
        logger.setUseParentHandlers(false);

        try {
            logger.info("Message");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    public String morning() {
        if (selected_language.equalsIgnoreCase("english")) {
            return array[0];
        } else if (selected_language.equalsIgnoreCase("русский")) {
            return array[1];
        } else return null;
    }

    public String day() {
        if (selected_language.equalsIgnoreCase("english")) {
            return array[2];
        } else if (selected_language.equalsIgnoreCase("русский")) {
            return array[3];
        } else return null;
    }

    public String evening() {
        if (selected_language.equalsIgnoreCase("english")) {
            return array[4];
        } else if (selected_language.equalsIgnoreCase("русский")) {
            return array[5];
        } else return null;
    }

    public String night() {
        if (selected_language.equalsIgnoreCase("english")) {
            return array[6];
        } else if (selected_language.equalsIgnoreCase("русский")) {
            return array[7];
        } else return null;
    }


}

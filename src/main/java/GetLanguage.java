import java.awt.im.InputContext;

public class GetLanguage {

    public String Language() {

        InputContext context = InputContext.getInstance();
        String lang = context.getLocale().getDisplayLanguage();
        return lang;
    }
}


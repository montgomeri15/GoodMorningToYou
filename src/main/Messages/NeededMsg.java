public class NeededMsg extends AllMsg implements TimesOfDay {


    public NeededMsg(String language, int hour) {
        super(language, hour);
    }

    public String morning() {
        return null;
    }

    public String day() {
        return "Good day, World!";
    }

    public String evening() {
        return null;
    }

    public String night() {
        return null;
    }
}

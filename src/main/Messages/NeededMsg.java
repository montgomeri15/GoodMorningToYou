public class NeededMsg extends AllMsg implements TimesOfDay {


    public NeededMsg(String language, int hour) {
        super(language, hour);
    }

    public String morning() {
        return "Good morning, World!";
    }

    public String day() {
        return "Good day, World!";
    }

    public String evening() {
        return "Good evening, World!";
    }

    public String night() {
        return "Good night, World!";
    }
}

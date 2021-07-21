public class Twofer {
    public String twofer(String name) {

        final String rName = name != null
            ? name
            : "you";

        return "One for " +rName+ ", one for me.";
    }
}
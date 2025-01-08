public class Sign {
    
    private String message = "";
    private int width;

    public Sign(String m, int w) {
        message = m;
        width = w;
    }

    public int numberOfLines() {
        double len = message.length();
        int lines = (int) Math.ceil((double) len / width);
        return lines;
    }

    public String getLines() {
        String linedMessage = "";
        for (int i = 0; i < message.length(); i += width) {
            linedMessage += message.substring(i, Math.min(i + width, message.length()));
            if (i + width < message.length()) {
                linedMessage += ";";
            }
        }
        return linedMessage;
    }

}

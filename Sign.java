public class Sign {
    
    private String message = "";
    private int width;
    private double len = message.length();
    private int lines = (int) Math.ceil((double) len / width);

    public Sign(String m, int w) {
        message = m;
        width = w;
    }

    public int numberOfLines() {
        return lines;
    }

    public String getLines() {
        
        return "";
    }


}

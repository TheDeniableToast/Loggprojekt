public class Logg {

    private String user;
    private double time;
    private String text;

    public Logg() {
        text = "text";
        time = 1.0;
        user = "user";
    }

    public Logg(double time) {
        this.time = time;
    }

    public Logg(String text, double time) {
        this.text = text;
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}

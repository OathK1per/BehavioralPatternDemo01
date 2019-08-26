package chainOfResponsibility01;

public class DayOff {
    private String name;
    private int days;

    public DayOff() {
        super();
    }

    public DayOff(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}

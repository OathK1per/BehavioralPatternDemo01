package chainOfResponsibility01;

public interface Teacher {

    void setNext(Teacher next);
    void check(DayOff dayOff);
}

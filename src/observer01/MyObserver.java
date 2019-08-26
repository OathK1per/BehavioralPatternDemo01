package observer01;

public interface MyObserver {

    int getStatus();

    void update(MySubject subject);
}

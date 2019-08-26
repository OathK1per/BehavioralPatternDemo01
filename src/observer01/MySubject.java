package observer01;

import java.util.ArrayList;
import java.util.List;

public class MySubject {
    List<MyObserver> list = new ArrayList<>();

    public void addObserver(MyObserver observer) {
        list.add(observer);
    }

    public void removeObserver(MyObserver observer) {
        list.remove(observer);
    }

    protected void notifyObservers() {
        for (MyObserver observer : list) {
            observer.update(this);
        }
    }
}

package observer02;

import java.util.Observable;
import java.util.Observer;

public class MyObserverB implements Observer {
    //持有广播过来的状态
    private int status;

    public int getStatus() {
        return status;
    }
    @Override
    public void update(Observable o, Object arg) {
        MySubjectB subjectB = (MySubjectB)o;

        status = subjectB.getStatus();
    }
}

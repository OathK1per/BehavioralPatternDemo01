package observer02;

import java.util.Observable;

public class MySubjectB extends Observable {
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
        this.setChanged();
        this.notifyObservers();
    }


}

package observer01;

public class MyObserverA implements MyObserver {
    //持有广播过来的状态
    private int status;

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public void update(MySubject subject) {
        MySubjectA subjectA = (MySubjectA)subject;
        status = subjectA.getStatus();
    }
}

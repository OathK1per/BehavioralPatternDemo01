package observer01;

public class MySubjectA extends MySubject {
    //向外发布的状态
    private int status;

    public int getStatus() {
        return status;
    }

    //在设置好状态后就直接调用广播方法
    public void setStatus(int status) {
        this.status = status;
        this.notifyObservers();
    }
}

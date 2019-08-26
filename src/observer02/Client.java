package observer02;

/**
 * 传播者模式：使用Observable类和Observer接口实现
 */
public class Client {

    public static void main(String[] args) {
        MySubjectB subject = new MySubjectB();

        MyObserverB observer1 = new MyObserverB();
        MyObserverB observer2 = new MyObserverB();
        MyObserverB observer3 = new MyObserverB();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.setStatus(302);

        System.out.println(observer1.getStatus());
        System.out.println(observer2.getStatus());
        System.out.println(observer3.getStatus());
    }
}

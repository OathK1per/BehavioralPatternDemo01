package observer01;

/**
 * 观察者模式：自定义观察者和目标对象函数
 * 在广播时需要双方实现类都持有要广播的东西
 * 在广播时，客户端给目标对象一个值，则目标对象立即广播出去，而不是再手动添加
 */
public class Client {

    public static void main(String[] args) {
        MySubjectA subject = new MySubjectA();

        MyObserver observer1 = new MyObserverA();
        MyObserver observer2 = new MyObserverA();
        MyObserver observer3 = new MyObserverA();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.setStatus(400);

        System.out.println(observer1.getStatus());
        System.out.println(observer2.getStatus());
        System.out.println(observer3.getStatus());
    }
}

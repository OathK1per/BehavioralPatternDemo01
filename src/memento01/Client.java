package memento01;

/**
 * 备忘录模式：保存一个对象的拷贝，方便以后可以恢复到原先的状态
 * 从源发器Originator中得到数据，然后创建一个备忘录Memento并保存在负责人CareTaker中
 * 当需要调用的时候再从负责人中取出来
 * 负责人可以储存很多内容，备忘录类一般就接收和取出当前内容
 */
public class Client {

    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Originator originator = new Originator("aaa", 18);
        System.out.println(originator.getName() + "-->" + originator.getAge());

        taker.setMemento(originator.createMemento());

        originator.setName("bbb");
        originator.setAge(38);
        System.out.println(originator.getName() + "-->" + originator.getAge());

        originator.recovery(taker.getMemento());
        System.out.println(originator.getName() + "-->" + originator.getAge());
    }
}

package chainOfResponsibility01;

/**
 * 责任链模式：将能够处理同一类请求的对象连成一条链，最后依次看哪个对象能够处理具体问题
 * 可以把Teacher设成抽象类
 * 通过集合或者数组生成责任链可能更加实用
 */
public class Client {

    public static void main(String[] args) {
        DayOff dayOff = new DayOff("aabb", 14);
        Teacher t1 = new NormalTeacher();
        Teacher t2 = new HeadTeacher();
        Teacher t3 = new ClassManager();

        t1.setNext(t2);
        t2.setNext(t3);
        t1.check(dayOff);
    }
}

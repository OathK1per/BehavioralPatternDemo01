package mediator01;

/**
 * 中介者模式：将对象之间复杂关系进行解耦，由一个中介对象来安排，其他对象都持有这一中介对象
 * 在中介者中，使用一个map关系管理普通对象的名字和对象更加方便
 * 在outAction中，需要调用中介者的command方法，相当于由中介者下指令
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new Teacher();

        Student student1 = new Monitor(mediator);
        Student student2 = new EnglishLeader(mediator);
        Student student3 = new OrdinaryOne(mediator);

        student2.selfAction();

        student2.outAction();

        student1.outAction();
    }
}

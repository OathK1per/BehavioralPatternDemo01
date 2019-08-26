package state01;

/**
 * 状态模式：为复杂系统的状态转换和行为变化进行封装所使用的模式
 * 使用context环境类持有一个状态对象，这个环境类可以被看做是一个房间对象
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.update(new EmptyState());

        context.update(new BookedState());
    }
}

package state01;

/**
 * 环境类context在这里面可以当作一个房间，这个房间可以存在一个状态
 */
public class Context {
    private MyState state;

    public void update(MyState state) {
        System.out.println("更新状态");
        this.state = state;
        this.state.handler();
    }
}

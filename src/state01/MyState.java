package state01;

public interface MyState {

    void handler();
}

class EmptyState implements MyState {

    @Override
    public void handler() {
        System.out.println("房间空置");
    }
}

class BookedState implements MyState {

    @Override
    public void handler() {
        System.out.println("房间已被预定");
    }
}

class CheckedInState implements MyState {

    @Override
    public void handler() {
        System.out.println("房间已入住");
    }
}
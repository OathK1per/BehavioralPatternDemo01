package mediator01;

public interface Student {

    void selfAction();

    void outAction();
}

class Monitor implements Student {
    private Mediator mediator;

    public Monitor(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("Monitor", this);
    }

    @Override
    public void selfAction() {
        System.out.println("管理班级事务");
    }

    @Override
    public void outAction() {
        System.out.println("向老师报告班级问题");

        mediator.command("OrdinaryOne");
    }
}

class EnglishLeader implements Student {
    private Mediator mediator;

    public EnglishLeader(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("EnglishLeader", this);
    }

    @Override
    public void selfAction() {
        System.out.println("收集班级英语作业");
    }

    @Override
    public void outAction() {
        System.out.println("将不交作业的名字上报老师");

        mediator.command("Monitor");
    }
}

class OrdinaryOne implements Student {
    private Mediator mediator;

    public OrdinaryOne(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("OrdinaryOne", this);
    }

    @Override
    public void selfAction() {
        System.out.println("开开心心上学");
    }

    @Override
    public void outAction() {
        System.out.println("被叫到老师办公室");
    }
}
package strategy01;

public class Context {

    private MyStrategy strategy;

    public Context(MyStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MyStrategy strategy) {
        this.strategy = strategy;
    }

    public void print(double price) {
        System.out.println("实际金额为：" + strategy.calculate(price));
    }
}

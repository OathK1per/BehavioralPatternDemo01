package strategy01;

public interface MyStrategy {

    double calculate(double price);
}

class GoldenCard implements MyStrategy {

    @Override
    public double calculate(double price) {
        return price * 0.8;
    }
}

class BlackCard implements MyStrategy {

    @Override
    public double calculate(double price) {
        return price * 0.6;
    }
}

class GoldenTicket implements MyStrategy {

    @Override
    public double calculate(double price) {
        return price * 0.9;
    }
}

class BlackTicket implements MyStrategy {

    @Override
    public double calculate(double price) {
        return price * 0.7;
    }
}
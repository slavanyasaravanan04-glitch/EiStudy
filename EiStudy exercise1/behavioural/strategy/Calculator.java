package behavioural.strategy;

public class Calculator {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double a, double b) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set!");
        }
        return strategy.execute(a, b);
    }
}

package behavioural.strategy;

public class MultiplyStrategy implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}


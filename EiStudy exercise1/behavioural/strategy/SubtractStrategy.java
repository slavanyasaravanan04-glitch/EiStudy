package behavioural.strategy;

public class SubtractStrategy implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}


package oopCalculator.operations;

public abstract class AbstractOperation implements Operation {

    public AbstractOperation() {

    }

    public abstract double getResult(double val1, double val2);
}

package oopCalculator.operations;

import oopCalculator.operations.AbstractOperation;

public class GetSubstraction extends AbstractOperation {

    public GetSubstraction() {
    }

    @Override
    public double getResult(double val1, double val2) {
        return val1 - val2;
    }
}

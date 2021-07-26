package oopCalculator.operations;

import oopCalculator.operations.AbstractOperation;

public class GetDivision extends AbstractOperation {

    public GetDivision() {
        super();
    }

    @Override
    public double getResult(double val1, double val2) {
        return val1 / val2;
    }
}
